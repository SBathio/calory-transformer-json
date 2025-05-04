# Calory Transformer JSON

A Java-based backend project designed to parse, transform, and serve calorie-related data from JSON files. This service provides API endpoints that allow ingestion and transformation of nutritional data for downstream applications or API consumers.

---

## 🚀 Features
- Read and process structured JSON calorie data
- Transform JSON into domain-specific Java objects
- Serve data via REST API
- Designed for real-world API integration simulations

---

## 🔧 Tech Stack
- Java 17
- Spring Boot
- Gradle
- RESTful API
- Jackson for JSON parsing
- Docker
- Google Kubernetes Engine (GKE)
- GitHub Actions for CI/CD

---

## 📦 Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/SBathio/calory-transformer-json.git
cd calory-transformer-json
```

### 2. Run the Application
```bash
./gradlew bootRun
```

The application should start on `http://localhost:8080`

---

## 📂 Project Structure
```
src/
├── main
│   ├── java
│   │   └── com/sbathio/calorytransformer  # Core logic and controllers
│   └── resources
│       ├── application.properties         # App config
│       └── calories.json                  # Sample JSON file
```

---

## 🧪 Sample API Usage

Once the server is running, test endpoints using Postman or curl:

**GET raw calorie data:**
```bash
curl http://localhost:8080/calories/source
```

**POST transformed calorie data to target:**
```bash
curl -X POST http://localhost:8080/calories/target \
     -H 'Content-Type: application/json' \
     -d '[{"name":"Apple","calories":95,"fat":0.3,"carbs":25,"protein":0.5}]'
```

---

## 📝 Example JSON Structure
```json
[
  {
    "name": "Apple",
    "calories": 95,
    "fat": 0.3,
    "carbs": 25,
    "protein": 0.5
  },
  {
    "name": "Banana",
    "calories": 105,
    "fat": 0.4,
    "carbs": 27,
    "protein": 1.3
  }
]
```

---

## ⚙️ CI/CD Workflow Description

This project includes an automated continuous integration and delivery pipeline using GitHub Actions and Google Cloud Platform:

- **Build & Test**: Java code is compiled and built using Gradle.
- **Dockerization**: The application is containerized using Docker.
- **Push to Artifact Registry**: Docker image is pushed to Google Cloud Artifact Registry.
- **Deploy to Cloud Run**: Image is deployed to a managed Cloud Run service.
- **Infrastructure**: GKE Autopilot used for scalable Kubernetes-based backend infrastructure.

### 📊 CI/CD Architecture

![CI/CD Pipeline Diagram](./docs/ci-cd-pipeline.png)

---

## 📚 License
This project is open source and available under the [MIT License](LICENSE).

---

## 🙇‍♂️ Author
**Sigou Bathily**  
[LinkedIn](https://www.linkedin.com/in/sbathily)  |  [GitHub](https://github.com/SBathio)

---
