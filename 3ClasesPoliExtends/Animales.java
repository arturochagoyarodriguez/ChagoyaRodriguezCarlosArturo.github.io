public class Animales {
    private String especie;
    private String altura;
    private String peso;

    public Animales(String especie, String altura, String peso){
        this.especie = especie;
        this.altura = altura;
        this.peso = peso;

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }


    public void datosGenerales(){
        System.out.println("Especie: "+ especie);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
    }
}
