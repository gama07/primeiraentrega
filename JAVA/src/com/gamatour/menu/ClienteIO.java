package com.gamatour.menu;

import java.sql.Connection;
import java.util.Scanner;
import com.gamatour.dao.ClienteDAO;
import com.gamatour.database.DatabaseConnection;
import com.gamatour.model.Cliente;

public class ClienteIO {

    static Connection connection = DatabaseConnection.createConnection();
    static ClienteDAO clienteDAO = new ClienteDAO(connection);

    public static int SubMenuCliente(Scanner scanner) {
        int option = Integer.MAX_VALUE;
        do {
            System.out.println("MENU CLIENTE\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar" + "\n0 - Sair");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine();
                    Cliente cliente = new Cliente();
                    System.out.println("Nome Completo: ");
                    cliente.setNomeCliente(scanner.nextLine());
                    System.out.println("CPF: ");
                    cliente.setCpfCliente(scanner.nextLine().trim());
                    System.out.println("Telefone: ");
                    cliente.setTelefoneCliente(scanner.nextLine().trim());
                    System.out.println("Email: ");
                    cliente.setEmailCliente(scanner.nextLine().trim());

                    clienteDAO.criarCliente(cliente);
                    break;
                case 2:
                    clienteDAO.consultarClientes();
                    break;
                case 3:
                    Cliente clienteAtualizado = new Cliente();
                    System.out.println("Digite o ID do cliente a ser atualizado: ");
                    clienteAtualizado.setIdCliente(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nome Completo: ");
                    clienteAtualizado.setNomeCliente(scanner.nextLine());
                    System.out.println("CPF: ");
                    clienteAtualizado.setCpfCliente(scanner.nextLine().trim());
                    System.out.println("Telefone: ");
                    clienteAtualizado.setTelefoneCliente(scanner.nextLine().trim());
                    System.out.println("Email: ");
                    clienteAtualizado.setEmailCliente(scanner.nextLine().trim());

                    clienteDAO.atualizarCliente(clienteAtualizado);
                    break;
                case 4:
                    System.out.println("Digite o ID do Cliente a ser deletado");
                    int idCliente = scanner.nextInt();
                    clienteDAO.deletarCliente(idCliente);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }

        } while (option != 0);

        return option;
    }
}
