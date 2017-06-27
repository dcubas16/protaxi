package org.protaxi.services;

import org.protaxi.ProtaxiConstants;
import org.protaxi.dto.RequestTaxiDTO;
import org.protaxi.dto.TaxiCallerDTO;
import org.protaxi.entities.RequestTaxi;
import org.protaxi.entities.TaxiCaller;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class FireBaseAccess {

	Firebase ref;
	boolean isFirebaseComplete = false; 


	public void configure(String databaseName) {
		isFirebaseComplete = false; 
		try {
			ref = new Firebase(databaseName); 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hay un error " + e.getMessage());
		}

	}

	public boolean requestTaxi(TaxiCaller taxiCaller) {
		try {
			
			Firebase refRequestTaxi = ref.child(ProtaxiConstants.FIREBASE_REQUEST_TAXI);
			Firebase refRequestTaxiNew = refRequestTaxi.push();
			
			refRequestTaxiNew.setValue(new TaxiCallerDTO(taxiCaller), new Firebase.CompletionListener() {
				@Override
				public void onComplete(FirebaseError firebaseError, Firebase firebase) {
					if(firebaseError == null)
						isFirebaseComplete = true;
				}
			});
			
			Thread.sleep(ProtaxiConstants.FIREBASE_TIME_REQUEST);
			
			return isFirebaseComplete;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hay un error " + e.getMessage());
			return false;
		}
	}
	
	public boolean requestTaxi(RequestTaxi requestTaxi) {
		
		try {
			
			Firebase refRequestTaxi = ref.child(ProtaxiConstants.FIREBASE_REQUEST_TAXI);
			Firebase refRequestTaxiNew = refRequestTaxi.push();
			
			refRequestTaxiNew.setValue(new RequestTaxiDTO(requestTaxi), new Firebase.CompletionListener() {
				@Override
				public void onComplete(FirebaseError firebaseError, Firebase firebase) {
					if(firebaseError == null)
						isFirebaseComplete = true;
				}
			});
			
			Thread.sleep(ProtaxiConstants.FIREBASE_TIME_REQUEST);
			
			return isFirebaseComplete;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hay un error " + e.getMessage());
			return false;
		}
	}

}
