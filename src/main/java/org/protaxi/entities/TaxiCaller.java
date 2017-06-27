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
	
	@Column(name="CLIENT_ID", nullable = false)
	private int clientId;
	
	@Column(name="LATITUDE_ORIGIN", nullable = false)
	private double latitudeOrigin;
	
	@Column(name="LONGITUDE_ORIGIN", nullable = false)
	private double longitudeOrigin;
	
	@Column(name="ORIGIN_REFERENCES", nullable = true)
	private String originReferences;
		
	@Column(name="LATITUDE_DESTINY", nullable = false)
	private double latitudeDestiny;
	
	@Column(name="LONGITUDE_DESTINY", nullable = false)
	private double longitudeDestiny;
	
	@Column(name="PAYMENT_TYPE_ID", nullable = false, length = 36)	
	private String paymentTypeId;
	
	@Column(name="SERVICE_TYPE_ID", nullable = false, length = 36)	
	private String serviceTypeId;
	
	@Column(name="CATEGORY_ID", nullable = false, length = 36)	
	private String categoryId;
	
	@Column(name="REQUEST_DATE", nullable = true)
	private Date callerDate;
	
	@Column(name="STATE_ID", nullable = false, length = 36)
	private String stateId;
		
	
	public TaxiCaller(int id, int clientId, double latitudeOrigin, double longitudeOrigin, String originReferences,
			double latitudeDestiny, double longitudeDestiny, String paymentTypeId, String serviceTypeId,
			String categoryId, Date callerDate, String stateId) {
		super();
		this.id = id;
		this.clientId = clientId;
		this.latitudeOrigin = latitudeOrigin;
		this.longitudeOrigin = longitudeOrigin;
		this.originReferences = originReferences;
		this.latitudeDestiny = latitudeDestiny;
		this.longitudeDestiny = longitudeDestiny;
		this.paymentTypeId = paymentTypeId;
		this.serviceTypeId = serviceTypeId;
		this.categoryId = categoryId;
		this.callerDate = callerDate;
		this.stateId = stateId;
	}

	public TaxiCaller(int clientId, double latitudeOrigin, double longitudeOrigin, String originReferences,
			double latitudeDestiny, double longitudeDestiny, String paymentTypeId, String serviceTypeId,
			String categoryId, Date callerDate, String stateId) {
		super();
		this.clientId = clientId;
		this.latitudeOrigin = latitudeOrigin;
		this.longitudeOrigin = longitudeOrigin;
		this.originReferences = originReferences;
		this.latitudeDestiny = latitudeDestiny;
		this.longitudeDestiny = longitudeDestiny;
		this.paymentTypeId = paymentTypeId;
		this.serviceTypeId = serviceTypeId;
		this.categoryId = categoryId;
		this.callerDate = callerDate;
		this.stateId = stateId;
	}

	public TaxiCaller() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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

	public String getOriginReferences() {
		return originReferences;
	}

	public void setOriginReferences(String originReferences) {
		this.originReferences = originReferences;
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

	public String getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setPaymentTypeId(String paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public String getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(String serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Date getCallerDate() {
		return callerDate;
	}

	public void setCallerDate(Date callerDate) {
		this.callerDate = callerDate;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

}
