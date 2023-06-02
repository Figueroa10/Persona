
package persona;

/**
 *
 * @author 59399
 */
public class Doctor extends Persona {
    private String Titulacion;
    private int AñosDeExperiencia;
    //ccONTRUCTOR
    public Doctor(String N, String A,int E,String T,int AE) {
        super(N,A,E);
        this.Titulacion = T;
        this.AñosDeExperiencia = AE;
    }
    //Metodos
    public String getT() {
        return Titulacion;
    }
    public int getAE() {
        return AñosDeExperiencia;
    }
    public void MostrarDtos(){
        System.out.println(" *Doctor* ");
       System.out.println("El Nombre Del Doctor es: "+ getN() );
       System.out.println("El Apellido Del Doctor es:"+ getA() );
       System.out.println("La Edad Del Doctor es: "+ getE() );
       System.out.println("El titulo Del Doctor es: "+ getT() );
       System.out.println("Los Años de Experiencia Del Doctor es: "+ getAE() );
}
    public void PartidoDeFutbol() {
      System.out.println("El Doctor asistara al partido de Futbol");
  }
  public void Viajar(){
      System.out.println("El Doctor Viaja");
  }
  public void AsistirAEntrenamiento(){
      System.out.println("El Doctor asistira al entrenamiento");
  }
  public void CurarLesiones(){
      System.out.println("El Doctar Curara Las Lesiones");
}
  }
