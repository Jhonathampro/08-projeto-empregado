public abstract class Empregado  {
    // abstract porque eu não instancio a classe empregado, não faz sentido eu poder
    // colocar valor nela por isso deixo abstrato
    long Matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        Matricula = matricula;
        this.nome = nome;
    }

    public String getDados(){
        String aux = "";
        aux += "Matricula " + Matricula + "\n";
        aux += "Nome " + nome + "\n";
        return  aux;
    }
    // se a classe não tiver abstrato não posso usar um método abstrato;
    public abstract double calcularSalario();

}
