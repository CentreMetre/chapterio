package dev.centremetre.chapterio.repository;

import dev.centremetre.chapterio.model.Universe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniverseRepository extends JpaRepository<Universe, Integer>
{
    Universe getUniverseById(Integer id);

//    List<Universe> getAll();

    Universe getUniverseByName(String name);
}
