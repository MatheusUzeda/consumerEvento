package com.comsumerEvento.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.dynaccurate.form.EventoForm;

@Document
public class Evento {

	@Id
	private String id;

	private String eventType;

	private LocalDateTime eventDateTime;
	
	private String idUsuario;

	public Evento(EventoForm form) {
		this.eventType = form.getEventType();
		this.eventDateTime = form.getEventDateTime();
		this.idUsuario = form.getIdUsuario();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}
	

	public void setEventDateTime(LocalDateTime eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
}
