package szoftteszt;

public class Calculator {

  public double Average(int[] numbers) {
    int price = 0;
    double avg;
    /*for (int number : numbers) {
      price += number;
    }*/
    for(int i = 0; i< numbers.length; i++){
        price += numbers[i];
    }
    avg = (double) price / numbers.length;
    double scale = Math.pow(10, 2);
    return Math.round(avg * scale) / scale;
  }

  public double ProjPrice(int landCost, int sell, int yield) {
    double prediction = (double) landCost / (double) (yield * sell);
    double scale = Math.pow(10, 2);
    return Math.round(prediction * scale) / scale;
  }
}
