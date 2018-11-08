
package Animal;


public class MostrarAnimal {
    public static void main(String[] args) {
        Cachorro dog= new Cachorro ();
        Ave ave = new Ave ();
        dog.setComida("Ração");
        dog.setPeso(1.5);
        dog.setFoto("cachorro");
        ave.setComida("alpiste");
        ave.setPeso(0.15);
        ave.setFoto("ave");
        System.out.println(" "+ dog.toString()+"kg");
        dog.enterrarOsso();
        System.out.println(""+ ave.toString()+"kg");
        ave.botar();
        ave.voar();
    }
    
}
