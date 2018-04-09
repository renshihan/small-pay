FROM livingobjects/jre8
VOLUME /tmp
ADD /data/docker/tmp/smallpay.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]