package szoftteszt;

public class Calculator {

    public int Average(int[] numbers){
        int price = 0;
        int avg;
        for(int i = 0; i< numbers.length; i++){
            price += numbers[i];
        }
        avg = price/numbers.length;
        return avg;
    }

    public double CalcPrice(int landCost, int sell, int yield){
        double prediction =  (double)landCost/(double)(yield*sell);
        double scale = Math.pow(10, 2);
        return Math.round(prediction * scale) / scale;
    }
}
