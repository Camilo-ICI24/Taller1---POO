import java.util.Scanner;

class juegoBlackjack {

    public static void main(String[] args) {
        agregarCartas();
        inicializarCartasJuego();
        obtenerCartas();
        jugarJuego();
        salir();
        menu();
    }

    public static void crearMatrizCartas() {
        String[][] cartas = new String[12][2]; // Esta matriz será de 12 x 2 ya que se desean doce cartas como máximo y cada carta tiene su puntaje particular
    }

    public static void agregarCartas(String[][] m, String nombreCarta, String puntaje) {
        crearMatrizCartas();
        for (int fila = 1; fila < m.length(); fila++) {
            for (int columna = 1; columna < 3; columna++) {
                if (m[fila][columna] == null) {
                    m[fila][0] = nombreCarta;
                    m[fila][1] = puntaje;
                }
            }
        }
    }

    //Integer.parseInt (sumar puntaje)

    public static void inicializarCartasJuego(String[][] m) {
        agregarCartas(m, "As", "11");
        agregarCartas(m, "Jacks", "10");
        agregarCartas(m, "Queen", "10");
        agregarCartas(m, "King", "10");
        agregarCartas(m, "cartaDos", "2");
        agregarCartas(m, "cartaTres", "3");
        agregarCartas(m, "cartaCuarto", "4");
        agregarCartas(m, "cartaCinco", "5");
        agregarCartas(m, "cartaSeis", "6");
        agregarCartas(m, "cartaSiete", "7");
        agregarCartas(m, "cartaOcho", "8");
        agregarCartas(m, "cartaNueve", "9");
    }

    public static void obtenerCartas() {

    }

    public static void opcionesMenu() {
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    public static void menu() {
        Scanner opcion = new Scanner(System.in);
        System.out.println("¡Bienvenido a BlackJackva!");
        System.out.println("-----beta v08.21-----");
        while (true) {
            opcionesMenu();
            int decision = opcion.nextInt();
            if (decision == 1) {


            } else if (decision == 2) {
                System.out.println("¡Gracias por jugar BlackJackva");
                break;
            }
        }

    }

}