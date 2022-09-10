package SF.IntupOutput.HomeWork.BookStore;


public class BookStore {
    public static void main(String[] args) {
        Book[] bookStore = new Book[5];
        Book book1 = new Book("The Hobbit", 1988, 500);
        addBook(bookStore, book1);

        Book book2 = new Book("The Hobbit", 1995, 1250);
        addBook(bookStore, book2);

        Book book3 = new Book("The Hobbit", 1995, 1550);
        addBook(bookStore, book3);

        Book book4 = new Book("War and peace", 1889, 155000);
        addBook(bookStore, book4);

        Book book5 = new Book("Vii", 1889, 15665);
        addBook(bookStore, book5);

        Book book6 = new Book("Chook abd Geek", 1998, 250);
        addBook(bookStore, book6);
        printAllBook(bookStore);
    }

    public static boolean checkBook(Book[] booksList, Book book) {
        for (Book item : booksList) {
            if (item != null && item.name.equals(book.name) && item.year == book.year) {
                System.out.println("Книга" + " " + book.name + " " + "уже есть в библиотеке");
                return true;
            }
        }
        System.out.println("Книги нет в библиотеке");
        return false;
    }

    public static void addBook(Book[] bookList, Book book) {
        if (!checkBook(bookList, book)) {

            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i == bookList.length - 1) {
                    System.out.println("Картотека переволнена");
                }
            }
        }
    }

    public static void printAllBook(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            if (bookList != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dрублей \n", i + 1, bookList[i].name,
                        bookList[i].year, bookList[i].price);
            }
        }
    }
}
