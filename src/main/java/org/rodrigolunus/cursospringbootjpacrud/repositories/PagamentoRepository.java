package org.rodrigolunus.cursospringbootjpacrud.repositories;

import org.rodrigolunus.cursospringbootjpacrud.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
