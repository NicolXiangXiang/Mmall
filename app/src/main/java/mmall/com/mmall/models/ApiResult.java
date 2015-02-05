package mmall.com.mmall.models;

import com.fasterxml.jackson.databind.JsonNode;

public class ApiResult {
	
	private String status;
	
	private String message;
	
	private JsonNode data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JsonNode getData() {
		return data;
	}

	public void setData(JsonNode data) {
		this.data = data;
	}	
	
}
