public class TaxCalculator {
    private final int range1 = 145000;
    private final int range2 = 250000;
    private final int range3 = 325000;
    private final int range4 = 750000;

    public double getRangeTax(double purchasePrice, double rate, int range) {
            return rate * (purchasePrice-range);
    }

    public double calculateTaxByPurchasePrice(double purchasePrice){
        double wholeRange2Tax = getRangeTax(range2,0.02,range1);
        double wholeRange3Tax = getRangeTax(range3,0.05,range2);
        double wholeRange4Tax = getRangeTax(range4,0.1,range3);

        if (purchasePrice >= 0 && purchasePrice <= range1){
            return getRangeTax(purchasePrice,0,0);
        }
        if (purchasePrice > range1 && purchasePrice <= range2){
            return getRangeTax(purchasePrice,0.02,range1);
        }
        if (purchasePrice > range2 && purchasePrice <= range3){
            double range3Tax = getRangeTax(purchasePrice,0.05,range2);
            return wholeRange2Tax + range3Tax;
        }
        if (purchasePrice > range3 && purchasePrice <= range4){
            double range4Tax = getRangeTax(purchasePrice,0.1,range3);
            return wholeRange2Tax + wholeRange3Tax + range4Tax;
        }
        if (purchasePrice > range4){
            double range5Tax = getRangeTax(purchasePrice,0.12,range4);

            return wholeRange2Tax + wholeRange3Tax + wholeRange4Tax + range5Tax;
        }
        throw new IllegalArgumentException("Input not valid!");
    }

    public TaxCalculator() {
    }
}
