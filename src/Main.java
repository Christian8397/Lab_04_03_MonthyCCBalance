//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     double balance = 5000;
     final double TAX_RATE = .17;

     double Month1 = balance * TAX_RATE / 12;
        System.out.println("Interest due for one month is: " + Month1);

     double balancemonth1 = balance + Month1;
     
     double Month2 = balancemonth1 * TAX_RATE / 12;
        System.out.println("Interest due for two months is: " + Month2);

    }
}