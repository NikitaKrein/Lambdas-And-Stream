package task_4;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private List<Author> authors;
    private int numberOfPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, List<Author> authors, int numberOfPages) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (this.getAuthors() == null || book.getAuthors() == null ||
                this.getTitle() == null || book.getTitle() == null) {
                    return false;
        }
        return getNumberOfPages() == book.getNumberOfPages() &&
                getTitle().equals(book.getTitle()) &&
                getAuthors().equals(book.getAuthors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthors(), getNumberOfPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = '" + title + '\'' +
                ", authors = " + authors +
                ", numberOfPages = " + numberOfPages +
                '}';
    }
}
