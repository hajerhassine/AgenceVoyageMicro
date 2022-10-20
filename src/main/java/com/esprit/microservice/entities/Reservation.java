package com.esprit.microservice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Reservation implements Serializable {
	private static final long serialVersionUID = 3090249096008711398L;
	@Id
	@GeneratedValue
	private int id;
	private int duree;
	private String dateReservation, heureReservation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}
	
	public String getHeureReservation() {
		return heureReservation;
	}
	public void setHeureReservation(String heureReservation) {
		this.heureReservation = heureReservation;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", duree=" + duree + ", dateReservation=" + dateReservation
				+ ", heureReservation=" + heureReservation + "]";
	}
	public Reservation(int id, int duree, String dateReservation, String heureReservation) {
		super();
		this.id = id;
		this.duree = duree;
		this.dateReservation = dateReservation;
		this.heureReservation = heureReservation;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(String dateReservation) {
		super();
		this.dateReservation = dateReservation;
	}
	
}
