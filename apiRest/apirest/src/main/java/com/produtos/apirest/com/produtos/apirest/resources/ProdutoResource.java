package com.produtos.apirest.com.produtos.apirest.resources;

import com.produtos.apirest.com.produtos.apirest.models.Produtos;
import com.produtos.apirest.com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ClassController
//Class que recebe as requisições HTTP

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {

    @Autowired    //Ponto de injeção que ultiliza os métodos para se comunicar com o banco de dados
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos") //GET Listagem dos produtos salvos no banco
    public List<Produtos> listaProdutos(){
        return produtoRepository.findAll();

    }

    @GetMapping("/produto/{id}")
    public Produtos listaProdutosunico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }
    @PostMapping("/produto")
    public Produtos salvaProduto(@RequestBody Produtos produto) {
      return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produtos produto){
        produtoRepository.delete(produto);

    }

    @PutMapping("/produto")
    public Produtos atualizaProduto(@RequestBody Produtos produto) {
      return produtoRepository.save(produto);
    }


}
