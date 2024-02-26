# SFU CMPT276: Assignment 2 - Student Data App

## Overview

This project is a web application designed to track a group of students. It allows users to add new students, modify student attributes, and delete students from the database.

## Features

- **Add New Students**: Users can add new students with corresponding attributes such as name, weight, height, hair color, and GPA.
- **Edit Student Attributes**: Users can modify the attributes of any existing student. The application displays a form with existing attributes already filled in for easy editing.
- **Delete Students**: Users can delete any student from the database. There is no confirmation prompt for the delete action.
- **Display Students**: The application displays all students currently in the database as rectangles. Each rectangle represents a student and includes their name, GPA, and other attributes. The rectangles are sized and colored based on the student's weight, height, and hair color.

## Technical Stack

- Java
- Spring Framework
- PostgreSQL

## Usage

1. Access the web application using the provided URL.
2. Navigate to the root endpoint `/` to interact with the main features of the application.
3. Use the "Add New Student" button to add new students and fill in their details.
4. Existing students are displayed as rectangles on the page. Clicking on a student's rectangle allows you to edit or delete the student.

## Features

- The application dynamically sizes and colors the rectangles based on the student's attributes, making it easier to distinguish between different students.
- Additional attributes beyond the minimum requirements can be easily added to the student data model for increased flexibility and customization.

## Contact Information

Han Tun  
Email: xha98@sfu.ca

## Links

- GitHub Repository: [GitHub Link](https://github.com/xhanwt/Student-Data-App-Java-Spring-Postgres)
- App URL: [App URL](https://student-data-app-java-spring-postgres.onrender.com/)
