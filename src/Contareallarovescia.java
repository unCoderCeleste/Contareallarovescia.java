import java.util.Scanner;
public class Contareallarovescia {
    public static void main(String[] args) {
        Scanner rovescia= new Scanner(System.in);
        System.out.println("CONTATORE ALLA ROVESCIA");
        int contOr=0;

        do{
        System.out.print("Inserisci un numero POSITIVO: ");
        contOr= rovescia.nextInt();}
        while(contOr<=0);
        int cont=contOr;

        System.out.println("Contiamo da " +contOr +" a 1 e poi torniamo a " +contOr);
        System.out.println("\nUsando DO WHILE:");
        do{System.out.print(cont + " ");
            cont--;}
        while (cont!=0);
        System.out.println();
        do{cont++;
           System.out.print(cont + " ");}
        while (cont<contOr);
        System.out.println("\n");

        System.out.println("Ora usando FOR:");
        for(cont=contOr; cont!=0; cont--){
           System.out.print(cont + " ");
        }
            System.out.println();
            for(cont=1; cont<=contOr; cont++)
            {
                System.out.print(cont + " ");
            }
            System.out.println("\n");

            System.out.println("Ora usando FOR (con un'altra sintassi):");
            for(cont=contOr; cont!=0; cont--)
                System.out.print(cont + " ");
            {
                System.out.println();
                for(cont=1; cont<=contOr; cont++)
                {
                    System.out.print(cont + " ");
                }
            }
    }
}