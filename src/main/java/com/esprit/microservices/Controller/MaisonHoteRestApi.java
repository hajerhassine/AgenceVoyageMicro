package com.esprit.microservices.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.core.Response;
import com.esprit.microservices.Entity.MaisonHote;
import com.esprit.microservices.Service.MaisonHoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.boot.json.JsonParseException;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/maisonHote")
public class MaisonHoteRestApi {

	@Autowired
	public MaisonHoteService maisonservice;

	// URL: http://localhost:8086/SpringMVC/servlet/maisonHote/addmaisonHote

	@PostMapping("/addmaisonHote")
	@ResponseBody
	public ResponseEntity<Response>  createMaisonHote(@RequestPart("file") MultipartFile file,@RequestParam("MaisonHote") String s)throws JsonParseException, JsonMappingException, Exception {
		 return maisonservice.addMaisonHote(file, s);
	}

	@GetMapping("/getallmaisonHote")
	public List<MaisonHote> getMaisonHote() {

		List<MaisonHote> listmaison = maisonservice.AllMaisonHote();
		return listmaison;

	}

	@PutMapping(value = "updatemaisonHote/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MaisonHote> updateMaisonHote(@PathVariable(value = "id") int id, @RequestBody MaisonHote mh) {
		return new ResponseEntity<>(maisonservice.updateMaisonHote(id, mh), HttpStatus.OK);

	}

	@DeleteMapping(value = "deletemaisonHote/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteMaisonHote(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(maisonservice.deleteMaisonHote(id), HttpStatus.OK);
	}

}
