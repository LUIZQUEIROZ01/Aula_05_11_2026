package Aula_05_11_2026;

public class Principal {
	public static void main (String [] args) {
		Universidade universidade = new Universidade ("USP");
		Universidade universidade2 = new Universidade ("Fatec");
		Estudante estudante = new Estudante ("João", universidade);
		Estudante estudante2 = new Estudante ("Luiz", universidade2);
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());
		System.out.println(" ----------------------------");
		System.out.println("Estudante: " + estudante2.getNome() + "\nUniversidade: " + universidade2.getNome());
	}
	

}
