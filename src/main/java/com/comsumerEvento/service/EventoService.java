package com.comsumerEvento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comsumerEvento.model.Evento;
import com.comsumerEvento.repository.EventosRepository;
import com.dynaccurate.form.EventoForm;


@Service
public class EventoService {

	@Autowired
	private EventosRepository eventosRepository;

	public void salvarEvento(EventoForm form) {
		Evento evento = new Evento(form);
		this.eventosRepository.save(evento);
	}

}
