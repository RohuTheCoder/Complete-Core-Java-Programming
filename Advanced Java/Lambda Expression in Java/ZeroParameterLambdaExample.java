interface Drawable
{
    public void draw();
}
public class ZeroParameterLambdaExample
{
    public static void main(String[] args) {
        int width = 5;
        Drawable d = () -> {System.out.println("Drawing "+width);};
        d.draw();
    }

}
