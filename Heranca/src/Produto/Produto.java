
package Produto;

public class Produto {
    private String nome;
    private double preco;
    
    public boolean eCaro (){
        return true;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto " + "nome= " + nome + ", preco= " + preco ;
    }
    
}