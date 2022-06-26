public class Main {

    public static void main(String[] args) {
        suma(100, 200, 300);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("numero de puertas es: " + miCoche.numeroDePuertas);

    }

    
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int numeroDePuertas = 3;

    public void sumarPuertas(){

        this.numeroDePuertas++;
        System.out.println(numeroDePuertas);

    }
}