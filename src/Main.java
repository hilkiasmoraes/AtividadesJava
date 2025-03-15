//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Media de três números
        int num1 = 10;
        int num2 = 20;
        int num3 = 100;

        int media1 = (num1 + num2 + num3) / 3;

        double media2 = (num1 + num2 + num3) / 3.0;

        float media3 = (num1 + num2 + num3) / 3.0f;

        long media4 = (num1 + num2 + num3) / 3L;

        System.out.println("A média do inteiro é: " + media1);
        System.out.println("A média do número real é: " + media2);
        System.out.println("A média do número float é: " + media3);
        System.out.println("A média do número long é: " + media4);

    }
}