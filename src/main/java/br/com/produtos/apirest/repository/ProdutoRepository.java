package br.com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	// JpaRepository ajuda o desenvolvedor pois existem métodos prontos para o banco de dados.
	// Quando quisermos utiliza-lo, será preciso apenas instanciar o ProdutoRepository.
	
	Produto findById(long id);
	
}
