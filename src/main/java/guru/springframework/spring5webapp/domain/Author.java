package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    public Author() {
        //JPA requires a zero args constructor

    }

        // added in constructor with  cmd+n constructor all
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    //set up getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
