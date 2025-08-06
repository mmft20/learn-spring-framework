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
    -- Called GameRunner run() from main LearnSpringFrameworkApplication class.

---
    Lecture 153
    -- Created SuperContraGame class in Game Package.
    -- Called GameRunner run() from main LearnSpringFrameworkApplication class to execute SuperContraGame.
    -- This shows that GameRunner is tighly coupled to eiter MarioGame or SuperContraGame.
    -- We need to Update GameRunner everytime we want to run a dufferent game.

---
    Lecture 154
    -- Created GamingConsole interface.
    -- Implemented interface for Mario SuperContra and PacmanGame classes.
    -- Updated GameRunner class to have variable of type GamingConsole rather than a specific game.
    -- this is how we implemented loose couppling using Interface.

---
    Lecture 155
    -- Nothing Much

---
    Lecture 156
    -- IMPORTANT
    -- How @Compoent and @Autowired are added and used.
    -- How Spring context is craeted and assigned to a variable.
    -- How the Spring context variable is used to craete a Bean.
    -- How the BEAN craetion happens automatically using @autowired for GameRunner class.
    -- Why Only SuperContraGame insyance was craeted as a dependency for GameRunner class.