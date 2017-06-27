package org.protaxi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.protaxi.dto.RequestTaxiDTO;

@Entity
@Table(name = "REQUEST_TAXI", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID")})
public class RequestTaxi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="ID")
	private int id;
	
	@Column(name = "CLIENT_ID", nullable = true)
	private int clientId;
	
	@Column(name = "LAT_ORIGIN", nullable = true)
	private Double latOrigin;
    
	@Column(name = "LNG_ORIGIN", nullable = true)
	private Double lngOrigin;
    
	@Column(name = "ORIGIN_ADDRESS", nullable = true)
	private String originAddress;
    
	@Column(name = "ORIGIN_ADDRESS_NUMBER", nullable = true)
	private String originAddressNumber;
    
	@Column(name = "ORIGIN_REFERENCE", nullable = true)
	private String originReference;
    
	@Column(name = "LAT_DESTINATION", nullable = true)
	private Double latDestination;
    
	@Column(name = "LNG_DESTINATION", nullable = true)
	private Double lngDestination;
    
	@Column(name = "DESTINATION_REFERENCE", nullable = true)
	private String destinationReference;
    
	@Column(name = "PAYMENT_TYPE_ID", nullable = true)
	private String paymentTypeId;
    
	@Column(name = "SERVICE_TYPE_ID", nullable = true)
	private String serviceTypeId;
    
	@Column(name = "REQUEST_DATE", nullable = true)
	private Date requesDate;
    
    
    public RequestTaxi() {
		super();
	}
    
	public RequestTaxi(int id, int clientId, Double latOrigin, Double lngOrigin, String originAddress,
			String originAddressNumber, String originReference, Double latDestination, Double lngDestination,
			String destinationReference, String paymentTypeId, String serviceTypeId, Date requesDate) {
		super();
		this.id = id;
		this.clientId = clientId;
		this.latOrigin = latOrigin;
		this.lngOrigin = lngOrigin;
		this.originAddress = originAddress;
		this.originAddressNumber = originAddressNumber;
		this.originReference = originReference;
		this.latDestination = latDestination;
		this.lngDestination = lngDestination;
		this.destinationReference = destinationReference;
		this.paymentTypeId = paymentTypeId;
		this.serviceTypeId = serviceTypeId;
		this.requesDate = requesDate;
	}
	
	public RequestTaxi(RequestTaxiDTO requestTaxiDTO) {
		this.id = requestTaxiDTO.getId();
		this.clientId = requestTaxiDTO.getClientId();
		this.latOrigin = requestTaxiDTO.getLatOrigin();
		this.lngOrigin = requestTaxiDTO.getLngOrigin();
		this.originAddress = requestTaxiDTO.getOriginAddress();
		this.originAddressNumber = requestTaxiDTO.getOriginAddressNumber();
		this.originReference = requestTaxiDTO.getOriginReference();
		this.latDestination = requestTaxiDTO.getLatDestination();
		this.lngDestination = requestTaxiDTO.getLngDestination();
		this.destinationReference = requestTaxiDTO.getDestinationReference();
		this.paymentTypeId = requestTaxiDTO.getPaymentTypeId();
		this.serviceTypeId = requestTaxiDTO.getServiceTypeId();
		this.requesDate = requestTaxiDTO.getRequesDate();
	}

	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public Double getLatOrigin() {
		return latOrigin;
	}
	public void setLatOrigin(Double latOrigin) {
		this.latOrigin = latOrigin;
	}
	public Double getLngOrigin() {
		return lngOrigin;
	}
	public void setLngOrigin(Double lngOrigin) {
		this.lngOrigin = lngOrigin;
	}
	public String getOriginAddress() {
		return originAddress;
	}
	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}
	public String getOriginAddressNumber() {
		return originAddressNumber;
	}
	public void setOriginAddressNumber(String originAddressNumber) {
		this.originAddressNumber = originAddressNumber;
	}
	public String getOriginReference() {
		return originReference;
	}
	public void setOriginReference(String originReference) {
		this.originReference = originReference;
	}
	public Double getLatDestination() {
		return latDestination;
	}
	public void setLatDestination(Double latDestination) {
		this.latDestination = latDestination;
	}
	public Double getLngDestination() {
		return lngDestination;
	}
	public void setLngDestination(Double lngDestination) {
		this.lngDestination = lngDestination;
	}
	public String getDestinationReference() {
		return destinationReference;
	}
	public void setDestinationReference(String destinationReference) {
		this.destinationReference = destinationReference;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRequesDate() {
		return requesDate;
	}
	public void setRequesDate(Date requesDate) {
		this.requesDate = requesDate;
	}
}
