package org.protaxi.dto;

import java.util.Date;

import org.protaxi.entities.TaxiCaller;

public class TaxiCallerDTO {

	public int id;
	
	public int clientId;
	
	public double latitudeOrigin;
	
	public double longitudeOrigin;
	
	public String originReferences;
		
	public double latitudeDestiny;
	
	public double longitudeDestiny;
	
	public String paymentTypeId;
		
	public String serviceTypeId;
	
	public String categoryId;
	
	public Date callerDate;
	
	public String stateId;

	public TaxiCallerDTO(int id, int clientId, double latitudeOrigin, double longitudeOrigin, String originReferences,
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

	public TaxiCallerDTO(int clientId, double latitudeOrigin, double longitudeOrigin, String originReferences,
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
	
	public TaxiCallerDTO(TaxiCaller taxiCaller) {
		super();
		this.id = taxiCaller.getId();
		this.clientId = taxiCaller.getClientId();
		this.latitudeOrigin = taxiCaller.getLatitudeOrigin();
		this.longitudeOrigin = taxiCaller.getLongitudeOrigin();
		this.originReferences = taxiCaller.getOriginReferences();
		this.latitudeDestiny = taxiCaller.getLatitudeDestiny();
		this.longitudeDestiny = taxiCaller.getLongitudeDestiny();
		this.paymentTypeId = taxiCaller.getPaymentTypeId();
		this.serviceTypeId = taxiCaller.getServiceTypeId();
		this.categoryId = taxiCaller.getCategoryId();
		this.callerDate = taxiCaller.getCallerDate();
		this.stateId = taxiCaller.getStateId();
	}

}
