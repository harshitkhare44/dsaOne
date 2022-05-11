package wt.lab8;
public class second {
public static void main(String[] args) {
Washing_Machine obj = new Washing_Machine();
obj.run();
obj.consume();
}
}
interface motor {
final float capacity = 12.5f;
void run();
void consume();
}
class Washing_Machine implements motor {
public void run() {
System.out.println("Run() running successfully");
}
public void consume() {
System.out.println("Consume() running successfully");
System.out.println("Capacity = " + capacity + " kg");
}
}
