//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Media de três números
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

        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Declaração de Long
        long distancia = 149600000L;

        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");

        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Valor Unicode de um Caractere
        char letra = 'A';
        char letra1 = 'F';
        char letra2 = 'H';
        char letra3 = 'O';
        char letra4 = 'S';

        int valorUnicode = letra;
        System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);

        int valorUnicode1 = letra1;
        System.out.println("O valor Unicode de '" + letra1 + "' é: " + valorUnicode1);

        int valorUnicode2 = letra2;
        System.out.println("O valor Unicode de '" + letra2 + "' é: " + valorUnicode2);

        int valorUnicode3 = letra3;
        System.out.println("O valor Unicode de '" + letra3 + "' é: " + valorUnicode3);

        int valorUnicode4 = letra4;
        System.out.println("O valor Unicode de '" + letra4 + "' é: " + valorUnicode4);

        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Boas Práticas com Tipos Booleanos
        int numero = 15;
        boolean maiorQueDez = numero > 10;

        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);

        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Usando Arrays
        int[] numeros = {10, 20, 30, 40, 50, 70, 68, 99};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Segundo número: " + numeros[3]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Calculando a Área de um Retângulo
        double largura = 7.82;
        double altura = 23;

        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);


        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Trabalhando com Strings e dados multivalorados
        String nome = "Hilkias";
        int idade = 31;
        double peso = 71.45;
        System.out.println("Olá meu nome é " + nome + ", minha idade é " + idade + " e meu peso é " + peso);


        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Verificando Par ou Ímpar
        int numero1 = 7;
        if (numero1 % 2 == 0) {
            System.out.println("O número " + numero1 + " é par.");
        } else {
            System.out.println("O número " + numero1 + " é ímpar.");
        }


        System.out.println("\n--------------------------------------------------");
        System.out.println();


        // Declarando Variáveis
        int idade1 = 25;
        double altura1 = 1.75;
        char inicial = 'J';
        boolean estudante = true;

        System.out.println("Sua idade é " + idade1);
        System.out.println("Sua altura é " + altura1);
        System.out.println("A inicial do seu nome é '" + inicial + "'");
        System.out.println("Você é estudante? " + estudante);

        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Pré-incremento e Pós-incremento**
        int a = 5;
        int b = a++;
        int c = ++a;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);


        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Operadores Abreviados
        int valor = 20;
        valor = valor + 5;
        valor = valor * 2;
        valor = valor - 3;
        valor = valor / 2;
        valor = valor % 4;
        System.out.println("Resultado final: " + valor);


        System.out.println("\n--------------------------------------------------");
        System.out.println();

        // Concatenação vs Soma
        int senai = 10;
        int senai1 = 210;
        System.out.println("O valor da soma está errado: " + senai + senai1);
        System.out.println("O valor da soma é: " + (senai + senai1));


        System.out.println("\n--------------------------------------------------");
        System.out.println();


        int myInt;
        long myLong = 123987654321L;
        myInt = (int)myLong; //O número é "cortado"
                            //myInt é -566397263

        System.out.println(myInt);

        
        System.out.println("\n--------------------------------------------------");
        System.out.println();

    }
}