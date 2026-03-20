# Ecommerce Product API

A Spring Boot REST API for product management, fully containerized with Docker.

## Tech Stack
- Java 17 + Spring Boot
- Spring Data JPA + MySQL 8
- Docker + Docker Compose

## API Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| POST   | /api/products | Create product |
| GET    | /api/products | Get all products |
| GET    | /api/products/{id} | Get by ID |
| GET    | /api/products/category/{cat} | Get by category |
| PUT    | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

## Run with Docker
```bash
docker-compose up --build
```

## Docker Hub
```bash
docker pull mallikarjun42/ecommerce-product-api:latest
```
