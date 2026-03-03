# 🚀 CTSE Lab 05 - Spring Boot Microservices System  

---

## 📌 Project Overview

This project implements a complete microservices-based architecture using Spring Boot, Spring Cloud Gateway, and Docker.

The system consists of independent services that communicate through a centralized API Gateway. All services are containerized and deployed using Docker Compose.

This project was developed as part of a Microservices Lab assignment.

---

## 🏗️ System Architecture

The system contains four main components:

- API Gateway – Central entry point (Port 8080)
- Item Service – Manages items (Port 8081)
- Order Service – Manages orders (Port 8082)
- Payment Service – Handles payment processing (Port 8083)

All client requests must go through:

http://localhost:8080

The API Gateway routes requests to the appropriate microservice.

---

## 🔄 Architecture Flow

Client → API Gateway (8080) → Target Microservice → Response → Client

Each service runs independently inside its own Docker container.

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Gateway
- Maven
- REST APIs
- Docker
- Docker Compose
- Postman (API Testing)

---

## 🔗 Implemented API Endpoints

All endpoints work through the API Gateway on port 8080.

### 🟦 Item Service

- GET /items → Get all items  
- POST /items → Create new item  
- GET /items/{id} → Get item by ID  

### 🟩 Order Service

- GET /orders → Get all orders  
- POST /orders → Place a new order  
- GET /orders/{id} → Get order by ID  

### 🟨 Payment Service

- GET /payments → Get all payments  
- POST /payments/process → Process a payment  
- GET /payments/{id} → Get payment status  

---

## ▶️ How to Run the Project

### 1️⃣ Build All Services

Inside each service folder:

mvn clean package -DskipTests

OR directly run using Docker.

---

### 2️⃣ Run Using Docker Compose

From the root directory:

docker-compose up --build

This will start:
- API Gateway
- Item Service
- Order Service
- Payment Service

---

### 3️⃣ Test the APIs

Use Postman and test through:

GET http://localhost:8080/items  
POST http://localhost:8080/orders  
GET http://localhost:8080/payments  

---

## 📸 API Testing

All endpoints were successfully tested using Postman through the API Gateway (Port 8080).

---

## 📦 Features

- Microservices architecture
- Independent service deployment
- API Gateway routing
- RESTful API design
- Docker containerization
- Centralized client access
- In-memory data storage
- Fully functional endpoints through Gateway

---

## 📁 Project Structure

microservices-lab/
│
├── api-gateway/
├── item-service/
├── order-service/
├── payment-service/
├── docker-compose.yml
└── README.md

---

## 🎯 Lab Requirements Completed

✔ All required GET endpoints  
✔ POST endpoints implemented  
✔ API Gateway routing working  
✔ Docker Compose configuration completed  
✔ Services containerized  
✔ Repository publicly available  
