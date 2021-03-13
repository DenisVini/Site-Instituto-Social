package org.ISC.ISC.Controller;

import java.util.List;

import org.ISC.ISC.Repository.AjudeRepository;
import org.ISC.ISC.Tabelas.Ajude;
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
@RequestMapping("/ajude")
@CrossOrigin("*")
public class AjudeController {

	@Autowired
	private AjudeRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Ajude>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id_ajude}")
	public ResponseEntity<Ajude>GetById(@PathVariable Long id_ajude){
		return repository.findById(id_ajude)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Ajude> post(@RequestBody Ajude cadAjude){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(cadAjude));
	}
	
	@PutMapping
	public ResponseEntity<Ajude> put(@RequestBody Ajude cadAjude){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(cadAjude));
	}
	
	@DeleteMapping("/{id_ajude}")
	public void delete(@PathVariable long id_ajude) {
		repository.deleteById(id_ajude);
	}
}
