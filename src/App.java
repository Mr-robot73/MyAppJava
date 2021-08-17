import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int num, menu, numGui, Digitar_Salir;
        boolean salir = true;
        String menuTexto = "Digite un numero para el menu:\n1.consola\n2.grafica\n4.salir";

        try {
            System.out.println(menuTexto);
            menu = entrada.nextInt();

            while (salir == true) {
                if (menu == 1) {
                    System.out.println("para digitar un numero precione 1 para salir presione 2");
                    Digitar_Salir = entrada.nextInt();

                    if (Digitar_Salir == 1) {
                        System.out.println("Digite un numero de dos o tres cifra");
                        num = entrada.nextInt();

                        if (num >= 10 && num <= 99) {
                            int decena = num / 10;
                            int unidad = num % 10;
                            int sum = decena + unidad;

                            System.out.println("el numero es: " + sum);
                        } else if (num >= 100 && num <= 999) {
                            int centro = num / 100;
                            int decena = num / 10;
                            int unidad = num % 100;
                            int sum1 = centro + decena + unidad;

                            System.out.println("el numero es: " + sum1);
                        } else {
                            System.out.println("Digite un numero de dos o tres cifra");
                            num = entrada.nextInt();
                        }
                    } else if (Digitar_Salir == 2) {
                        System.out.println(menuTexto);
                        menu = entrada.nextInt();
                    } else {
                        System.out.println("para digitar un numero precione 1 para salir presione 2");
                        Digitar_Salir = entrada.nextInt();
                    }

                } else if (menu == 2) {
                    Digitar_Salir = Integer.parseInt(
                            JOptionPane.showInputDialog("para digitar un numero precione 1 para salir presione 2"));
                    if (Digitar_Salir == 1) {
                        numGui = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de dos o tres cifra"));
                        if (numGui >= 10 && numGui <= 99) {
                            int decena = numGui / 10;
                            int unidad = numGui % 10;
                            int sum = decena + unidad;

                            JOptionPane.showMessageDialog(null, "el numero es: " + sum);
                        } else if (numGui >= 100 && numGui <= 999) {
                            int centro = numGui / 100;
                            int decena = numGui / 10;
                            int unidad = numGui % 100;
                            int sum = centro + decena + unidad;

                            JOptionPane.showMessageDialog(null, "el numero es: " + sum);
                        } else {
                            numGui = Integer
                                    .parseInt(JOptionPane.showInputDialog("Digite un numero de dos o tres cifra"));
                        }
                    } else if (Digitar_Salir == 2) {
                        System.out.println(menuTexto);
                        menu = entrada.nextInt();
                    } else {
                        Digitar_Salir = Integer.parseInt(
                            JOptionPane.showInputDialog("para digitar un numero precione 1 para salir presione 2"));
                    }
                } else if (menu == 3) {
                    Digitar_Salir = Integer.parseInt(
                            JOptionPane.showInputDialog("para digitar un numero precione 1 para salir presione 2"));
                    if (Digitar_Salir == 1) {
                        long num1, num2, total;
                        total = 0;

                        num1 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Digite un numero de dos o tres cifra \nsi quiere salir presione 1 para salir"));

                        num2 = num1;
                        while (num1 != 0) {
                            total += num1 % 10;
                            num1 = num1 / 10;
                        }
                        JOptionPane.showMessageDialog(null, "la cifra es: " + num2 + " total es: " + total);
                    } else if (Digitar_Salir == 2) {
                        System.out.println(menuTexto);
                        menu = entrada.nextInt();
                    }

                } else if (menu == 4) {
                    salir = false;
                } else {
                    System.out.println(menuTexto);
                    menu = entrada.nextInt();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro");
        }
        ;
    }
}
