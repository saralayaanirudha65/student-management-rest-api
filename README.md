# Student Management REST API

A simple **Student Management REST API** built with **Java and Spring Boot**.

I built this project while learning backend development and Spring Boot. The main goal was to understand how a real REST API works — from receiving a request in the controller to storing and retrieving data from a MySQL database.

## What it can do

- Add a student
- Get all students
- Get a student by ID
- Update student details
- Delete a student

## Tech Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## How it works

The project follows a simple layered structure:

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
MySQL
```

The **Controller** handles API requests, the **Service** contains the application logic, and the **Repository** communicates with the database.

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get a student by ID |
| POST | `/students` | Add a new student |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

## Example

A student can be added using a `POST` request:

```json
{
  "name": "Anirudh",
  "age": 21
}
```

## Running the Project

1. Clone the repository.
2. Open it in your preferred Java IDE.
3. Make sure MySQL is running.
4. Configure the database details in `application.properties`.
5. Run the Spring Boot application.

The API will run on:

```text
http://localhost:8080
```

You can use **Postman** to test the API endpoints.

## Current Status

🚧 **Ongoing**

The basic CRUD functionality is working. I'm continuing to improve the project and learn more about building production-ready Spring Boot applications.

## Why I Built This

This is one of my hands-on projects for learning **backend development with Java and Spring Boot**. I'm using it to understand how REST APIs, databases, service layers, and repositories work together in a real application.

More features will be added as I continue learning.

---

**Built by Anirudh Saralaya**
