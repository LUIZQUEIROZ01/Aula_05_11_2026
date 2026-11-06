package Aula_05_11_2026;

public class Principal2 {

	public static void main(String[] args) {
		
		Motor motor = new Motor ("V1");
		Carro carro = new Carro ("Uno", motor);
		Motor motor2 = new Motor ("V8");
		Carro carro2 = new Carro ("Corola", motor2);
		
		
		System.out.println("Carro: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
		System.out.println("-----------------------------------------");
		System.out.println("Carro: " + carro2.getModelo() + "\nMotor: " + motor2.getTipo());
		
	}

}
