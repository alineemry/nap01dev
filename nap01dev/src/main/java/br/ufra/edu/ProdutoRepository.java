package br.ufra.edu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
