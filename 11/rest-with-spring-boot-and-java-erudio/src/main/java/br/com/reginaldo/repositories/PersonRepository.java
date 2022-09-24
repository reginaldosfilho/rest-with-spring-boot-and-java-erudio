package br.com.reginaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.reginaldo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
