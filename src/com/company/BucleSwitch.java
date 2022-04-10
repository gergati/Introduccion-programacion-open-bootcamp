package com.company;

public class BucleSwitch {
    public static void main(String[] args){
        var estacion = "Verano";
        switch (estacion){
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            default:
                System.out.println("La estacion ingresada no existe");
        }
    }
}
