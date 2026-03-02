# 📌 PROJECT OVERVIEW


This repository contains my hands-on implementation of core **Spring Boot backend concepts**.

The main goal of this project is to:

✔ Understand real-world REST API development  
✔ Learn proper layered architecture  
✔ Implement clean exception handling  
✔ Apply validation best practices  
✔ Work with relational databases using JPA  

This project focuses on writing clean, structured, and maintainable backend code.

---

# 🛠️ TECH STACK

### 🔹 Java 21 
### 🔹 Spring Boot  
### 🔹 Spring Data JPA  
### 🔹 Hibernate ORM  
### 🔹 PostgreSQL / H2 Database  
### 🔹 Maven  
### 🔹 Lombok  
### 🔹 Postman (API Testing)

---

# 🏗️ ARCHITECTURE USED

The project follows a proper layered backend architecture:

CONTROLLER  
⬇  
SERVICE  
⬇  
REPOSITORY  
⬇  
DATABASE  

This ensures:

✔ Separation of concerns  
✔ Clean code structure  
✔ Easy maintainability  
✔ Scalable design  

---

# 📚 CONCEPTS IMPLEMENTED

## 🔹 REST API DEVELOPMENT

• GET API  
• POST API  
• PUT API  
• DELETE API  
• Path Variables  
• Request Parameters  
• JSON Request & Response Handling  

---

## 🔹 SPRING DATA JPA

• JpaRepository  
• CRUD Operations  
• Entity Mapping using @Entity  
• Automatic Query Generation  
• Database Integration  

---

## 🔹 GLOBAL EXCEPTION HANDLING

• Custom Exception Classes  
• @ControllerAdvice  
• Structured Error Response  
• Proper HTTP Status Codes  

---

## 🔹 VALIDATION

• @Valid  
• @NotNull  
• @NotBlank  
---


# 📂 PROJECT STRUCTURE

src  
 └── main  
     └── java  
         └── com.yourpackage  
             ├── controller  
             ├── service  
             ├── repository  
             ├── entity  
             ├── exception  
             |----Actuator

---

# ▶️ HOW TO RUN THE PROJECT

## 1️⃣ Clone the repository

git clone https://github.com/your-username/your-repo-name.git

## 2️⃣ Navigate to the project folder

cd your-repo-name

## 3️⃣ Run using Maven

mvn spring-boot:run

Application will start at:

http://localhost:8082

Actuator will start at:

http://localhost:9090

---

# 🧪 API TESTING

All endpoints can be tested using:

✔ Postman  
✔ Browser (for GET APIs)

---

# 🎯 LEARNING OUTCOME

Through this project, I have:

✔ Strengthened backend fundamentals  
✔ Understood layered architecture  
✔ Implemented production-style REST APIs  
✔ Practiced validation and exception handling  
✔ Worked with JPA and relational databases  


---

# 👨‍💻 AUTHOR

Yadav Rahul Suresh Chandra 
Backend Developer (Aspiring)  
Spring Boot Enthusiast  

---

⭐ If you found this project helpful, feel free to star the repository.
