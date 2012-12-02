package br.com.controlmais.orcamento.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sun.istack.internal.Nullable;

@Entity
public class Contato implements IEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idContato;
	
	@NotNull
	@Size(max=250)
	private String nomeContato;
	
	@Nullable
	@Size(max=19)
	private String telefoneContato;
	
	@Nullable
	@Size(max=14)
	private String cpf;
	
	@Nullable
	@JoinColumn(name="idEmpresa", referencedColumnName="idEmpresa")
	private Empresa empresa;
	
	@Nullable
	@JoinColumn(name="idEndereco", referencedColumnName="idEndereco")
	private Endereco endereco;


	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
