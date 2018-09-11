# Spring CRM Web App - Ticket Master

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
By using Dependency Injection(DI) through the Spring Framework.I can easily inject dependencies such as Data Access Objects (DAO) and Service Layers through my class constructors and fields instead of hardwiring resources. DI and the Inversion of Control(IOC) that Spring enforces also makes the application loosely coupled, making it easier to unit test and easier to modify the application without changing multiple things, following the open-closed principle. Overall, I found the Spring Framework greatly simplifies the management of dependencies to make building web applications easier.

### Hibernate Framework
The backend database processing uses Hibernate ORM, the Java Persistence API (JPA), and SQL to model Java classes as entities to map to our MySQL database as well as the Data Access Object (DAO) and Service Layer design patterns to give our Customer Controller class a single streamlined view of all the data I pull together from the SQL database. 
The Service Layer known as the Customer Service implementation in my application will act as the transaction layer between the Customer Controller and CustomerDAO. This makes it easy to delegate calls to a DAO in the service layer and simplifies the process of extending new Data Access Objects. This architectural style follows the Open-Closed Principle in SOLID OOP. 

### Deployment
The application is run locally on the open source Apache Tomcat server, which is a Java Servlet Container. 

**Resources Used:**
*[Spring Docs and JAR files](https://spring.io/docs/reference)
*[Hibernate Docs and JAR files](http://hibernate.org/orm/documentation/5.3/)
*[Apache Tomcat connecters and JAR files](http://tomcat.apache.org/)



