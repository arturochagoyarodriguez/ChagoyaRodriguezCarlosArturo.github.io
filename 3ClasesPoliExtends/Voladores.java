public class Voladores extends Animales{
    private String alas;
    private String vuela;
    
    public Voladores(String especie, String altura, String peso,String alas, String vuela){
        super(especie, altura, peso);
        this.alas = alas;
        this.vuela = vuela;
    }

     public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getVuela() {
        return vuela;
    }

    public void setVuela(String vuela) {
        this.vuela = vuela;
    }
    
    @Override
    public void datosGenerales(){
        System.out.println("VOLADORES \n");
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());

        System.out.println("Alas: "+ alas);
        System.out.println("Vuela: "+ vuela+ "\n");
    }

   
    
}
