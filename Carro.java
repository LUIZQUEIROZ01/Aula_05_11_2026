package Aula_05_11_2026;

public class Carro {
	private String modelo;
	private Motor motor;
	
	public Carro(String modelo, Motor motor) {
		super();
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}
