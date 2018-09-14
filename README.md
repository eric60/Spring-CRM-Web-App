# Ticket Master - A Spring and Hibernate Customer Relationship Management Web Application 

### Table of Contents 
* Application Purpose
* Architecture Design

   * Design Patterns Used
* Spring Framework
   * Spring Modules Used
* Hibernate Framework
* Deployment
* Resources Used
### Application Purpose
This Spring MVC and Hibernate Web Application models a Customer Relationship Management(CRM) System for customers with tickets to a venue, supporting CRUD operations through a MySQL database. Customized constraints makes the application unique in dealing with the data representing ticket customers/buyers, and eventually ticket sellers which will be implementated later on.

### Architecture Design
The Model-View-Controller architecture of the application seperates the presentation layer from the logic layer, making the application much more maintainable and easier to develop on. The model should be self-contained and be separate from the view and controller. The controller decouples the model from the view, and can connect multiple views to multiple models.

**Design Patterns Used:** 
* Model-View-Controller
* Dependency Injection
* Factory Method
* Service Layer 
* Singleton
* DAO

### Spring Framework
By using Dependency Injection(DI) through the Spring Framework, I can easily inject dependencies such as Data Access Objects (DAO) and Service Layers through my class constructors and fields instead of hardwiring resources. DI and the Inversion of Control(IOC) that the Spring Container enforces with my defined Java beans makes the application loosely coupled, making the application easier to unit test and modify in the future without changing multiple dependent classes or configurations (this follows the open-closed principle). Overall, I found the Spring Framework greatly simplified the building and management of a web application by abstracting away dependency management and letting you focus on the business logic of the application.

**Spring Modules Used:**
* Spring Security 

### Hibernate Framework
The backend database processing uses Hibernate ORM, the Java Persistence API (JPA), and SQL to model Java classes as entities to map to our MySQL database as well as the Data Access Object (DAO) and Service Layer design patterns to give our Customer Controller class a single streamlined view of all the model data I pull from the SQL database through one to one mappings or one to many mappings.

The Service Layer known as the Customer Service implementation in my application will act as the transaction layer between the Customer Controller and CustomerDAO. This makes it easy to delegate calls to a DAO in the service layer and simplifies the process of extending new Data Access Objects. This architectural style follows the Open-Closed Principle in SOLID OOP.
I define the Java beans for my JDBC C3PO connection pooling, session factory, and Hibernate Transaction manager in my xml configurations.

### Deployment
The application is run locally on the open source Apache Tomcat server, which is a Java Servlet Container. I specify the Dispatcher servlet which handles the HTTP requests and responses and the return of my JSP in my web.xml configurations, as well as my bean view resolver.

### Resources Used

<a href="https://spring.io/docs/reference" target="_blank">Spring Docs and JAR Files</a></br>
<img src="https://upload.wikimedia.org/wikipedia/en/2/20/Pivotal_Java_Spring_Logo.png" width="240" height="80">

<a href="http://hibernate.org/orm/documentation/5.3/" target="_blank">Hibernate Docs and JAR Files</a></br>
<img src="http://198.211.104.161/wp-content/uploads/2014/01/Hibernate-logo.png" width="100" height="100">

<a href="http://tomcat.apache.org/" target="_blank">Apache Tomcat Connector JAR Files</a></br>
<img src="https://sdtimes.com/wp-content/uploads/2017/07/tomcat-1.png" width="100" height="100">

<a href="https://www.mysql.com/downloads/" target="_blank">Oracle MySQL Database Download</a></br>
<img src="https://cdn.worldvectorlogo.com/logos/mysql.svg" width="150" height="150">






