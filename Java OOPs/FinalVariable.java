class FinalVariable
{
    public static void main(String[] args) {
        final int num = 8;
        num = 9; //cannot assign a value to final variable num
        System.out.println(num);
    }
}