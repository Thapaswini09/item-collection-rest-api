# Item Collection REST API

This project is a simple **Java Spring Boot REST API** for managing a collection of items (Movies).
It demonstrates RESTful API design using **in-memory data storage with ArrayList**, without using any database.

---

## Technologies Used

- Java 21
- Spring Boot
- Maven
- REST API
- Collections (ArrayList)
- Docker (for deployment)
- Render (hosting)

---

## Project Overview

The application allows:

- Adding a new item (Movie)
- Fetching a single item by its ID

All data is stored **in memory**, so it is reset whenever the application restarts.

---

## How to Run Locally

### Prerequisites

- Java 21
- Maven

### Steps

```bash
mvn clean install
mvn spring-boot:run

```

---

### Application runs on:

http://localhost:8080

### API Endpoints

## 1. Add a new movie

POST /movies

Request Body:
{
"id": 1,
"name": "Inception",
"description": "Sci-fi thriller",
"rating": 8.8
}

## 2. Get movie by ID

GET /movies/{id}

Example:
GET /movies/1

---

### Validation

id, name, and description are mandatory

Invalid input returns 400 Bad Request

---

## Important Note

This application uses in-memory storage (ArrayList).
Data is not persisted, so please add a movie using the POST endpoint before fetching it using GET.

---

### Deployment

This is a backend-only REST API.
The application is deployed on Render and can be tested using the public URL below.

Deployed URL:

https://item-collection-rest-api.onrender.com

---

## Notes

No database is used
Data resets on application restart
Designed for simplicity and learning purposes
