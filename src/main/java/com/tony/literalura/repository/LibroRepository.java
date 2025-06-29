package com.tony.literalura.repository;

import com.tony.literalura.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface LibroRepository extends JpaRepository<Libro,Long>
{

    @Query("SELECT l FROM Libro l WHERE l.lenguaje ILIKE %:lenguaje%")
    List<Libro> findByLenguaje(String lenguaje);
}
