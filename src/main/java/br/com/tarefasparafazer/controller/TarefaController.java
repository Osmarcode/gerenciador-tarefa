package br.com.tarefasparafazer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefasparafazer.model.Tarefa;
import br.com.tarefasparafazer.service.TarefaService;

@RestController
@RequestMapping("/api/v1")
public class TarefaController {

	@Autowired
	TarefaService tarefaService;

	public TarefaController() {
	}
	
	@PostMapping("/tarefas")
	@ResponseStatus(HttpStatus.CREATED)
	public Tarefa tarefaCriada(@RequestBody Tarefa tarefa) {
		System.out.println("Criando uma nova tarefa");
		return tarefaService.criarTarefa(tarefa);	
	}
	
	@GetMapping("/tarefas")
	@ResponseStatus(HttpStatus.OK)
	public List<Tarefa> getAllTarefas(){
		System.out.println("Listando todas as tarefas");
		return tarefaService.listAllTarefas();
	}
	
	@GetMapping("/tarefas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Tarefa> getTarefaById(@PathVariable(value="id") Long id){
		System.out.println("Listando tarefa pelo ID");
		return tarefaService.findTarefaById(id);
	}
	
	@PutMapping("/tarefas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Tarefa> atualizaTarefaById(@PathVariable(value="id") Long id, @RequestBody Tarefa tarefa){
		System.out.println("Atualizando tarefa através do ID: " + id);
		return tarefaService.atualizaTarefaById(tarefa, id);
	}
	
	@DeleteMapping("/tarefas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Object> deletaTarefaById(@PathVariable(value="id") Long id){
		System.out.println("Deletando tarefa através do ID");
		return tarefaService.deletaTarefaById(id);
	}
}

