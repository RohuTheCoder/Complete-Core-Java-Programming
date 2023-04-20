
class AssignmentOperator
{
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int result = num1+num2;

        System.out.println(result);

        result = num1-num2;

        System.out.println(result);

        result = num1*num2;

        System.out.println(result);

        result = num1/num2;

        System.out.println(result);

        result = num1%num2;

        System.out.println(result);

        num1 += 2;

        System.out.println(num1);

        result = num1++; //post increment operator

        System.out.println(result);

        result = ++num1; //pre increment operator

        System.out.println(result);
    }
}