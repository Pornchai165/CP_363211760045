package Lab6;

public class Example_StringBuffer {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Puriwat Lertkrai");
        str.append("RUTS");
        str.insert(16, " ");
        System.out.println(str);
        str.replace(0, 6, "MT");
        System.out.println(str.reverse());

    }
}