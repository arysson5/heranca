
package Medico;


public class Medico {
    private boolean trabalhaHospital;
    public void tratarPaciente (){
        System.out.println("tratando...");
        
    }
    public void trabalhaHospital (){
        trabalhaHospital=true;
    }

    @Override
    public String toString() {
        return "Medico " + "trabalhaHospital= " + trabalhaHospital ;
    }

    public boolean isTrabalhaHospital() {
        return trabalhaHospital;
    }

    public void setTrabalhaHospital(boolean trabalhaHospital) {
        this.trabalhaHospital = trabalhaHospital;
    }
}
