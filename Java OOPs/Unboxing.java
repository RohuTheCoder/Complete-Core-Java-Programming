class Unboxing
{
    public static void main(String[] args) {
        //Unboxing eg: of Integer to int
        Integer a = 3;
        int i = a.intValue();  //Converting Integer to int explicitly
        int j = a;
        System.out.println(a+" "+i+" "+j);
    }
}