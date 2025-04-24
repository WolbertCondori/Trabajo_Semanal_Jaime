package Trabajo_Semanal_Jaime;


import java.util.Random;

public class Jugador extends Participante implements Competidor{
    String pais;
    int ranking;

    public Jugador(String nombre, String nickname, Integer id_participante, Integer edad, String pais) {
        super(nombre, nickname, id_participante, edad);
        this.pais = pais;
    }

    @Override
    public void mostrar_perfil() {
        System.out.println("Nombre : "+nombre
                +"\nNickname : "+nickname
                +"\nEdad : "+edad
                +"\nID : "+id_participante
        +"\nPais : "+pais
        +"\nRanking : "+ranking);
    }

    @Override
    public void jugar_Partida() {
        System.out.println("jugando. . .");
    }

    @Override
    public void recibir_premio() {
        System.out.println("grax");
    }
}
