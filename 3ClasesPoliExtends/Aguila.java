public class Aguila extends Voladores{
           private String aguila = "poderoza";
    
    public Aguila(String especie, String altura, String peso,String alas, String vuela){
        super(especie, altura, peso, alas, vuela);
    }

    public String getAguila() {
        return aguila;
    }

    public void setAguila(String aguila) {
        this.aguila = aguila;
    }
    
    @Override
    public void datosGenerales(){
         System.out.println("AGUILA \n");
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Peso: "+ getPeso());

         System.out.println("Alas: "+ getAlas());
        System.out.println("Vuela: "+ getVuela());

        System.out.println("Aguilaaa: "+ aguila + "\n");

    }

    
}
