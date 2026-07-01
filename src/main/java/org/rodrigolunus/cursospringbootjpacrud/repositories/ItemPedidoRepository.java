package org.rodrigolunus.cursospringbootjpacrud.repositories;

import org.rodrigolunus.cursospringbootjpacrud.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
