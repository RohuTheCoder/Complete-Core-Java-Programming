class Calc
{
    public final void show()
    {
        System.out.println("By Navin");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{
    public void show() //Cannot override the final method from Calc
    {
        System.out.println("By John");
    }
}

class FinalMethod
{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4,5);
    }
}