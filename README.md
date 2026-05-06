<div align="center">

# Student Management REST API

A simple and structured backend application built using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

Designed to perform CRUD operations while following a clean layered architecture.

<br>

</div>

---

## Overview

This project is a REST API for managing student records using Spring Boot and MySQL.

The application follows a layered backend architecture using:

- Controller Layer
- Service Layer
- Repository Layer
- Entity Layer

The project was built to strengthen understanding of backend development concepts such as REST APIs, database integration, JPA, Hibernate, and CRUD operations.

---

## Features

- Create student records
- Retrieve all students
- Retrieve student details by ID
- Update student information
- Delete student records
- MySQL database integration
- RESTful API architecture
- Layered project structure

---

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Core Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Access Layer |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| Lombok | Boilerplate Code Reduction |
| Maven | Dependency Management |

---

## Project Structure

```bash
src
│
├── controller
├── service
├── repository
├── models
└── main
```

### Controller Layer

Handles incoming HTTP requests and API endpoint mappings.

### Service Layer

Contains business logic and communicates with the repository layer.

### Repository Layer

Uses `JpaRepository` to interact with the MySQL database.

### Entity Layer

Represents database tables using JPA annotations.

---

## Student Entity

```json
{
  "id": 101,
  "name": "Karl",
  "dept": "CSE",
  "cgpa": 8.9,
  "year": 3
}
```

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/Alpha/CIT/Students` | Retrieve all students |
| GET | `/Alpha/CIT/Students/{id}` | Retrieve student by ID |
| POST | `/Alpha/CIT/Students` | Add a new student |
| PUT | `/Alpha/CIT/Students` | Update existing student |
| DELETE | `/Alpha/CIT/Students/{id}` | Delete student by ID |

---