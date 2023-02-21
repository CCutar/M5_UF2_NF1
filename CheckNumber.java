public class CheckNumber { // Especificamos la clase
    private double number;

    public CheckNumber(double num) { //
        this.number = num;
    }

    public double comprovaSigne() {
        double status;
        if (this.number < 0)
            status = -1;
        else if (this.number == 0)
            status = 0;
        else
            status = 1;
        return status;
    }
}
