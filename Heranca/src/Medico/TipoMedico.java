
package Medico;


public class TipoMedico {
    public static void main(String[] args) {
        ClinicoGeral clinico = new ClinicoGeral ();
        Cirurgiao cirurgiao = new Cirurgiao ();
        clinico.setTrabalhaHospital(false);
        clinico.atendeCasa();
        cirurgiao.setTrabalhaHospital(true);
        System.out.println(""+ clinico.toString());
        clinico.receitar();
        System.out.println(""+ cirurgiao.toString());
        cirurgiao.insisao();
        cirurgiao.tratarPaciente();
    }
    
}
