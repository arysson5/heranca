
package Produto;

public class EscolherProduto {
    public static void main(String[] args) {
        Cd cd = new Cd ();
        Livro livro = new Livro ();
        Dvd dvd =  new Dvd ();
        cd.setArtista("x");
        cd.setFaixas("Rajada");
        cd.setNome("cd");
        cd.setPreco(2.99);
        livro.setNome("Livro");
        livro.setPreco(5.00);
        livro.setAutor("markx");
        livro.setPaginas(500);
        dvd.setNome("dvd");
        dvd.setPreco(15.00);
        dvd.setArtista("lil pinga");
        dvd.setDuracao(20);
        System.out.println(""+cd.toString());
        cd.eCaro();
        System.out.println(""+ livro.toString());
        livro.eCaro();
        livro.eGrande();
        System.out.println(""+ dvd.toString());
        dvd.eCaro();
        
    }
}
