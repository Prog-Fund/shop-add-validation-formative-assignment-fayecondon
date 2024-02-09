public class Product {

    private String productName = "";
    private int productCode = 5000;
    private double unitCost = Integer.MAX_VALUE;
    private boolean inCurrentProductLine;

    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        setProductCode(productCode);

        if (productName != null){
            if (productName.length() <= 20)
                this.productName = productName;
            else
                this.productName = productName.substring(0,20);
        }

        setUnitCost(unitCost);
        this.inCurrentProductLine = inCurrentProductLine;
    }

    public String getProductName(){
        return productName;
    }

    public double getUnitCost(){
        return unitCost;
    }

    public int getProductCode() {
        return productCode;
    }

    public boolean isInCurrentProductLine() {
        return inCurrentProductLine;
    }

    public void setProductCode(int productCode) {
        if ((productCode >= 1000) && (productCode <= 5000)) {
            this.productCode = productCode;
        }
    }

    public void setProductName(String productName) {
        if (productName != null){
            if (productName.length() <= 20) {
                this.productName = productName;
            }
        }
    }
