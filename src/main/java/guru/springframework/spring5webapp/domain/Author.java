package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

        // added in constructor with  cmd constructor all
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
}
