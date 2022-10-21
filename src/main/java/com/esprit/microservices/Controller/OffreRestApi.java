package com.esprit.microservices.Controller;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.microservices.Entity.Offre;
import com.esprit.microservices.Service.OffreService;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/offre")
public class OffreRestApi {

	@Autowired
	public OffreService offreservice;

	// URL: http://localhost:8086/SpringMVC/servlet/offre/addoffre

//	@PostMapping("/addoffre")
//	@ResponseStatus(HttpStatus.CREATED)
//	public ResponseEntity<Offre> createoffre(@RequestBody Offre mh) {
//		return new ResponseEntity<>(offreservice.addoffre(mh), HttpStatus.OK);
//	}
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<Response>  addHotel(@RequestPart("file") MultipartFile file,@RequestParam("offre") String s)throws JsonParseException, JsonMappingException, Exception {
		 return offreservice.add(file,s);
	}

	@GetMapping("/getalloffre")
	public List<Offre> getoffre() {

		List<Offre> listoffre = offreservice.Alloffre();
		return listoffre;

	}

	@PutMapping(value = "updateoffre/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Offre> updateoffre(@PathVariable(value = "id") int id, @RequestBody Offre mh) {
		return new ResponseEntity<>(offreservice.updateoffre(id, mh), HttpStatus.OK);

	}

	@DeleteMapping(value = "deleteoffre/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteoffre(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(offreservice.deleteoffre(id), HttpStatus.OK);
	}

}
