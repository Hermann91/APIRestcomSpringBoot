package com.produtos.apirest.com.produtos.apirest.repository;

import com.produtos.apirest.com.produtos.apirest.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

    Produtos findById(long id); //método criado para buscar apenas um produto através do ID )


}
