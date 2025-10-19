## Client Side Setup

1. Trust Cert by Import sqlserver.cer  to Trust Store
2. Download JDBC driver https://learn.microsoft.com/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server
3. Open Via SQL Management Console
4. Check Connection  Using Command
5. ``` sql
    > select * from sys.dm_exec_connections; 
   ```

## For Java Code
1. Import Cert to Keystore using keytool
   ``` console
    keytool -importcert -alias sqlserver -file sqlserver.cer -keystore truststore.jks -storepass mypass -noprompt
    ```
