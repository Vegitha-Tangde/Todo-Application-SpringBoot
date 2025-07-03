# Todo-Application-SpringBoot
A simple web-based Todo Application built using Spring Boot, Thymeleaf, and Bootstrap. It allows users to add, view, toggle, and delete tasks with a clean and responsive UI. Data is managed using Spring Data JPA and stored in a relational database.
Here's a detailed **README** description you can use for your **Todo Application** on GitHub:

🔧 Features

* ✅ Add new tasks
* 🗒️ View all existing tasks
* 🔁 Toggle task completion status
* ❌ Delete individual tasks
* 🧹 Delete all tasks at once
* 💡 Responsive UI using Bootstrap 5


 🛠️ Technologies Used

* Java 17+
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* Bootstrap 5
* H2 / PostgreSQL (any JPA-compatible DB)

 📂 Project Structure

```
TodoApp/
├── controller/
│   └── TaskController.java
├── entity/
│   └── TaskEntity.java
├── repository/
│   └── TaskRepository.java
├── services/
│   └── TaskService.java
├── resources/
│   ├── templates/
│   │   └── index.html
│   └── application.properties
```


 🚀 Getting Started

# Prerequisites

* Java 17+
* Maven or Gradle
* IDE (IntelliJ, Eclipse, etc.)

# Steps to Run

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/todo-app.git
   cd todo-app
   ```

2. Run the application

   ```bash
   ./mvnw spring-boot:run
   ```

3. Access the app
   Open your browser and go to:
   `http://localhost:8080/`


 🗃️ Database Configuration

If using H2 (in-memory):

```properties
spring.datasource.url=jdbc:h2:mem:todoapp
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

 🙋‍♂️ Author

* T Vegitha
* GitHub: https://github.com/Vegitha-Tangde
