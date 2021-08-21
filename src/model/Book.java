package model;

public class Book {
    String id,publisher,nameBook,author,addDate;
    int amount, remainAmount;

    public Book(String id, String publisher, String nameBook, String author, String addDate, int amount, int remainAmount) {
        this.id = id;
        this.publisher = publisher;
        this.nameBook = nameBook;
        this.author = author;
        this.addDate = addDate;
        this.amount = amount;
        this.remainAmount = remainAmount;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(int remainAmount) {
        this.remainAmount = remainAmount;
    }
}
