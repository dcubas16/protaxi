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
//	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="ID")
	private int id;
	
	@Column(name="ID_CLIENT", nullable = false)
	private int idClient;
	
	@Column(name="LATITUDE_ORIGIN", nullable = false)
	private double latitudeOrigin;
	
	@Column(name="LONGITUDE_ORIGIN", nullable = false)
	private double longitudeOrigin;
		
	@Column(name="LATITUDE_DESTINY", nullable = false)
	private double latitudeDestiny;
	
	@Column(name="LONGITUDE_DESTINY", nullable = false)
	private double longitudeDestiny;
	
	@Column(name="ORIGIN_REFERENCES", nullable = true)
	private String originReferences;
	
	@Column(name="PAYMENT_TYPE", nullable = false, length = 36)	
	private String paymentType;
	
	@Column(name="SERVICE_TYPE", nullable = false, length = 36)	
	private String serviceType;
	
	@Column(name="REQUEST_DATE", nullable = true)
	private Date callerDate;
	
	@Column(name="ID_ESTATE", nullable = false, length = 36)
	private String estado;
		
	
	public TaxiCaller(int id, int idClient, double latitudeOrigin, double longitudeOrigin, double latitudeDestiny,
			double longitudeDestiny, String originReferences, String paymentType, String serviceType, Date callerDate,
			String estado) {
		super();
		this.id = id;
		this.idClient = idClient;
		this.latitudeOrigin = latitudeOrigin;
		this.longitudeOrigin = longitudeOrigin;
		this.latitudeDestiny = latitudeDestiny;
		this.longitudeDestiny = longitudeDestiny;
		this.originReferences = originReferences;
		this.paymentType = paymentType;
		this.serviceType = serviceType;
		this.callerDate = callerDate;
		this.estado = estado;
	}
	
	public TaxiCaller(int idClient, double latitudeOrigin, double longitudeOrigin, double latitudeDestiny,
			double longitudeDestiny, String originReferences, String paymentType, String serviceType, Date callerDate,
			String estado) {
		super();
		this.idClient = idClient;
		this.latitudeOrigin = latitudeOrigin;
		this.longitudeOrigin = longitudeOrigin;
		this.latitudeDestiny = latitudeDestiny;
		this.longitudeDestiny = longitudeDestiny;
		this.originReferences = originReferences;
		this.paymentType = paymentType;
		this.serviceType = serviceType;
		this.callerDate = callerDate;
		this.estado = estado;
	}

	public TaxiCaller() {
		super();
	}

	
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	public double getLatitudeOrigin() {
		return latitudeOrigin;
	}

	public void setLatitudeOrigin(double latitudeOrigin) {
		this.latitudeOrigin = latitudeOrigin;
	}

	public double getLongitudeOrigin() {
		return longitudeOrigin;
	}

	public void setLongitudeOrigin(double longitudeOrigin) {
		this.longitudeOrigin = longitudeOrigin;
	}

	public double getLatitudeDestiny() {
		return latitudeDestiny;
	}

	public void setLatitudeDestiny(double latitudeDestiny) {
		this.latitudeDestiny = latitudeDestiny;
	}

	public double getLongitudeDestiny() {
		return longitudeDestiny;
	}

	public void setLongitudeDestiny(double longitudeDestiny) {
		this.longitudeDestiny = longitudeDestiny;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getOriginReferences() {
		return originReferences;
	}
	
	public void setOriginReferences(String originReferences) {
		this.originReferences = originReferences;
	}
	
}
