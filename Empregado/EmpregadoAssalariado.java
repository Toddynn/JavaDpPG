public class EmpregadoAssalariado extends Empregado {
    private double salarioSemanal;

    public EmpregadoAssalariado(String nome, int numeroSeguro, double salarioSemanal) {
        super(nome, numeroSeguro);
        setSalarioSemanal(salarioSemanal); 
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if(salarioSemanal >= 0){
            this.salarioSemanal = salarioSemanal;
        }else{
            throw new IllegalArgumentException("Salario semanal deve ser maior que zero.");
        }
    }

    public double ganhos(){
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("%s Salario semanal = %.2f\n Salario total = %.2f\n", super.toString(), getSalarioSemanal(), ganhos());
    }

    
}