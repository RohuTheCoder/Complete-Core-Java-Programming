public class MutableStringExample
{
    public static void main(String[] args) {
        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: "+sb);

        //Modifying the string
        sb.append(" World");
        System.out.println("Modified StringBuilder: "+sb);

        //Using StringBuffer
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Original StringBuffer: "+sbf);

        sbf.append(" Programming");
        System.out.println("Modified StringBuffer: "+sbf);
    }
}
