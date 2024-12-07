# User Management System

A robust Java-based CRUD (Create, Read, Update, Delete) application for managing user data. This console application demonstrates best practices in Java development, including secure password storage using BCrypt, efficient database connection pooling with HikariCP, and comprehensive error handling.

## Features

1. Create new users with validation
2. View all users in a formatted table
3. Update existing user information
4. Secure delete with confirmation
5. Password hashing using BCrypt
6. Connection pooling with HikariCP
7. Input validation and error handling
8. Clean console-based user interface
9. Proper resource management and connection handling
10. Comprehensive error logging

## Prerequisites

1. Java 17 or higher
2. Maven 3.6 or higher
3. MySQL Server 8.0 or higher
4. MySQL Workbench (optional, for database management)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ayus1234/CRUD_Operations_App.git
   cd CRUD_Operations_App
   ```

2. Navigate to the project directory:
   ```bash
   cd CRUD/CRUD\ App
   ```

3. Run Maven to install dependencies:
   ```bash
   mvn clean install
   ```

## Database Setup

1. Start your MySQL server
2. Create a new MySQL database and required table:
   ```sql
   CREATE DATABASE dbase;
   USE dbase;

   CREATE TABLE users (
       id INT PRIMARY KEY AUTO_INCREMENT,
       username VARCHAR(50) NOT NULL,
       email VARCHAR(100) NOT NULL,
       password VARCHAR(60) NOT NULL,
       UNIQUE KEY unique_email (email),
       UNIQUE KEY unique_username (username)
   );
   ```

## Configuration

1. Update database connection details in `UserDao.java`:
   ```java
   private static final String JDBC_URL = "jdbc:mysql://localhost:3306/dbase";
   private static final String JDBC_USER = "your_username";
   private static final String JDBC_PASSWORD = "your_password";
   ```

## Running the Application

1. Build the project:
   ```bash
   mvn package
   ```

2. Run the application:
   ```bash
   java -jar target/crud-app-1.0-SNAPSHOT.jar
   ```

## Usage Examples

1. **Creating a New User**
   - Select option 1 from the main menu
   - Enter username, email, and password when prompted
   - System will validate input and confirm creation

2. **Viewing Users**
   - Select option 2 to see all users
   - Users will be displayed in a formatted table

3. **Updating User Information**
   - Select option 3
   - Enter the ID of the user to update
   - Follow prompts to update specific fields

4. **Deleting a User**
   - Select option 4
   - Enter the ID of the user to delete
   - Confirm deletion when prompted

## Project Structure

```
crud-app/
├── src/
│   └── main/
│       └── java/
│           ├── App.java         # Main application class
│           ├── User.java        # User entity class
│           └── UserDao.java     # Data Access Object
├── pom.xml                      # Maven configuration
├── setup.sql                    # Database setup script
└── README.md                    # This file
```

## Dependencies

- MySQL Connector/J 8.0.33
- HikariCP 5.0.1 (Connection Pooling)
- JBCrypt 0.4 (Password Hashing)
- SLF4J 2.0.7 (Logging)

## Troubleshooting

1. **Database Connection Issues**
   - Verify MySQL server is running
   - Check connection credentials in UserDao.java
   - Ensure database and table exist
   - Verify MySQL port (default: 3306)

2. **Compilation Errors**
   - Ensure Java 17 is installed: `java -version`
   - Verify Maven installation: `mvn -version`
   - Run `mvn clean install` to refresh dependencies

3. **Runtime Errors**
   - Check console output for specific error messages
   - Verify all required dependencies are present
   - Ensure proper database setup

## Contributing

Feel free to submit issues and enhancement requests!

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
