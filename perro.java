public class perro {
    //declaracion de atributos o cambios de variable
    private String nombre;
    private String ladrido = "Woof";
    private String raza;
    private double peso;
    
    // Primer constructor (sin ladrido)
    public perro(String nombre, String raza, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
       
    }
    
    // Segundo constructor 
    public perro(String nombre, String raza, double peso, String ladrido) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.ladrido = ladrido;
    }
    
    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    } 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getLadrido() {
        return ladrido;
    }
    
    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }
}