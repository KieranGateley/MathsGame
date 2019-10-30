package xyz.fluxinc.MathsGame.calculations;

public class AdditionCalculation extends Calculation {

    public AdditionCalculation(double variable1, double variable2) {
        super(variable1, variable2);
    }

    @Override
    public double getResult() {
        return this.getVariable1() + this.getVariable2();
    }

    @Override
    public String toString() {
        return this.getVariable1() +  " + " + this.getVariable2();
    }
}