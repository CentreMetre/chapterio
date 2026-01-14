package dev.centremetre.chapterio.service;

import dev.centremetre.chapterio.model.Book;
import dev.centremetre.chapterio.model.Chapter;
import dev.centremetre.chapterio.model.Series;
import dev.centremetre.chapterio.model.Universe;

import java.util.List;

/**
 * This service is for chapters, books, series, and universes.
 */
public interface LibraryService extends BookService
{
    /**
     * Get a chapter with a specific ID.
     * @param chapterId The ID of the chapter to retrieve.
     * @return A {@link Chapter} object with the supplied ID.
     */
    Chapter retrieveChapterById(int chapterId);

    List<Chapter> retrieveAllChapters();

    /**
     * Retrieve a series with a specific ID.
     * @param seriesId The ID of the series to retrieve.
     * @return A {@link Series} object with the supplied ID.
     */
    Series retrieveSeriesById(int seriesId);

    /**
     * Retrieve a universe with a specific ID.
     * @param universeId The ID of the universe to retrieve.
     * @return A {@link Universe} object with the supplied ID.
     */
    Universe retrieveUniverseById(int universeId);

}

// Chapters could just be incrementing when it has the same book id. For manga, the display will be the total, and the index will be of just that volume