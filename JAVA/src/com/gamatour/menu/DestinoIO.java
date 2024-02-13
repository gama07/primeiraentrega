package com.gamatour.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.gamatour.dao.DestinoDAO;
import com.gamatour.database.DatabaseConnection;
import com.gamatour.model.Destino;

public class DestinoIO {

    static Connection connection = DatabaseConnection.createConnection();
    static DestinoDAO destinoDAO = new DestinoDAO(connection);

    public static int SubMenuDestino(Scanner scanner) {
        int option = Integer.MAX_VALUE;
        do {
            System.out.println("MENU DESTINO\n" + "1 - Cadastrar Destino\n" + "2 - Listar Destinos\n" + "3 - Atualizar Destino\n" + "4 - Deletar Destino" + "\n0 - Sair");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine();
                    Destino destino = new Destino();
                    System.out.println("Nome do Destino: ");
                    destino.setNomeDestino(scanner.nextLine());

                    destinoDAO.criarDestino(destino);
                    break;
                case 2:
                    destinoDAO.consultarDestinos();
                    break;
                case 3:
                    Destino destinoAtualizado = new Destino();
                    System.out.println("Digite o ID do destino a ser atualizado: ");
                    destinoAtualizado.setIdDestino(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nome do Destino: ");
                    destinoAtualizado.setNomeDestino(scanner.nextLine());

                    destinoDAO.atualizarDestino(destinoAtualizado);
                    break;
                case 4:
                    System.out.println("Digite o ID do Destino a ser deletado");
                    int idDestino = scanner.nextInt();
                    destinoDAO.deletarDestino(idDestino);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }

        } while (option != 0);

        return option;
    }
}
