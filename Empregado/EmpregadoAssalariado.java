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
        }
    }

    @Override
    public String toString() {
        return String.format("%s \nSalario semanal = %.2f\n", super.toString(), getSalarioSemanal());
    }

    
}