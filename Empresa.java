package Aula_05_11_2026;

public class Empresa {
	private String nome;
	private Departamento departamento;
	
	public Empresa(String nome, Departamento departamento) {
		super();
		this.nome = nome;
		this.departamento = departamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	

}
