package n1ejercicio1;

public class NoGenericMethods {

    private int edad;
    private String nombre;
    private double sueldo;

    
    @Override
	public String toString() {
		return "NoGenericMethods [edad=" + edad + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	private NoGenericMethods(Builder builder) {
        this.edad = builder.edad;
        this.nombre = builder.nombre;
        this.sueldo = builder.sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    
    public static class Builder {
        private int edad = 7000;
        private String nombre;
        private double sueldo;

        public Builder() {}

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder sueldo(double sueldo) {
            this.sueldo = sueldo;
            return this;
        }

        public NoGenericMethods build() {
            return new NoGenericMethods(this);
        }
    }
}
    
    
    
 
    
    

    
    
    