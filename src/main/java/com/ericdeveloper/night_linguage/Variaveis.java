package com.ericdeveloper.night_linguage;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Variaveis {

    private String Texto;  

    private int Numero;    

    public void ImprimeDados(){

        System.out.println("Dados das variaveis: " );
        
        System.out.println(this.Texto);
        System.out.println(this.Numero);


    }

    public void setTexto ( String Texto){
        this.Texto = Texto;
    }

    public void setNumero ( int Numero){

        if ( Numero < 0){
            System.out.println("Número inválido!");
            return;
        }
            this.Numero = Numero;
    }

}

