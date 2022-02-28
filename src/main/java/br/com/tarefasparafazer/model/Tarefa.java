package br.com.tarefasparafazer.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(name = "prazo_tarefa", nullable=false)
	private LocalDateTime prazoTarefa;
	
	@UpdateTimestamp
	@Column(name="tarefa_atualizada", nullable=false)
	private LocalDateTime tarefaAtualizada;

	@CreationTimestamp
	@Column(name = "data_criacao", nullable=false, updatable = false)
	private LocalDateTime dataCriacao;
	
	public Tarefa() {
	}
	
	public Tarefa(Long id, String titulo, String descricao, LocalDateTime prazoTarefa, LocalDateTime tarefaUpdate, LocalDateTime dataCriacao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.prazoTarefa = prazoTarefa;
		this.tarefaAtualizada = tarefaAtualizada;
		this.dataCriacao = dataCriacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getPrazoTarefa() {
		return prazoTarefa;
	}
	
	public void setPrazoTarefa(LocalDateTime prazoTarefa) {
		this.prazoTarefa = prazoTarefa;
	}

	public LocalDateTime getTarefaAtualizada() {
		return tarefaAtualizada;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", prazoTarefa=" + prazoTarefa
				+ ", tarefaUpdate=" + tarefaAtualizada + ", dataCriacao=" + dataCriacao + "]";
	}
	
}
