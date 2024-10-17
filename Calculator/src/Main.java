import java.util.Scanner;

public class Main{
    public static void main(String []args){

        Calculator calculator=new Calculator();
        while(true){
            System.out.println("1.please enter 1 for addition");
            System.out.println("1.please enter 2 for Subtraction");
            System.out.println("1.please enter 3 for multiplication");
            System.out.println("1.please enter 4 for division");
            System.out.println("1.please enter 5 for termination");


            Scanner sc=new Scanner(System.in);
            System.out.print("Input: ");
            int options=sc.nextInt();

            switch(options){
                case 1: {
                    System.out.print("Enter !st num for sum: ");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("Enter 2nd num for sum: ");
                    double num2=sc.nextDouble();
                    double ans = calculator.add(num1, num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: "+ans);

                    break;
                }
                case 2: {
                    System.out.print("Enter !st num for sum: ");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("Enter 2nd num for sum: ");
                    double num2=sc.nextDouble();
                    double ans = calculator.sub(num1, num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: "+ans);

                    break;
                }
                case 3: {
                    System.out.print("Enter !st num for sum: ");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("Enter 2nd num for sum: ");
                    double num2=sc.nextDouble();
                    double ans = calculator.mul(num1, num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: "+ans);

                    break;
                }
                case 4: {
                    System.out.print("Enter !st num for sum: ");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("Enter 2nd num for sum: ");
                    double num2=sc.nextDouble();
                    double ans = calculator.div(num1, num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: "+ans);

                    break;
                }
                case 5: {
                    System.out.println("Existing...");
                    break;
                }
                default : {
                    System.out.println("Error:Please enter valid input");
                    break;
                }
            }
        }


    }


}