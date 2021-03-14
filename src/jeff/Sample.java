package jeff;

import java.util.HashMap;

public class Sample {	
	public HashMap<String, Integer> data;
	private boolean valid = false;
	
	/**
	 * Constructor that takes a HashMap for initializing the class' data
	 * @param data - data to be stored in Sample
	 */
	public Sample(HashMap<String, Integer> data) {
		this.data = data;
	}
	
	/**
	 * isValid - determine if this thing is valid
	 * @return boolean validity
	 */
	public boolean isValid() {
		return valid;
	}
	
	
	/**
	 * getData - Returns data by key
	 * @param key - String key value to lookup data with
	 * @return Integer data in given key
	 */
	public Integer getData(String key) {
		return data.get(key);
	}	
}
