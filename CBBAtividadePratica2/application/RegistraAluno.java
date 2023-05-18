package application;

public class RegistraAluno {
	private String nome;
	private String endereco;
	private int idade;
	private double notaMatematica;
	private double notaPortugues;
	private double notaGeografia;
	
	private static int contadorAlunos;
	
	public RegistraAluno(String nome, String endereco, int idade, double notaMatematica, double notaPortugues, double notaGeografia) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.notaMatematica = notaMatematica;
		this.notaPortugues = notaPortugues;
		this.notaGeografia = notaGeografia;
		contadorAlunos += 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNotaMatematica() {
		return notaMatematica;
	}

	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}

	public double getNotaPortugues() {
		return notaPortugues;
	}

	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}

	public double getNotaGeografia() {
		return notaGeografia;
	}

	public void setNotaGeografia(double notaGeografia) {
		this.notaGeografia = notaGeografia;
	}
	
	public int getQuantidadeAlunos() {
		return contadorAlunos;
	}
	
	public void imprimir() {
		System.out.println("\nNome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Idade: " + idade + "\n");
	}
	
	public void imprimir(double notaMatematica, double notaPortugues, double notaGeografia) {
		System.out.println("\nNome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Idade: " + idade);
		System.out.println("Nota matematica: " + String.format("%.2f", notaMatematica));
		System.out.println("Nota portugues: " + String.format("%.2f", notaPortugues));
		System.out.println("Nota geografia: " + String.format("%.2f", notaGeografia));
	}
}
