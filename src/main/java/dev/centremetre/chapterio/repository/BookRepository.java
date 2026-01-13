package dev.centremetre.chapterio.repository;

import dev.centremetre.chapterio.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{
    Book getBookById(Integer id);

    Book getBookByIsbn(String isbn);
}
