package com.gamatour.menu;
import java.util.Scanner;

import com.gamatour.utils.Colors;

public class MenuIO {

    public static int menu(Scanner scanner) {
        System.out.println(Colors.CYAN_BOLD.get() + "Escolha uma opção de 1 a 5\n" + Colors.RESET.get()
                + "1 - Cliente\n" + "2 - Destino\n" + "3 Passagens\n" + "4 - Promoção\n" + "5 - Sair");

        return scanner.nextInt();
    }
}
