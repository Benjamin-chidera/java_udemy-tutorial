# Java & Spring Framework Journey

This repository contains hands-on code, practical exercises, and reference notes from learning the Java and Spring ecosystems.

---

## 📂 Repository Structure

- **[`Learning/`](./Learning/)**
  - Contains structured notes, explanations, and key takeaways across Core Java, Object-Oriented Design, and Spring Framework concepts.
  - [Spring Framework Learning Notes](./Learning/Spring_Framework_Learning_Notes.md)
- **[`learn-spring-framework-01/`](./learn-spring-framework-01/)**
  - Introduction to tight vs. loose coupling, interfaces (`GamingConsole`), and manual dependency injection.
- **[`learn-spring-framework-02/`](./learn-spring-framework-02/)**
  - Spring Core basics: Spring IoC container, `@Configuration`, `@Bean`, and managing beans with `AnnotationConfigApplicationContext`.
- **[`Practice/`](./Practice/)**
  - Hands-on practice projects and exercises (e.g., custom decoupled vehicle runner implementations).

---

## 🚀 Key Topics Covered

1. **Modern Core Java**
   - Local Variable Type Inference (`var`) in Java 10+.
   - Java Records (`record`) for immutable data structures.
2. **Object-Oriented Design & Decoupling**
   - Tight coupling vs. loose coupling.
   - Programming to interfaces for polymorphism and extensibility.
3. **Spring Framework Core**
   - Inversion of Control (IoC) & Dependency Injection (DI).
   - Java-based configuration using `@Configuration` and `@Bean`.
   - Managing application lifecycle and beans via `AnnotationConfigApplicationContext`.
4. **Spring Ecosystem & Concepts**
   - Spring Framework vs. Spring Boot differences and use cases.
   - REST API concepts and tooling comparisons (SpringDoc OpenAPI / Swagger UI).

---

## 🛠️ How to Run Projects

To compile and run any of the Spring runner classes using the Maven wrapper:

```bash
cd <project-folder>

# Example: Run via Maven Exec Plugin
./mvnw compile exec:java -Dexec.mainClass="<full.package.and.ClassName>"

# Or run via Spring Boot Maven plugin
./mvnw spring-boot:run -Dspring-boot.run.main-class="<full.package.and.ClassName>"
```
