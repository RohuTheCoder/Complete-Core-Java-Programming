class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}

class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}
class MethodOverriding
{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,3);
        System.out.println(r1);
    }
}