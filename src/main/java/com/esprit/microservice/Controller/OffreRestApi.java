package com.esprit.microservice.Controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

import com.esprit.microservice.Entity.Offre;
import com.esprit.microservice.Service.IOffreService;

import com.fasterxml.jackson.databind.JsonMappingException;





@RestController
public class OffreRestApi {
	private String title="hello I'm the Offre Microservice";
	

	@Autowired
	IOffreService OffreService; 

	
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<Response>  addOffre(@RequestPart("file") MultipartFile file,@RequestParam("Offre") String s)throws JsonParseException, JsonMappingException, Exception {
		 return OffreService.add(file,s);
	}
	
	@PutMapping("/update-Offre/{id}")
	@ResponseBody
	Offre updateOffre(@RequestBody Offre s){
		return OffreService.updateOffre(s);
	}
	
	
	
	@RequestMapping("/hello")
	
	public String sayHello(){
		
		System.out.println(title);
		return title;
	}
	
	@DeleteMapping(value="/id", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteOffre(@PathVariable(value="id") int  id){
	return new ResponseEntity<>(OffreService.deleteOffre(id),HttpStatus.OK);

	}
}
