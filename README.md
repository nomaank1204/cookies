Java Servlet Cookie Example
Project Description

This project demonstrates how to:
Create a cookie using a Servlet
Store data in the browser
Read cookie values from the browser
Display cookie information
It uses Jakarta Servlet API and runs on Apache Tomcat.

🛠 Technologies Used

Java
Jakarta Servlet API
Apache Tomcat 10+
HTML (generated via Servlet)

Project Structure
ProjectName/
│
├── src/
│   ├── Createcookie.java
│   └── Readcookie.java
│
└── README.md
🚀 How It Works
1️⃣ Create Cookie

URL:

http://localhost:8080/YourProjectName/Create

This servlet:

Cookie ck = new Cookie("username", "nomaan");
ck.setMaxAge(60 * 60); // 1 hour
response.addCookie(ck);
Creates a cookie named username
Stores value 

Sets expiry time to 1 hour

2️⃣ Read Cookie

URL:

http://localhost:8080/YourProjectName/Read

This servlet:

Cookie[] cookies = request.getCookies();
Reads all cookies
Searches for cookie named username
Displays its value

🔄 Application Flow

Open /Create
Cookie gets stored in browser
Click "Read Cookie"

/Read displays the username

🧠 Key Concepts Used

HttpServlet
doGet()
Cookie
setMaxAge()
request.getCookies()
response.addCookie()

▶️ How to Run

Install Java 11+
Install Apache Tomcat 10+
Deploy project to webapps
Start Tomcat
Open browser:
http://localhost:8080/Cookie/Create

 Requirements

Java 11 or higher
Tomcat 10 or higher (Jakarta compatible)
IDE (Eclipse / IntelliJ / NetBeans)

🧪 Expected Output
After /Create:
Cookie Created Successfully!
After /Read:
Username: nomaan

If cookie not found:
No Username Cookie Found!

This project is useful for understanding:

Client-side storage
Cookie lifecycle
Servlet request & response handling

