package api.model.proyecto;

import com.google.gson.annotations.SerializedName;

public class HourlyRate{

	@SerializedName("amount")
	private int amount;

	@SerializedName("currency")
	private String currency;

	public int getAmount(){
		return amount;
	}

	public String getCurrency(){
		return currency;
	}
}