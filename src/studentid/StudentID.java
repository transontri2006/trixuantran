/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentid;

import java.util.Scanner;

public class StudentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap studentID: ");
        int studentID = sc.nextInt();

        System.out.println("StudentID vua nhap la: " + studentID);
    }
}

