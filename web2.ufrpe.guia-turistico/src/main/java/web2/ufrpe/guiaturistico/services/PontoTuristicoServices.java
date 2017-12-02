package web2.ufrpe.guiaturistico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web2.ufrpe.guiaturistico.domain.PontoTuristico;
import web2.ufrpe.guiaturistico.repository.PontoTuristicoRepository;

@Service
public class PontoTuristicoServices {

	@Autowired
	PontoTuristicoRepository ponto;
	
	public List<PontoTuristico> listarPontoTuristico() {
		return ponto.findAll();
	}
	
	public PontoTuristico buscarPontoTuristico(Integer id) {
		return ponto.findOne(id);
	}

}
