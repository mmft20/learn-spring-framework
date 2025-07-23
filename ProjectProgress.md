# Learn Spring
## Udemy Course : Java Spring Boot Framework in 100 steps - Build a REST API and a Web application with Java, JPA, SpringBoot and Maven
### Lectures : 150-167

Date : 2025-07-23

    Lecture 150
    We will learn the following in this Project :
    -- Tight Coupling and loose coupling
    -- IOC Container
    -- Application Context
    -- Component Scan
    -- Dependency Injection
    -- Spring Beans
    -- Autowiring

----
    Lecture 151
    -- Created the project using Spring Initializr.
    -- Imported Project in IntelliJ as Maven Project from Existing resources.
    -- Started the Spring Project.

---
    Lecture 152
    -- Created GameRunner and MarioGame class in Game Package.
    -- Called GameRunner run() from mail LearnSpringFrameworkApplication class.

---
    Lecture 153
    -- Created SuperContraGame class in Game Package.
    -- Called GameRunner run() from mail LearnSpringFrameworkApplication class to execute SuperContraGame.
    -- This shows that GameRunner is tighly coupled to eiter MarioGame or SuperContraGame.
    -- We need to Update GameRunner everytime we want to run a dufferent game.

---
    Lecture 154
    -- Created GamingConsole interface.
    -- Implemented interface for Mario SuperContra and PacmanGame classes.
    -- Updated GameRunner class to have variable of type GamingConsole rather than a specific game.
    -- this is how we implemented loose couppling using Interface.