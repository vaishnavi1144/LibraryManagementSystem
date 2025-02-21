class Book {
    private String title, author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
}
class Member {
    private String name, memberId;
    private int borrowedBooks;
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = 0;
    }
    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }
    public int getBorrowedBooks() {
        return borrowedBooks;
    }
    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }
    public void decrementBorrowedBooks() {
        borrowedBooks--;
    }
}
class Librarian {
    public void addBook(Book book) {
        System.out.println("Added book: " + book.getTitle());
    }
    public void addMember(Member member) {
        System.out.println("Added member: " + member.getName());
    }
    public void borrowBook(Member member, Book book) {
        System.out.println(member.getName() + " borrowed " + book.getTitle());
        member.incrementBorrowedBooks();
    }
    public void returnBook(Member member, Book book) {
        System.out.println(member.getName() + " returned " + book.getTitle());
        member.decrementBorrowedBooks();
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        FictionBook book2 = new FictionBook("1984", "George Orwell", 1949, "Dystopian");
        Member member1 = new Member("John Doe", "M123");
        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addMember(member1);
        librarian.borrowBook(member1, book1);
        librarian.borrowBook(member1, book2);
        librarian.returnBook(member1, book1);
    }
}
