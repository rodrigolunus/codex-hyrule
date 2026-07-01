package org.rodrigolunus.cursospringbootjpacrud.repositories;

import org.rodrigolunus.cursospringbootjpacrud.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
