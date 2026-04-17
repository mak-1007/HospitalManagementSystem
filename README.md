# 🏥 Hospital Management System (Spring Boot)

A simple **Hospital Management System REST API** built using **Spring Boot (Java)**.
This project demonstrates how to create and manage patient records using **RESTful APIs**, handling requests through controllers and storing data in memory.

---

##  Features

* ➕ Add patient (via Request Params & Request Body)
* 🔍 Get patient details
* 👤 Get patient by name
* 📋 Get all patients
* 🎯 Filter patients based on age
* ⚡ Fast in-memory data handling using HashMap

---

## 🧠 Concepts Used

* Spring Boot
* REST API Development
* Annotations (`@RestController`, `@GetMapping`, `@PostMapping`)
* Request Handling (`@RequestParam`, `@RequestBody`)
* Java Collections (`HashMap`, `ArrayList`)
* Object-Oriented Programming (OOP)

---

## 📁 Project Structure

```id="proj456"
HospitalManagementSystem
│
├── HospitalManagementSystemApplication.java   // Main class (Spring Boot starter)
├── Patient.java                               // Patient model class
├── PatientController.java                     // REST Controller (API endpoints)
```

---

## ⚙️ Technologies Used

* Java
* Spring Boot
* Maven
* REST APIs

---

## ▶️ How to Run

1. Clone the repository:

```bash id="run456"
git clone https://github.com/your-username/your-repo-name.git
```

2. Open project in **IntelliJ IDEA / Eclipse**

3. Run:

```id="runmain"
HospitalManagementSystemApplication.java
```

4. Server will start at:

```id="port"
http://localhost:8080
```

---

## 📡 API Endpoints

### 🔹 Add Patient (Request Params)

```id="api1"
POST /addPatientViaRequestParameter
```

Example:

```id="api1ex"
http://localhost:8080/addPatientViaRequestParameter?patientId=1&name=Aman&disease=Fever&age=22
```

---

### 🔹 Add Patient (Request Body)

```id="api2"
POST /addPatientViaRequestBody
```

JSON Body:

```json id="api2ex"
{
  "patientId": 2,
  "name": "Adnan",
  "disease": "Cold",
  "age": 24
}
```

---

### 🔹 Get Patient Info

```id="api3"
GET /getPatientInfo
```

---

### 🔹 Get Patient By Name

```id="api4"
GET /getPatientByName?name=Aman
```

---

### 🔹 Get All Patients

```id="api5"
GET /getAllPatients
```

---

### 🔹 Get Patients Greater Than Age

```id="api6"
GET /getPatientsListGreaterThanAge?age=20
```

---

## ⚠️ Known Issues / Improvements Needed

* ❌ `getPatientInfo` method returns new object instead of fetching from map
* ❌ String comparison uses `==` instead of `.equals()`
* ❌ `getAllPatients` loop is incorrect (empty list issue)
* ❌ No database (data lost on restart)
* ❌ No validation or exception handling

---

## 🔧 Suggested Improvements

* Use `.equals()` for String comparison
* Fix `getAllPatients()` logic
* Add proper error handling
* Integrate database (MySQL / PostgreSQL)
* Add Service Layer (best practice)
* Use Spring Data JPA

---

## 🚀 Future Enhancements

* 🗄️ Database integration
* 🔐 Authentication & authorization
* 🧾 Appointment management
* 👨‍⚕️ Doctor management
* 🌐 Frontend (React / Angular)

---

## 👨‍💻 Author

**Aman**
B.Tech CSE | Backend Developer (Spring Boot)

---

## ⭐ Support

If you like this project:

* ⭐ Star the repository
* 🍴 Fork it
* 🤝 Contribute

---

**Made with ❤️ using Spring Boot**
