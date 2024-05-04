package cl.praxis.miprimerjava.desafios;

public class Ejercicios {
    public static void main(String[] args) {

        int num= 8;
        int num2= 8;
        String tx1= "pera";
        String tx2= "pera";

        if(tx1.equals(tx2)){
            System.out.println("Los textos son iguales");
        } else{
            System.out.println("Los textos no son iguales");
        }

        if(!tx1.equals(tx2)){
            System.out.println("Los textos no son iguales");
        } else{
            System.out.println("Los textos si son iguales");
        }



        if(num==num2){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }

        if(!(num==num2)){
            System.out.println("Los numeros no son iguales");
        } else {
            System.out.println("Los numeros  son iguales");
        }
    }

}
