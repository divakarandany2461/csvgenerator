package fieldsPojo;

import java.util.ArrayList;

public class PickListValue{
	private String display_value;
	private String colour_code;
	private int probability;
	private String forecast_category;
	private String actual_value;
	private String id;
	private String forecast_type;
	private ArrayList<Object> maps;
	public String getDisplay_value() {
		return display_value;
	}
	public void setDisplay_value(String display_value) {
		this.display_value = display_value;
	}
	public String getColour_code() {
		return colour_code;
	}
	public void setColour_code(String colour_code) {
		this.colour_code = colour_code;
	}
	public int getProbability() {
		return probability;
	}
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public String getForecast_category() {
		return forecast_category;
	}
	public void setForecast_category(String forecast_category) {
		this.forecast_category = forecast_category;
	}
	public String getActual_value() {
		return actual_value;
	}
	public void setActual_value(String actual_value) {
		this.actual_value = actual_value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getForecast_type() {
		return forecast_type;
	}
	public void setForecast_type(String forecast_type) {
		this.forecast_type = forecast_type;
	}
	public ArrayList<Object> getMaps() {
		return maps;
	}
	public void setMaps(ArrayList<Object> maps) {
		this.maps = maps;
	}
    
}
