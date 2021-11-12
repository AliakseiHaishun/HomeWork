package AutomationTesting.HomeWork.HW1.Task3;

import AutomationTesting.HomeWork.HW1.Task3.Book;
import AutomationTesting.HomeWork.HW1.Task3.TypesOfBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.list;

public class Main {
    public static void main(String[] args) {


        Book[] booksArray = {
                new Book(23, "War and Peace", List.of("Lev Tolstoy"),
                1925, 403, 2443, TypesOfBinding.TYPE2),
                new Book(33, "JavaCore", List.of("John Jameson"),
                2003, 689, 4000, TypesOfBinding.TYPE1),
                new Book(2, "Warrior of books", List.of("Tina Selling", "Tony Robbins"),
                2016, 124, 900, TypesOfBinding.TYPE3)
        };

              // список книг заданного автора
        List<Book> result1 = Arrays.asList(booksArray).stream().
                filter(i -> i.authors.contains("Tony Robbins")).
                collect(Collectors.toList());
        System.out.println(result1);

      // список книг, выпущенных за определенный период времени
        List<Book> result3 = Arrays.asList(booksArray).stream().
                filter(i -> i.yearOfPublishing > 1928 && i.yearOfPublishing < 2021).
                collect(Collectors.toList());
        System.out.println(result3);


      // список книг название которых содержит заданное слово
        List<Book> result2 = Arrays.asList(booksArray).stream().
                filter(i -> i.bookName.contains("books")).
                collect(Collectors.toList());
        System.out.println(result2);




    }
}
