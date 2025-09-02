public class AnimalesTest {
    
    public static void main(String[] args) {
        Animales terre = new Terrestre("Perro", "1.2", "6.7", "4", "Si");
        Animales gat = new Gato("Egipcio", "0.3", "4.2", "4", "Si");

        Animales vola = new Voladores("Mariposa", "0.2", "0.01", "4", "Si");
        Animales agui = new Aguila("Real", "1.3", "2.2", "2", "Si");

        Animales mari = new Marino("Delfin", "2.2", "12", "4", "Si");
        Animales tibu = new Tiburon("Martillo", "1.3", "8.2", "2", "Si");
       

        terre.datosGenerales();// llama método de Animal
        gat.datosGenerales(); // llama método de Mamifero

        vola.datosGenerales(); // llama método de Mamifero
        agui.datosGenerales(); // llama método de Mamifero

        mari.datosGenerales(); // llama método de Mamifero
        tibu.datosGenerales(); // llama método de Mamifero
       
    }
}
