package com.leewatterson.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.leewatterson.languages.models.Language;
import com.leewatterson.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	//return all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	//create a language
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	
	//delete a language
	public void deleteLanguage(Long id){
    	if(languageRepository.existsById(id)) {
    		languageRepository.deleteById(id);
    		System.out.println("Deleting language " + id);
    	}
    	else {
    		System.out.println("Language not Found");
    	}
    }
	
	//retrieve a language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}
		else {
			return null;
		}
	}
	
	//update a language
	public Language updateLanguage(Long id, String name, String creator, double version) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			Language newLang = optionalLanguage.get();
			newLang.getName();
			newLang.setName(name);
			newLang.getCreator();
			newLang.setCreator(creator);
			newLang.getVersion();
			newLang.setVersion(version);
			return languageRepository.save(newLang);
		}
		return null;
		
	}
	
	//update from form
	public Language updateLanguageForm(Language language) {
		Optional<Language> optionalLanguage = languageRepository.findById(language.getId());
		if(optionalLanguage.isPresent()) {
//			language.getName();
			language.setName(language.getName());
			language.setCreator(language.getCreator());
			language.setVersion(language.getVersion());
			return languageRepository.save(language);
//			Language newLang = optionalLanguage.get();
//			newLang.getName();
//			newLang.setName(language.getName());
//			newLang.getCreator();
//			newLang.setCreator(language.getCreator());
//			newLang.getVersion();
//			newLang.setVersion(language.getVersion());
//			return languageRepository.save(newLang);
		}
		return null;
	}
}






