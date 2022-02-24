package SF.Exception.Task1;

class DivisionExc extends Exception {

    double firstNum;
    double secondNum;


    public DivisionExc(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
        return "Результат деления " + String.format("%.2f", firstNum) +
               " на " + String.format("%.2f", secondNum) +
               " меньше 1";
    }
}
