# fullstack_backend_1
[Youtube Support Link] (https://www.youtube.com/watch?v=aVIragIv4lY&list=PL1oBBulPlvs84AmRmT-_3dGz4KHYuINsj&index=3)


## Overview
This project is a full-stack web application that utilizes a Java Spring Boot backend and a React frontend, with MySQL serving as the database. The primary purpose of this application is to manage user data through endpoints that allow for the creation, updating, and deletion of user records.

## Technologies Used
Backend:
Java Spring Boot: A powerful and flexible framework for building Java-based enterprise applications.
MySQL: A relational database management system used to store and manage user data.
Frontend:
React: A JavaScript library for building user interfaces, providing a responsive and dynamic user experience.
Getting Started
To run the application locally, follow these steps:

## Backend
Ensure you have Java and Maven installed on your machine.

Clone the repository.

Navigate to the backend directory.

Configure the MySQL database connection in the application.properties file.

Run the following commands in your terminal:

bash
Copy code
mvn clean install
java -jar target/{your-jar-file-name}.jar
Replace {your-jar-file-name} with the actual name of the generated JAR file.

## Frontend
Ensure you have Node.js and npm installed on your machine.

Navigate to the frontend directory.

Run the following commands in your terminal:

bash
Copy code
npm install
npm start
Open your browser and go to http://localhost:3000 to access the application.

Database Configuration
Make sure to configure your MySQL database connection details in the backend application. Modify the application.properties file with the appropriate database URL, username, and password.

properties
Copy code
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

## API Endpoints
Create User
Endpoint: /api/users
Method: POST
Request Body:
json
Copy code
{
"username": "exampleUser",
"email": "user@example.com",
"password": "securePassword"
}


## Update User
Endpoint: /api/users/{userId}
Method: PUT
Request Body:
json
Copy code


{
"username": "updatedUsername",
"email": "updatedEmail@example.com",
"password": "newSecurePassword"
}
``


## Delete User
Endpoint: /api/users/{userId}
Method: DELETE


## Additional Notes
This is a basic setup, and you may need to adapt the code for production environments.
Ensure that your MySQL server is running before starting the backend application.
Feel free to customize the frontend to suit your design preferences.

## Contributors
Will Okanumeh

## License
This project is licensed under the MIT License.