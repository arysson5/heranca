
package Produto;


public class Livro extends Produto {
    private String autor;
    private int paginas;       
    
     public boolean eGrande (){
       return true;
   }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
}
