import java.util.Scanner;

    public class Fases{
public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    int fasesFaceis;
    int fasesDificeis;
    int horasFaceis;
    int horasDificeis;
    int totalHoras;
    double valor;
    System.out.println("Digite quantas fases são fáceis:");
    fasesFaceis = teclado.nextInt();

    fasesDificeis=96 - fasesFaceis;

    horasFaceis= fasesFaceis *1;
    horasDificeis=fasesDificeis*2;

 totalHoras =horasFaceis + horasDificeis;

 valor= totalHoras * 5;
 System.out.println("Quantidade fases fáceis: " + fasesFaceis);
System.out.println("Quantidade fases difíceis: " + fasesDificeis);
System.out.println("Horas nas fases fáceis: " + horasFaceis);
System.out.println("Horas nas fases difíceis: " + horasDificeis);
System.out.println("Total de horas gastas até concluir o jogo: " + totalHoras);
System.out.println("Valor em reais da jogatina: R$ " + valor);

}
    }
