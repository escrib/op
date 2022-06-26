
public class If {
    public static void main(String args[]) {
      

        // if else
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("positivo");
        } else if (numeroIf > 0) {
            System.out.println("negativo");
        } else {
            System.out.println("cero");
        }

        //while
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile ahora es: " + numeroWhile);
        }

        //do while
        int numeroDo = 3;
        do {
            numeroDo++;
            System.out.println("numeroDoWhile ahora es: " + numeroDo);
        } while(numeroDoWhile < 3);

        //for
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor ahora es: " + numeroFor);
        }

        //switch
        String estacion = "Primavera";
        switch(estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("No es una estación");
      }
    }
  