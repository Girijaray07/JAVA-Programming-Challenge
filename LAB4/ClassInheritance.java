class LibraryItem {
    int itemNo;
    int studID;
    boolean isCheckedOut;

    LibraryItem(int itemNo, int studID) {
        this.itemNo = itemNo;
        this.studID = studID;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Item " + itemNo + " checked out by Student ID: " + studID);
        } else {
            System.out.println("Item " + itemNo + " is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Item " + itemNo + " returned.");
        } else {
            System.out.println("Item " + itemNo + " was not checked out.");
        }
    }

    public void displayInfo() {
        System.out.println("Item No: " + itemNo + ", Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }
}

class Book extends LibraryItem {
    String title;
    String author;

    Book(String title, String author, int itemNo, int studID) {
        super(itemNo, studID);
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book - Title: " + title + ", Author: " + author);
        super.displayInfo();
    }
}

class DVD extends LibraryItem {
    String dvdTitle;
    String dvdAuthor;

    DVD(String dvdTitle, String dvdAuthor, int itemNo, int studID) {
        super(itemNo, studID);
        this.dvdTitle = dvdTitle;
        this.dvdAuthor = dvdAuthor;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD - Title: " + dvdTitle + ", Author: " + dvdAuthor);
        super.displayInfo();
    }
}

class Journal extends LibraryItem {
    String journalTitle;
    String journalAuthor;

    Journal(String journalTitle, String journalAuthor, int itemNo, int studID) {
        super(itemNo, studID);
        this.journalTitle = journalTitle;
        this.journalAuthor = journalAuthor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Journal - Title: " + journalTitle + ", Author: " + journalAuthor);
        super.displayInfo();
    }
}

public class ClassInheritance {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 13, 101);
        DVD dvd = new DVD("Introduction to Java", "Jane Smith", 24, 102);
        Journal journal = new Journal("Java Research", "Dr. Brown", 35, 103);

        book.displayInfo();
        dvd.displayInfo();
        journal.displayInfo();

        book.checkOut();
        dvd.checkOut();
        journal.returnItem();

        book.returnItem();
        dvd.returnItem();
    }
}