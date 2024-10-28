package com.ec.pintulac.utilitario;

public class TiempoEjecucion {
	
	private long startTime;
	private long finalTime;
	private long ejecutionTime;
	
	 
	public TiempoEjecucion() {
		super();
	}
	public TiempoEjecucion(long startTime, long finalTime, long ejecutionTime) {
		super();
		this.startTime = startTime;
		this.finalTime = finalTime;
		this.ejecutionTime = ejecutionTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getFinalTime() {
		return finalTime;
	}
	public void setFinalTime(long finalTime) {
		this.finalTime = finalTime;
	}
	public long getEjecutionTime() {
		return ejecutionTime;
	}
	public void setEjecutionTime(long ejecutionTime) {
		this.ejecutionTime = ejecutionTime;
	}
	
	

}
