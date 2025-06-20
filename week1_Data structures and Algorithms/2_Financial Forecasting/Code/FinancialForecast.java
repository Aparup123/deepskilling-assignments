import java.util.Arrays;

class FinancialForecast {
    // Recursive method for predicting future financial value.
    public static double predictFutureValue(double currentValue, int year, double avgGrowthRate){
        // Base case
        if(year==0){
            return currentValue;
        }
        // Recursive call for getting previous year value.
        double prevValue=predictFutureValue(currentValue, year-1, avgGrowthRate);
        // Value Calculation
        double futureValue=prevValue*(1+avgGrowthRate);
        return futureValue;
    }

    // Main method.
    public static void main(String[] args) {
        // Past growth rates.
        double[] pastGrowthRates={0.39, 0.12, 0.18, 0.26, 0.104};
        // Calculating average growth rates for previous years.
        double totalRate=0;
        for(double r:pastGrowthRates){
            totalRate+=r;
        }
        double avgGrowthRate=totalRate/pastGrowthRates.length;
        double currentValue=1000;
        int targetYear=4;

        // Printing past growth rates
        System.out.println("Past growth rates: "+ Arrays.toString(pastGrowthRates));

        // Printing financial value after target years.
        System.out.print("Financial value after "+ targetYear +" years will be: ");
        System.out.println(predictFutureValue(currentValue, targetYear, avgGrowthRate));
    }
}
