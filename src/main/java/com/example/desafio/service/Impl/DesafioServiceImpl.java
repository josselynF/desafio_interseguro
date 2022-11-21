package com.example.desafio.service.Impl;

import com.example.desafio.exception.Excepciones;
import com.example.desafio.service.DesafioService;
import org.springframework.stereotype.Service;

@Service
public class DesafioServiceImpl implements DesafioService {
    @Override
    public int[][] ejecutar(int[][] matrizInicial) throws Excepciones {
        if(validar(matrizInicial)){
            int t = matrizInicial.length;

            int [][] matrizFinal = new int[t][t];

            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t; j++) {
                    matrizFinal[t-1-j][i] = matrizInicial[i][j];
                }
            }
            return matrizFinal;
        }
        throw new Excepciones("El array ingresado no es NxN, ingrese un array cuadrático");
    }

    public boolean validar(int[][] m){
        int filas = m.length;
        int columnas = m[0].length;

        if(filas == columnas) return true;

        return false;
    }
}
