/**
 * 
 */
package com.codenerdz.auctioncenter.model;

/**
 * @author PMeththananda
 *
 */
public class VehicleOffer {

	/**
	 * 
	 */
	private float vehicleActionPrice;
	private float averageYenRate;
	private float shppingCost;
	private float cifValue;
	private float taxValue;
	private float bankCharges;
	private float insuranceValue;
	private float clearanceCharges;
	
	public VehicleOffer() {
		
	}

	public float getVehicleActionPrice() {
		return vehicleActionPrice;
	}

	public void setVehicleActionPrice(float vehicleActionPrice) {
		this.vehicleActionPrice = vehicleActionPrice;
	}

	public float getAverageYenRate() {
		return averageYenRate;
	}

	public void setAverageYenRate(float averageYenRate) {
		this.averageYenRate = averageYenRate;
	}

	public float getShppingCost() {
		return shppingCost;
	}

	public void setShppingCost(float shppingCost) {
		this.shppingCost = shppingCost;
	}

	public float getCifValue() {
		return cifValue;
	}

	public void setCifValue(float cifValue) {
		this.cifValue = cifValue;
	}

	public float getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(float taxValue) {
		this.taxValue = taxValue;
	}

	public float getBankCharges() {
		return bankCharges;
	}

	public void setBankCharges(float bankCharges) {
		this.bankCharges = bankCharges;
	}

	public float getInsuranceValue() {
		return insuranceValue;
	}

	public void setInsuranceValue(float insuranceValue) {
		this.insuranceValue = insuranceValue;
	}

	public float getClearanceCharges() {
		return clearanceCharges;
	}

	public void setClearanceCharges(float clearanceCharges) {
		this.clearanceCharges = clearanceCharges;
	}

}
