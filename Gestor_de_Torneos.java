package Trabajo_Semanal_Jaime;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        for (Torneo torneo : torneos) {
            torneo.registrar_Puntuacion();
            torneo.obtener_Ganador();
        }
    }
    void mostrarInforme(int id_torneo){
        crearjeson(id_torneo);
        escreberJeson(id_torneo);
    }
    void crearjeson(int id_torneo){
        Torneo t = torneos.get(id_torneo);
        try {
            File archivo = new File(t.nombre_torneo+"_Informe.txt");
            if(!archivo.exists()){
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("paso un error al crear el archivo");
        }
    }
    void escreberJeson(int id_torneo){
        Torneo t = torneos.get(id_torneo);
        try {
            FileWriter escritor = new FileWriter(t.nombre_torneo+"_Informe.txt");
            BufferedWriter buffer = new BufferedWriter(escritor);
            JSONObject objetojson = new JSONObject();
            int id_json=0;
            for (Jugador j : t.lista_Jugadores) {
                String creadorDeString;
                creadorDeString = "Nombre : "+j.nickname+" Ranking : "+j.ranking;
                buffer.write(creadorDeString);
                buffer.newLine();
            }
            buffer.close();
            System.out.println("Texto escrito");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    }
}
