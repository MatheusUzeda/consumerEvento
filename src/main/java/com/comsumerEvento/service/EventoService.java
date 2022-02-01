package com.comsumerEvento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comsumerEvento.model.Evento;
import com.comsumerEvento.repository.EventosRepository;
import com.dynaccurate.dto.EventoDto;

@Service
public class EventoService {

	@Autowired
	private EventosRepository eventosRepository;

	public void salvarEvento(EventoDto dto) {
		Evento evento = new Evento(dto);
		this.eventosRepository.save(evento);
	}

}
