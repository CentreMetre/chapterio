package dev.centremetre.chapterio.service;

import dev.centremetre.chapterio.model.Book;
import dev.centremetre.chapterio.model.Chapter;
import dev.centremetre.chapterio.model.Series;
import dev.centremetre.chapterio.model.Universe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultLibraryService implements LibraryService
{

    @Override
    public Chapter retrieveChapterById(int chapterId)
    {
        return null;
    }

    @Override
    public List<Chapter> retrieveAllChapters()
    {
        return List.of();
    }

    @Override
    public Book retrieveBookById(int bookId)
    {
        return null;
    }

    @Override
    public Book retrieveBookByIsbn(String isbn)
    {
        return null;
    }

    @Override
    public List<Book> retrieveAllBooks()
    {
        return List.of();
    }

    @Override
    public List<Book> searchBookByNameLevenshteinDistance(String searchTerm, int distance)
    {
        return List.of();
    }

    @Override
    public Series retrieveSeriesById(int seriesId)
    {
        return null;
    }

    @Override
    public Universe retrieveUniverseById(int universeId)
    {
        return null;
    }
}
