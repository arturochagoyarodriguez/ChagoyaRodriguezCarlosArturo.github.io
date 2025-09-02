public class Marino extends Animales{
    private String aletas;
    private String nada;
    
    public Marino(String especie, String altura, String peso,String aletas, String nada){
        super(especie, altura, peso);
        this.aletas = aletas;
        this.nada = nada;
    }

    
     public String getAletas() {
        return aletas;
    }

    public void setAletas(String aletas) {
        this.aletas = aletas;
    }

    public String getNada() {
        return nada;
    }

    public void setNada(String nada) {
        this.nada = nada;
    }

    @Override
    public void datosGenerales(){
        System.out.println("MARINOS \n");
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());

        System.out.println("Aletas: "+ aletas);
        System.out.println("Nada: "+ nada + "\n");
    }

   
    
}
