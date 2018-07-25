package com.gilbarco.vo;

import java.time.LocalDateTime;

public class CounterData {
	
	private LocalDateTime timestamp;
	private int calls;
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public int getCalls() {
		return calls;
	}
	public void setCalls(int calls) {
		this.calls = calls;
	}
	
	
	
	

}
