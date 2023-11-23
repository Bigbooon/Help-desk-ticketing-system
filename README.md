# Help-desk-ticketing-system
help desk ticketing system that allows different types of support requests to be handled by different support teams, and implement a chain of responsibility.

# Design Choices and Implementation Report
Design Choices:
1. Chain of Responsibility Pattern
2. Handler Interface was defined to ensure that all handlers in the chain implement a common method handleRequest(). 
3. Concrete Handler Classes were implemented, each handling a specific type of support request. 
4. SupportRequest Class was designed to encapsulate the details of a support request, including type, description, and priority. A unique identifier (id) was added to each request to facilitate tracking and reference.
5. The Test Main class was created to demonstrate how the Chain of Responsibility pattern works in handling different types of support requests.

# How the Chain of Responsibility Pattern Simplified Implementation
The implementation of the help desk ticketing system using the Chain of Responsibility pattern provides a flexible and scalable solution for handling diverse support requests. The pattern's hierarchical structure simplifies the organization of handlers, and the loose coupling enhances maintainability and extensibility. 

## The user used Yandex Translator)))
