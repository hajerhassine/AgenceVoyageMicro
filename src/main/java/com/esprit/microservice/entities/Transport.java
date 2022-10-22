package com.esprit.microservice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Transport implements Serializable {
	private static final long serialVersionUID = 3090249096008711398L;
	@Id
	@GeneratedValue
	private int id;
	private String categorie,  image, modele;
	private int prix;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Transport(int id, String categorie, String modele, int prix, String image) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.modele = modele;
		this.prix = prix;
		this.image = image;
		
	}
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transport(String categorie) {
		super();
		this.categorie = categorie;
	}
	
	
	
}
