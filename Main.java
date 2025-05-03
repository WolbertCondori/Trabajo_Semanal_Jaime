package Trabajo_Semanal_Jaime;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    Gestor_de_Torneos gestor = new Gestor_de_Torneos();
    Scanner sc = new Scanner(System.in);
    void menu(){
        String menu = "Opciones)\n" +
                "1) Crear Torneo\n" +
                "2) Agregar Participante\n" +
                "3) Inscribir jugador a Torneo\n" +
                "4) Registrar Resultado\n" +
                "5) Crear Informe";
        System.out.println(menu);
        int R = sc.nextInt();
        switch (R) {
            case 1:
                gestor.CrearTorneo();
                break;
            case 2:
                String menu2 = "1) Streamer\n" +
                        "2) Jugador";
                System.out.println(menu2);
                int R2 = sc.nextInt();
                if (R2==1){
                    System.out.println("Nombre :\n");
                    String nombre = sc.next();
                    System.out.println("nickname :\n");
                    String nickname = sc.next();
                    System.out.println("plataforma :\n");
                    String plataforma = sc.next();
                    System.out.println("edad :");
                    Integer edad = sc.nextInt();
                    System.out.println("numero de seguidores :");
                    Integer numero_seguidores = sc.nextInt();
                    Streamer sp = new Streamer(nombre,nickname,edad,numero_seguidores,plataforma);
                    gestor.agregarParticipante(sp);
                }
                else if (R2==2) {
                    System.out.println("Nombre :\n");
                    String nombre = sc.next();
                    System.out.println("nickname :\n");
                    String nickname = sc.next();
                    System.out.println("Pais :\n");
                    String pais = sc.next();
                    System.out.println("edad :");
                    Integer edad = sc.nextInt();
                    Jugador jp = new Jugador(nombre,nickname,edad,pais);
                    gestor.agregarParticipante(jp);
                }
                else {
                    System.out.println("Valor Introducido no Valido");
                }
                break;
            case 3 :
                System.out.println("Nickname del Jugador");
                String nickname =sc.nextLine();
                Jugador jugador = new Jugador("",nickname,0,"");
                System.out.println("ID de Torneo donde Inscribir");
                int ID_torneo = sc.nextInt();
                gestor.inscribirJugador(jugador,ID_torneo);
                break;
            case 4 :
                gestor.registrarResultado();
                break;
            case 5 :
                System.out.println("ID del torneo al que crear informe :");
                int id = sc.nextInt();
                gestor.mostrarInforme(id);
                break;
            default:
                System.out.println("Opcion no Valida");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        Main main = new Main();
        do {
            main.menu();
            System.out.println("Quieres Seguir Modificando ? S/N");
            respuesta=sc.nextLine();
        }while (!Objects.equals(respuesta, "N"));
    }
}
