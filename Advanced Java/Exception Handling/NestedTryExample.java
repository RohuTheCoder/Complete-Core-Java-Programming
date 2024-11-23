public class NestedTryExample
{
    public static void main(String[] args) {
        //outer try block
        try {
            //inner try block1
            try {
                System.out.println("going to divide by 0");
                int b = 39 / 0;
            }
            //catch block of inner try block1
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }

            //inner try block2
            try
            {
                int a[] = new int[5];

                //assigning value out of array bounds
                a[5] = 4;
            }
            //catch block of inner try block2
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

            System.out.println("other statement");
        }
        //catch block of outer try block
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }
}
