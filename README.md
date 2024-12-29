Here’s a sample `README.md` file for your project:

```markdown
# User Profile API

A simple REST API for managing user profiles built using Spring Boot. This application uses an in-memory `HashMap` to store user data (no database required). The API supports basic CRUD operations: Create, Read, Update, and Delete.

---

## Features

- Create a new user
- Retrieve all users
- Retrieve a user by ID
- Update user details
- Delete a user by ID

---

## Technologies Used

- **Java** (JDK 17+)
- **Spring Boot** (3.x)
- **Maven** (for dependency management)

---

## Setup and Run

### Prerequisites

- JDK 17 or higher installed
- Maven installed
- Git installed

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/user-profile-api.git
   cd user-profile-api
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. The API will be accessible at:  
   `http://localhost:8080/api/users`

---

## API Endpoints

### 1. Create a User

- **URL:** `POST /api/users`  
- **Request Body:**
  ```json
  {
    "name": "John Doe",
    "email": "john.doe@example.com",
    "age": 25
  }
  ```
- **Response:**
  ```json
  {
    "id": "generated-uuid",
    "name": "John Doe",
    "email": "john.doe@example.com",
    "age": 25
  }
  ```

---

### 2. Get All Users

- **URL:** `GET /api/users`  
- **Response:**
  ```json
  {
    "user-id-1": {
      "id": "user-id-1",
      "name": "John Doe",
      "email": "john.doe@example.com",
      "age": 25
    },
    "user-id-2": {
      "id": "user-id-2",
      "name": "Jane Doe",
      "email": "jane.doe@example.com",
      "age": 30
    }
  }
  ```

---

### 3. Get User by ID

- **URL:** `GET /api/users/{id}`  
- **Response:**
  ```json
  {
    "id": "user-id",
    "name": "John Doe",
    "email": "john.doe@example.com",
    "age": 25
  }
  ```

---

### 4. Update a User

- **URL:** `PUT /api/users/{id}`  
- **Request Body:**
  ```json
  {
    "name": "John Updated",
    "email": "john.updated@example.com",
    "age": 28
  }
  ```
- **Response:**
  ```json
  {
    "id": "user-id",
    "name": "John Updated",
    "email": "john.updated@example.com",
    "age": 28
  }
  ```

---

### 5. Delete a User

- **URL:** `DELETE /api/users/{id}`  
- **Response:**
  ```
  User with ID {id} has been deleted.
  ```

---

## Project Structure

```plaintext
user-profile-api
│
├── src/main/java/com/example/userprofile
│   ├── UserProfileApplication.java       # Main application class
│   ├── model
│   │   └── User.java                     # User model class
│   ├── controller
│       └── UserController.java           # REST API controller
│
├── src/main/resources
│   └── application.properties            # Spring Boot configuration
│
├── pom.xml                               # Maven dependencies
└── README.md                             # Project documentation
```

---

## Future Enhancements

- Integrate with a database like MySQL or MongoDB
- Add pagination and sorting for user retrieval
- Implement validation for user input
- Add unit and integration tests

---


Replace `your-username` with your actual GitHub username if applicable.
