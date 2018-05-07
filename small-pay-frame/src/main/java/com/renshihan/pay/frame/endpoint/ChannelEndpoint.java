package com.renshihan.pay.frame.endpoint;

import com.renshihan.pay.frame.service.IChannelService;
import com.renshihan.pay.frame.standard.AbstractChannelMiddlewareServiceFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.*;

/**
 * @author renshihan@winchannel.net
 * @date 2018/5/3 10:45
 */
@Slf4j
public class ChannelEndpoint extends AbstractEndpoint<Object> implements ApplicationContextAware {
    public static final String CHANNEL_VERSION_PREFIX = "channel_version";
    private ApplicationContext applicationContext;
    private List<Object> endpointResult = null;
    private PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

    public ChannelEndpoint() {
        super(CHANNEL_VERSION_PREFIX, false);
    }

    @Override
    public Object invoke() {
        if (this.endpointResult != null) {
            //cache
            return this.endpointResult;
        }
        List<Object> result = new ArrayList<>();
        //first https://stackoverflow.com/questions/9259819/how-to-read-values-from-properties-file
        try {
            List<Properties> gavResult = new LinkedList<>();
            this.generateGavResult(gavResult);
            if (gavResult.size() > 0) {
                result.addAll(gavResult);
            }
        } catch (Exception ex) {
            log.warn("Load properties failed " + " : " + ex.getMessage());
        }
        //second Interface
        @SuppressWarnings("rawtypes")
        Collection<AbstractChannelMiddlewareServiceFacade> serviceFacades = BeanFactoryUtils
                .beansOfTypeIncludingAncestors(this.applicationContext,
                        AbstractChannelMiddlewareServiceFacade.class).values();
        for (AbstractChannelMiddlewareServiceFacade serviceFacade : serviceFacades) {
            if (serviceFacade == null) {
                continue;
            }
            Map<String, Object> info = this.getServiceInfo(serviceFacade);
            if (info != null && info.size() > 0) {
                result.add(info);
            }
        }
        //cache
        this.endpointResult = result;
        return this.endpointResult;
    }

    private void generateGavResult(List<Properties> gavResult) throws IOException {
        //read channel.service.properties
        this.generateChannelServiceProperties(gavResult);
    }

    private void generateChannelServiceProperties(List<Properties> gavResult) throws IOException {
        List<Resource> pomResourceLocations = getChannelServicePropertiesResources();
        if (pomResourceLocations == null || pomResourceLocations.size() <= 0) {
            return;
        }
        for (Resource channelServiceResource : pomResourceLocations) {
            Properties channelServiceProperties = loadProperties(channelServiceResource);
            gavResult.add(channelServiceProperties);
        }
    }

    /**
     * Load properties into the given instance.
     *
     * @param resourceLocation the Resource locations to load
     */
    private Properties loadProperties(Resource resourceLocation) {
        Properties result = new Properties();
        if (resourceLocation != null) {
            if (log.isInfoEnabled()) {
                log.info("Loading properties file from " + resourceLocation);
            }
            try {
                PropertiesLoaderUtils.fillProperties(result, new EncodedResource(resourceLocation));
            } catch (IOException ex) {
                if (log.isWarnEnabled()) {
                    log.warn("Could not load properties from " + resourceLocation + ": "
                            + ex.getMessage());
                }
            }
        }
        return result;
    }

    private List<Resource> getChannelServicePropertiesResources() throws IOException {
        List<String> paths = new ArrayList<>();
        String path1 = "classpath*:META-INF/channel.service.properties";
        paths.add(path1);
        return getResources(paths);
    }

    private List<Resource> getResources(List<String> paths) throws IOException {
        if (paths == null || paths.size() == 0) {
            return null;
        }
        List<Resource> resultList = new ArrayList<>();
        for (String path : paths) {
            Resource[] resources = resourcePatternResolver.getResources(path);
            List<Resource> resourceList = Arrays.asList(resources);
            resultList.addAll(resourceList);
        }
        return resultList;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    private Map<String, Object> getServiceInfo(AbstractChannelMiddlewareServiceFacade serviceFacade) {
        Map<String, Object> result = new HashMap<>();
        result.put("agencyId", serviceFacade.getAgencyId());       //机构id
        result.put("agencyName", serviceFacade.getAgencyName()); //机构名称
        result.put("serviceCode", serviceFacade.getServiceCode()); //服务id
        result.put("serviceName", serviceFacade.getServiceName());    //服务名称
        result.put("version", serviceFacade.getVersion());    //版本
        result.put("author", serviceFacade.getAuthor());    //对接人
        result.put("startDate", serviceFacade.getStartDate());    //开始时间
        result.put("endDate", serviceFacade.getEndDate());    //创建时间

        Map<String, Object> runtimeInfo = serviceFacade.getRuntimeInfo();
        result.put("runtimeInfo", runtimeInfo);
        return result;
    }
}
