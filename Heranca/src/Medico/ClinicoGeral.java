
package Medico;

public class ClinicoGeral extends Medico{
    private boolean atendeCasa;
   public void atendeCasa(){
       atendeCasa=true;
       
   } 
    public void receitar (){
        System.out.println("tomar rivotril");
    }
}
