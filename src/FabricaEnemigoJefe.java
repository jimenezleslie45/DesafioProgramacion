class FabricaEnemigoJefe extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoJefe(); // Puedes crear una clase EnemigoJefe si lo deseas
    }
}

