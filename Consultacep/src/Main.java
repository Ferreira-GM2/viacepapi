import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException,
            InterruptedException {

        int cont = 0;
        while (cont == 0) {
            System.out.print("Digite o seu cep: ");
            Scanner leitura = new Scanner(System.in);
            String meuCep = leitura.nextLine();
            if (meuCep.length() != 8) {
                System.out.println("Digite um cep válido");
            } else {
                Buscador minhaConsulta = new Buscador();
                minhaConsulta.buscar(meuCep);

            };
            System.out.print("Digite 1 para encerrar ou 0 para continuar ");
            cont = leitura.nextInt();
        }
    }
}























