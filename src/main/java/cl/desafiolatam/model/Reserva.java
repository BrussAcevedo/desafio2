package cl.desafiolatam.model;

public class Reserva {
	String medioPago;
	String diasStr;
	String fechaEntrada;
	

	public Reserva(String medioPago, String diasStr, String fechaEntrada) {

		this.medioPago = medioPago;
		this.diasStr = diasStr;
		this.fechaEntrada = fechaEntrada;
	}


	public String getMedioPago() {
		return medioPago;
	}


	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}


	public String getDiasStr() {
		return diasStr;
	}


	public void setDiasStr(String diasStr) {
		this.diasStr = diasStr;
	}


	public String getFechaEntrada() {
		return fechaEntrada;
	}


	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	
	
	
	
}
