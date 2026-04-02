# 🏃 Runique

A modern **Android run tracking application** built with **Kotlin** and **Jetpack Compose**. Runique lets you record and monitor your runs with an offline-first approach, ensuring your data is always available even without an internet connection.

---

## 📸 Screenshot

<img src="https://private-user-images.githubusercontent.com/72562597/495303055-0437328c-6a80-4527-ac2b-b594cbec5622.jpg?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NzUxMjk0MzIsIm5iZiI6MTc3NTEyOTEzMiwicGF0aCI6Ii83MjU2MjU5Ny80OTUzMDMwNTUtMDQzNzMyOGMtNmE4MC00NTI3LWFjMmItYjU5NGNiZWM1NjIyLmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNjA0MDIlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjYwNDAyVDExMjUzMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTM2YzJjMWM3NzA5NjQxZDhkZmQ5OGY5NmM5NTFjNDBmNTFmODM1MDI3ODgxZDZhMzdjMDJjNjIwM2MxMGVjMTcmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.ObQnMoDjin9sEP9yKUivJhSyTOCWW062SY98ksqnBXg" width="360"/>

> ⚠️ **Note:** If the screenshot above doesn't load (JWT token expiration), please upload the image to the repo's `docs/` folder and update the path to `docs/screenshot.jpg`.

---

## 🌟 Features

- 🗺️ **Run Tracking** — Record your runs with GPS route visualization
- 📴 **Offline First** — Runs are saved locally and synced when online
- 🏗️ **Multi-Module Architecture** — Feature-based modular structure for scalability and reusability
- 🎨 **Jetpack Compose UI** — Fully declarative and modern Android UI
- ⚡ **Kotlin Coroutines** — Smooth async operations throughout the app
- 💉 **Koin Dependency Injection** — Lightweight and pragmatic DI

---

## 🧰 Tech Stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose |
| Architecture | Clean Architecture, Multi-Module |
| DI | Koin |
| Async | Kotlin Coroutines & Flow |
| Local Storage | Room Database |
| Maps | Google Maps / MapBox |
| Build System | Gradle (KTS) |

---

## 🗂️ Project Structure

```
Runique/
├── app/                  # Application module (entry point)
├── core/
│   ├── data/             # Shared data layer (models, repositories)
│   ├── domain/           # Shared domain logic
│   ├── presentation/     # Shared UI components
│   └── database/         # Room DB setup
├── auth/
│   ├── data/             # Auth data sources
│   ├── domain/           # Auth use cases
│   └── presentation/     # Login / Register screens
├── run/
│   ├── data/             # Run tracking data layer
│   ├── domain/           # Run use cases & location tracking
│   └── presentation/     # Run screens (active run, overview)
└── build-logic/          # Convention plugins for modules
```

---

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or newer
- Android SDK 26+
- Kotlin 1.9+

### Installation

```bash
# Clone the repository
git clone https://github.com/ozanyazici9/Runique.git

# Open in Android Studio and sync Gradle
# Run on emulator or physical device (API 26+)
```

---

## 🏛️ Architecture

Runique follows **Clean Architecture** principles split across multiple Gradle modules:

```
Presentation Layer  →  Jetpack Compose (UI)
     ↓
Domain Layer        →  Use Cases, Business Logic
     ↓
Data Layer          →  Room (local), Remote API (sync)
```

Each feature (auth, run) is its own independent module with its own `data`, `domain`, and `presentation` layers, promoting high cohesion and low coupling.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👤 Author

**Ozan Yazıcı**  
[![GitHub](https://img.shields.io/badge/GitHub-ozanyazici9-181717?style=flat&logo=github)](https://github.com/ozanyazici9)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Ozan%20Yazıcı-0077B5?style=flat&logo=linkedin)](https://www.linkedin.com/in/ozan-yaz%C4%B1c%C4%B1-a5025a236/)


