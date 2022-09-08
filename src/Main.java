import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);


            float nota = 0;
            int opc, quantidadeNotas;
            String nome, sobrenome, cpf;

            Scanner sc = new Scanner(System.in);


            do {
                System.out.println("\n --------------------------------");
                System.out.println("       MENU");
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Inserir Aluno");
                System.out.println("2 - Listar Aluno");
                System.out.println("3 - Situação");
                System.out.println("0 - Sair");

                opc = sc.nextInt();
                sc.nextLine();

                switch (opc){
                    case 1:
                        System.out.println("Digite o nome do aluno(a): ");
                        nome = sc.nextLine();
                        System.out.println("Digite o sobrenome do aluno(a): ");
                        sobrenome = sc.nextLine();
                        System.out.println("Digite seu CPF: ");
                        cpf = sc.nextLine();

                        System.out.println("Deseja acrescentar quantas notas");
                        quantidadeNotas = sc.nextInt();

                            for (int i =0; i < quantidadeNotas; i++){
                                System.out.println("\nNota: " + (i + 1));
                                nota = sc.nextFloat();
                    }break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default: System.out.println("Número Invalido!");
                }


            } while(opc != 0);

            sc.close();
    }
}
