
package persona;

/**
 *
 * @author 59399
 */
public class Entrenador extends Persona {
    //Atributos
    public String Estrategia;
    //Contructor
    
    public Entrenador(String N, String A,int E,String ES){
        super (N,A,E);
        this.Estrategia = ES;
    }
    //Metodos
    public String getES() {
        return Estrategia;
    }
    public void MostrarDtos(){
        System.out.println(" *Entrenador* ");
        System.out.println("El Nombre del Entrenador es: "+ getN() );
        System.out.println("El Apellido del Entrenador es: "+ getA() );
        System.out.println("La Edad del Entrenador es: "+ getE() );
        System.out.println("La Estrategia DEL Entrenador es: "+ getES() );
    }
    public void PartidoDeFutbol() {
      System.out.println("El Entrenador asistara al partido de Futbol");   
}
    public void Viajar(){
      System.out.println("El Futbolista Viaja");
  }
  public void AsistirAEntrenamiento(){
      System.out.println("El Entrenador asistira al entrenamiento");
  }
  public void PlanificaDELosEntrenamientos() {
      System.out.println("El Entrenador PlanificaLosEntrenamientos");
}
}
