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

**GET transformed calorie data:**
```bash
curl http://localhost:8080/api/calories
```

**Expected Output:**
A list of parsed and mapped calorie entries from the internal JSON file.

---

## 🧾 Example JSON Structure
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

## 📘 License
This project is open source and available under the [MIT License](LICENSE).

---

## 🙋‍♂️ Author
**Sigou Bathily**  
[LinkedIn](https://www.linkedin.com/in/sbathily)  |  [GitHub](https://github.com/SBathio)

---

