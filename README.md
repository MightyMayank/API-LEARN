Inventory Management System (Spring Boot)
A RESTful Web API for managing a retail store's inventory. This project was developed as part of a Java Developer Intern technical task.

Technologies Used
Java 17+ (Core Logic)
Spring Boot 3.x (Framework)
Spring Data JPA (Database ORM)
Hibernate (Implementation of JPA)
MySQL (Database)
Postman (API Testing)
Lombok (Boilerplate code reduction

Project Structure
Controller: Handles HTTP requests and maps them to service methods.

Service: Contains the business logic (e.g., checking if an item exists before deletion).

Repository: Interface extending JpaRepository for database communication.

Entity: Represents the products table in MySQL
