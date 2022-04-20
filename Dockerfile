FROM tomcat
ENV DEPLOY_DIR /usr/local/tomcat/webapps
COPY target/wfhir.war $DEPLOY_DIR
