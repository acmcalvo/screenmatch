import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFecheDeLazamineto(2921);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

       miPelicula.muestraFichaTecnica();
       miPelicula.evalua( 10);
       miPelicula.evalua(10);
       miPelicula.evalua(7.8);

       System.out.println(miPelicula.getTotaDeLasEvaluciones());
       System.out.println(miPelicula.calculaMedia());







//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "matrix";
//        otraPelicula.fecheDeLazamineto = 1998;
//        otraPelicula.duracionEnMinutos = 180;

    }
}
