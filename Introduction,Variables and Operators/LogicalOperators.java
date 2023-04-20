
class LogicalOperators
{
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 6;

        boolean result = (x>y)&&(a>b);

        System.out.println(result);

        result = (x>y)||(a>b);

        System.out.println(result);

        result = x<y;

        System.out.println(!result);
    }
}