import java.text.DecimalFormat;

public class Controle  {
   private Empregado [] lista = new Empregado[3];
   private int index = 0;

   public void inserir(Empregado empregado){
       lista[index++] = empregado;
   }

   public Empregado pesquisar(long matricula){
       for (int i = 0; i < index; i++){
           if(lista[i].Matricula == matricula){
               return lista[i];
           }
       }
          return null;
   }

   public String listar (){
       DecimalFormat df = new DecimalFormat("#,##0.00");
       String aux = "";
       for (int i = 0; i < index; i++){
           aux += lista[i].getDados();
           aux += "Salário: R$ " + df.format(lista[i].calcularSalario()) + "\n";
       }
       return aux;
   }

}
