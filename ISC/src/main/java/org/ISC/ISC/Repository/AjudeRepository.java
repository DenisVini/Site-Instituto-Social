package org.ISC.ISC.Repository;

import java.util.List;
import java.util.Optional;

import org.ISC.ISC.Tabelas.Ajude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AjudeRepository extends JpaRepository<Ajude, Long> {

	public Optional<Ajude> findById(Long id_ajude);

}
