package Trabajo_Semanal_Jaime;

public abstract class Participante {

    String nombre,nickname;
    Integer edad,id_participante;

    public Participante(String nombre, String nickname, Integer id_participante, Integer edad) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.id_participante = id_participante;
        this.edad = edad;
    }

    public abstract void mostrar_perfil();
}
