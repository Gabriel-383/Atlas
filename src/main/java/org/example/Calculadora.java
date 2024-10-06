package org.example;

import java.util.Scanner;

public class Calculadora {

    /**Metodo para soma de valores do tipo float
     * @param float num1 - 1ª Parcela
     * @param float num2 - 2ª Parcela
     * @param float resul - Resultado
     * */
    static Double soma(double a, double b){
        double resul;
        resul = a + b;
        return resul;
    }

    /**Metodo para subtração de valores do tipo float
     * @param float num1 - Minuendo
     * @param float num2 - Subtraendo
     * @param float resul - Resultado
     * */
    static Double subt(double a, double b){
        double resul;
        resul = a - b;
        return resul;
    }

    /**Metodo para multiplicação de valores do tipo float
     *@param float num1 - 1ª Parcela
     * @param float num2 - 2ª Parcela
     * @param float resul - Resultado
     * */
    static double mult(double a, double b){
        double resul;
        resul = a * b;
        return resul;
    }

    /**Metodo para divisão de valores do tipo float
     * @param float num1 -Numero a ser dividido
     * @param float num2 - Dividendo
     * @param float resul - Resultado
     * @link menuCalc
     * */
    static double divi(double a, double b){
        double resul;
        resul = a / b;
        return resul;
    }

    /**Metodo para potência de valores do tipo float
     * @param float base - Base
     * @param float expoente - Expoent
     * @param float resul - Resultado
     * @link menuCalc
     * */
    static double pote(double b, double x){
        double resul;
        Scanner input =  new Scanner(System.in);
        resul = Math.pow(b, x);
        return resul;
    }

    /**Metodo para obter Raiz Quadrada de valores do tipo Double
     * @param double num - Numero
     * @param double resul - Resultado
     * */
    static double raiz(double n1){
        double resul;
        Scanner input =  new Scanner(System.in);

        resul = Math.sqrt(n1);
        return resul;
    }

    /**Metodo para obter Raiz cúbica de valores do tipo Double
     * @param double num - Numero
     * @param double resul - Resultado
     * */
    static double raqu(double n1){
        double resul;
        Scanner input =  new Scanner(System.in);

        resul = Math.cbrt(n1);
        return resul;
    }

    /**
     * Metodo para geração de numeros aleatorios do tipo Double
     * */
    static double geradorNumerosAleatorios(){

        double a = Math.random();
        return a;
    }
}
