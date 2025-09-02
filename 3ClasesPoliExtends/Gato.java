public class Gato extends Terrestre{
    private String ronroneo = "Miauuu";
    
    public Gato(String especie, String altura, String peso,String patas, String camina){
        super(especie, altura, peso, patas, camina);
    }

    
    public String getRonroneo() {
        return ronroneo;
    }

    public void setRonroneo(String ronroneo) {
        this.ronroneo = ronroneo;
    }

    @Override
    public void datosGenerales(){
        System.out.println("GATO \n");
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Altura (mts): "+ getAltura());
        System.out.println("Peso (kg): "+ getPeso());

        System.out.println("Patas: "+ getPatas());
        System.out.println("Camina: "+ getCamina());

        System.out.println("Ronroneo: "+ ronroneo + "\n");

    }

    
}
