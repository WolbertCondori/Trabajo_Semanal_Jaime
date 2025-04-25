package Trabajo_Semanal_Jaime;

public abstract class Participante {

    String nombre,nickname;
    Integer edad,id_participante;

    public Participante(String nombre, String nickname,  Integer edad) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
    }

    public abstract void mostrar_perfil();
}
