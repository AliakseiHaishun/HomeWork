package AutomationTesting.HomeWork.HW1.Task3;

import java.util.List;

public class Book {
    public int bookId;
    public String bookName;
    public List<String> authors;
    public int yearOfPublishing;
    public int numberOfPages;
    public int price;
    public TypesOfBinding bindingType;

    public Book(int bookId, String bookName, List<String> authors, int yearOfPublishing,
                int numberOfPages, int price, TypesOfBinding bindingType) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authors = authors;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName=" + bookName +
                ", Authors=" + authors +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType=" + bindingType +
                '}';
    }
}
