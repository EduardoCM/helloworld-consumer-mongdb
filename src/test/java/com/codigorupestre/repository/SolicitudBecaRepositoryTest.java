package com.codigorupestre.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codigorupestre.model.SolicitudBeca;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class SolicitudBecaRepositoryTest {
	
	@Autowired
	private SolicitudesBecaRepository repository;
	
	
	/*
	 * Given : Teniendo los datos correctos a almacenar para solicitar una beca 
	 * 
	 * When: : Se almacena la solicitud de en mongoDB
	 * 
	 * Then : Se puede consultar la solicitud almacenada
	 */
	@Test
	public void crearSolicitudTest() {
		
		log.info("=============== INICIA PRUEBA ========================");
		
		SolicitudBeca solicitud = new SolicitudBeca();
		solicitud.setNombre("Eduardo Castillo Mendoza");
		solicitud.setEscuela("TESJI");
		solicitud.setBeca("Estado del arte del desarrollo de sotware");
		
		repository.save(solicitud);
		
		
		//List<SolicitudBeca> becas = repository.findAll();
		
		
		//log.info("Becas: " + becas);
	
		log.info("============== FINALIZA PRUEBA ====================");
		
		
	}

}
