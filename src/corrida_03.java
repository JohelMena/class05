import java.util.Date;

public class corrida_03 {
    public static void main(String[] args){
        cls_Persona[] vecGente = new cls_Persona[100];
        functions f = new functions();
        for (int i=0; i< vecGente.length; i++){
          try {
              vecGente[i] = new cls_Persona(f.Cedula(), f.Nombre() + " " +
                      f.Apellido(),
                      f.Sexo(),
                      f.estCivil(),
                      new Date(f.fecNac()));
          }catch (Exception exp){
              System.out.println(exp.getMessage());
              i-=1;

          }
        }
        System.out.println();
    }
}
