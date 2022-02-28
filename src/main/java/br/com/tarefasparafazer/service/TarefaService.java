package br.com.tarefasparafazer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.tarefasparafazer.model.Tarefa;
import br.com.tarefasparafazer.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository tarefaRepository;

	public TarefaService() {
	}
	
	public Tarefa criarTarefa(Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	
	public List<Tarefa> listAllTarefas(){
		return tarefaRepository.findAll();
	}
	
	public ResponseEntity<Tarefa> findTarefaById(Long id){
		return tarefaRepository.findById(id)
				.map(tarefa -> ResponseEntity.ok().body(tarefa))
				.orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<Tarefa> atualizaTarefaById(Tarefa tarefa, Long id){
		return tarefaRepository.findById(id)
				.map(tarefaParaAtualizar -> {
					tarefaParaAtualizar.setTitulo(tarefa.getTitulo());
					tarefaParaAtualizar.setDescricao(tarefa.getDescricao());
					tarefaParaAtualizar.setPrazoTarefa(tarefa.getPrazoTarefa());
					Tarefa atualizada = tarefaRepository.save(tarefaParaAtualizar);
					return ResponseEntity.ok().body(atualizada);
					
				}).orElse(ResponseEntity.notFound().build());		
	}
	
	public ResponseEntity<Object> deletaTarefaById(Long id){
		return tarefaRepository.findById(id)
				.map(tarefaParaDeletar ->{
				tarefaRepository.deleteById(id);
				return ResponseEntity.noContent().build();
				
				}).orElse(ResponseEntity.notFound().build());
	}
	
}
