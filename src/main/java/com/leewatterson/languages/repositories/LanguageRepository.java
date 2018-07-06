package com.leewatterson.languages.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leewatterson.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
//	Optional<Language> findById(Long id);
	List<Language> findByNameContaining(String search);
	List<Language> findByCreator(String search);
	Long countByNameContaining(String search);
	Long deleteByNameStartingWith(String search);
	
}
