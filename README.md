CONSULTANT BOOKING WEB APPLICATION :


This is a simple web application that allows users to find and book sessions with consultants. Users can register as clients or consultants and perform various actions, including creating user accounts, creating available slots for consulting sessions, and searching for available consultants.


## Technologies Used
- Java
- Spring Boot
- In-memory Database (HashMap)
- Spring MVC

## Project Structure
The project is organized into several packages:
- `com.example.BookSessionWithConsultant.controller`: Contains the RESTful controllers.
- `com.example.BookSessionWithConsultant.model`: Defines the data models (User, Consultant, Slot, etc.).
- `com.example.BookSessionWithConsultant.repository`: Contains repository classes for database operations (using HashMap for in-memory storage).
- `com.example.BookSessionWithConsultant.service`: Contains the business logic and services.
- `com.example.BookSessionWithConsultant`: The main application class.

## Setup
1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Build the project.
4. Run the application.

## Usage

User Service

Register a User
Endpoint: POST /api/users/register
Description: Register a new user.
Request Body: User object with user details.
Response: Returns the registered User entity.

Get User by ID
Endpoint: GET /api/users/{id}
Description: Retrieve a user by their ID.
Path Parameter: id (Long) - The ID of the user to retrieve.
Response: Returns the User entity if found, or a 404 Not Found status if the user does not exist.

Get All Users
Endpoint: GET /api/users/all
Description: Retrieve all users.
Response: Returns a map of User entities with their IDs as keys.


Consultant Service

Register a Consultant
Endpoint: POST /api/consultants/register
Description: Register a new consultant.
Request Body: Consultant object with consultant details.
Response: Returns the registered Consultant entity.

Get Consultant by ID
Endpoint: GET /api/consultants/{id}
Description: Retrieve a consultant by their ID.
Path Parameter: id (Long) - The ID of the consultant to retrieve.
Response: Returns the Consultant entity if found, or a 404 Not Found status if the consultant does not exist.

Get All Consultants
Endpoint: GET /api/consultants/all
Description: Retrieve all consultants.
Response: Returns a map of Consultant entities with their IDs as keys.


Slot Service

Create a Slot
Endpoint: POST /api/slots/create
Description: Create a time slot.
Request Body: Slot object with slot details.
Response: Returns the created Slot entity.

Get Available Slots
Endpoint: GET /api/slots/available
Description: Retrieve available slots for a consultant.
Query Parameters:
consultantId (Long) - The ID of the consultant.
startTime (String) - The start time for the search (in ISO-8601 format).
Response: Returns a list of available Slot entities.


How to Use the API

User Registration:

To register a new user, send a POST request to /api/users/register with the user's information in the request body. The registered user entity will be returned in the response.

Getting User Information:

To retrieve user information by ID, send a GET request to /api/users/{id} where {id} is the user's ID. You will receive the User entity as the response.

Consultant Registration:

To register a new consultant, send a POST request to /api/consultants/register with the consultant's details in the request body. The registered consultant entity will be returned in the response.

Getting Consultant Information:

To retrieve consultant information by ID, send a GET request to /api/consultants/{id} where {id} is the consultant's ID. You will receive the Consultant entity as the response.

Slot Creation:

To create a time slot, send a POST request to /api/slots/create with the slot details in the request body. The created Slot entity will be returned in the response.

Getting Available Slots:

To retrieve available slots for a consultant, send a GET request to /api/slots/available with the consultant's ID and start time as query parameters. You will receive a list of available Slot entities in the response.

