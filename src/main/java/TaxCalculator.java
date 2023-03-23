public class TaxCalculator {
    private final int range1 = 145000;
    private final int range2 = 250000;
    private final int range3 = 325000;
    private final int range4 = 750000;

    public double getRange1Tax(double purchasePrice) {
        double rate1 = 0;
        return rate1 * purchasePrice;
    }
    public double getRange2Tax(double purchasePrice) {
        double rate2 = 0.02;
        return rate2 * (purchasePrice - range1);
    }
    public double getRange3Tax(double purchasePrice) {
        double rate3 = 0.05;
        return rate3 * (purchasePrice - range2);
    }
    public double getRange4Tax(double purchasePrice) {
        double rate4 = 0.1;
        return rate4 * (purchasePrice - range3);
    }
    public double getRange5Tax(double purchasePrice) {
        double rate5 = 0.12;
        return rate5 * (purchasePrice - range4);
    }

    public double calculateTaxByPurchasePrice(double purchasePrice){
        if (purchasePrice >= 0 && purchasePrice <= range1){
            return getRange1Tax(purchasePrice);
        }
        if (purchasePrice > range1 && purchasePrice <= range2){
            return getRange1Tax(range1) + getRange2Tax(purchasePrice);
        }
        if (purchasePrice > range2 && purchasePrice <= range3){
            return getRange1Tax(range1) + getRange2Tax(range2) + getRange3Tax(purchasePrice);
        }
        if (purchasePrice > range3 && purchasePrice <= range4){
            return getRange1Tax(range1) + getRange2Tax(range2) + getRange3Tax(range3) + getRange4Tax(purchasePrice);
        }
        if (purchasePrice > range4){
            return getRange1Tax(range1) + getRange2Tax(range2) + getRange3Tax(range3) + getRange4Tax(range4) + getRange5Tax(purchasePrice);
        }
        throw new IllegalArgumentException("Input not valid!");
    }

    public TaxCalculator() {
    }
}
