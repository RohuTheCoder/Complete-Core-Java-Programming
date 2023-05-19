@FunctionalInterface
interface A 
{
    int add(int i,int j);
}

public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        A obj = (int i,int j) -> {return i+j;}; //with return

        obj = (i,j) -> i+j;  //without return
        int result = obj.add(4,5);
        System.out.println(result);
    }
}
