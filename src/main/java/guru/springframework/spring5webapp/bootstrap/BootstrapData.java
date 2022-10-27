package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repo.AuthorRepository;
import guru.springframework.spring5webapp.repo.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //tells spring to detect this as a spring managed component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Drive Design", "123123");
        eric.getBooks().add(ddd); //eric get books and add
        ddd.getAuthors().add(eric); //on the books you want to getauthors and add eric as an author to the book

        //then save it to the repositories
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johsnon");
        Book noEJB = new Book("J2EE Develop without EjB", "89234750");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Boostrap");
        System.out.println("Number of books: " + bookRepository.count());

    }
}
