<h1>Category Product Mapping Application</h1>

Welcome to the Category Product Mapping Application, a robust solution for managing and maintaining relationships between product categories and their associated products. This project was built with an emphasis on scalability, performance, and user-friendly features to simplify operations in business processes.

📜 Features
Here are the key features I’ve implemented in this project:

Category-Product Mapping
A streamlined system to associate products with specific categories, making it easier to manage complex relationships.

Pagination for Large Datasets
I’ve integrated pagination into the application to ensure seamless navigation and display of large datasets, improving performance and user experience.

Custom Workflows
Adaptable features to align with various business requirements.

🛠️ Technologies Used
Programming Language: Java
Framework: Spring Boot
Database: MySQL
Build Tool: Maven
Pagination Library: Spring Data JPA’s built-in pagination features
🚀 Getting Started
Prerequisites
To get started, ensure you have the following installed:

Java Development Kit (JDK) 17 or higher
Maven 3.8+
MySQL or your preferred database system
An IDE (e.g., IntelliJ IDEA, Eclipse)
Installation
Clone the repository:

bash
Copy code
git clone <repository-url>
cd CategoryProductMapping
Set up the database:

Create a MySQL database (e.g., category_product_db).
Update the application.properties file with your database credentials.
Build the project:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
The application will be available at http://localhost:8080.

📖 Documentation
Key Files:
DesignedPetStoreApplication.java: The main entry point of the application (update file name as necessary).
Pagination Integration: Integrated using Spring Data JPA for efficient handling of large datasets.
application.properties: Configuration settings for the database and application.
