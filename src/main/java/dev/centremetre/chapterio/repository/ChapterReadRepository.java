package dev.centremetre.chapterio.repository;

import dev.centremetre.chapterio.model.ChapterRead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterReadRepository extends JpaRepository<ChapterRead, Integer>
{
}
