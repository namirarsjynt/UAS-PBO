/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class InputUtil {
    private final static Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
      System.out.print(info + " : ");
      String data = scanner.nextLine();
      return data;
    }
}
