package dev.centremetre.chapterio.service;

import dev.centremetre.chapterio.repository.BookReadRepository;
import dev.centremetre.chapterio.repository.ChapterReadRepository;
import dev.centremetre.chapterio.repository.SeriesReadRepository;
import dev.centremetre.chapterio.repository.UniverseReadRepository;
import dev.centremetre.chapterio.util.BookLevel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class DefaultReadService
{
    private final ChapterReadRepository chapterReadRepository;
    private final BookReadRepository bookReadRepository;
    private final SeriesReadRepository seriesReadRepository;
    private final UniverseReadRepository universeReadRepository;

    public DefaultReadService(ChapterReadRepository chapterReadRepository,
                              BookReadRepository bookReadRepository,
                              SeriesReadRepository seriesReadRepository,
                              UniverseReadRepository universeReadRepository)
    {
        this.chapterReadRepository = chapterReadRepository;
        this.bookReadRepository = bookReadRepository;
        this.seriesReadRepository = seriesReadRepository;
        this.universeReadRepository = universeReadRepository;
    }

    public void createRecord(BookLevel[] levels, LocalTime timeStart, LocalDate dateStart, String notes)
    {
        // Should have at least 1 level to create a record for
        if (levels.length == 0)
        {
            // Raise Error
        }


    }

}
