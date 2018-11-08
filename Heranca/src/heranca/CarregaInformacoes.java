
package heranca;

import javax.swing.JOptionPane;

public class CarregaInformacoes {
    public static void main(String[] args) {
       Aluno ps1 = new Aluno ();
       Professor ps2= new Professor ();
       Funcionario ps3= new Funcionario ();
    ps1.setNome("Amarildo Justino ");
    ps1.setIdade(25);
    ps1.setSexo("m");
    ps1.setCurso("Informatíca");
    ps1.setMatricula(258469);
    ps2.setNome("Josias");
    ps2.setIdade(40);
    ps2.setSexo("m");
    ps2.setSalario(15000);
    ps2.setEspecialidade("Informatica");
    ps3.setNome("Avelino Marciel");
    ps3.setIdade(69);
    ps3.setSexo("m");
    ps3.setSetor("limpeza");
    
    JOptionPane.showMessageDialog(null,ps1.toString());
    System.out.println(" " + ps1.toString()+" curso: "+ps1.getCurso()+" numero matricula: "+ ps1.getMatricula());
   System.out.println(" "+ps2.toString()+" Salario: "+ps2.getSalario()+" especialidade: "+ps2.getEspecialidade());
   System.out.println(" "+ps3.toString()+" setor: "+ ps3.getSexo());}
}
