public class ContoCorrente
{
    static float contoTotale=0;
    public static void Versamenti(float versamento){
        if(versamento<0){
            System.out.print("operazione negata");
            return;
        }
        contoTotale= contoTotale+versamento;
        System.out.println("Complimenti, hai accreditato:"+ contoTotale+"  euro");
    }
    public static void Prelievo(float prelievo){
        if(prelievo>contoTotale){
            System.out.print("Operazione negata");
            return;
        }
        contoTotale=contoTotale-prelievo;
        System.out.println("Complimenti, ti sono rimasti :"+ contoTotale+"  euro");
    }
    public static void Stampa(){
        System.out.println("Questo è il resoconto del suo conto personale:"+contoTotale+"  euro");
    }

}

