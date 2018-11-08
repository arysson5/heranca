
package Animal;


public class Animal {
    private String foto,comida;
    private double peso ;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void comer (){
        
    }
        public void dormir (){
            
        }
        public void movimentar (){
            
        }
        public void fazerBarulho(){
            
        }

    @Override
    public String toString() {
        return "Animal " + "nome= " + foto + ", come = " + comida + ", peso= " + peso ;
    }
}
