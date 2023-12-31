package Clases.Torneo;
import java.util.Scanner;
public abstract class Torneo {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // ATRIBUTOS
        public static int ContadorTorneos=0;
        protected int Id;
        protected String Nombre;
        protected boolean Activo;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORES
        public Torneo(String _Nombre){
            Id = ContadorTorneos;
            ContadorTorneos++;
            Nombre = _Nombre;
            Activo = true;
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // METODOS
        public abstract void MenuTorneo(Scanner Teclado);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // RETORNADORES GETTERS SETTERS
        public int getId() {
            return Id;
        }
        public boolean isActivo() {
            return Activo;
        }
        public String getNombre() {
            return Nombre;
        }
        public String EstaActivo(){
            String Retornar;
            if (Activo){
                Retornar ="En curso";
            }
            else{
                Retornar="Finalizado";
            }
            return Retornar;
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // OVERRIDE
        @Override
        public String toString() {
            return "Torneo{" +
                    "Id=" + Id +
                    ", Nombre='" + Nombre + '\'' +
                    ", Activo=" + Activo +
                    '}';
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}