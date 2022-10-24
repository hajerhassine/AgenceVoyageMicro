package com.esprit.microservices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservices.Entity.MaisonHote;
import com.esprit.microservices.Repository.MaisonHoteRepository;
import java.io.File;

import javax.servlet.ServletContext;
//import javax.xml.ws.Response;
import javax.ws.rs.core.Response;
import org.springframework.http.HttpStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MaisonHoteService {

	@Autowired
	public MaisonHoteRepository maisonrepo;
	@Autowired
    ServletContext context;

	 public ResponseEntity<Response> addMaisonHote(MultipartFile file, String MaisonHote) throws JsonParseException, JsonMappingException, Exception
	    {

	        System.out.println("Ok .............");
	        MaisonHote s = new ObjectMapper().readValue(MaisonHote, MaisonHote.class);
	        boolean isExit = new File(context.getRealPath("/Images/")).exists();
	        if (!isExit)
	        {
	            new File (context.getRealPath("/Images/")).mkdir();
	            System.out.println("mkdir success.............");
	        }
	        String filename = file.getOriginalFilename();
	        String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
	        File serverFile = new File (context.getRealPath("/Images/"+File.separator+newFileName));
	        try
	        {
	            System.out.println("Image");
	            FileUtils.writeByteArrayToFile(serverFile,file.getBytes());

	        }catch(Exception e) {
	            e.printStackTrace();
	        }


	        s.setImage(newFileName);

	        MaisonHote art = maisonrepo.save(s);



	        if (art != null)
	        {
	            return new ResponseEntity<Response>( HttpStatus.OK);
	        }
	        else
	        {
	            return new ResponseEntity<Response>(HttpStatus.BAD_REQUEST);
	        }



	    }

	public List<MaisonHote> AllMaisonHote() {
		List<MaisonHote> maisons = (List<MaisonHote>) maisonrepo.findAll();

		return maisons;

	}

	public MaisonHote updateMaisonHote(int id, MaisonHote newMaisonHote) {
		if (maisonrepo.findById(id).isPresent()) {
			MaisonHote existingMaisonHote = maisonrepo.findById(id).get();
			existingMaisonHote.setNom(newMaisonHote.getNom());
			existingMaisonHote.setAdresse(newMaisonHote.getAdresse());
			existingMaisonHote.setDescription(newMaisonHote.getDescription());

			return maisonrepo.save(existingMaisonHote);
		} else
			return null;
	}

	public String deleteMaisonHote(int id) {
		if (maisonrepo.findById(id).isPresent()) {
			maisonrepo.deleteById(id);
			return "maison  supprimé";
		} else
			return "maison non supprimé";
	}

}
