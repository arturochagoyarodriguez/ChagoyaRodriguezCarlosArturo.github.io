public class Tiburon extends Marino{
       private String tiburoncin = "jujaja";
    
    public Tiburon(String especie, String altura, String peso,String aletas, String nada){
        super(especie, altura, peso, aletas, nada);
    }

    public String getTiburoncin() {
        return tiburoncin;
    }

    public void setTiburoncin(String tiburoncin) {
        this.tiburoncin = tiburoncin;
    }

    @Override
    public void datosGenerales(){
        System.out.println("TIBURON \n");
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());

        System.out.println("Aletas: "+ getAletas());
        System.out.println("Nada: "+ getNada());

        System.out.println("Tiburonciiin: "+ tiburoncin+ "\n");

    }

    
}
