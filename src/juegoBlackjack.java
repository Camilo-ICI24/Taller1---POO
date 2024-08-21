class juegoBlackjack {

    public static void main(String[] args) {
        crearMatrizCartas();
        agregarCartas();
        inicializarCartasJuego();
        obtenerCartas();
        jugarJuego();
        salir();
        menu();
    }

    public static String[][] crearMatrizCartas() {
        String[][] cartas = new String[12][2]; // Esta matriz será de 12 x 2 ya que se desean doce cartas como máximo y cada carta tiene su puntaje particular
        return cartas;
    }

    public static String agregarCartas(String nombreCarta, String puntaje) {
        crearMatrizCartas();

    }

    public static void inicializarCartasJuego() {
        for (int fila = 1; fila < agregarCartas().length(); fila++) {
            for (int columna = 1; columna < 3; columna++) {
                agregarCartas(String nombreCarta, String puntaje);
            }
        }
    }

    public static void obtenerCartas() {

    }

    public static void menu() {
        System.out.println("¡Bienvenido a BlackJackva!");
        System.out.println("-----beta v08.21-----");

    }

}