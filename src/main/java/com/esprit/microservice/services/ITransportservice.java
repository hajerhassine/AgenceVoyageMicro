package com.esprit.microservice.services;

import java.util.List;

import javax.ws.rs.core.Response;



import org.springframework.http.ResponseEntity;

import org.springframework.web.multipart.MultipartFile;


import com.esprit.microservice.entities.Transport;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface ITransportservice {
	ResponseEntity<Response> add(MultipartFile file, String Hotel)
			throws JsonParseException, JsonMappingException, Exception;
	
	ResponseEntity<Transport> updateTransport(int id, Transport a);
	//public Transport updateTransport(int id, Transport a);
	
	String deleteTransport(int id);
	public List<Transport> getAllTransport();
	public Transport getByIdTransport(int id);

}
