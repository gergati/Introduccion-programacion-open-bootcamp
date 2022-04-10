package com.company;

public class Functions {

    public static void main(String[] args) {
       suma(20, 30, 50);
       Coche miCoche = new Coche();
       miCoche.AgregarPuertas();
       System.out.println("El numero total de puertas de mi auto es " + miCoche.puertas);
    }
    public static void suma (int a, int b, int c){
        int otroResultado;
        otroResultado = a + b + c;
        String text = "La suma de los valores a + b + c : " + otroResultado;
        System.out.println(text);
    };
}
class Coche {
    public int puertas = 3;

    public void AgregarPuertas(){
          this.puertas++;
    };
}


