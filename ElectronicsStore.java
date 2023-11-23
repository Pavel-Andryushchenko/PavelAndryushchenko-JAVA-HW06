// 📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// 📌 Создать множество ноутбуков.
// 📌 Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 📌 Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// 📌 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElectronicsStore {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook(2, 512, "Windows", 15);
        Notebook nb2 = new Notebook(4, 1024, "macOS", 17);
        Notebook nb3 = new Notebook(8, 1024, "Linux", 19);
        Notebook nb4 = new Notebook(16, 512, "Windows", 15);
        Notebook nb5 = new Notebook(32, 128, "macOS", 15);
        Notebook nb6 = new Notebook(64, 2048, "Windows", 17);
        Set<Notebook> noteboks = new HashSet(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6));

        try {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\r\n" +
                    " 1 - Обьем оперативной памяти(в Гб)\r\n" +
                    " 2 - Объем жесткого диска(в Гб)\r\n" +
                    " 3 - Операционная система\r\n" +
                    " 4 - Диагональ монитора(в дюймах)");
            Scanner scn = new Scanner(System.in);
            String choice = scn.next();

            switch (choice) {
                case "1":
                    System.out.println("Введите минимальный минимальный обьем оперативной памяти: ");
                    choice = scn.next();
                    for (Notebook notebook : noteboks) {
                        if (notebook.amountOfRAM >= Integer.parseInt(choice)) {
                            System.out.println(notebook);
                        }
                    }
                    scn.close();
                    break;

                case "2":
                    System.out.println("Введите минимальный минимальный обьем жесткого диска: ");
                    choice = scn.next();
                    for (Notebook notebook : noteboks) {
                        if (notebook.sizeOfHardDrive >= Integer.parseInt(choice)) {
                            System.out.println(notebook);
                        }
                    }
                    scn.close();
                    break;

                case "3":
                    System.out.println("Введите цифру, соответствующую необходимому критерию : \r\n" +
                            " 1 - Windows \r\n" +
                            " 2 - macOS \r\n" +
                            " 3 - Linux");
                    choice = scn.next();
                    switch (choice) {
                        case "1":
                            for (Notebook notebook : noteboks) {
                                if (notebook.operatingSysytem.equals("Windows")) {
                                    System.out.println(notebook);
                                }
                            }
                            scn.close();
                            break;
                        case "2":
                            for (Notebook notebook : noteboks) {
                                if (notebook.operatingSysytem.equals("macOS")) {
                                    System.out.println(notebook);
                                }
                            }
                            scn.close();
                            break;    
                        case "3":
                            for (Notebook notebook : noteboks) {
                                if (notebook.operatingSysytem.equals("Linux")) {
                                    System.out.println(notebook);
                                }
                            }
                            scn.close();
                            break;
                        default:
                        scn.close();
                            break;
                    }
                    break;

                case "4":
                    System.out.println("Введите минимальную длинну диагонали: ");
                    choice = scn.next();
                    for (Notebook notebook : noteboks) {
                        if (notebook.monitorDiagonal >= Integer.parseInt(choice)) {
                            System.out.println(notebook);
                        }
                    }
                    scn.close();
                    break;
                default:
                scn.close();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
        }
        
    }
}
