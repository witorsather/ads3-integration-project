package domain;

import java.math.BigDecimal;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

public class Servico {

	private Integer id;

	private String nome;

	private BigDecimal preco;

	@ManyToOne
	@JoinColumn(name = "servico")
	private OrdemServicoServico ordemServicoServico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return String.format("%s - %s", nome, preco);
	}
}
