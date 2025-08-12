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

Date : 2025-08-06

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

Date : 2025-08-13

---
    Lecture 157
    -- Nothing much ( Why Should you teach others )

---
    Lecture 158
    --- Setup logging.level.org.springframework=debug
    --- Above is done to get log levels to Debug mode to understand what is happening in background.

    Important section from logs post starting the application :

    2025-08-13T07:11:02.459+08:00 DEBUG 24640 --- [learn-spring-framework] [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\GameRunner.class]
    2025-08-13T07:11:02.463+08:00 DEBUG 24640 --- [learn-spring-framework] [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\SuperContraGame.class]
    --- above shows effect of @Component annotation.

    2025-08-13T07:11:02.732+08:00 DEBUG 24640 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'learnSpringFrameworkApplication'
    2025-08-13T07:11:02.732+08:00 DEBUG 24640 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'gameRunner'
    2025-08-13T07:11:02.732+08:00 DEBUG 24640 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'superContraGame'
    2025-08-13T07:11:02.732+08:00 DEBUG 24640 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Autowiring by type from bean name 'gameRunner' via constructor to bean named 'superContraGame'
    --- How Shared instances of important classes are craeted as SINGLETON BEAN.

    O/P 
    SuperContra UP
    SuperContra  Down
    SuperContra  Right
    SuperContra  Left

    --- Now when No Implementation of GamingConsole is tagged as @Component - This happens ****************************************************

    2025-08-13T07:36:25.265+08:00 DEBUG 24176 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'learnSpringFrameworkApplication'
    2025-08-13T07:36:25.265+08:00 DEBUG 24176 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'gameRunner'
    2025-08-13T07:36:25.265+08:00  WARN 24176 --- [learn-spring-framework] [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gameRunner' defined in file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\GameRunner.class]: Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'com.example.learn_spring_framework.game.GamingConsole' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
    2025-08-13T07:36:25.265+08:00 DEBUG 24176 --- [learn-spring-framework] [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'

    2025-08-13T07:36:25.329+08:00 DEBUG 24176 --- [learn-spring-framework] [           main] o.s.b.d.LoggingFailureAnalysisReporter   : Application failed to start due to an exception
    org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.learn_spring_framework.game.GamingConsole' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}

    ***************************
    APPLICATION FAILED TO START
    ***************************
    Description:
    Parameter 0 of constructor in com.example.learn_spring_framework.game.GameRunner required a bean of type 'com.example.learn_spring_framework.game.GamingConsole' that could not be found.
    Action:
    Consider defining a bean of type 'com.example.learn_spring_framework.game.GamingConsole' in your configuration.

    --- Now when More than ONE Implementation of GamingConsole is tagged as @Component - This happens  ****************************************

    2025-08-13T07:43:49.140+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\GameRunner.class]
    2025-08-13T07:43:49.140+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\MarioGame.class]
    2025-08-13T07:43:49.140+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\PacManGame.class]
    2025-08-13T07:43:49.140+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.c.a.ClassPathBeanDefinitionScanner   : Identified candidate component class: file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\SuperContraGame.class]
    
    2025-08-13T07:43:49.416+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'learnSpringFrameworkApplication'
    2025-08-13T07:43:49.416+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'gameRunner'
    2025-08-13T07:43:49.419+08:00  WARN 32196 --- [learn-spring-framework] [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gameRunner' defined in file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\GameRunner.class]: Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'com.example.learn_spring_framework.game.GamingConsole' available: expected single matching bean but found 3: marioGame,pacManGame,superContraGame

    2025-08-13T07:43:49.469+08:00 DEBUG 32196 --- [learn-spring-framework] [           main] o.s.b.d.LoggingFailureAnalysisReporter   : Application failed to start due to an exception
    org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.example.learn_spring_framework.game.GamingConsole' available: expected single matching bean but found 3: marioGame,pacManGame,superContraGame

    ***************************
    APPLICATION FAILED TO START
    ***************************

    Description:
    Parameter 0 of constructor in com.example.learn_spring_framework.game.GameRunner required a single bean, but 3 were found:
    - marioGame: defined in file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\MarioGame.class]
    - pacManGame: defined in file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\PacManGame.class]
    - superContraGame: defined in file [S:\Java_Workspaces\spring\Learn-Spring-Boot\learn-spring-framework\target\classes\com\example\learn_spring_framework\game\SuperContraGame.class]

    This may be due to missing parameter name information
    Action:
    Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed