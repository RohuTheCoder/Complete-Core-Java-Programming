class Autoboxing
{
   public static void main(String[] args) {
    
    //Autoboxing eg: of int to Integer
    int a = 20;
    Integer i = Integer.valueOf(a); //converting int into Integer explicitly
    Integer j = a; //autoboxing
    System.out.println(a+" "+i+" "+j);
   } 
    
}