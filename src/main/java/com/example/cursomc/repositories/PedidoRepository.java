package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Pedido;

//Operações de acesso a dados referente a Pedido do tipo Integer
@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer>{

}
