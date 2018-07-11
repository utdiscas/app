package com.quejboard.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quejboard.app.model.Swiezak;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SwiezakRepository extends JpaRepository<Swiezak, Integer>{

    Swiezak findById(int id);

    @Query("SELECT s FROM Swiezak s WHERE s.swiezakNaDzis like 'A%'")
    List<Swiezak> findByNameA();

    @Query("SELECT s FROM Swiezak s WHERE s.swiezakNaDzis like CONCAT('%',:letters)")
    List<Swiezak> findByNameLastLetters(@Param("letters") String letters);

}
