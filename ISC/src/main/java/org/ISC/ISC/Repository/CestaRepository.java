package org.ISC.ISC.Repository;

import java.util.List;

import org.ISC.ISC.Tabelas.Cestas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CestaRepository extends JpaRepository<Cestas, Long>{

	public List<Cestas>findAllByRgContainingIgnoreCase(String rg);
	
}
