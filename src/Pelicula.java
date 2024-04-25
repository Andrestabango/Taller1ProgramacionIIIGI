class Pelicula {
    private String nombrePelicula;
    private int cantidadEntradas;

    public Pelicula(String nombrePelicula, int cantidadEntradas) {
        this.nombrePelicula = nombrePelicula;
        this.cantidadEntradas = cantidadEntradas;
    }

    public Pelicula() {

    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    @Override
    public String toString() {
            return "\nNombre de la película: "+nombrePelicula+
                    "\nCantidad de entradas: "+cantidadEntradas;
        }

}