import java.util.Scanner;
public class Discounts{
    public static void main (String[] argz){
        Scanner scan = new Scanner (System.in);
        int price, discount, total;
        
        System.out.println("What is the price of the item?");
        price = scan.nextInt();
        
        if (price > 1000)
        discount = price/10;
        else
        discount = 0;
        
        total = price - discount;
        System.out.println("The total is: "+ total);
    }
}