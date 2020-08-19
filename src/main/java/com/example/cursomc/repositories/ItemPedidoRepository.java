package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.ItemPedido;

//Operações de acesso a dados referente a ItemPedido do tipo Integer
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer>{

}
