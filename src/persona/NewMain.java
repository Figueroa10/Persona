
package persona;

/**
 *
 * @author 59399
 */
public class NewMain {
    public static void main(String[] args) {
        Persona P =new Persona("JHONATHAN","Figueroa",18 );
        String Nombre=P.getN();
        String Apellido=P.getA();
        int Edad=P.getE();
        System.out.println(" *Persona* ");
        System.out.println("El Nombre de la Persona es: "+ Nombre);
        System.out.println("El Apellidos de la Persona es: "+ Apellido);
        System.out.println("La edad de la Persona es: "+ Edad);
        
        Futbolista F=new Futbolista("BRYAN","ALCIVAR",19,11,"VOLANTE");
        
        F.MostrarDatos();
        
        F.PartidoDeFutbol();
        F.Viajar();
        F.AsistirAEntrenamiento();
        F.Entrevistas();
        
        Entrenador EN=new Entrenador("AARON","RUIZ",35,"Buscar Informacion nueva");
        
        EN.MostrarDtos();
        
        EN.PartidoDeFutbol();
        EN.Viajar();
        EN.AsistirAEntrenamiento();
        EN.PlanificaDELosEntrenamientos();
        
        Doctor DO=new Doctor("OSCAR","Cevallos",50,"Especicialista En beber a diario",20);
        
        DO.MostrarDtos();
        
        DO.PartidoDeFutbol();
        DO.Viajar();
        DO.AsistirAEntrenamiento();
        DO.CurarLesiones();
        
    }

    
    
}
