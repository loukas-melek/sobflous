package com.aws.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reseau")
public class IReseau {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
    private Long id;
	
	@Column(name="nombre")
    private int nombre;
	
	@Column(name="equipement")
    private String equipement;
	
	@Column(name="marque")
    private String marque;
	
	@Column(name="emplacement")
    private String emplacement;
	
	@Column(name="redandonce")
    private Boolean redandonce;
	
	@Column(name="proprietaire")
    private String proprietaire;
	
	@Column(name="classification")
    private String classification;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getEquipement() {
		return equipement;
	}

	public void setEquipement(String equipement) {
		this.equipement = equipement;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public Boolean getRedandonce() {
		return redandonce;
	}

	public void setRedandonce(Boolean redandonce) {
		this.redandonce = redandonce;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	
	
	
	
	
	
	
}
