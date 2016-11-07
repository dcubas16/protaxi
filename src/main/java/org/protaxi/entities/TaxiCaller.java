package org.protaxi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAXI_CALLER")
public class TaxiCaller{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="ID")
	private int id;
	
	@Column(name="ID_CLIENT", nullable = false)
	private int idClient;
	
	@Column(name="LATITUDE", nullable = false)
	private double latitud;
	
	@Column(name="LONGITUD", nullable = false)
	private double longitud;
	
	@Column(name="REQUEST_DATE", nullable = true)
	private Date callerDate;
	
	@Column(name="ID_ESTATE", nullable = false)
	private String estado;
	
	public TaxiCaller(double latitud, double longitud, Date callerDate, String estado) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.callerDate = callerDate;
		this.estado = estado;
	}

	public TaxiCaller(int idClient, double latitud, double longitud, Date callerDate, String estado) {
		super();
		this.idClient = idClient;
		this.latitud = latitud;
		this.longitud = longitud;
		this.callerDate = callerDate;
		this.estado = estado;
	}
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public Date getCallerDate() {
		return callerDate;
	}
	public void setCallerDate(Date callerDate) {
		this.callerDate = callerDate;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
