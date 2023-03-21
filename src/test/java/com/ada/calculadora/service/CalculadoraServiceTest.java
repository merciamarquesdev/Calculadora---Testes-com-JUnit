package com.ada.calculadora.service;

import com.ada.calculadora.model.Quadrado;
import com.ada.calculadora.model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {

    CalculadoraService calculadoraService;

    @Before
    public void before(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveSomarCorretamente(){
        int esperado = 3;
        int atual = calculadoraService.somar(1,2);
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void deveSubtrairCorretamente(){
        Assert.assertTrue(calculadoraService.subtrair(2,1) == 1);
    }

    @Test
    public void deveDividirCorretamente(){
        Assert.assertTrue(calculadoraService.dividir(10,5) == 2);
    }

    @Test
    public void deveMultiplicarCorretamente(){
        Assert.assertTrue(calculadoraService.multiplicar(5,2) == 10);
    }

    @Test
    public void deveCalcularAreaDoQuadradoCorretamente(){
        Quadrado quadrado = new Quadrado(5.0);
        double areaEsperada = 25.0;
        Assert.assertEquals(areaEsperada, calculadoraService.calcularArea(quadrado), 0.0);
    }

   @Test
    public void deveCalcularAreaDoTrianguloCorretamente(){
        Triangulo triangulo = new Triangulo(10.0,3.0);
        double areaEsperada = 15.0;
        Assert.assertEquals(areaEsperada,calculadoraService.calcularArea(triangulo),0.0);
    }

    @Test
    public void deveRetornarQuadradoDeMenorArea(){
        Quadrado quadradoA = new Quadrado(2.0);
        Quadrado quadradoB = new Quadrado(3.0);
        Quadrado quadradoMenorEsperado = quadradoA;
        Quadrado quadradoMenorAtual = calculadoraService.quadradoDeMenorArea(quadradoA,quadradoB);
        Assert.assertTrue(quadradoMenorEsperado == quadradoMenorAtual);
    }

    @Test
    public void deveRetornarTrianguloDeMenorArea(){
        Triangulo trianguloA = new Triangulo(2.0,7.0);
        Triangulo trianguloB = new Triangulo(4.0,1.0);
        Triangulo trianguloMenorEsperado = trianguloB;
        Triangulo trianguloMenorAtual = calculadoraService.trianguloDeMenorArea(trianguloA,trianguloB);
        Assert.assertTrue(trianguloMenorEsperado == trianguloMenorAtual);
    }

    @Test
    public void deveRetornarNullParaQuadradosDeAreasIguais(){
        Quadrado quadradoA = new Quadrado(2.0);
        Quadrado quadradoB = new Quadrado(2.0);
        Quadrado quadradoMenor = calculadoraService.quadradoDeMenorArea(quadradoA,quadradoB);
        Assert.assertNull(quadradoMenor);
    }

    @Test
    public void deveRetornarNullParaTriangulosDeAreasIguais(){
        Triangulo trianguloA = new Triangulo(2.0,1.0);
        Triangulo trianguloB = new Triangulo(2.0,1.0);
        Triangulo trianguloMenor = calculadoraService.trianguloDeMenorArea(trianguloA,trianguloB);
        Assert.assertNull(trianguloMenor);
    }

}
