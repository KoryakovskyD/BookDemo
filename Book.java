import java.util.Arrays;

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
    }

    public String getAuthors() {
        String resAuthor = "";

        //System.out.println(Arrays.toString(authors));

        if (authors == null || authors[0] == null)
            return "There is no authors.";

        for (int i = 0; i<this.authors.length; i++) {
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
