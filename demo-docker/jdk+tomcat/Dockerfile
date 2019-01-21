FROM                 daocloud.io/ubuntu:latest
MAINTAINER           bobit   email: iloveapi@163.com

# now add java and tomcat support in the container

ADD jdk-8u121-linux-x64.tar.gz /usr/local/
ADD apache-tomcat-9.0.14.tar.gz /usr/local/

# configuration of java and tomcat ENV

ENV JAVA_HOME /usr/local/jdk1.8.0_121
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV CATALINA_HOME /usr/local/apache-tomcat-9.0.14
ENV CATALINA_BASE /usr/local/apache-tomcat-9.0.14

ENV PATH $PATH:$JAVA_HOME/bin:$CATALINA_HOME/lib:$CATALINA_HOME/bin

# container listener port


EXPOSE 8080

# startup web application services by self

CMD /usr/local/apache-tomcat-9.0.14/bin/catalina.sh run
