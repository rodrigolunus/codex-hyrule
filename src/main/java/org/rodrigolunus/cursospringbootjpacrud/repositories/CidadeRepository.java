package org.rodrigolunus.cursospringbootjpacrud.repositories;

import org.rodrigolunus.cursospringbootjpacrud.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
