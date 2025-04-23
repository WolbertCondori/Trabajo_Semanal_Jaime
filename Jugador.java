package Trabajo_Semanal_Jaime;

public class Jugador extends Participante implements Competidor{
    String pais,ranking;

    public Jugador(String nombre, String nickname, Integer id_participante, Integer edad, String pais, String ranking) {
        super(nombre, nickname, id_participante, edad);
        this.pais = pais;
        this.ranking = ranking;
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
        Competidor.super.jugar_Partida();
    }

    @Override
    public void recibir_premio() {
        Competidor.super.recibir_premio();
    }
}
