## Step 1.  สร้าง Selfsign Certificate

https://learn.microsoft.com/en-us/sql/database-engine/configure-windows/configure-sql-server-encryption?view=sql-server-ver17#sql-server-generated-self-signed-certificates


1. คำสั่ง Run Powershell  แบบ Administrator
``` PowerShell 
# Define parameters
$certificateParams = @{
    Type = "SSLServerAuthentication"
    Subject = "CN=$env:COMPUTERNAME"
    FriendlyName = "sqlserver"
    DnsName = @("$($env:COMPUTERNAME)", $([System.Net.Dns]::GetHostEntry('').HostName), 'localhost')
    KeyAlgorithm = "RSA"
    KeyLength = 2048
    HashAlgorithm = "SHA256"
    TextExtension = "2.5.29.37={text}1.3.6.1.5.5.7.3.1"
    NotAfter = (Get-Date).AddMonths(36)
    KeySpec = "KeyExchange"
    Provider = "Microsoft RSA SChannel Cryptographic Provider"
    CertStoreLocation = "cert:\LocalMachine\My"
}

# Call the cmdlet
New-SelfSignedCertificate @certificateParams
```

2. ตรวจสอบ Certificate โดยใช้ Cert Manager
   1. Personal -> Certificate 
   2. เช็ค  Cert ชื่อ sqlserver  
   3. Click ขวาเลือก All Task -> Manage Private Keys...
   4. กำหนด Permission ให้ MSSQLServer สามารถ Read ได้
   5. 