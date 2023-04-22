class StringBufferExample
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        sb.append(" Reddy");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
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