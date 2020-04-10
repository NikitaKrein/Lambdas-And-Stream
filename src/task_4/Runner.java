package task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Author aleksievich = new Author("Svetlana Aleksievich", (short)25, new ArrayList<>());
        Author polukoshko = new Author("Vladislav Polukoshko", (short)22, new ArrayList<>());
        Author voss = new Author("Christopher Voss", (short)42, new ArrayList<>());
        Author roberts = new Author("Gregory David Roberts", (short)67, new ArrayList<>());
        Author[] authors = {aleksievich, polukoshko, voss, roberts};

        Book tsinkovyeMachiki = new Book("Tsinkovye malchiki", Collections.singletonList(aleksievich), 320);
        Book poslednieSvideteli = new Book("Poslednie svideteli", Collections.singletonList(aleksievich), 304);
        Book prosti = new Book("Prosti", Collections.singletonList(polukoshko), 4);
        Book zhopolizy = new Book("Zhopolizy", Collections.singletonList(polukoshko), 3);
        Book neverSplitTheDifferencei = new Book("Never Split the Difference", Collections.singletonList(voss), 260);
        Book shantaram = new Book("Shantaram", Collections.singletonList(roberts), 944);
        Book theMountainShadow = new Book("The Mountain Shadow", Collections.singletonList(roberts), 912);
        Book[] books = {tsinkovyeMachiki, poslednieSvideteli, prosti, zhopolizy, neverSplitTheDifferencei, shantaram, theMountainShadow};

        aleksievich.getBooks().add(tsinkovyeMachiki);
        aleksievich.getBooks().add(poslednieSvideteli);
        polukoshko.getBooks().add(prosti);
        polukoshko.getBooks().add(zhopolizy);
        voss.getBooks().add(neverSplitTheDifferencei);
        roberts.getBooks().add(shantaram);
        roberts.getBooks().add(theMountainShadow);

        System.out.println("Books with more than 200 pages:");
        Arrays.stream(books)
                .parallel()
                .filter(p -> p.getNumberOfPages() > 200)
                .forEach(System.out::println);

        System.out.println();

        System.out.print("Book with the maximum number of pages: ");
        Arrays.stream(books)
                .parallel()
                .max(Comparator.comparing(Book::getNumberOfPages))
                .ifPresent(System.out::println);

        System.out.println();

        System.out.print("Book with the maximum number of pages: ");
        Arrays.stream(books)
                .parallel()
                .min(Comparator.comparing(Book::getNumberOfPages))
                .ifPresent(System.out::println);

        System.out.println();

        System.out.println("Books with single author:"); // я хз, в чем смысл, сказали сделать такой фильтр, я так и не понял суть задания
        Arrays.stream(books)
                .parallel()
                .filter(a -> a.getAuthors().size() == 1)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by pages:");
        Arrays.stream(books)
                .parallel()
                .sorted(Comparator.comparing(Book::getNumberOfPages))
                .forEachOrdered(System.out::println);

        System.out.println();

        System.out.println("Sorted by title:");
        Arrays.stream(books)
                .parallel()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEachOrdered(System.out::println);

        System.out.println();

        System.out.println("Titles:");
        Arrays.stream(books)
                .parallel()
                .map(Book::getTitle)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Authors:");
        Arrays.stream(books)
                .parallel()
                .map(Book::getAuthors)
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("The title of the biggest book:");
        Arrays.stream(authors)
                .flatMap(author -> author.getBooks().stream())
                .max(Comparator.comparing(Book::getNumberOfPages))
                .ifPresent(System.out::println);
    }

}
