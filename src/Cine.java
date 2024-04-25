import java.util.LinkedList;
import java.util.Queue;

public class Cine {
    private Queue<Pelicula> peliculas;


    public Cine(){
        peliculas= new LinkedList<Pelicula>();
    }

  /*  public boolean esVacia(){
     // cambie el método para que funcione correctamente
        return true;
    }*/
    public boolean esVacia(){
        // cambie el método para que funcione correctamente

        return peliculas.isEmpty();
    }
    /*public int tamanio(){
     //actualice la sentencia para que devuelva el tamño de elementos de la cola
        return 10;
    }*/


    public int tamanio() {
        return peliculas.size();
    }
    public void encolar(String nombrePelicula, int cantidadEntradas){
        peliculas.add(new Pelicula(nombrePelicula,cantidadEntradas));
    }

    public Object desencolar() throws Exception{
       //actualice el método para eliminar el elemento del inicio.
        if (peliculas.isEmpty())
            throw new Exception("No hay peliculas en la cola");
        return peliculas.poll();
    }

    //cree un método para listar los elementos que seran desplegados en una textArea.
    public String listarPeliculas(){
        String mensaje = "";
        for (Pelicula v:peliculas){
            mensaje += v.toString();
        }
        return mensaje;
    }


    //cree un método para conocer la cantidad de entradas disponibles

    public int entradasDisponibles() {
        int entradasDisponibles = 0;
        for (Pelicula pelicula : peliculas) {
            entradasDisponibles += pelicula.getCantidadEntradas();
        }
        return entradasDisponibles;
    }

}
