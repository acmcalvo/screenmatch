public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fecheDeLazamineto = 2021;
       miPelicula.duracionEnMinutos =  120;

       miPelicula.muestraFichaTecnica();
       miPelicula.evalua( 10);
       miPelicula.evalua(10);
       miPelicula.evalua(7.8);

       System.out.println(miPelicula.getTotaDeLasEvaluciones());
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "matrix";
        otraPelicula.fecheDeLazamineto = 1998;
        otraPelicula.duracionEnMinutos = 180;

//        otraPelicula.muestraFichaTecnica();
    }
}
