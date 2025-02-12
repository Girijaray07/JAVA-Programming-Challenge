class LibraryItem
{
    int itemno;
    int studID;

    LibraryItem(int itemno, int studID)
    {
        this.itemno = itemno;
        this.studID = studID;
    }
}

class Book extends LibraryItem
{
    String title;
    String author;

    Book(String title, String author, int itemno, int studID)
    {
        super(itemno, studID);

        this.title = title;
        this.author = author;
    }
}

class DVD extends LibraryItem
{
    String dvdTitle;
    String dvdAuthor;

    DVD(String dvdTitle, String dvdAuthor, int itemno, int studID)
    {
        super(itemno, studID);

        this.dvdTitle = dvdTitle;
        this.dvdAuthor = dvdAuthor;
    }
}

class Journal extends LibraryItem
{
    String journalTitle;
    String journalAuthor;

    Journal(String journalTitle, String journalAuthor, int itemno, int studID)
    {
        super(itemno, studID);

        this.journalTitle = journalTitle;
        this.journalAuthor = journalAuthor;
    }
}

public class ClassInheritance
{
    public static void main(String[] args)
    {
        Book book = new Book("Java Programming", "John Doe", 13, 101);
        DVD dvd = new DVD("Java Programming", "John Doe", 24, 102);
        Journal journal = new Journal("Java Programming", "John Doe", 35, 103);
    }
}