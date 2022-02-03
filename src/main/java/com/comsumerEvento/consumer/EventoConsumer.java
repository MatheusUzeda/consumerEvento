package com.comsumerEvento.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comsumerEvento.service.EventoService;
import com.dynaccurate.constantes.RabbitMQConstantes;
import com.dynaccurate.form.EventoForm;

@Component
public class EventoConsumer {

	@Autowired
	private EventoService service;

	@RabbitListener(queues = RabbitMQConstantes.FILA_EVENTO)
	private void consumidor(EventoForm form) {
		service.salvarEvento(form);

	}

}
