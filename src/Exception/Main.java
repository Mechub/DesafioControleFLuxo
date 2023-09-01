package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        sc.close();

        try {
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametroInvException exception) {
            System.out.println(exception.getMessage());
        }
    }

}