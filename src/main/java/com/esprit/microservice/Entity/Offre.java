package com.esprit.microservice.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offre  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOffre;
	private String nom;
    private String type;
    private String datedebut;
    private String image;
    private String datefin;
    private int prix ;
    private String description ;
    
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Offre(String nom2) {
		super();
this.nom=nom2;
		// TODO Auto-generated constructor stub
	}
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getdatedebut() {
		return datedebut;
	}
	public void setdatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getdatefin() {
		return datefin;
	}
	public void setdatefin(String datefin) {
		this.datefin = datefin;
	}
	public int getprix() {
		return prix;
	}
	public void setprix(int prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Offre [idOffre=" + idOffre + ", nom=" + nom + ", type=" + type + ", datedebut=" + datedebut + ", image="
				+ image + ", datefin=" + datefin + ", prix=" + prix + ", description=" + description + "]";
	}
	




}
