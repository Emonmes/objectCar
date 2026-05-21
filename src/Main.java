import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            System.out.print("Declare quantos carros: ");
            int n = sc.nextInt();
            if (n > 50){
                System.out.println("Quantidade invalida, digite no maximo 50 carros");
                return;
            }

            sc.nextLine();



            Carro[] carros = new Carro[n];


            for (int i = 0; i < n; i++) {
                System.out.println("Digite os dados do carro " + ( i+1 ) + ":");

                System.out.print("Modelo: ");
                String modelo = sc.nextLine();

                System.out.print("Marca: ");
                String marca = sc.nextLine();

                System.out.print("Ano: ");
                int ano = sc.nextInt();

                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                carros[i] = new Carro(modelo, marca, ano, valor);
            }



            for (Carro c : carros) {
                c.exibirInfo();
            }

         double total = Carro.somaValores(carros);
         System.out.println("O valor total dos carros é : " + total);
         sc.close();
        }



    }
