package cl.praxis.miprimerjava;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // esto en un comentario en linea

    /*
    esto me permite comentarios
    en más de una línea.
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        int numero1=6;
        int numero2=2;
        int numero3=3;
        char caracter;
        boolean boleano;
        float decimal1= 1.5f;
        double decimal2;
        long numeroLargo1;
        int suma;
        final int DIAS_DE_LA_SEMANA =7;// El nombre de la variable se escribe en mayuscula por ser una variable

        // tipos de datos que vienen de Clases

        String texto=" Hola mundo";
        Double decimalLargo;
        Integer numeroentero2=5;
        String texto2= new String( "holamundo 2");// crea una referencia a un objeto
        String nulo=null ;// objeto nulo
        nulo=new String();// INICIALIZANDOSE del objeto nulo
        String vacio= ""; //String vacio
        System.out.printf(texto);




        //operadores


   suma= numero1 +numero2;
    System.out.println(suma);
        System.out.println(numero1+numero3/decimal1);
        System.out.println(17.8);
        System.out.println(9/1.5f);
        System.out.println(3+5);
        vacio = texto + texto2;
        System.out.println(vacio);
        System.out.println(vacio.substring(2,13));

        System.out.println(numero3);
        System.out.println(vacio.startsWith("hola"));
        System.out.println(vacio.indexOf('z'));

        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa un texto gil");
        texto = sc.nextLine();
        System.out.println(texto);

        numero2 =(int)decimal1;
        System.out.println(numero2);



        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}