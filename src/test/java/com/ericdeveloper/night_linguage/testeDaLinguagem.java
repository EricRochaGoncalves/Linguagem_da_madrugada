package com.ericdeveloper.night_linguage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testeDaLinguagem {
    public static void main(String[] args) {

        Variaveis dados = new Variaveis();

        dados.setTexto("Qualquer texto");
        dados.setNumero(19);

        dados.ImprimeDados();

    }
}
