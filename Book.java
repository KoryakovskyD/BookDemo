
/**
 * Created by Дмитрий on 16.10.2021.
 */
public class Book {
    private String name;
    private PublishingOffice publishingOffice;
    private int year;
    private String[] authors = null;

    public Book(String name, int year, PublishingOffice publishingOffice) {
        setName(name);
        setYear(year);
        setPublishingOffice(publishingOffice);
    }

    public Book(String name, String author,  int year, PublishingOffice publishingOffice) {
        setName(name);
        setYear(year);
        setPublishingOffice(publishingOffice);
        authors = new String[1];
        this.authors[0] = author;
    }

    public Book(String name, String[] authors,  int year, PublishingOffice publishingOffice) {
        setName(name);
        setYear(year);
        setPublishingOffice(publishingOffice);
        setAuthors(authors);
    }

    public String getName() {
        return name;
    }

    public PublishingOffice getPublishingOffice() {
        return publishingOffice;
    }

    public int getYear() {
        return year;
    }

    public String getAuthorByIndex(int index) {
        if (authors.length <= index || index < 0) {
            throw new IllegalArgumentException("Invalid author index");
        }
        return authors[index];
    }

    public int getCountAuthors() {
        int i = 0;

        if (authors == null)
            return 0;

        for (String a : authors) {
            if (a!=null)
                i++;
            else
                return 0;
        }
        return i;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Incorrect book title.");
        this.name = name;
    }

    public void setPublishingOffice(PublishingOffice  publishingOffice) {
        if (publishingOffice == null)
            throw new IllegalArgumentException("Incorrect book publishing.");
        this.publishingOffice = publishingOffice;
    }

    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException("Incorrect book year.");
        this.year = year;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
        int i = 0;

        if (authors[0] == null)
            throw new IllegalArgumentException("The array must not contain empty references.");

        for (String a : authors) {
             authors[i] = a;
             i++;
        }
    }

    public String getAuthors() {
        String resAuthor = "";

        if (this.authors == null)
            return "There is no authors.";

        for (int i = 0; i<this.authors.length; i++) {
            if (authors[0]==null) {
                return resAuthor="There is no authors.";
            }
            if (authors[i]==null)
                return resAuthor;
            resAuthor=resAuthor + authors[i] + "; ";
        }
        return resAuthor;
    }

    public void print() {
        System.out.println("Name=" + getName() + "\n Author(s)=" +  getAuthors() + "(" + getCountAuthors() + ")" + "\n Year=" +
                getYear() + "\n Publishing=" + getPublishingOffice().getPublishingName() + "\n Publishing City=" + getPublishingOffice().getCity() + "\n\n");
    }
    public static void printAll(Book[] books) {
        for (Book b : books)
            b.print();
    }
}
