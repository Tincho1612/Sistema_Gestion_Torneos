import Clases.Administrador.Administrador_Nueva;
import Clases.Exportador.ImportarExportar_Gson;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        ImportarExportar_Gson.SetearContadoresId("src/Archivos", "Contadores.txt");
        Administrador_Nueva Admin = ImportarExportar_Gson.ImportarDatos("src/Clases/Administrador", "ObjetoAdministrador");
        Admin.Menu_Principal(Teclado);
        ImportarExportar_Gson.ExportarDatos("src/Clases/Administrador", "ObjetoAdministrador", Admin);
        ImportarExportar_Gson.GuardarContadores("src/Archivos", "Contadores.txt");
        Teclado.close();
    }
}