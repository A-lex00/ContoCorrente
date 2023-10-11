import java.util.Objects;
import java.util.Scanner;


public class GestioneConto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente contoCorrente = new ContoCorrente();
        System.out.println("Inserire l'operazione che vuole  svolgere:");
        String operazione = scanner.nextLine();
        float versamento= 0;
        float prelievo= 0;
        do {
            if (operazione.equals("versamento")) {
                System.out.println(" Inserisci l'importo del versamento:");
                versamento=scanner.nextFloat();
                ContoCorrente.Versamenti(versamento);
            }
            if (operazione.equals("prelievo")) {
                System.out.println("Inserisci l'importo del prelievo:");
                prelievo=scanner.nextFloat();
                ContoCorrente.Prelievo(prelievo);
            }
            if (operazione.equals("stampa")) {
                ContoCorrente.Stampa();
            }
            operazione = scanner.nextLine();
        }
        while (!Objects.equals(operazione, "esci")) ;

    }
}