// В классе Library:
package task02;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Были удалены лишние комментарии и методы для работы с номером карточки, так как они больше не нужны.
    // В методе findBook была упрощена проверка имени книги.
    // В методе issueBook была упрощена логика выдачи книги.
    // В методе receiveBook была упрощена логика возврата книги.
    private final List<LibraryCard> cards;

    public Library() {
        cards = new ArrayList<>();
    }

    void addCardToLibrary(LibraryCard card) {
        cards.add(card);
    }

    public LibraryCard findBook(String name) {
        for (LibraryCard card : cards) {
            Book book = card.getBook();
            if (book.getName().equals(name)) {
                return card;
            }
        }
        return null;
    }

    void issueBook(String name, String readerName) {
        LibraryCard card = findBook(name);
        if (card != null && !card.isIssued()) {
            card.setCustomer(readerName);
            card.setIssued(true);
        }
    }

    void receiveBook(String name) {
        LibraryCard card = findBook(name);
        if (card != null) {
            card.setIssued(false);
            card.setCustomer(null);
        }
    }

    void showIssuedBooks() {
        System.out.println("Выданы книги:");
        for (LibraryCard card : cards) {
            if (card.isIssued()) {
                System.out.println(card);
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "cards=" + cards +
                '}';
    }
}
