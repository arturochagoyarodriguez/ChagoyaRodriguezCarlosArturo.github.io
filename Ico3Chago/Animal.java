public class Animal {
    private String nombre;
    private String raza;
    private String color;

    public Animal(String nombre, String raza, String color){
        this.nombre=nombre;
        this.raza=raza;
        this.color=color; 
    }
    
    public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getraza() {
        return raza;
    }
    
    public void setraza(String raza) {
        this.raza = raza;
    }

    public String getcolor() {
        return color;
    }
    
    public void setcolor(String color) {
        this.color = color;
    }
    
}