package com.comsumerEvento.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comsumerEvento.model.Evento;
import com.comsumerEvento.repository.EventosRepository;
import com.dynaccurate.constantes.RabbitMQConstantes;
import com.dynaccurate.dto.EventoDto;

@Component
public class EventoConsumer {
	
	@Autowired
	private EventosRepository eventosRepository;
	
	@RabbitListener(queues = RabbitMQConstantes.FILA_EVENTO)
	private void consumidor (EventoDto dto) {
		Evento evento = new Evento(dto);
		this.eventosRepository.save(evento);
	}

}
