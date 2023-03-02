package br.com.alurafood.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurafood.pagamentos.model.Pagamento;

public interface Pagamentorepository extends JpaRepository<Pagamento, Long> {
    
}
