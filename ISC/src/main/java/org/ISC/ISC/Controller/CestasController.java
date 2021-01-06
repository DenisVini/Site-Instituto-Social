package org.ISC.ISC.Controller;

import java.util.List;

import org.ISC.ISC.Repository.CestaRepository;
import org.ISC.ISC.Tabelas.Cestas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cestas")
@CrossOrigin("*")
public class CestasController {

	@Autowired
	private CestaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cestas>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id_cestas}")
	public ResponseEntity<Cestas> GetById(@PathVariable long id_cestas){
		return repository.findById(id_cestas)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/rg/{rg}")
	public ResponseEntity<List<Cestas>> GetByRg(@PathVariable String rg){
		return ResponseEntity.ok(repository.findAllByRgContainingIgnoreCase(rg));
	}
	
	@PostMapping
	public ResponseEntity<Cestas> post (@RequestBody Cestas cadCestas){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(cadCestas));
	}
	
	@PutMapping
	public ResponseEntity<Cestas> put (@RequestBody Cestas cadCestas){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(cadCestas));
	}
	
	@DeleteMapping("/{id_cestas}")
	public void delete (@PathVariable long id_cestas) {
		repository.deleteById(id_cestas);
	}
	
}
