package com.esprit.microservices.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MaisonHote implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private String nom, adresse, description , prix,chambre , image;

	public MaisonHote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getChambre() {
		return chambre;
	}

	public void setChambre(String chambre) {
		this.chambre = chambre;
	}

	public MaisonHote( int id, String nom, String adresse, String description ,String prix ,String chambre,String image) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.description = description;
		this.image = image;
		this.chambre = chambre;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
