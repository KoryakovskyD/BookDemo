/**
 * Created by Дмитрий on 16.10.2021.
 */
public class Main {
    public static void main(String[] args) {
        PublishingOffice publishingOffice1 = new PublishingOffice("Проспект", "Москва");
        PublishingOffice publishingOffice2 = new PublishingOffice("Питер", "Санкт-Петербург");
        PublishingOffice publishingOffice3 = new PublishingOffice("БХВ", "Санкт-Петебург");
        PublishingOffice publishingOffice4 = new PublishingOffice("Диалектика", "Киев");


        Book[] book = new Book[] {
                new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных",new String[] {"Седжвик Роберт","Уэйн Кевин"}, 2018, publishingOffice2),
                new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное","Вигерс Карл", 2019, publishingOffice3),
                new Book("Java. Полное руководство, 10-е издание","Шилдт Герберт", 2018, publishingOffice4),
                new Book("C/C++. Процедурное программирование","Полубенцева М.И.", 2017, publishingOffice3),
                new Book("Конституция РФ", 2020, publishingOffice1),
        };


        Book bookByAuthorIndex =  new Book("Java. Полное руководство, 10-е издание",new String[] {"Седжвик Роберт","Уэйн Кевин"}, 2018, publishingOffice4);
        System.out.println("\nAuthor by index 1 = " + bookByAuthorIndex.getAuthorByIndex(1)+ "\n");
       //bookByAuthorIndex.getAuthorByIndex(2);   //error
        Book.printAll(book);

        // An error in the name of the city! The array will be printed again with the error replaced.
        if (publishingOffice3.getCity().equals("Санкт-Петебург")) {
            publishingOffice3.setCity("Санкт-Петербург");
            System.out.println("\n\nAn error in the name of the city!\n" +
                    "The array will be printed again with the error replaced.\n\n");
        }

        Book.printAll(book);


        System.out.println("---------------Test--------------------");

        Book bookWithoutAuthor1 =  new Book("Java. Полное руководство, 10-е издание",new String[] {null}, 2018, publishingOffice4);
        Book bookWithoutAuthor2 =  new Book("Java. Полное руководство, 10-е издание", 2018, publishingOffice4);

        bookWithoutAuthor1.print();
        bookWithoutAuthor2.print();
    }
}
