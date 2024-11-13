public class ReturnExample
{
    double sum(double a,double b)
    {
        double sum = 0;
        sum = (a+b)/2.0;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new ReturnExample().sum(5.5,6.5));
    }
}
