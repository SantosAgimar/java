
package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author Agimar
 */
public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;
    
    public void imprimir(){
        System.out.println("Número da conta é: " +numero);
        System.out.println("Nome da agência é: " +agencia);
        System.out.println("Nome do cliente é: " +nomeCliente);
        System.out.println("Saldo em conta é: " +saldo);
    }
    
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite número da conta: ");
        contaTerminal.numero = scan.nextInt();

        System.out.println("Digite nome da agência: ");
        contaTerminal.agencia = scan.next();

        System.out.println("Digite nome: ");
        contaTerminal.nomeCliente = scan.next();

        System.out.println("Digite o saldo: ");
        contaTerminal.saldo = scan.nextDouble();

        contaTerminal.imprimir();

    }
}
