package task02;

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.addProd(new Product("Штаны", 150.0));
        store.addProd(new Product("Носки", 50.0));

        Order order1 = new Order(1111);
        Order order2 = new Order(57);
        order1.setListProd("Штаны");
        order2.setListProd("Носки");
        store.createOrder(order1);
        store.createOrder(order2);

        System.out.println(store);
        Book b1 = new Book("Война и мир", "Л.Н.Толстой");
        Book b2 = new Book("Бег", "М.А.Булгаков");
        Book b3 = new Book("Е. Онегин", "А.С.Пушкин");
        Book b4 = new Book("Приключения Незнайки", "Н.Носов");
        System.out.println(b3);

        LibraryCard card1 = new LibraryCard(b1, false);
        LibraryCard card2 = new LibraryCard(b2, false);
        LibraryCard card3 = new LibraryCard(b3, false);
        LibraryCard card4 = new LibraryCard(b4, false);
        System.out.println(card1);

        Library library = new Library();
        library.addCardToLibrary(card1);
        library.addCardToLibrary(card2);
        library.addCardToLibrary(card3);
        library.addCardToLibrary(card4);
        System.out.println(library);


        library.issueBook("Приключения Незнайки", "Петров");
        library.issueBook("Бег", "Баширов");
        library.showIssuedBooks();

    }
}