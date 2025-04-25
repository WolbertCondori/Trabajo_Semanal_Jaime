package Trabajo_Semanal_Jaime;

public class Streamer extends Participante{

    Integer numero_seguidores;
    String plataforma;

    public Streamer(String nombre, String nickname , Integer edad, Integer numero_seguidores, String plataforma) {
        super(nombre, nickname, edad);
        this.numero_seguidores = numero_seguidores;
        this.plataforma = plataforma;
    }

    @Override
    public void mostrar_perfil() {
        System.out.println("Nombre : "+nombre
                +"\nNickname : "+nickname
                +"\nEdad : "+edad
        +"\nID : "+id_participante
        +"\nNumero de seguidores : "+numero_seguidores
        +"\nPlataforma : "+plataforma);
    }
}
