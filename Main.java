import java.io.PrintStream;

class Main {
  public static void main(String[] args) {
    int age = 18;
    int i = 1;
    int j = 2;
    int k = 3;
    int l = 4;
    double MyDouble = 69.420;
    MyDouble = 9.999;
    // for #6
    int apple = 420;
    double banana = 6.9;
    double orange = 18;
    PrintStream irony = System.out;
    irony.println(apple * banana);
    irony.print(banana);
    irony.print(apple + "\n");
    orange = 21;
    irony.println("apple+banana*orange=" + apple + banana * orange);
    irony.println(apple / orange + banana);
    irony.println("repetition makes you learn faster");
    irony.println(banana + orange);
    irony.println(apple + orange);
    irony.println(orange * orange);
  }
}
