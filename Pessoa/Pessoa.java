public class Pessoa{
    
    private String nome;
    private int idade;
    private double salario;
	
	public Pessoa(){
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setSalario(double salario, int percentual) {
        this.salario = salario + (salario * percentual / 100.0);
	}
	
	

    
}