public class Pelicula {
    String nombre;

    int fecheDeLazamineto;

    int duracionEnMinutos;

    boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totaDeLasEvaluciones;

    int getTotaDeLasEvaluciones() {
        return totaDeLasEvaluciones;
    }

    void muestraFichaTecnica(){
        System.out.println("El Nombre  Pelicula es: " + nombre);
        System.out.println("Su fecha de lazamiento es: " + fecheDeLazamineto);
        System.out.println("duracion en Minutos es: " + duracionEnMinutos );

    }
void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
//        sumaDeLasEvaluaciones + sumaDeLasEvaluaciones + nota;
    totaDeLasEvaluciones++;


}

double calculaMedia() {
        return sumaDeLasEvaluaciones / totaDeLasEvaluciones;
}

}
