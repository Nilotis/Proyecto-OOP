package org.catsharks.backend.application.entities;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code Mammal}.
 */
public class Mammal extends Animal{
    /**
     * Define el tipo de andar del {@code Mammal}.
     */
    private boolean biped;

    /**
     * Construye una instancia de {@code Mammal}.
     */
    public Mammal(int s_type, boolean biped) {
        super(MAMMAL, s_type);
        this.setBiped(biped);
    }

    /**
     * Obtiene el tipo de andar del mamífero.
     * @return    el tipo de andar.
     * @see       #setBiped(boolean)
     */
    public boolean isBiped() {
        return biped;
    }

    /**
     * Asigna el tipo de andar del mamífero.
     * @param biped el tipo de andar.
     * @see      #isBiped()
     */
    public void setBiped(boolean biped) {
        this.biped = biped;
    }

    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString(){
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Bípedo:                  %s %n", this.isBiped()));
        return sb.toString();
    }
}
