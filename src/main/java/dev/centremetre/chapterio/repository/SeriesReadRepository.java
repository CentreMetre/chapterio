package dev.centremetre.chapterio.repository;

import dev.centremetre.chapterio.model.SeriesRead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesReadRepository extends JpaRepository<SeriesRead, Integer>
{
}
