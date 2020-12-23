#export ORA_JARS=/var/tmp/pkg/ojdbc6.jar
#export SQOOP_USER_CLASSPATH=/sso/sfw/cloudera/parcels/CDH-6.3.2-1.cdh6.3.2.p4054.4568991/jars:${ORA_JARS}:${SQOOP_USER_CLASSPATH}
#export HADOOP_OPTS=-Djava.security.egd=file:/dev/../dev/urandom
#export HADOOP_OPTS="-Djavax.net.ssl.trustStore=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.jks -Djavax.net.ssl.trustStoreType=JKS"
#export HADOOP_OPTS="-Djavax.net.ssl.trustStore=/sso/hadoop/cloudera-certs/node-keystore-SAS.jks -Djavax.net.ssl.trustStoreType=JKS"
#export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=/home/ird0qal/sqoop/conf/ewallet.p12 -Djavax.net.ssl.trustStoreType=PKCS12"
#export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=/home/ird0qal/sqoop/conf/ewallet.p12 -Djavax.net.ssl.trustStoreType=PKCS12 -Djavax.net.ssl.trustStorePassword=@9S98Kse"
#export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=/sso/certs/sas-hadoop-truststore.jks -Djavax.net.ssl.trustStoreType=JKS -Djavax.net.ssl.trustStorePassword=@9S98Kse"
#export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=/sso/hadoop/cloudera-certs/CACerts/sas-hadoop-truststore.jks -Djavax.net.ssl.trustStoreType=JKS"
#export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=/sso/hadoop/cloudera-certs/node-keystore-SAS.jks -Djavax.net.ssl.trustStoreType=JKS"
#export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=hdfs://ird-prd-002/user/ird0qal/certs/IRD-TrustStore.jks -Djavax.net.ssl.trustStoreType=JKS -Djavax.net.ssl.trustStorePassword=@9S98Kse"
export HADOOP_OPTS=" -Djavax.net.ssl.trustStore=/home/ird0qal/sqoop/conf/IRD-TrustStore.jks -Djavax.net.ssl.trustStoreType=JKS -Djavax.net.ssl.trustStorePassword=@9S98Kse"
