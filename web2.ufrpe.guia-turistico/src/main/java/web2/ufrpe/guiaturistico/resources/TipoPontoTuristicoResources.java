package web2.ufrpe.guiaturistico.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import web2.ufrpe.guiaturistico.domain.TipoPontoTuristico;
import web2.ufrpe.guiaturistico.services.TipoPontoTuristicoService;

@RestController
@RequestMapping("/tipo")
public class TipoPontoTuristicoResources {
	
	@Autowired
	TipoPontoTuristicoService tipo;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TipoPontoTuristico>> listar(){
		List<TipoPontoTuristico> tipos = tipo.listartipos();
		return ResponseEntity.status(HttpStatus.OK).body(tipos);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<TipoPontoTuristico> buscar(@PathVariable("id") Integer id){
		TipoPontoTuristico tipoPontoTuristico= tipo.buscarTipoPontoTuristico(id);
		return ResponseEntity.status(HttpStatus.OK).body(tipoPontoTuristico);
	}
	
}
