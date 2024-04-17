package br.sp.gov.etesp.tasks.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity(name = "Tarefas_Table")
public class Tarefa {
	@Id // Declara que o Long id é um Id (primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TAREFA") // NOME DA COLUNA DO BANCO DE DADOS (PEGARIA O "id" se n tivesse nada)
	private Long id;
	@Column(name = "nome_tarefa")
	private String nomeTarefa; 	
	@Column(name = "status_tarefa")
	private String status;
	@Column(name = "inicio_tarefa")
	private LocalDate dataInicio;	
	@Column(name = "termino_tarefa")
	private LocalDate dataTermino;	
	@Column(name = "numero")
	private Long num;
	
	
	
	
	@Override
	public String toString() {
		return "Tarefa [nomeTarefa=" + nomeTarefa + ", status=" + status + ", dataInicio=" + dataInicio
				+ ", dataTermino=" + dataTermino + "]" ;
	}

	//Getters and Setters

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeTarefa() {
		return nomeTarefa;
	}


	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}


	
	
	
	


}
