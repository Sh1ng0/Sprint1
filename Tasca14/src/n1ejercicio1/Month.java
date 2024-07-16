package n1ejercicio1;

import java.util.ArrayList;

public class Month {

	private ArrayList<String> months;

    public Month() {
        this.months = new ArrayList<>();
        monthList();  // Llama a monthList para inicializar la lista de meses
    }

    public Month(ArrayList<String> months) {
        super();
        this.months = months;
    }

    private void monthList() {
        months.add("Enero");
        months.add("Febrero");
        months.add("Marzo");
        months.add("Abril");
        months.add("Mayo");
        months.add("Junio");
        months.add("Julio");
        months.add("Agosto");
        months.add("Septiembre");
        months.add("Octubre");
        months.add("Noviembre");
        months.add("Diciembre");
    }

    public ArrayList<String> getMonths() {
        return months;
    }

    public void setMonths(ArrayList<String> months) {
        this.months = months;
    }
}