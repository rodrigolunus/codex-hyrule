package org.rodrigolunus.cursospringbootjpacrud.repositories;

import org.rodrigolunus.cursospringbootjpacrud.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
