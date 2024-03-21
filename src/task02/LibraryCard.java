// В классе LibraryCard:
package task02;

import task02.Book;

public class LibraryCard {
    // Были изменены типы данных для номера карточки и самой книги.

    private int number;
    private Book book;
    // Были удалены поля для информации о выдаче и читателе, так как эта информация хранится в объекте книги.
    // Поля для выдачи и читателя теперь хранятся в объекте Book.
    private boolean issued = false;
    private String customer;

    public LibraryCard(Book book, boolean issued) {
        this.book = book;
        this.issued = issued;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Book getBook() {
        return book;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        if (!issued) {
            return "Карточка номер: " + number + ", книга: " + book.getName();
        } else {
            return "Карточка номер: " + number + ", книга: " + book.getName() + ", забрал: " + customer;
        }
    }
}
