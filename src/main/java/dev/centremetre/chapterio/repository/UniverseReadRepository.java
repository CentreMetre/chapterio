package dev.centremetre.chapterio.repository;

import dev.centremetre.chapterio.model.UniverseRead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniverseReadRepository extends JpaRepository<UniverseRead, Integer>
{

}
