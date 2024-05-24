package com.mycompany.projeto.dio.contabancaria;

import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("///////////////////////////////////////////\n"
                + "Bem vindo ao Banco!\n"
                + "///////////////////////////////////////////");
        //criar uma validação que precissa de uma resposta do while
        
        
        System.out.println("Informe o número da conta: ");
        numero = scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Informe o número da agência: ");
        agencia = scanner.nextLine();
        
        System.out.println("Informe o nome: ");
        nomeCliente = scanner.nextLine();
        
        
        System.out.println("Informe o saldo: ");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo+" já está disponível para saque");
        
        scanner.close();
           
         
    }
}
