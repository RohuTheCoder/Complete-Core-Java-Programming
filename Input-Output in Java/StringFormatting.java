public class StringFormatting
{
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        //Formatting from lowercase to uppercase
        System.out.printf("%s \n",str);
        System.out.printf("%S \n",str);

        str = "GFG";
        //Vice-versa not possible
        System.out.printf("%S \n",str);
        System.out.printf("%s \n",str);
    }
}
