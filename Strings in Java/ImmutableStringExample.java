public class ImmutableStringExample
{
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: "+str);

        String modifiedStr = str.concat(" World");
        System.out.println("Modified String: "+modifiedStr);

        // The original string remains unchanged
        System.out.println("Original String after modification: "+str);
    }
}
