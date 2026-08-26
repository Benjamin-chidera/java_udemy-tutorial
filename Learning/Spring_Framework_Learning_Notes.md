# Spring Framework Learning Progress

A comprehensive summary of the core concepts, topics, and design principles learned so far, along with topics currently being explored.

---

## 1. Core Java Concepts & Best Practices

### Local Variable Type Inference (`var`)
- Introduced in **Java 10** for local variables with initializers.
- **Static Typing Preserved:** Java remains 100% strongly and statically typed at compile-time.
- **Scope:** Valid only for local variables inside methods/loops/constructors (not for class fields, method parameters, or return types).
- **Rule of Thumb:** Use `var` when the type is obvious from the constructor initialization to reduce boilerplate (`var gameRunner = new GameRunner(...)`).

### Java Records (`record`)
- Introduced in **Java 14/16** to eliminate boilerplate for immutable data carrier classes.
- Automatically generates:
  - Constructor
  - Getters (`name()`, `age()`)
  - `equals()`, `hashCode()`, and `toString()` methods.
- Example:
  ```java
  record Person(String name, int age, String emailAddress) {}
  ```

---

## 2. Object-Oriented Design & Loose Coupling

### Tight Coupling vs. Loose Coupling
- **Tight Coupling:** High dependency between classes (e.g., `GameRunner` directly instantiating and depending on `MarioGame`). Modifying or swapping the game requires modifying `GameRunner`.
- **Loose Coupling (Best Practice):** Introducing an interface (e.g., `GamingConsole`) so `GameRunner` depends on the abstraction rather than concrete implementations (`MarioGame`, `SuperContract`, `PacMan`).

---

## 3. Spring Framework vs. Spring Boot

- **Spring Framework:** The foundational IoC container and modular framework (Spring Core, AOP, Data, Security). Gives full control but requires manual configuration.
- **Spring Boot:** Built on top of Spring Framework to simplify setup via **Auto-Configuration**, **Starter dependencies** (`spring-boot-starter`), and **Embedded servers** (Tomcat).
- **Python / Frontend Equivalents:**
  - *Python:* Django (full-featured like Spring Boot), FastAPI (modern REST API/DI), Flask (minimal/flexible).
  - *API Docs:* Swagger UI (OpenAPI specification) for backends; Storybook for React frontend components.

---

## 4. Spring Core Fundamentals (Currently Learning)

### Inversion of Control (IoC) & Dependency Injection (DI)
- Instead of manually managing object creation using `new ClassName()`, the **Spring Container** manages the creation, wiring, and lifecycle of objects (Spring Beans).

### Key Spring Annotations
- **`@Configuration`:** Marks a class as a source of Spring bean definitions.
- **`@Bean`:** Indicates that a method instantiates, configures, and initializes a Spring-managed object (Bean).

### Spring Application Context
- **`AnnotationConfigApplicationContext`:** Spring container that loads bean configurations from `@Configuration` Java classes.
- Initializing context and fetching beans:
  ```java
  try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
      var name = context.getBean("name");
      var person = context.getBean("person");
  }
  ```
- **Resource Management:** Using try-with-resources to automatically close the application context and release resources.

---

## 5. Running & Building Spring Applications

- Standard `java` CLI execution fails for Spring classes if external dependencies are missing from the classpath.
- Running with Maven Wrapper:
  ```bash
  ./mvnw spring-boot:run -Dspring-boot.run.main-class="com.discoverbenix.learn_spring_framework.App02HelloWorldSpring"
  ```
