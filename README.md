# JobListing Backend

## Overview

**JobListing** is a Spring Boot-based backend service that enables users to list jobs and search for jobs based on various criteria. The project is designed to allow job seekers to explore job opportunities by typing in keywords, and job posters to add detailed job listings. This backend service connects to a MongoDB Atlas database and is structured using the Maven build system. The API documentation is integrated with Swagger2 and Swagger UI for easy interaction and testing of the endpoints.

## Features

- **Job Listing**: Users can post jobs with details such as:
  - Job profile (title)
  - Job description
  - Experience required
  - Skills needed
- **Job Search**: Users can search for jobs using keywords (e.g., job title, required skills, etc.), leveraging MongoDB Atlas’s full-text search capabilities to show relevant results.
- **RESTful API**: Built with REST principles, the API offers endpoints to create, search, and manage job listings.

## Tech Stack

- **Backend Framework**: Spring Boot
- **Database**: MongoDB Atlas
- **Build Tool**: Maven
- **API Documentation**: Swagger2, Swagger UI

## Getting Started

### Prerequisites

To run this project locally, ensure you have the following installed:

- Java 17 or later
- Maven 3.6 or later
- MongoDB Atlas account (with a database and collection for job listings)
- IDE (IntelliJ, Eclipse, etc.)



## Dependencies

The following key dependencies are used in this project:

- **Spring Boot Starter Web**: To build REST APIs.
- **Spring Data MongoDB**: To interact with the MongoDB Atlas database.
- **Swagger2 & Swagger UI**: For API documentation and testing.

To see the full list of dependencies, check the `pom.xml` file.






