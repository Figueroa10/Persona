
package persona;

/**
 *
 * @author 59399
 */
public class Futbolista extends Persona {
    //Atributos
    private int NumeroDeCamisa;
    private String Posicion;
    //Contructor
    public Futbolista(String N,String A,int E,int NC,String P){
        super(N,A,E);
        this.NumeroDeCamisa = NC;
        this.Posicion = P;
    }
    //Metodos
    public int getNC(){
        return NumeroDeCamisa;
    }
    public String getP(){
        return Posicion;
    }
    
   public void MostrarDatos() {
       System.out.println(" *Futbolista* ");
       System.out.println("El Nombre Del Futbolista: "+ getN() );
       System.out.println("El Apellido Del Futbolista: "+ getA() );
       System.out.println("La Edad Del Futbolista es: "+ getE() );
       System.out.println("El Numero De Camisa Del Futbolista es: "+ getNC() );
       System.out.println("La posicion Del Futbolista es: "+ getP() );
   }
  public void PartidoDeFutbol() {
      System.out.println("El Futbolista asistara al partido de Futbol");
  }
  public void Viajar(){
      System.out.println("El Futbolista Viaja");
  }
  public void AsistirAEntrenamiento(){
      System.out.println("El Futbolista asistira al entrenamiento");
  }
  public void Entrevistas() {
      System.out.println("El Futbolista Dara una Entrevista");
  }
}
