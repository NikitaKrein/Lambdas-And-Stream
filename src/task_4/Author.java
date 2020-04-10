package task_4;

import java.util.List;
import java.util.Objects;

public class Author {
    private String name;
    private short age;
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Author(String name, short age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        if (this.getBooks() == null || author.getBooks() == null ||
                this.getName() == null || author.getName() == null) {
            return false;
        }
        return getAge() == author.getAge() &&
                getName().equals(author.getName()) &&
                getBooks().equals(author.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getBooks());
    }

    @Override
    public String toString() {
        return "Author{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
