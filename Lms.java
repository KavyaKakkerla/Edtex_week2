import java.util.*;

class Book{
    private String title, author;
    private int isbn, quantity;

    public Book(String title, String author, int isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

     public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}

class Patron {
    private String name;
    private int id;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) throws Exception {
        if (book.getQuantity() > 0) {
            borrowedBooks.add(book);
            book.setQuantity(book.getQuantity() - 1);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            throw new Exception("Book not available.");
        }
    }

    public void returnBook(Book book) throws Exception {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setQuantity(book.getQuantity() + 1);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            throw new Exception("Book not borrowed by " + name);
        }
    }

    @Override
    public String toString() {
        return "Patron ID: " + id + ", Name: " + name + ", Borrowed Books: " + borrowedBooks.size();
    }
}

public class Lms{
    private static List<Book> books = new ArrayList<>();
    private static List<Patron> patrons = new ArrayList<>();

    private static void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        int isbn = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        books.add(new Book(title, author, isbn, quantity));
        System.out.println("Book added successfully.");
    }

    private static void removeBook() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN of the book to remove: ");
        int isbn = sc.nextInt();
        boolean removed = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn) {
                books.remove(i);
                removed = true;
                System.out.println("Book removed successfully.");
                break;
            }
        }

        if (removed==false) {
            throw new Exception("Book not found.");
        }
    }

    private static void displayBooks() {
        System.out.println("\nAvailable Books:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private static void addPatron() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patron Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Patron ID: ");
        int id = sc.nextInt();
        patrons.add(new Patron(name, id));
        System.out.println("Patron added successfully.");
    }

    private static void removePatron() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patron ID to remove: ");
        int id = sc.nextInt();
        boolean removed = false;

        for (int i = 0; i < patrons.size(); i++) {
            if (patrons.get(i).getId() == id) {
                patrons.remove(i);
                removed = true;
                System.out.println("Patron removed successfully.");
                break;
            }
        }

        if (removed==false) {
            throw new Exception("Patron not found.");
        }
    }

    private static void displayPatrons() {
        System.out.println("\nRegistered Patrons:");
        if (patrons.isEmpty()) {
            System.out.println("No patrons registered.");
        } else {
            for (Patron patron : patrons) {
                System.out.println(patron);
            }
        }
    }

    private static void borrowBook() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patron ID: ");
        int id = sc.nextInt();
        Patron patron = findPatronById(id);

        displayBooks();
        System.out.print("Enter ISBN of the book to borrow: ");
        int isbn = sc.nextInt();
        Book book = findBookByIsbn(isbn);

        patron.borrowBook(book);
    }

    private static void returnBook() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patron ID: ");
        int id = sc.nextInt();
        Patron patron = findPatronById(id);

        System.out.print("Enter ISBN of the book to return: ");
        int isbn = sc.nextInt();
        Book book = findBookByIsbn(isbn);

        patron.returnBook(book);
    }

    private static Book findBookByIsbn(int isbn) throws Exception {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        throw new Exception("Book not found.");
    }

    private static Patron findPatronById(int id) throws Exception {
        for (Patron patron : patrons) {
            if (patron.getId() == id) {
                return patron;
            }
        }
        throw new Exception("Patron not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Add Patron");
            System.out.println("5. Remove Patron");
            System.out.println("6. Display Patrons");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        removeBook();
                        break;
                    case 3:
                        displayBooks();
                        break;
                    case 4:
                        addPatron();
                        break;
                    case 5:
                        removePatron();
                        break;
                    case 6:
                        displayPatrons();
                        break;
                    case 7:
                        borrowBook();
                        break;
                    case 8:
                        returnBook();
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}


