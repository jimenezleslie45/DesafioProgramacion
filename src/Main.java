public class Main {
    public static void main(String[] args) {
        // Creación de personajes y enemigos utilizando las fábricas correspondientes
        FabricaPersonajes fabricaJugador = new FabricaGuerrero();
        Personaje jugador = fabricaJugador.crearPersonaje();

        FabricaEnemigos fabricaEnemigo = new FabricaEnemigoNormal();
        Enemigo enemigo = fabricaEnemigo.crearEnemigo();

        // Prueba de interacciones entre personajes y enemigos
        jugador.atacar();
        enemigo.recibirDaño(10);
    }
}
