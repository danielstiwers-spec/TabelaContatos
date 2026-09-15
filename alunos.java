import java.util.Scanner; // importa a ferramenta para escanear a resposta do usuário

public class alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // criando o scanner
        Pessoa pessoa = new Pessoa(new String[5], new int[5]); // criando um vetor que suporte 5 nomes e 5 números
        String resp; // variável de resposta final

        do {
            pessoa.nome = NomeAluno(scanner); // irá ler os nomes que o usuário digitar por meio de uma função
            pessoa.num = NumeroAluno(scanner); // irá ler os números que o usuário digitar por meio de uma função

            System.out.print("Quer ver a lista? [S/N] ");
            resp = scanner.nextLine();

            if (resp.equalsIgnoreCase("S")) {
                MostraTabela(pessoa); // mostra a tabela que o  usuário criou por meio de um procedimento
            }
        } while (!resp.equalsIgnoreCase("N")); // irá terminar se o usuário não quiser continuar

        scanner.close();
    }

    static String[] NomeAluno(Scanner scanner) {
        String[] nome = new String[5]; // criando um vetor que suporte 5 nomes

        for (int i = 1; i < nome.length; i++) {
            System.out.print("Digite o nome do " + i + "o. contato: ");
            nome[i] = scanner.nextLine();
        }

        return nome;
    }

    static int[] NumeroAluno(Scanner scanner) {
        int[] num = new int[5]; // criando um vetor que suporte 5 números

        for (int i = 1; i < num.length; i++) {
            System.out.print("Digite o numero do " + i + "o. contato: ");
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        return num;
    }

    static void MostraTabela(Pessoa pessoa) {
        for (int i = 1; i < pessoa.nome.length; i++) {
            System.out.println(pessoa.nome[i] + ": " + pessoa.num[i]);
        }
    }
}

class Pessoa {
    String[] nome;
    int[] num; // criando um objeto do tipo Pessoa que irá armazenar os nomes e números

    Pessoa(String[] nome, int[] num) {
        this.nome = nome;
        this.num = num;
    }
}