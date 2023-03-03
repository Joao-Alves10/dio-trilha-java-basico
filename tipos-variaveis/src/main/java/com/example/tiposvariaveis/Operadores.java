package com.example.tiposvariaveis;

import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args) {
        /*String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/

        /*int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);*/

        //Operador ternário
        /*int a, b;
        a = 6;
        b = 6;
        int resultado = a==b ? 1 : 0;
        System.out.println(resultado);*/
        //Equals usado para comparar objetos.
        String nomeUm = "JOAO";
        String nomeDois = new String("JOAO");

        System.out.println(nomeUm.equals(nomeDois));




        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + simNao);



    }
}
