package mainmethod;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new Text();
        var textBox2 = textBox1;

        // textbox1 & textbox2 are referencing the same object which is Text()
        textBox2.setText("hello world");

        System.out.println(textBox1.text);
        // output : hello world
    }
}