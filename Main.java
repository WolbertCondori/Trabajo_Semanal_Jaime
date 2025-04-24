package Trabajo_Semanal_Jaime;

public class Main {
    public static void main(String[] args) {
        Gestor_de_Torneos gestorDeTorneos = new Gestor_de_Torneos();
        Jugador jugador1 = new Jugador("pepe", "pepe_pro", 0, 23, "Chile");
        Jugador jugador2 = new Jugador("carlos", "xdestroyer", 1, 19, "EEUU");
        gestorDeTorneos.CrearTorneo();
        gestorDeTorneos.inscribirJugador(jugador1, 0);
        gestorDeTorneos.inscribirJugador(jugador2, 0);
        gestorDeTorneos.torneos.getFirst().registrar_Puntuacion(jugador1);
        gestorDeTorneos.torneos.getFirst().registrar_Puntuacion(jugador2);
        gestorDeTorneos.torneos.getFirst().obtener_Ganador();
        for(int i =0 ; i<gestorDeTorneos.torneos.getFirst().lista_Jugadores.size();i++) {
            System.out.println("nick : "+ gestorDeTorneos.torneos.getFirst().lista_Jugadores.get(i).nickname+"\nranking : "+gestorDeTorneos.torneos.getFirst().lista_Jugadores.get(i).ranking);
        }
    }
}
