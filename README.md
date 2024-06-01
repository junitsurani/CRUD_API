# CRUD API Project

## Overview

This project is a RESTful API that provides CRUD (Create, Read, Update, Delete) operations for managing users. It is built using Spring Boot and follows best practices for API development.

## Features

- **Create:** Add new user to the database.
- **Read:** Retrieve existing user.
- **Update:** Modify existing user.
- **Delete:** Remove user from the database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Firebase Database
- Maven

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) installed
- Maven installed
- Firebase account and project

## Project Setup

1. **Clone the repository:**

```bash
git clone https://github.com/junitsurani/CRUD_API.git
cd CRUD_API
```

2. **Create a `serviceAccountKey.json` file with your Firebase credentials and place it in the `src/main/resources` directory.**

## Running the Application

1. **Build the project:**

    ```bash
    mvn clean install
    ```

2. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

### Create a User

- **URL:** `/api/users`
- **Method:** `POST`
- **Request Body:**

    ```json
    {
        "id": "1",
        "name": "Junit Surani",
        "subjectMarks": {
            "Math": 90,
            "Science": 95
        }
    }
    ```

- **Response:**

    ```json
    {
        "message": "User created successfully. Updated time: <timestamp>"
    }
    ```

### Get a User by ID

- **URL:** `/api/users/{id}`
- **Method:** `GET`
- **Response:**

    ```json
    {
        "id": "1",
        "name": "Junit Surani",
        "subjectMarks": {
            "Math": 90,
            "Science": 95
        }
    }
    ```


### Update a User

- **URL:** `/api/users`
- **Method:** `PUT`
- **Request Body:**

    ```json
    {
        "id": "1",
        "name": "Updated Name",
        "subjectMarks": {
            "Math": 95,
            "Science": 98
        }
    }
    ```

- **Response:**

    ```json
    {
        "message": "User updated successfully. Updated time: <timestamp>"
    }
    ```

### Delete a User by ID

- **URL:** `/api/users/{id}`
- **Method:** `DELETE`
- **Response:**

    ```json
    {
        "message": "User deleted successfully. Updated time: <timestamp>"
    }
    ```

## Testing with cURL

### Create a User

```bash
curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{
    "id": "1",
    "name": "Junit Surani",
    "subjectMarks": {"Math": 90, "Science": 95}
}'
```

### Get a User by ID

```bash
curl -X GET http://localhost:8080/api/users/1
```

### Update a User

```bash
curl -X PUT http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{
    "id": "1",
    "name": "Updated Name",
    "subjectMarks": {"Math": 95, "Science": 98}
}'
```

### Delete a User by ID

```bash
curl -X DELETE http://localhost:8080/api/users/1
```


