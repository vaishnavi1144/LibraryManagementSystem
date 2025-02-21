# Library Management System

## Overview
The *Library Management System* is a simple Java-based console application that simulates the operations of a library. It allows a librarian to add books, add members, and manage book borrowing and returning transactions. The project demonstrates *Object-Oriented Programming (OOP)* principles, such as *inheritance, **encapsulation, and **polymorphism*.

## Features
- Add books to the library
- Add members to the library
- Borrow books
- Return books
- Track the number of books borrowed by a member

## Technologies Used
- *Java* (JDK 8 or later)
- *Object-Oriented Programming (OOP) Concepts*

## Classes and Their Responsibilities
### 1. Book
Represents a general book with attributes:
- title
- author
- publicationYear

### 2. FictionBook (Inherits from Book)
Represents a specific type of book (fiction) with an additional attribute:
- genre

### 3. Member
Represents a library member with attributes:
- name
- memberId
- borrowedBooks (tracks the number of books borrowed)

### 4. Librarian
Handles book and member management, including:
- Adding books
- Adding members
- Borrowing books
- Returning books

### 5. LibraryManagementSystem
Contains the main method, which demonstrates the functionality of the library system.

## How to Run the Project
1. Clone this repository:
   sh
   git clone https://github.com/your-username/library-management-system.git
   
2. Navigate to the project directory:
   sh
   cd library-management-system
   
3. Compile the Java files:
   sh
   javac LibraryManagementSystem.java
   
4. Run the program:
   sh
   java LibraryManagementSystem
   

## Sample Output

Added book: To Kill a Mockingbird
Added book: 1984
Added member: John Doe
John Doe borrowed To Kill a Mockingbird
John Doe borrowed 1984
John Doe returned To Kill a Mockingbird
