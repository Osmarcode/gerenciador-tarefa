package br.com.tarefasparafazer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tarefasparafazer.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
}