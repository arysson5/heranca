
package heranca;


public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    public boolean MudaTrabalho (){
        return true;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
}
