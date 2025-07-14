# Spring Boot Authentication with PostgreSQL

This is a Spring Boot project that implements Basic Authentication with PostgreSQL.

## Features

- Basic Authentication (USER & ADMIN)
- Role-based access control
- PostgreSQL integration with Spring Data JPA
- Password encryption using BCrypt
- Secure REST APIs

## Default Users

Username Password   Role  

intern    password123   USER  
admin     admin123      ADMIN 

## API Endpoints

Method  Endpoint     Access        

GET    /public       Anyone        
GET    /user       USER/ADMIN    
GET    /admin      ADMIN only    
POST   /users      ADMIN only    

## How to Run

1. Make sure PostgreSQL is running
2. Database name: `intern_db`

```bash
mvn clean install
mvn spring-boot:run
