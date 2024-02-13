package com.gamatour;

import java.util.Scanner;

import com.gamatour.menu.ClienteIO;
import com.gamatour.menu.DestinoIO;
import com.gamatour.menu.MenuIO;
import com.gamatour.menu.PassagemIO;
import com.gamatour.menu.PromoçãoIO;
import com.gamatour.utils.Colors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int option = 0;

		do {

			option = MenuIO.menu(scanner);

			switch (option) {
			case 1:
				ClienteIO.SubMenuCliente(scanner);
				break;
			case 2:
				DestinoIO.SubMenuDestino(scanner);
				break;
			case 3:
				PassagemIO.SubMenuPassagem(scanner);
				break;
			case 4:
				PromoçãoIO.SubMenuPromocao(scanner);
				break;
			default:
				System.out.println(Colors.RED.get() + "Digite uma opcao valida!" + Colors.RED.get());

			}

		} while (option != 5);
		scanner.close();

	}
}