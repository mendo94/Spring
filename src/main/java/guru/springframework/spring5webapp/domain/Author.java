package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity //annotate with entity to tell hibernate that this is an entity and make a primary key
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //automatic id generation
    private Long id;
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
