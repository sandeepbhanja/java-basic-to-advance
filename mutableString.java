public class mutableString{
    public static void main(String args[]){
        StringBuffer buffer = new StringBuffer("Lucifer");
        buffer.append(" Whisper");
        System.out.println(buffer.capacity());
        String str = buffer.toString();
        System.out.println(str);
        buffer.deleteCharAt(0);
        System.out.println(buffer);
    }
}