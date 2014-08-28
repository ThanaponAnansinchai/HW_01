/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // เรียกใช้ object รับค่า
       int[] IncomeRange = new int[4]; // ตัวแปรเก็บเงินเดือน
       int[] TaxRate = new int[4];// ตัวแปรเก็บค่าอัตราภาษี
       
       for(int x = 0, y = 1;x < 4;x++, y++){
           System.out.print("Please enter income and  tax rate  in tax bracket " + y + ": ");
           IncomeRange[x] = sc.nextInt();// รับค่าเงินเดือนขั้นต่ำ
           TaxRate[x] = sc.nextInt();// รับค่าอัตราภาษีตามเงินเดือน
       }
    }
    
}
