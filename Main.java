package Trabajo_Semanal_Jaime;

public class Main {
    public static void main(String[] args) {
        Gestor_de_Torneos gestorDeTorneos = new Gestor_de_Torneos();
        Jugador jugador1 = new Jugador("pepe", "pepe_pro" , 23, "Chile");
        Jugador jugador2 = new Jugador("carlos", "xdestroyer", 19, "EEUU");
        Jugador jugador3 = new Jugador("Mario", "mata_abuelitas3000",  29, "Alemania");
        Jugador jugador4 = new Jugador("ramiro", "Don_Ramon",  35, "Russia");
        gestorDeTorneos.CrearTorneo();
        gestorDeTorneos.agregarParticipante(jugador1);
        gestorDeTorneos.agregarParticipante(jugador2);
        gestorDeTorneos.agregarParticipante(jugador3);
        gestorDeTorneos.inscribirJugador(jugador1,0);
        gestorDeTorneos.inscribirJugador(jugador2,0);
        gestorDeTorneos.inscribirJugador(jugador3,0);
        gestorDeTorneos.inscribirJugador(jugador4,0);
        gestorDeTorneos.torneos.getFirst().registrar_Puntuacion(jugador1);
        gestorDeTorneos.torneos.getFirst().registrar_Puntuacion(jugador2);
        gestorDeTorneos.torneos.getFirst().registrar_Puntuacion(jugador3);
        gestorDeTorneos.torneos.getFirst().registrar_Puntuacion(jugador4);
        gestorDeTorneos.torneos.getFirst().obtener_Ganador();
        for(int i =0 ; i<gestorDeTorneos.torneos.getFirst().lista_Jugadores.size();i++) {
            System.out.println("Nick : "+ gestorDeTorneos.torneos.getFirst().lista_Jugadores.get(i).nickname+"\nRanking : "+gestorDeTorneos.torneos.getFirst().lista_Jugadores.get(i).ranking);
        }
        gestorDeTorneos.mostrarInforme();
    }
}
