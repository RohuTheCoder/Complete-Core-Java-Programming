
class RelationalOperator
{
    public static void main(String[] args) {
        int x = 6;
        int y = 5;

        boolean result = x>y;

        System.out.println(result);

        result = x<y;

        System.out.println(result);

        y=6;

        result = x>=y;

        System.out.println(result);

        result = x<=y;

        System.out.println(result);

        result = x==y;

        System.out.println(result);

        result = x!=y;

        System.out.println(result);
    }
}