package br.com.ebac.animalservice.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class Cachorro implements Serializable {  

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nomeProvisorio;

	@Column(nullable = false)
	private Integer idadeEstimada;

	@Column(nullable = false)
	private String raca;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE", nullable = false)
	private Instant dataEntrada;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dataAdocao;

	@Column(nullable = false)
	private String condicaoChegada;

	private String nomeRecebedor; 

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dataObito; 

	@Column(nullable = false)
	private String porte;

	public Cachorro () {
		
	}

	
	public Cachorro(Long id, String nomeProvisorio, Integer idadeEstimada, String raca, Instant dataEntrada,
			Instant dataAdocao, String condicaoChegada, String nomeRecebedor, Instant dataObito, String porte) {
		this.id = id;
		this.nomeProvisorio = nomeProvisorio;
		this.idadeEstimada = idadeEstimada;
		this.raca = raca;
		this.dataEntrada = dataEntrada;
		this.dataAdocao = dataAdocao;
		this.condicaoChegada = condicaoChegada;
		this.nomeRecebedor = nomeRecebedor;
		this.dataObito = dataObito;
		this.porte = porte;
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeProvisorio() {
		return nomeProvisorio;
	}


	public void setNomeProvisorio(String nomeProvisorio) {
		this.nomeProvisorio = nomeProvisorio;
	}


	public Integer getIdadeEstimada() {
		return idadeEstimada;
	}


	public void setIdadeEstimada(Integer idadeEstimada) {
		this.idadeEstimada = idadeEstimada;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public Instant getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(Instant dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public Instant getDataAdocao() {
		return dataAdocao;
	}


	public void setDataAdocao(Instant dataAdocao) {
		this.dataAdocao = dataAdocao;
	}


	public String getCondicaoChegada() {
		return condicaoChegada;
	}


	public void setCondicaoChegada(String condicaoChegada) {
		this.condicaoChegada = condicaoChegada;
	}


	public String getNomeRecebedor() {
		return nomeRecebedor;
	}


	public void setNomeRecebedor(String nomeRecebedor) {
		this.nomeRecebedor = nomeRecebedor;
	}


	public Instant getDataObito() {
		return dataObito;
	}


	public void setDataObito(Instant dataObito) {
		this.dataObito = dataObito;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cachorro other = (Cachorro) obj;
		return Objects.equals(id, other.id);
	}

}
