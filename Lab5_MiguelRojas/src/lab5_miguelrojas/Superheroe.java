package lab5_miguelrojas;

public class Superheroe  extends Super{

    public Superheroe() {
    }

    public Superheroe(String nombre, String poder, String debilidad, int fuerza, int agilidad_fisica, int agilidad_mental) {
        super(nombre, poder, debilidad, fuerza, agilidad_fisica, agilidad_mental);
    }

    @Override
    public String toString() {
        return super.getNombre() + ", " +super.getPoder();
    }
  
}
