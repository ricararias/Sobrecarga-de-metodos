import java.util.Scanner;

//Sobrecarga de metodos: quando uma classe possui metodos com o mesmo nome mas possui diferentes parametros

class Desenhar{

    public void mostrar(){
    for( int i = 0; i < 10; i++){
        System.out.println("*");

        }
    }

    public void mostrar(char simbol){
        for(int i = 0; i < 10; i++){
            System.out.println(simbol);
        }

    }

    public void mostrar(char simbol, int n){
        for(int i = 0; i < n; i++){
            System.out.println(simbol);
        }
    }

}



public class App {
    public static void main(String[] args) throws Exception {

        Desenhar desenho = new Desenhar();
        Scanner simbol = new Scanner(System.in);
        System.out.print("Digite um simbilo: ");
        char sim = simbol.next().charAt(0);

        Scanner simbol2 = new Scanner(System.in);
        System.out.print("Digite outro simbolo: ");
        char sim2 = simbol2.next().charAt(0);

        Scanner qtde = new Scanner(System.in);
        System.out.print("Digite uma quantidade de repetição: ");
        int q = qtde.nextInt();


        desenho.mostrar();

        desenho.mostrar(sim);;

        desenho.mostrar(sim2, q);


    }

}

