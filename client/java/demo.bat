SET JAVA_HOME=C:\jdk-17.0.14
SET PATH=%JAVA_HOME%\bin;%PATH%
ECHO @off

ECHO ##### TLS Connection #############
java -cp "mssql-jdbc-12.10.2.jre11.jar" TestTLS.java

PING 127.0.0.1 

ECHO ##### Plain Text Connection #############
java -cp "mssql-jdbc-12.10.2.jre11.jar" TestPlain.java

ECHO @On