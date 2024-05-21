import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class GerenciarObras{
   
   
    private static List<Obras> obras = new ArrayList<>();


    public static void listarObras() {

        if (obras.size() == 0) {
            System.out.println("\nNenhum cliente cadastrado.");
            return;
        }

        System.out.println("\nClientes cadastrados:");

        for (Obras tempCliente : obras) {

            tempCliente.exibirObras();
        }
    }

}
