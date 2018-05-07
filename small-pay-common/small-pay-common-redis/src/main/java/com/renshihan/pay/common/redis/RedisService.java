package com.renshihan.pay.common.redis;

import lombok.Data;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * Created by zhangtao on 2017/11/8.
 */
@Data
public abstract class RedisService {
     public abstract boolean set(String key, String value) throws Exception;
     public abstract String get(String key) throws Exception;

     public abstract boolean expire(String key, long expire) throws Exception;

     public abstract <T> boolean setList(String key, List<T> list) throws Exception;

     public abstract <T> List<T> getList(String key, Class<T> clz) throws Exception;

     public abstract long lpush(String key, Object obj) throws Exception;

     public abstract long rpush(String key, Object obj) throws Exception;

     public abstract void hmset(String key, Object obj) throws Exception;

     public abstract <T> T hget(String key, Class<T> clz) throws Exception;


     public abstract void del(String key) throws Exception;

     public abstract <T> List<T> hmGetAll(String key, Class<T> clz) throws Exception;

     public abstract String lpop(String key) throws Exception;
}
