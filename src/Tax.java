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
        int sum = 0;
        for (int x = 0, y = 1; x < 4; x++, y++) {
            System.out.print("Please enter income and  tax rate  in tax bracket " + y + ": ");
            IncomeRange[x] = sc.nextInt();// รับค่าเงินเดือนขั้นต่ำ
            TaxRate[x] = sc.nextInt();// รับค่าอัตราภาษีตามเงินเดือน
        }
        System.out.print("Please enter tax rate if income > 750000 : ");
        int MaxTaxRate = sc.nextInt(); // รับค่าอัตราภาษีสูงสุด
        System.out.print("Please enter income: ");
        int Income = sc.nextInt();//รับค่า รายได้ต่อปี
        int temp = Income; // เก็บค่ารายได้ต่อปีเพื่อนำไปคำนวน

        if (temp > IncomeRange[0]) {
            System.out.println("0 - 150000 you pay 0 baht");
            temp -= 150000;
        } else {
            System.out.print("0 - " + Income);
            System.out.println(" you pay 0 baht");
            System.exit(0);
        }

        if (temp > IncomeRange[1] - 150000) {
            System.out.println("150001 – 300000 you pay ");
        } else {
            System.out.print("150001 - " + Income + " you pay ");
            System.out.println(temp*TaxRate[1] / 100);
            System.out.println(" baht");
            System.exit(0);
        }

        if (temp >= IncomeRange[2]) {
            System.out.println("300001 – 500000 you pay");
        } else {
            System.out.print("300001 - " + Income);
        }

        if (temp >= IncomeRange[3]) {
            System.out.println("500001 – 750000 you pay");
        } else {
            System.out.print("500001 - " + Income);
        }

        if (temp >= 750000) {
            System.out.println("750001 – 100000 you pay");
        } else {
            System.out.print("750001 - " + Income);
        }

    }

}
