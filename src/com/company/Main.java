package com.company;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float X,Y,resultadosum, resultadores, resultadomul, resultadodiv, resultadomod;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bienvenido a la actividad 5, donde podras hacer la suma, resta, multiplicación, division y modulo de dos numeros.");
        System.out.println("Por Favor introduce el primer número.");
        X=keyboard.nextFloat();
        System.out.println("Por Favor introduce el segundo número.");
        Y=keyboard.nextFloat();
        resultadosum=X+Y;
        resultadores=X-Y;
        resultadomul=X*Y;
        resultadodiv=X/Y;
        resultadomod=X%Y;
        System.out.println("X: "+X);
        System.out.println("Y: "+Y);
        System.out.println("Suma: "+resultadosum);
        System.out.println("Resta: "+resultadores);
        System.out.println("Multiplicación: "+resultadomul);
        System.out.println("Division: "+resultadodiv);
        System.out.println("Modulo: "+resultadomod);
    }
}
