package lab5_miguelrojas;

public class Villano extends Super{

    public Villano() {
    }

    public Villano(String nombre, String poder, String debilidad, int fuerza, int agilidad_fisica, int agilidad_mental) {
        super(nombre, poder, debilidad, fuerza, agilidad_fisica, agilidad_mental);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    


    
    
}
