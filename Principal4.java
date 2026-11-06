package Aula_05_11_2026;

public class Principal4 {

	public static void main(String[] args) {
		Departamento departamento = new Departamento ("RH");
		Empresa empresa = new Empresa ("Humanos", departamento);
		
		System.out.println("Departamento: " + departamento.getNome() + "\nEmpresa: " + empresa.getNome());

	}

}
