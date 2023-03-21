package com.ada.calculadora.service;

import com.ada.calculadora.model.Quadrado;
import com.ada.calculadora.model.Triangulo;

public class CalculadoraService {
    public int somar(int a, int b){
        return a+b; }

    public int subtrair(int a, int b){
        return a-b;
    }

    public int dividir(int a, int b){
        return a/b;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }

    public double calcularArea(Quadrado quadrado){
        return Math.pow(quadrado.getLado(),2);
    }

    public double calcularArea(Triangulo triangulo){
        return (triangulo.getBase()* triangulo.getAltura())/2.0;
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadradoA, Quadrado quadradoB){
        double areaQuadradoA = calcularArea(quadradoA);
        double areaQuadradoB = calcularArea(quadradoB);

        if(areaQuadradoA < areaQuadradoB){
            return quadradoA;
        }
        else if (areaQuadradoB < areaQuadradoA) {
            return quadradoB;
        }
        else {
            return null;
        }
    }

    public Triangulo trianguloDeMenorArea(Triangulo trianguloA, Triangulo trianguloB){
        double areaTrianguloA = calcularArea(trianguloA);
        double areaTrianguloB = calcularArea(trianguloB);

        if(areaTrianguloA < areaTrianguloB){
            return trianguloA;
        }
        else if (areaTrianguloB < areaTrianguloA) {
            return trianguloB;
        }
        else {
            return null;
        }
    }
}
