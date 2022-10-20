package com.esprit.microservices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservices.Entity.Offre;
import com.esprit.microservices.Repository.OffreRepository;

@Service
public class OffreService {

	@Autowired
	public OffreRepository offrerepo;

	public Offre addoffre(Offre mh) {

		return offrerepo.save(mh);
	}

	public List<Offre> Alloffre() {
		List<Offre> offres = (List<Offre>) offrerepo.findAll();

		return offres;

	}

	public Offre updateoffre(int id, Offre newoffre) {
		if (offrerepo.findById(id).isPresent()) {
			Offre existingoffre = offrerepo.findById(id).get();
			existingoffre.setNom(newoffre.getNom());
			existingoffre.setType(newoffre.getType());
			existingoffre.setDatedebut(newoffre.getDatedebut());
			existingoffre.setImage(newoffre.getImage());
			existingoffre.setDatefin(newoffre.getDatefin());
			existingoffre.setPrix(newoffre.getPrix());
			existingoffre.setDescription(newoffre.getDescription());
			return offrerepo.save(existingoffre);
		} else
			return null;
	}

	public String deleteoffre(int id) {
		if (offrerepo.findById(id).isPresent()) {
			offrerepo.deleteById(id);
			return "offre  supprimé";
		} else
			return "offre non supprimé";
	}

}
