Project Overview
This project is a simple Spring Boot application designed to simulate a streaming service and customer management system. It utilizes Java as the primary programming language and Maven for dependency management.

Classes
StreamingService
This class represents a streaming service and includes the following properties:

id: The unique identifier for the streaming service.
name: The name of the streaming service.
quality: The quality of the streaming service.
price: The subscription price of the streaming service.
It also provides getter and setter methods for these properties.

Customers
This class represents a customer and includes properties for customer details and the streaming service to which they are subscribed.

ScamBase
Acting as a fake database for the application, this class includes methods for adding, retrieving, and deleting customers and streaming services.

CustomersController
A REST controller for managing customers, this class includes the following endpoints:

GET /customers: Returns a list of all customers.
GET /customers/{id}: Returns a customer by their ID.
POST /addcustomer: Adds a new customer.
DELETE /deletecustomer/{id}: Deletes a customer by their ID.
StreamingServiceController
A REST controller for managing streaming services, this class includes the following endpoints:

GET /streams: Returns a list of all streaming services.
GET /streams/{id}: Returns a streaming service by its ID.
POST /addstream: Adds a new streaming service.
DELETE /deletestream/{id}: Deletes a streaming service by its ID.
Endpoints
CustomersController
GET /customers: Returns a list of all customers.
GET /customers/{id}: Returns a customer by ID.
POST /addcustomer: Adds a new customer.
DELETE /deletecustomer/{id}: Deletes a customer by ID.
StreamingServiceController
GET /streams: Returns a list of all streaming services.
GET /streams/{id}: Returns a streaming service by ID.
POST /addstream: Adds a new streaming service.
DELETE /deletestream/{id}: Deletes a streaming service by ID.
Usage
To interact with this application, you can send HTTP requests to the endpoints listed above. For POST requests, include the relevant object in the request body. For GET and DELETE requests that require an ID parameter, include the ID in the URL.
