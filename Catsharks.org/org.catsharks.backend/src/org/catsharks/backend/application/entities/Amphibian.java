package org.catsharks.backend.application.entities;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code Amphibian}.
 */
public class Amphibian extends Animal{

    /**
     * Atributo que designa si el {@code Amphibian} es venenoso.
     */
    private boolean poisonous;
    /**
     * Construye una instancia de {@code Amphibian}.
     */
    public Amphibian(int s_type, boolean poisonous) {
        super(AMPHIBIAN, s_type);
        this.setPoisonous(poisonous);
    }
    /**
     * Obtiene si es venenoso o no.
     * @return    el tipo de venenoso.
     * @see       #setPoisonous(boolean)
     */
    public boolean isPoisonous() {
        return poisonous;
    }
    /**
     * Asigna si es venenoso o no.
     * @param poisonous el tipo de venenoso.
     * @see      #isPoisonous()
     */
    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }
    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString(){
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Venenoso:               %s %n", this.isPoisonous()));
        return sb.toString();
    }
}
