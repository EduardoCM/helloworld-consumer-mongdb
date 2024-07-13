package com.codigorupestre.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "solicitudes")
public class SolicitudBeca {
	
	@Id
	private String id;
	
	private String nombre;
	
	private String escuela;
	
	private String beca;

}
