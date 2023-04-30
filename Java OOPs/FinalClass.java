final class Calc 
{
    public void show()
    {
        System.out.println("in Calc show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc //AdvCalc cannot subclass the final class Calc
{

}

class FinalClass
{
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
}