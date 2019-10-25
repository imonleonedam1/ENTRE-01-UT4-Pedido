import java.time.LocalDate;
/**
 *  Representa una fecha @autor Ibai Monleón Elía
 */
public class Fecha
{
    private LocalDate date;

    /**
     * Constructor  
     */
    public Fecha(int dia, int mes, int year)    {
        date = LocalDate.of(year, mes, dia);
    }

    /**
     * accesor para el día
     */
    public int getDia() {
        return date.getDayOfMonth();
    }

    /**
     * accesor para el mes
     */
    public int getMes() {
        return date.getMonthValue() ;
    }

    /**
     * accesor para el año
     */
    public int getYear() {
        return date.getYear() ;
    }

    /**
     * devuelve true si la fecha actual es más antigua (va antes) que la
     * recibida como parámetro
     */
    public boolean antesQue(Fecha fecha) {
        return this.date.isBefore(LocalDate.of(fecha.getYear(), fecha.getMes(), fecha.getDia()));
    }

    /**
     * representación textual de la fecha
     */
    public String toString() {
        return date.getDayOfMonth() + "/" + date.getMonthValue() +  "/" + date.getYear();
    }

    /**
     * 
     */
    public void print() {
        System.out.println(this.toString());
    }
}
