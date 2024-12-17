package ma.xproce.book;

import ma.xproce.book.dao.entities.Book;

import ma.xproce.book.dao.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository){
        return  args -> {

            List<Book> books = List.of(
                    Book.builder().title("The Catcher in the Rye").publisher("Little, Brown and Company").datePublication("1951-07-16").price(10.99f).build(),
                    Book.builder().title("1984").publisher("Secker & Warburg").datePublication("1949-06-08").price(12.99f).build(),
                    Book.builder().title("To Kill a Mockingbird").publisher("J.B. Lippincott & Co.").datePublication("1960-07-11").price(14.99f).build(),
                    Book.builder().title("Pride and Prejudice").publisher("T. Egerton, Whitehall").datePublication("1813-01-28").price(9.99f).build()
            );

            bookRepository.saveAll(books);
        };



//
        };
    }

