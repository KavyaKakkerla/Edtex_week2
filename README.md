# Edtex_week2
README: Library Management System
This README file explains how to compile and run the Library Management System program written in Java.

Overview
The Library Management System (Lms.java) allows users to perform the following operations:

Add, remove, and display books.
Add, remove, and display patrons.
Borrow and return books with proper validations.
The program is written following Object-Oriented Programming (OOP) principles, incorporating encapsulation, exception handling, and modular design.

Prerequisites
Java Development Kit (JDK) installed (version 8 or higher).
A text editor (e.g., Notepad++, Visual Studio Code) or an IDE (e.g., IntelliJ IDEA, Eclipse).
Terminal or command prompt for compilation and execution.
File Structure
Lms.java: The main program file containing all the code.
How to Compile and Run
Steps to Compile:
Save the program in a file named Lms.java.
Open a terminal or command prompt.
Navigate to the directory where the Lms.java file is saved.
Run the following command to compile the program:
bash
Copy
Edit
javac Lms.java
If there are no syntax errors, this will generate a Lms.class file.
Steps to Run:
After successful compilation, run the following command to execute the program:
bash
Copy
Edit
java Lms
Follow the on-screen menu to interact with the system.
Program Usage
Menu Options:
Add Book: Add a new book to the system by providing title, author, ISBN, and quantity.
Remove Book: Remove a book by entering its ISBN.
Display Books: View the list of all available books.
Add Patron: Register a new patron by providing their name and ID.
Remove Patron: Remove a patron by entering their ID.
Display Patrons: View the list of all registered patrons.
Borrow Book: Borrow a book by entering the patron ID and book ISBN.
Return Book: Return a book by entering the patron ID and book ISBN.
Exit: Exit the program.
Error Handling
The program uses exceptions to handle errors, such as:

Trying to remove or borrow a book that does not exist.
Attempting to return a book that has not been borrowed.
Handling invalid inputs like a nonexistent patron ID or ISBN.
