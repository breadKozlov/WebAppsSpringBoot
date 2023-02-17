package tacos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class TacoOrder implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message="Delivery name is required")
	private String deliveryName;
	
	@NotBlank(message="Street is required")
	private String deliveryStreet;
	
	@NotBlank(message="City is required")
	private String deliveryCity;
	
	@NotBlank(message="State is required")
	private String deliveryState;
	
	@NotBlank(message="Zip code is required")
	private String deliveryZip;
	
	@CreditCardNumber(message="Not a valid credit card number")
	private String ccNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
			 message="Must be formatted MM/YY")
	private String ccExpiration;
	
	@Digits(integer=3, fraction=0, message="Invalid CVV")
	private String ccCVV;
	
	private List<Taco> tacos = new ArrayList<>();

	public TacoOrder() {};
	public TacoOrder(String deliveryName, String deliveryStreet, String deliveryCity, String deliveryState,
			String deliveryZip, String ccNumber, String ccExpiration, String ccCVV) {
		
		this.deliveryName = deliveryName;
		this.deliveryStreet = deliveryStreet;
		this.deliveryCity = deliveryCity;
		this.deliveryState = deliveryState;
		this.deliveryZip = deliveryZip;
		this.ccNumber = ccNumber;
		this.ccExpiration = ccExpiration;
		this.ccCVV = ccCVV;
	}
	
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryStreet() {
		return deliveryStreet;
	}
	public void setDeliveryStreet(String deliveryStreet) {
		this.deliveryStreet = deliveryStreet;
	}
	public String getDeliveryCity() {
		return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	public String getDeliveryZip() {
		return deliveryZip;
	}
	public void setDeliveryZip(String deliveryZip) {
		this.deliveryZip = deliveryZip;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcExpiration() {
		return ccExpiration;
	}
	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}
	public String getCcCVV() {
		return ccCVV;
	}
	public void setCcCVV(String ccCVV) {
		this.ccCVV = ccCVV;
	}
	
	public List<Taco> getTacos() {
		return tacos;
	}
	public void setTacos(List<Taco> tacos) {
		this.tacos = tacos;
	}
	public void addTaco(Taco taco) {
		this.tacos.add(taco);
	}
	@Override
	public int hashCode() {
		return Objects.hash(ccCVV, ccExpiration, ccNumber, deliveryCity, deliveryName, deliveryState, deliveryStreet,
				deliveryZip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TacoOrder other = (TacoOrder) obj;
		return Objects.equals(ccCVV, other.ccCVV) && Objects.equals(ccExpiration, other.ccExpiration)
				&& Objects.equals(ccNumber, other.ccNumber) && Objects.equals(deliveryCity, other.deliveryCity)
				&& Objects.equals(deliveryName, other.deliveryName)
				&& Objects.equals(deliveryState, other.deliveryState)
				&& Objects.equals(deliveryStreet, other.deliveryStreet)
				&& Objects.equals(deliveryZip, other.deliveryZip);
	}
	@Override
	public String toString() {
		return "TacoOrder [deliveryName=" + deliveryName + ", deliveryStreet=" + deliveryStreet + ", deliveryCity="
				+ deliveryCity + ", deliveryState=" + deliveryState + ", deliveryZip=" + deliveryZip + ", ccNumber="
				+ ccNumber + ", ccExpiration=" + ccExpiration + ", ccCVV=" + ccCVV + "]";
	}	
}
