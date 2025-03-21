package Cofrinho;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Cofrinho cofrinho = new Cofrinho();
        Scanner scan = new Scanner(System.in);


        while(true) {
            try{
                System.out.println("--------------- COFRINHO ---------------");
                System.out.println("1 - Adicionar moeda");
                System.out.println("2 - Remover moeda");
                System.out.println("3 - Listar moedas");
                System.out.println("4 - Calcular total convertido para real");
                System.out.println("5 - Encerrar");
                System.out.println("Escolha uma opção: ");
                if(!scan.hasNextInt()) {
                    System.out.println("Erro: Entrada inválida. Digite um número entre 1 e 5.");
                    scan.next();
                    continue;
                }

                int input = scan.nextInt();

                switch (input) {
                    case 1:
                        while(true) {
                            System.out.println("--------------- COFRINHO ---------------");
                            System.out.println("1 - Adicionar Real");
                            System.out.println("2 - Adicionar Dolar");
                            System.out.println("3 - Adicionar Euro");
                            System.out.println("4 - Voltar");
                            System.out.println("Escolha uma opção: ");
                            if(!scan.hasNextInt()) {
                                System.out.println("Erro: Entrada inválida. Digite um número entre 1 e 4.");
                                scan.next();
                                continue;
                            }
                            int escolha = scan.nextInt();
                            if(escolha == 4) {
                                break;
                            } else if(escolha == 1 || escolha == 2 || escolha == 3) {
                                System.out.println("Digite a quantidade: ");
                                if(!scan.hasNextInt()) {
                                    System.out.println("Erro: Entrada inválida. Digite apenas números!");
                                    scan.next();
                                    continue;
                                }
                                int quantidade = scan.nextInt();
                                switch(escolha) {
                                    case 1:
                                        cofrinho.adicionar(new Real(quantidade));
                                        System.out.println(quantidade + " reais foram adicionados ao cofrinho");
                                        break;
                                    case 2:
                                        cofrinho.adicionar(new Dolar(quantidade));
                                        System.out.println(quantidade + " dolares foram adicionados ao cofrinho");
                                        break;
                                    case 3:
                                        cofrinho.adicionar(new Euro(quantidade));
                                        System.out.println(quantidade + " euros foram adicionados ao cofrinho");
                                        break;
                                }

                            } else {
                                throw new Exception("Opção inválida!");
                            }
                        }
                        break;
                    case 2:
                        while(true) {
                            System.out.println("--------------- COFRINHO ---------------");
                            System.out.println("1 - Remover Real");
                            System.out.println("2 - Remover Dolar");
                            System.out.println("3 - Remover Euro");
                            System.out.println("4 - Voltar");
                            System.out.println("Escolha uma opção: ");
                            if(!scan.hasNextInt()) {
                                System.out.println("Erro: Entrada inválida. Digite um número entre 1 e 4.");
                                scan.next();
                                continue;
                            }
                            int escolhaRemover = scan.nextInt();
                            if (escolhaRemover == 4) {
                                break;
                            } else if(escolhaRemover == 1 || escolhaRemover == 2 || escolhaRemover == 3) {
                                System.out.println("Digite a quantidade: ");
                                if(!scan.hasNextInt()) {
                                    System.out.println("Erro: Entrada inválida. Digite um número entre 1 e 4.");
                                    scan.next();
                                    continue;
                                }
                                int quantidadeRemover = scan.nextInt();
                                switch(escolhaRemover) {
                                    case 1:
                                        cofrinho.remover(1, quantidadeRemover);
                                        break;
                                    case 2:
                                        cofrinho.remover(2, quantidadeRemover);
                                        break;
                                    case 3:
                                        cofrinho.remover(3, quantidadeRemover);
                                        break;
                                }
                            } else {
                                throw new Exception("Opção inválida!");
                            }
                        }
                        break;
                    case 3:
                        cofrinho.listagemMoedas();
                        break;
                    case 4:
                        cofrinho.totalConvertido();
                        break;
                    case 5:
                        System.out.println("Encerrando programa...");
                        scan.close();
                        return;
                    default:
                        throw new Exception("Opção inválida! ");
                }

            } catch (Exception e) {
                System.out.println("Erro inesperado! " + e.getMessage());
            }
        }
    }
}



