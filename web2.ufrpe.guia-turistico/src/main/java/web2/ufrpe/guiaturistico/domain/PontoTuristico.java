package web2.ufrpe.guiaturistico.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PontoTuristico {

	@Id
	@Column(name = "id_pontoTuristico")
	private Integer id;

	@Column(name = "nome_ponto")
	private String nome;

	@Column(name = "image")
	private String image;

	@Column(name = "relato")
	private String relato;

	@OneToMany(mappedBy = "pontoTuristico", 
	targetEntity = Anexo.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Anexo> anexos;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_tipo")
	@JsonIgnore
	private TipoPontoTuristico tipoPontoTuristico;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPontoTuristico getTipoPontoTuristico() {
		return tipoPontoTuristico;
	}

	public void setTipoPontoTuristico(TipoPontoTuristico tipoPontoTuristico) {
		this.tipoPontoTuristico = tipoPontoTuristico;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRelato() {
		return relato;
	}

	public void setRelato(String relato) {
		this.relato = relato;
	}

}
