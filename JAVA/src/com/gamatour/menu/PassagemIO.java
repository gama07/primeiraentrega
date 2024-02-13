package com.gamatour.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.gamatour.dao.PassagemDAO;
import com.gamatour.database.DatabaseConnection;
import com.gamatour.model.Passagens;

public class PassagemIO {

    static Connection connection = DatabaseConnection.createConnection();
    static PassagemDAO passagemDAO = new PassagemDAO(connection);

    public static int SubMenuPassagem(Scanner scanner) {
        int option = Integer.MAX_VALUE;
        do {
            System.out.println("MENU PASSAGEM\n" + "1 - Cadastrar Passagem\n" + "2 - Listar Passagens\n" + "3 - Atualizar Passagem\n" + "4 - Deletar Passagem" + "\n0 - Sair");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine();
                    Passagens passagem = new Passagens();
                    System.out.println("ID do Destino: ");
                    passagem.setIdDestino(scanner.nextInt());
                    System.out.println("ID do Cliente: ");
                    passagem.setIdCliente(scanner.nextInt());
                    System.out.println("ID da Promoção: ");
                    passagem.setIdPromoção(scanner.nextInt());
                    System.out.println("Data de Partida (AAAA-MM-DD): ");
                  String dataPartidaStr = scanner.next();
                    passagem.setDataPartida(dataPartidaStr);
                    System.out.println("Data de Retorno (AAAA-MM-DD): ");
                    String dataRetornoStr = scanner.next();
                    passagem.setDataRetorno(dataRetornoStr);
                    System.out.println("Preço da Passagem: ");
                    passagem.setPreçoPassagem(scanner.nextDouble());
                    System.out.println("Número de Passageiros: ");
                    passagem.setNumPassageiros(scanner.nextInt());

                    passagemDAO.criarPassagem(passagem);
                    break;
                case 2:
                    passagemDAO.consultarPassagens();
                    break;
                case 3:
                    Passagens passagemAtualizada = new Passagens();
                    System.out.println("Digite o ID da passagem a ser atualizada: ");
                    passagemAtualizada.setIdPassagem(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("ID do Destino: ");
                    passagemAtualizada.setIdDestino(scanner.nextInt());
                    System.out.println("ID do Cliente: ");
                    passagemAtualizada.setIdCliente(scanner.nextInt());
                    System.out.println("ID da Promoção: ");
                    passagemAtualizada.setIdPromoção(scanner.nextInt());
                    System.out.println("Data de Partida (AAAA-MM-DD): ");
                    String dataPartidaStrAtualizada = scanner.next();
                    passagemAtualizada.setDataPartida(dataPartidaStrAtualizada);
                    System.out.println("Data de Retorno (AAAA-MM-DD): ");
                    String dataRetornoStrAtualizada = scanner.next();
                    passagemAtualizada.setDataRetorno(dataRetornoStrAtualizada);
                    System.out.println("Preço da Passagem: ");
                    passagemAtualizada.setPreçoPassagem(scanner.nextDouble());
                    System.out.println("Número de Passageiros: ");
                    passagemAtualizada.setNumPassageiros(scanner.nextInt());

                    passagemDAO.atualizarPassagem(passagemAtualizada);
                    break;
                case 4:
                    System.out.println("Digite o ID da Passagem a ser deletada");
                    int idPassagem = scanner.nextInt();
                    passagemDAO.deletarPassagem(idPassagem);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }

        } while (option != 0);

        return option;
    }
}

