package Trabajo_Semanal_Jaime;

import java.util.*;

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
     void inscribir_Jugador(Jugador j){
        lista_Jugadores.add(j);
        mapa_puntuaciones.put(j.nickname,0);
    }
     void registrar_Puntuacion(){
        Random random = new Random();
       for(Jugador jugador :lista_Jugadores){
           jugador.jugar_Partida();
           mapa_puntuaciones.put(jugador.nickname,random.nextInt(100)+1);
       }
    }
     void obtener_Ganador(){
        List<String> listajugadores = new ArrayList<>();
        List<Integer> listapuntajes = new ArrayList<>();

        for (int i = 0 ; i < mapa_puntuaciones.size();i++) {
            String nickname = "";
            int pganador = 0;
            for (String j : mapa_puntuaciones.keySet()) {
                if (mapa_puntuaciones.get(j) > pganador) {
                    pganador = mapa_puntuaciones.get(j);
                    nickname = j;
                }
            }
            listapuntajes.add(pganador);
            listajugadores.add(nickname);
            mapa_puntuaciones.put(nickname,0);
        }
        asignarrangkings(listajugadores);
        for(int i = 0;i<mapa_puntuaciones.size();i++){
            System.out.println("#"+(i+1)+"\nNick : "+listajugadores.get(i)+"\nPuntaje : "+listapuntajes.get(i));
        }
    }
    void asignarrangkings(List<String> jugadores) {
        for (Jugador j : lista_Jugadores) {
            j.ranking=jugadores.indexOf(j.nickname)+1;
        }
    }
}
