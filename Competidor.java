package Trabajo_Semanal_Jaime;

public interface Competidor {
    public default void jugar_Partida(){
        System.out.println("*se pone a jugar*");
    }
    public default void recibir_premio(){
        System.out.println("*toma el premio y sonrie*");
    }
}
