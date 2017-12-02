package web2.ufrpe.guiaturistico.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoPontoTuristico {

	@Id
	@Column(name = "id_tipo")
	private Integer id;

	@Column(name = "tipo_turistico")
	private String tipoTuristico;

	@OneToMany(mappedBy = "tipoPontoTuristico", 
	targetEntity = PontoTuristico.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PontoTuristico> pontosTuristico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoTuristico() {
		return tipoTuristico;
	}

	public void setTipoTuristico(String tipoTuristico) {
		this.tipoTuristico = tipoTuristico;
	}

	public List<PontoTuristico> getPontosTuristico() {
		return pontosTuristico;
	}

	public void setPontosTuristico(List<PontoTuristico> pontosTuristico) {
		this.pontosTuristico = pontosTuristico;
	}

}
