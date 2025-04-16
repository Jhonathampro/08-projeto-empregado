public class Main {
    public static void main(String[] args) {

        Empregado [] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(12, "João", 25, 400);
        empregado[1] = new EmpregadoHorista(30, "Jotape", 5, 30);
        empregado[2] = new EmpregadoComissionado(6, "Justo", 90, 200);

        for(Empregado e : empregado){
            System.out.println(e.calcularSalario() + " Salario");
            System.out.println(e.getDados());

        }
    }
}
