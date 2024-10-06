package org.example;
/**
 * @author Rodrigues, J.Gabriel
 * @since out, 2024.
 * @version 0.0.1
 * */

import java.util.Scanner;
import org.example.Calculadora;
import org.example.Agenda;

public class Main {

/**Metodo Central
 * @link mainMenu
 * @link menuCalc
 **/

    public static void main(String[] args) {
        mainMenu();

    }
    /**Metodo Que interage de forma primaria e contral com o usuario
**/
    static void mainMenu() {
        Scanner input =  new Scanner(System.in);

        System.out.println("[0]ENCERRAR;");
        System.out.println("[1]CALCULADORA;");
        System.out.println("[2]AGENDA.");
        int opc =  input.nextInt();
        switch (opc){
            case 0:
                System.exit(0);
            case 1:
                menuCalc();
            case 2:
                menuAgenda();
        }
        input.close();
    }
/**Método para que o usuario selecione a opção(Menu Secundario)
 * @param int opc - opção do usuario
 * @param int ctr - variavel redundante do sistema
 * */
    static void menuCalc(){
        Scanner input =  new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Insira o Numero Desejado:");
        System.out.println("[0]ENCERRAR!");
        System.out.println("[1]Soma;");
        System.out.println("[2]Subtração;");
        System.out.println("[3]Multiplicação;");
        System.out.println("[4]Divisão;");
        System.out.println("[5]Potência;");
        System.out.println("[6]Raiz Quadrada;");
        System.out.println("[7]Raiz Cúbica;");
        System.out.println("[8]Gerador de Números;");
        System.out.println("[9]Menu Anterior.");

        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
        int opc = input.nextInt();
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");

        switch (opc){
            case 0:
                System.exit(0);
            case 1:
                System.out.println("Insira o numero Primario: ");
                num1 = input.nextDouble();

                System.out.println("Insira o numero Secundario: :");
                num2 = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.soma(num1, num2));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 2:
                System.out.println("Insira o numero Primario: ");
                num1 = input.nextDouble();

                System.out.println("Insira o numero Secundario: :");
                num2 = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.subt(num1, num2));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 3:
                System.out.println("Insira o numero Primario: ");
                num1 = input.nextDouble();

                System.out.println("Insira o numero Secundario: :");
                num2 = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.mult(num1, num2));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 4:
                System.out.println("Insira o numero Primario: ");
                num1 = input.nextDouble();

                System.out.println("Insira o numero Secundario: :");
                num2 = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.divi(num1, num2));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 5:
                System.out.println("Insira a Base: ");
                double base = input.nextDouble();

                System.out.println("Insira o expoente: ");
                double xpoent = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.pote(base, xpoent));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 6:
                System.out.println("|*Raiz Quadrada*|");
                System.out.println("Insira o numero ");
                num1 = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.raiz(num1));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 7:
                System.out.println("|*Raiz Cúbica*|");
                System.out.println("Insira o numero ");
                num1 = input.nextDouble();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(Calculadora.raqu(num1));
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            case 8:
                num1 = Calculadora.geradorNumerosAleatorios();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println(num1);
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
                menuCalc();
            default:
                System.out.println("[0]SAIR");
                int ctr  = input.nextInt();
                mainMenu();
        }

    }

    static void menuAgenda(){
        Scanner input =  new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opc;

        do{
            System.out.println("[0]Adicionar Contato;");
            System.out.println("[1]Listar Contato;");
            System.out.println("[2]Remover Contato;");
            System.out.println("[3]Sair;");
            System.out.println("Escolha uma Opção: ");
            opc = input.nextInt();
            input.nextLine();

            switch (opc){
                case 0:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Telefone: ");
                    String tele = input.nextLine();
                    agenda.adicionarContato(new Contato(nome, tele));
                    break;
                case 1:
                    agenda.listarContatos();
                    break;
                case 2:
                    System.out.print("Nome do Contato a Remover: ");
                    String nomeRemover = input.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    agenda.salvarContatos();
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida. Tente Novamente!");
            }
        }while (opc != 3);

        input.close();
    }




}















