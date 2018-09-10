# Spring-CRM-Web-App


This Spring MVC and Hibernate Web Application models a Customer Relationship Management (CRM) System, supporting CRUD operations through a MySQL database.

By using Dependency Injection(DI) through the Spring Framework I can easily inject dependencies such as Data Access Objects (DAO) and Service Layers through my class constructors and fields instead of hardwiring resources. The Spring Framework greatly simplifies the management of dependencies to make building web applications easier.

The backend database processing uses Hibernate ORM, the Java Persistence API (JPA), and SQL to model Java classes as entities to map to our MySQL database as well as the Data Access Object (DAO) and Service Layer design patterns to give our Customer Controller class a single streamlined view of all the data I pull together from the SQL database. 
The Service Layer known as the Customer Service implementation in my application will act as the transaction layer between the Customer Controller and CustomerDAO. This makes it easy to delegate calls to a DAO in the service layer and simplifies the process of extending new Data Access Objects. This architectural style follows the Open-Closed Principle in SOLID OOP. 

Design Patterns Used: Dependency Injection, DAO, Service Layer, Singleton, Factory Method


