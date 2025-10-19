# 🔐 SQL Server Connection Encryption (Java JDBC Demo)

โปรเจ็กต์นี้สาธิตการเชื่อมต่อ **Application → SQL Server** แบบเข้ารหัส (Encrypted Connection)  
โดยเปรียบเทียบระหว่าง **การเชื่อมต่อแบบธรรมดา (Unencrypted)** และ **แบบเข้ารหัส (Encrypted)**  
เพื่อให้เข้าใจถึงความแตกต่างและความปลอดภัยที่เกิดขึ้นเมื่อเปิดใช้ Encryption

---

## 🎯 เป้าหมายของโปรเจ็กต์
1. เรียนรู้การ **ตั้งค่า SQL Server ให้บังคับใช้การเข้ารหัส (Force Encryption)**
2. เข้าใจการใช้ **Certificate** สำหรับเข้ารหัสการเชื่อมต่อ
3. ฝึกการตั้งค่า **Java Client (JDBC)** ให้ยอมรับ Certificate
4. ทดสอบผลลัพธ์ด้วย **Wireshark** เพื่อดูความต่างของข้อมูลที่ส่ง

---

## 🧱 โครงสร้างโปรเจ็กต์
```
sqlconnencrypt/
│
├── cert/
│ └── how_to_gencert.md
│ └── how_to_sqlserver.md
├── client/
│ └── java/
│       └── demo.bat
│       └── mssql-jdbc-12.10.2.jre11.jar
│       └── TestPlain.java
│       └── TestTLS.java
│
├── wireshark/
│ └── wireshark.md
│
└── README.md
```

### 🧠 Key Takeaways

ข้อมูลที่ไม่เข้ารหัสสามารถถูกดักจับได้ง่ายด้วยเครื่องมือทั่วไป

การเปิด Encryption ทำให้ข้อมูลทั้งหมดถูกเข้ารหัสระหว่างทาง

SQL Server ใช้ TLS Certificate เพื่อป้องกันการดักฟังข้อมูล

Client ต้อง trust certificate เพื่อเชื่อมต่อแบบปลอดภัย

เหมาะกับระบบที่มีข้อมูลสำคัญ เช่น ระบบการเงิน, ระบบลูกค้า, หรือระบบภายในองค์กร


### 🧰 Tools ที่ใช้

☕ Java 17+

🧱 SQL Server 2019 หรือใหม่กว่า

📦 SQL JDBC Driver (mssql-jdbc-12.x.jar)

🕵️ Wireshark (ใช้ตรวจสอบ Packet)

🔑 keytool (สำหรับสร้าง/นำเข้า Certificate)


### 📹 สำหรับผู้ชม YouTube

ดูคลิปสาธิตแบบ Step-by-Step ได้ที่
👉 YouTube:  ([SQL Connection Encryption | เข้ารหัส การเชื่อมต่อ ฐานข้อมูล ให้ปลอดภัย](https://youtu.be/L19Y1t9yhXE))

----

🧑‍💻 Author: Narong Sungkhamalai
📅 Updated: October 2025

📂 License: MIT

