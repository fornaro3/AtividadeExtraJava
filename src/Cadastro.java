public class Cadastro{
    


    private static void cadastrar() {

        int op;

        do {

            System.out.println("\nCadastrar obras de arte");
            System.out.println("1) Cadastrar");
            System.out.println("2) Listar");
            System.out.println("3) Apagar cadastro");
            System.out.println("0) Sair");
            System.out.print("Sua opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    
                    System.out.println("\nNova obra de arte:");
                    System.out.print("Título: ");
                    String placa = Console.lerString();

                    System.out.print("Artista: ");
                    String modelo = Console.lerString();

                    System.out.print("Ano de criação: ");
                    String cor = Console.lerString();

                    System.out.println("Tipo de obra: ");
                    String tipoObra = Console.lerString();

                    System.out.println("localização: ");
                    String localizacao = Console.lerString();

                    Obras obra = new Obras(S);

                    GerenciarObras.salvarObra(obra);

                    System.out.println("\nCarro cadastrado com sucesso!");

                    break;

                case 2: 

                    System.out.println("\nObras Cadastradas: ");
                    GerenciarObras.listarObras();
                    break;

                case 3:

                    GerenciarCarros.apagarDados();
                    System.out.println("\nCarros excluídos do arquivo");
                    break;
                    
                case 0: 

                    System.out.println("\nO sistema foi finalizado...");
                    break;  

                default:
                    System.out.println("\nOpção inválida. Digite novamente");
                    break;
            }


        } while (op != 0);

}
