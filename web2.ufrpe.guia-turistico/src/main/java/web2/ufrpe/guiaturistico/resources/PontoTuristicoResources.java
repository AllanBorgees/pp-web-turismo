package web2.ufrpe.guiaturistico.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import web2.ufrpe.guiaturistico.domain.PontoTuristico;
import web2.ufrpe.guiaturistico.services.PontoTuristicoServices;

@RestController
@RequestMapping("/ponto")
public class PontoTuristicoResources {

	@Autowired
	PontoTuristicoServices ponto;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PontoTuristico>> listar(){
		List<PontoTuristico> pontos= ponto.listarPontoTuristico();
		return ResponseEntity.status(HttpStatus.OK).body(pontos);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<PontoTuristico> buscar(@PathVariable("id") Integer id){
		PontoTuristico pontoTuristico= ponto.buscarPontoTuristico(id);
		return ResponseEntity.status(HttpStatus.OK).body(pontoTuristico);
	}
	


}
