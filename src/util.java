import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
public class util {
   private Controle controle = new Controle();


    public void menu(){
        inserir();
        pesquisar();
        pesquisar();
        listar();

    }

    private void inserir(){
        long matricula;
        String nome;
        double totalDeVendas, comissao;
        int totalDeHoras;
        double valorDaHoras;
        int opc;
        String msg = "1. comissionado\n2. Horista\n 3. Sair";
        do {
            opc = parseInt(showInputDialog(msg));
            if(opc < 1 || opc > 3){
                showMessageDialog(null, "Mensagem ivalida");
            }
            if (opc == 1 || opc == 2){
                matricula = parseLong(showInputDialog("Matricula do empregado"));
                nome = showInputDialog("Nome do empregado");
                if (opc == 1){
                    totalDeVendas = parseDouble(showInputDialog("Valor total das vendas"));
                    comissao = parseDouble(showInputDialog("Comissão (porcentagem)"));
                    controle.inserir(new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao));
                }
                else {
                     totalDeHoras= parseInt(showInputDialog("Total de horas trabalhadas"));
                     valorDaHoras = parseDouble(showInputDialog("Valor da hora trabalhada"));
                     controle.inserir(new EmpregadoHorista(matricula, nome, totalDeHoras, valorDaHoras));


                }
            }
        } while(opc != 3);

    }

    private void pesquisar(){
         long matricula = parseLong(showInputDialog("Matricula para pesquisa"));
         Empregado empregado = controle.pesquisar(matricula);
         if (empregado == null){
             showMessageDialog(null, "Empregado com a Matricula " +
                     "" + matricula + " não encontrado");
         } else {
             showMessageDialog(null, empregado.getDados());
         }
    }

    private void listar(){
        showMessageDialog(null, controle.listar());
    }
}
