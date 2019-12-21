package com.alex.tarasik;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1. Генерация пары ключей алгоритма RSA;");
        System.out.println("2. Импортировать ключи шифрования;");
        System.out.println("3. Экспорт ключей шифрования из файла;");
        System.out.println("4. Подписать документ;");
        System.out.println("5. Проверить подпись документа;");
        System.out.println("6. Выход из приложения;");
    }

    public void start() throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {

        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        RSA rsa = new RSA();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 6:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 6);
        }
    }
}
