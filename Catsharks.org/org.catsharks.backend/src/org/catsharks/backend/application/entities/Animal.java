package org.catsharks.backend.application.entities;

/**
 * Superclase encargada de proporcionar metodos para el resto
 * de clases de animales.
 */
public class Animal {
    /**
     * Constante que designa el sexo del animal como masculino.
     */
    public static final int MALE = 0;
    /**
     * Constante que designa el sexo del animal como masculino (String).
     */
    public static final String STR_MALE = "Macho";
    /**
     * Constante que designa el sexo del animal como femenino.
     */
    public static final int FEMALE = 1;
    /**
     * Constante que designa el sexo del animal como femenino (String).
     */
    public static final String STR_FEMALE = "Hembra";
    /**
     * Constante que designa el sexo del animal como Array.
     */
    public static final String[] SEX_SELECTOR = {"Macho", "Hembra"};
    /**
     * Constante que designa si el animal es una mamífero.
     */
    public static final int MAMMAL = 0;
    /**
     * Constante que designa si el animal es una ave.
     */
    public static final int BIRD = 1;
    /**
     * Constante que designa si el animal es un reptil.
     */
    public static final int REPTILE = 2;
    /**
     * Constante que designa si el animal es un anfibio.
     */
    public static final int AMPHIBIAN = 3;
    /**
     * Constante que designa si el animal es un pez.
     */
    public static final int FISH = 4;
    /**
     * Constante que guarda los tipos de animales.
     */
    public static final String[] type = new String[]{"Mamífero", "Ave", "Reptil", "Anfibio", "Pez"};
    /**
     * Atributos del objeto tipo de animal.
     */
    private String animal_type, sex;
    /**
     * Construye una instancia de {@code Animal}.
     */
    public Animal(int animal_t, int s_type) {
        this.animal_type = type[animal_t];
        if (s_type == 0) {
            this.sex = STR_MALE;
        } else if (s_type == 1) {
            this.sex = STR_FEMALE;
        }
    }
    /**
     * Obtiene el tipo de animal.
     *
     * @return el tipo de animal.
     * @see #setAnimal_type(String)
     */
    public String getAnimal_type() {
        return animal_type;
    }
    /**
     * Asigna el tipo de animal.
     *
     * @param animal_type el tipo de animal.
     * @see #getAnimal_type
     */
    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }
    /**
     * Obtiene el sexo del animal.
     *
     * @return el sexo del animal.
     * @see #setSex (String)
     */
    public String getSex() {
        return sex;
    }
    /**
     * Asigna el sexo del animal.
     *
     * @param sex el sexo del animal.
     * @see #getSex()
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append(String.format(">Tipo de animal:          %s %n", this.getAnimal_type()));
        sb.append(String.format(">Sexo:                    %s %n", this.getSex()));
        return sb.toString();
    }
}
