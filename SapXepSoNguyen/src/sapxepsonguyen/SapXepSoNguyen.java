package sapxepsonguyen;

import java.util.Scanner;

public class SapXepSoNguyen {

    static double [] displaySortNumber(double num1, double num2, double num3){
        double max=Math.max(num1, Math.max(num2, num3));
        double min=Math.min(num1, Math.min(num2, num3));
        double mid;
        if(num1!=max && num1!=min) mid=num1;
        else if(num2!=max && num2!=min) mid=num2;
        else mid=num3;
        double []a = new double[3];
        a[0]=max;
        a[1]=mid;
        a[2]=min;
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1=sc.nextInt();
        double num2=sc.nextInt();
        double num3=sc.nextInt();
        double[]a=displaySortNumber(num1, num2, num3);
        for(double x : a){
            System.out.print(x+"\t");
        }
    }
    
}
