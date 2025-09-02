public class Terrestre extends  Animales{

    private String patas;
    private String camina;
    
    public Terrestre(String especie, String altura, String peso,String patas, String camina){
        super(especie, altura, peso);
        this.patas = patas;
        this.camina = camina;
    }

    public String getPatas() {
        return patas;
    }

    public void setPatas(String patas) {
        this.patas = patas;
    }

    public String getCamina() {
        return camina;
    }

    public void setCamina(String camina) {
        this.camina = camina;
    }

    @Override
    public void datosGenerales(){
        System.out.println("ANIMAL TERRESTRE \n");
        System.out.println("Especie: "+ getEspecie());
        System.out.println("Altura (mts): "+ getAltura());
        System.out.println("Peso (kg): "+ getPeso());

        System.out.println("Patas: "+ patas);
        System.out.println("Camina: "+ camina + "\n");
    }

    
}
