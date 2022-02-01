package com.comsumerEvento.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comsumerEvento.model.Evento;
import com.comsumerEvento.service.EventoService;
import com.dynaccurate.constantes.RabbitMQConstantes;
import com.dynaccurate.dto.EventoDto;

@Component
public class EventoConsumer {

	@Autowired
	private EventoService service;

	@RabbitListener(queues = RabbitMQConstantes.FILA_EVENTO)
	private void consumidor(EventoDto dto) {
		service.salvarEvento(dto);

	}

}
