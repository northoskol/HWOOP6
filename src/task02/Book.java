// В классе Book изменения не требуются, так как он уже соответствует принципам SOLID.
package task02;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Книга: '" + name + "'. Автор: " + author;
    }
}
