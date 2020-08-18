package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Pagamento;

//Operações de acesso a dados referente a Pagamento do tipo Integer
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer>{

}
