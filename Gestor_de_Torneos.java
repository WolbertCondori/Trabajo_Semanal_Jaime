package Trabajo_Semanal_Jaime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Gestor_de_Torneos {
    List<Torneo> torneos = new ArrayList<>();
    List<Participante> participantes= new ArrayList<>();

    void agregarParticipante(Participante p){
        p.id_participante=participantes.size()+1;
        participantes.add(p);
    }
    void CrearTorneo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nombre del Torneo");
        String nombre = sc.nextLine();
        System.out.println("De que sera el torneo ?");
        String tipo = sc.nextLine();
        torneos.add(new Torneo(nombre, tipo,torneos.size()));
    }
    void inscribirJugador(Jugador j,int id_torneo){
        for (Participante p : participantes){
            if (Objects.equals(p.nickname, j.nickname)){
                if (torneos.get(id_torneo).lista_Jugadores.isEmpty()) {
                    torneos.get(id_torneo).lista_Jugadores.add(j);
                }
                else {
                    boolean esta = false;
                    for (Jugador jt : torneos.get(id_torneo).lista_Jugadores) {
                        if (Objects.equals(jt.nickname, j.nickname)) {
                            esta=true;
                        }
                    }
                    if (!esta) {
                        torneos.get(id_torneo).lista_Jugadores.add(j);
                    }
                }
            }
        }
    }
    void registrarResultado(){

    }
    void mostrarInforme(){
        for (Torneo t:torneos){
            System.out.println("Nombre del Torneo : "+t.nombre_torneo
            +"\nTipo de Torneo : "+t.tipo_juego
            +"\nID Torneo : "+t.ID_torneo
            +"\n===================JUGADORES=====================");

            for(Jugador j:t.lista_Jugadores){
                j.mostrar_perfil();
            }
        }
    }
}
