package Trabajo_Semanal_Jaime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Torneo {
    String nombre_torneo,tipo_juego;
    Integer ID_torneo;
    List<Jugador> lista_Jugadores = new ArrayList<>();
    HashMap<String,Integer> mapa_puntuaciones = new HashMap<>();

    public Torneo(String nombre_torneo, String tipo_juego, Integer ID_torneo) {
        this.nombre_torneo = nombre_torneo;
        this.tipo_juego = tipo_juego;
        this.ID_torneo = ID_torneo;
    }

    protected void inscribir_Jugador(Jugador j){
        lista_Jugadores.add(j);
        mapa_puntuaciones.put(j.nickname,0);
    }

    protected void registrar_Puntuacion(int puntaje,Jugador j){
       for(Jugador jugador :lista_Jugadores){
           if (Objects.equals(jugador.nickname, j.nickname)){
               mapa_puntuaciones.replace(j.nickname,puntaje);
           }
       }
    }
    protected void obtener_Ganador(){
    }
}
