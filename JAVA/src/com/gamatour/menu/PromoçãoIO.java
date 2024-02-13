package com.gamatour.menu;

import java.util.Scanner;
import java.sql.Connection;
import com.gamatour.dao.PromoçãoDAO;
import com.gamatour.database.DatabaseConnection;
import com.gamatour.model.Promoção;

public class PromoçãoIO {

    static Connection connection = DatabaseConnection.createConnection();
    static PromoçãoDAO promocaoDAO = new PromoçãoDAO(connection);

    @SuppressWarnings("null")
	public static int SubMenuPromocao(Scanner scanner) {
        int option = Integer.MAX_VALUE;
        do {
            System.out.println("MENU PROMOÇÃO\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar" + "\n0 - Sair");

            option = scanner.nextInt();
            PromoçãoDAO promoçãoDAO = null;
			switch (option) {
                case 1:
                    scanner.nextLine();
                    Promoção promocao = new Promoção();
                    System.out.println("Desconto: ");
                    promocao.setDesconto(scanner.nextInt());
                    
                    promocaoDAO.criarPromoção(promocao);
                    break;
                case 2:
                    promoçãoDAO.verPromoção();
                    break;
                case 3:
                    Promoção promoçãoAtualizada = new Promoção();
                    System.out.println("Digite o ID da promoção a ser atualizada: ");
                    promoçãoAtualizada.setIdPromocao(scanner.nextInt());
                    System.out.println("Desconto: ");
				Promoção promoçãoAtualizada1 = null;
				promoçãoAtualizada1.setDesconto(scanner.nextInt());

                    promoçãoDAO.atualizarPromocao(promoçãoAtualizada1);
                    break;
                case 4:
                    System.out.println("Digite o ID da Promoção a ser deletada");
                    int idPromocao = scanner.nextInt();
                    promoçãoDAO.deletarPromoção(idPromocao);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        } while (option != 0);

        return option;
    }
}
