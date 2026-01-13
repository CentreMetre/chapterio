package dev.centremetre.chapterio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Series extends JpaRepository<Series, Integer>
{

}
