class StringBuilderExample
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Harsh");
        sb.append(" Agarwal");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(0,"Java ");
        System.out.println(sb);
        sb.ensureCapacity(100);
        sb.replace(0, 4, "hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}