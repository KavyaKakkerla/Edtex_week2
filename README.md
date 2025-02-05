This project is a Library Management System written in Java that allows users to manage books and patrons.
The program demonstrates the use of Object-Oriented Programming (OOP) concepts and Java Collection Framework classes.

===>Features
=> Book Management
1.Add books (Fiction and Non-Fiction).
2.Remove books.
3.Display a list of all available books.

=>Patron Management

1.Add patrons.
2.Remove patrons.
3.Display a list of all registered patrons.
4.Borrowing and Returning Books

=>Patrons can borrow books.
=>Patrons can return books.



===>Demonstrates OOP Concepts

-> Encapsulation, Inheritance, Polymorphism, and Abstraction.
-> Use of abstract classes and interfaces.
-> Utilizes Java Collection Framework
-> ArrayList for managing lists of books and patrons.



===> Prerequisites
Java Development Kit (JDK) installed (version 8 or higher).
A Java-compatible IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code.
Project Structure
The project contains the following classes inside the LMSS package:

->Book (Superclass)
Represents a generic book with properties like title, author, ISBN, and quantity.

->FictionBook (Subclass of Book)
Represents fiction books with an additional genre field.

->NonFictionBook (Subclass of Book)
Represents non-fiction books with an additional subject field.

->Patron
Represents a library patron who can borrow and return books.

->BookList
Manages the collection of books using an ArrayList.

->PatronList
Manages the collection of patrons using an ArrayList.

->LibraryManagementSystem
The main class containing the program's entry point and menu-driven interface.

->Borrowable (Interface)
Defines methods for borrowing and returning books.

==>How to Compile and Run
1. Compile the Program
Extract the LMSS.zip file.

Navigate to the directory containing the LMSS package.

Open a terminal or command prompt in this directory.

Run the following command to compile all .java files:

javac -d . LMSS/*.java
This will compile the program and place the .class files in their respective package folders.

2. Run the Program
Navigate to the directory containing the compiled LibraryManagementSystem class.

Run the program using the following command:

java LMSS.LibraryManagementSystem

Follow the on-screen menu to interact with the system.

===>Demonstration of Concepts
OOP Concepts

Encapsulation: All class attributes are private, and access is provided through getter and setter methods.
Inheritance: FictionBook and NonFictionBook inherit from the Book class.
Polymorphism: Overriding the toString() method in subclasses to provide specific details and also borrowBook and returnBook.
Abstraction: Borrowable interface defines a contract for borrowing and returning books.
Collection Framework
ArrayList is used to store books and patrons dynamically.
Methods like add(), remove(), and iteration are used for managing collections.
