public class Calculator {
    public double num1;
    public double num2;

    //    Calculator(double num1,double num2){
//        this.num1=num1;
//        this.num2=num2;
//
//    }
    double add(double num1, double num2)
    {
        return this.num1 + this.num2;
    }
    double sub(double num1, double num2)
    {
        return num1-num2;
    }
    double mul(double num1, double num2)
    {
        return num1*num2;
    }
    double div(double num1, double num2)
    {
        return num1/num2;
    }
}