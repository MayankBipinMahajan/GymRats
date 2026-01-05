# 💪 Gym Membership Management System

<div align="center">

![Gym Membership](https://img.shields.io/badge/Gym-Membership-ff00ff?style=for-the-badge)
![Next.js](https://img.shields.io/badge/Next.js-16.0.3-000000?style=for-the-badge&logo=next.js)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.3-6DB33F?style=for-the-badge&logo=spring-boot)
![TypeScript](https://img.shields.io/badge/TypeScript-5.0-3178C6?style=for-the-badge&logo=typescript)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk)

A modern, full-stack gym membership management system with a stunning **Cyberpunk/Neon** aesthetic featuring member registration, admin dashboard, and dynamic membership tracking.

[Features](#-features) • [Tech Stack](#-tech-stack) • [Getting Started](#-getting-started) • [API Documentation](#-api-documentation) • [Screenshots](#-screenshots)

</div>

---

## ✨ Features

### 🎨 **Stunning UI/UX**
- **Cyberpunk/Neon Design** - Modern, vibrant interface with glassmorphism effects
- **Smooth Animations** - Powered by Framer Motion for fluid transitions
- **Confetti Celebrations** - Delightful feedback on successful member registration
- **Responsive Design** - Optimized for all screen sizes

### 👥 **Member Management**
- **Quick Registration** - Register new members with profile photos (up to 5MB)
- **Member Dashboard** - View all registered members with their details
- **Image Upload** - Base64 encoded profile picture support
- **Membership Plans** - Multiple plan types (Monthly, Quarterly, Annual)

### 🔐 **Admin Features**
- **Secure Login** - Protected admin dashboard
- **Member Overview** - Visual cards with member information
- **Expiration Tracking** - Automatic detection of expired memberships
- **Real-time Updates** - Instant member data synchronization

### 📊 **Membership Tracking**
- **Expiration Alerts** - Visual indicators for expired/expiring memberships
- **Start Date Management** - Custom membership start dates
- **Plan Types** - Flexible membership duration options

---

## 🛠️ Tech Stack

### Frontend
- **[Next.js 16.0.3](https://nextjs.org/)** - React framework with App Router
- **[React 19](https://react.dev/)** - UI library
- **[TypeScript](https://www.typescriptlang.org/)** - Type-safe JavaScript
- **[Tailwind CSS v4](https://tailwindcss.com/)** - Utility-first CSS framework
- **[Framer Motion](https://www.framer.com/motion/)** - Animation library
- **[Lucide React](https://lucide.dev/)** - Beautiful icon set
- **[Canvas Confetti](https://www.npmjs.com/package/canvas-confetti)** - Celebration effects

### Backend
- **[Spring Boot 3.2.3](https://spring.io/projects/spring-boot)** - Java framework
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** - Database abstraction
- **[Spring Security](https://spring.io/projects/spring-security)** - Authentication & authorization
- **[H2 Database](https://www.h2database.com/)** - In-memory database
- **[Lombok](https://projectlombok.org/)** - Boilerplate reduction
- **[Maven](https://maven.apache.org/)** - Dependency management

---

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- **Node.js** (v18 or higher) - [Download](https://nodejs.org/)
- **Java JDK 17** - [Download](https://adoptium.net/)
- **Maven** - [Download](https://maven.apache.org/download.cgi)
- **Git** - [Download](https://git-scm.com/)

### Installation

#### 1️⃣ Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/gym-membership.git
cd gym-membership
```

#### 2️⃣ Backend Setup

```bash
# Navigate to backend directory
cd backend

# Clean and install dependencies
mvn clean install

# Run the Spring Boot application
mvn spring-boot:run
```

The backend server will start on **http://localhost:8080**

> **H2 Console**: Access the database console at **http://localhost:8080/h2-console**
> - JDBC URL: `jdbc:h2:mem:gymdb`
> - Username: `sa`
> - Password: `password`

#### 3️⃣ Frontend Setup

```bash
# Navigate to frontend directory (from root)
cd frontend

# Install dependencies
npm install

# Run the development server
npm run dev
```

The frontend application will start on **http://localhost:3000**

### 🎯 Quick Start

1. **Start Backend**: Open a terminal and run `mvn spring-boot:run` in the `backend` directory
2. **Start Frontend**: Open another terminal and run `npm run dev` in the `frontend` directory
3. **Open Browser**: Navigate to http://localhost:3000
4. **Register Members**: Go to the registration page and add new members
5. **Admin Login**: Access the admin dashboard to view all members

---

## 📁 Project Structure

```
gym-membership/
├── backend/                    # Spring Boot backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/gymmembership/
│   │   │   │   ├── controller/    # REST API endpoints
│   │   │   │   ├── entity/        # JPA entities
│   │   │   │   ├── repository/    # Data access layer
│   │   │   │   ├── service/       # Business logic
│   │   │   │   └── config/        # Configuration classes
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   └── pom.xml                 # Maven dependencies
│
├── frontend/                   # Next.js frontend
│   ├── src/
│   │   ├── app/                # App router pages
│   │   │   ├── admin/          # Admin dashboard
│   │   │   ├── register/       # Member registration
│   │   │   └── plans/          # Membership plans
│   │   └── components/         # Reusable React components
│   ├── public/                 # Static assets
│   ├── package.json
│   └── tsconfig.json
│
└── README.md                   # You are here!
```

---

## 🔌 API Documentation

### Base URL
```
http://localhost:8080/api
```

### Endpoints

#### **Members API**

##### Get All Members
```http
GET /api/members
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "phoneNumber": "+1234567890",
    "planType": "Monthly",
    "startDate": "2024-01-15",
    "imageBase64": "data:image/jpeg;base64,..."
  }
]
```

##### Register New Member
```http
POST /api/members
Content-Type: multipart/form-data
```

**Parameters:**
| Field | Type | Required | Max Size | Description |
|-------|------|----------|----------|-------------|
| `name` | string | ✅ | - | Member name |
| `email` | string | ✅ | - | Email address |
| `phoneNumber` | string | ✅ | - | Contact number |
| `planType` | string | ✅ | - | Monthly/Quarterly/Annual |
| `startDate` | string | ✅ | - | Format: YYYY-MM-DD |
| `image` | file | ❌ | 5MB | Profile picture |

**Response:**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "phoneNumber": "+1234567890",
  "planType": "Monthly",
  "startDate": "2024-01-15",
  "imageBase64": "data:image/jpeg;base64,..."
}
```

#### **Admin API**

##### Admin Login
```http
POST /api/admin/login
Content-Type: application/json
```

**Request Body:**
```json
{
  "username": "admin",
  "password": "password"
}
```

**Response:**
```json
"Login successful"
```

#### **Membership Plans API**

##### Get All Plans
```http
GET /api/plans
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "Monthly",
    "price": 50.0,
    "duration": 30,
    "features": ["Access to gym", "Locker facility"]
  }
]
```


## 🔧 Configuration

### Backend Configuration

Edit `backend/src/main/resources/application.properties`:

```properties
# Application Name
spring.application.name=gym-membership

# Database Configuration
spring.datasource.url=jdbc:h2:mem:gymdb
spring.datasource.username=sa
spring.datasource.password=password

# H2 Console
spring.h2.console.enabled=true

# File Upload Settings
spring.servlet.multipart.max-file-size=5MB
spring.servlet.multipart.max-request-size=5MB

# Server Port
server.port=8080
```

### Frontend Configuration

The frontend is configured to connect to the backend at `http://localhost:8080`. If you change the backend port, update the API URLs in the frontend components.

---

## 🧪 Testing

### Backend Tests
```bash
cd backend
mvn test
```

### Frontend Tests
```bash
cd frontend
npm run lint
```

---

## 🏗️ Building for Production

### Backend
```bash
cd backend
mvn clean package
java -jar target/gym-membership-0.0.1-SNAPSHOT.jar
```

### Frontend
```bash
cd frontend
npm run build
npm start
```

---

## 🌟 Key Features Explained

### Image Upload System
- **Size Limit**: Maximum 5MB per image
- **Encoding**: Base64 encoding for database storage
- **Validation**: Client and server-side validation
- **Preview**: Real-time image preview before upload

### Membership Expiration Logic
- **Automatic Calculation**: Based on plan type and start date
- **Visual Indicators**: Color-coded status (Active/Expiring/Expired)
- **Admin Alerts**: Dashboard highlights members due for renewal

### Security Features
- **Spring Security**: Backend authentication
- **CORS Configuration**: Secure cross-origin requests
- **Input Validation**: Server-side validation for all inputs
- **Password Encoding**: Secure password storage (if implemented)

---

## 🐛 Troubleshooting

### Common Issues

#### Backend won't start
- Ensure Java 17 is installed: `java -version`
- Check if port 8080 is available
- Run `mvn clean install` to refresh dependencies

#### Frontend build errors
- Delete `node_modules` and `package-lock.json`
- Run `npm install` again
- Clear Next.js cache: `rm -rf .next`

#### Image upload fails
- Check file size (must be < 5MB)
- Verify file format (JPEG, PNG supported)
- Check backend logs for detailed error messages

#### CORS errors
- Ensure backend is running on port 8080
- Check `@CrossOrigin` annotation in controllers
- Verify frontend API URLs

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**Your Name**
- GitHub: [@YOUR_USERNAME](https://github.com/YOUR_USERNAME)
- Email: your.email@example.com

---

## 🙏 Acknowledgments

- [Next.js Documentation](https://nextjs.org/docs)
- [Spring Boot Guide](https://spring.io/guides)
- [Tailwind CSS](https://tailwindcss.com/)
- [Framer Motion](https://www.framer.com/motion/)
- Inspiration from modern fitness app designs

---

<div align="center">

### ⭐ Star this repository if you found it helpful!

Made with ❤️ and 💪

</div>
"# gym-membership" 
