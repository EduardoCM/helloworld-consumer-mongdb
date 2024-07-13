package com.codigorupestre.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codigorupestre.model.SolicitudBeca;
import com.codigorupestre.repository.SolicitudesBecaRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SolicitudesBecasListener {
	
	@Autowired
	private SolicitudesBecaRepository repository;
	
	
	@RabbitListener(queues = "q.codigorupestre.becas.tesji")
	public void recibirSolicitudBeca(SolicitudBeca solicitud) {
		
		log.info("Solicitud de beca recibida: {} ", solicitud);
		
		repository.save(solicitud);
		
		
		
	}
	

}
