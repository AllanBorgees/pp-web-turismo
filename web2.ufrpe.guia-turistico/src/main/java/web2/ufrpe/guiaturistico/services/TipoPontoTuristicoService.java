package web2.ufrpe.guiaturistico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web2.ufrpe.guiaturistico.domain.TipoPontoTuristico;
import web2.ufrpe.guiaturistico.repository.TipoPontoTuristicoRepository;

@Service
public class TipoPontoTuristicoService {

	@Autowired
	TipoPontoTuristicoRepository tipo;

	
	public List<TipoPontoTuristico> listartipos() {
		return tipo.findAll();
	}

	
	public TipoPontoTuristico buscarTipoPontoTuristico(Integer id) {
		return tipo.findOne(id);
	}

}
