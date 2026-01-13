package dev.centremetre.chapterio.repository;

import dev.centremetre.chapterio.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Integer>
{

}
