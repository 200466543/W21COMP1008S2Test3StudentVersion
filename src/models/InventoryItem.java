/*Nathan Goddard 200466543
 */
package models;

public abstract class InventoryItem {

    private int quantityInStock, quantitySold;
    private double purchasePrice, sellingPrice;

    public InventoryItem(double purchasePrice, double sellingPrice, int quantityInStock, int quantitySold)
    {
        setQuantityInStock(quantityInStock);
        this.quantitySold = 0;
        //setQuantitySold(quantitySold);
        setPurchasePrice(purchasePrice);
        setSellingPrice(sellingPrice);
    }


    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0){
            this.quantityInStock = quantityInStock;
        } else {
            throw new IllegalArgumentException("Quantity in stock must be greater than 0.");
        }
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        if (quantityInStock >= quantitySold){
            quantityInStock = quantityInStock - quantitySold;
            this.quantitySold = quantitySold + this.quantitySold;
            //this.quantitySold = quantitySold;
        } else {
            throw new IllegalArgumentException("Quantity in stock must be greater than Quantity Sold.");
        }
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (purchasePrice >= 0){
            this.purchasePrice = purchasePrice;
        } else {
            throw new IllegalArgumentException("Purchase Price must be greater than 0.");
        }
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice > purchasePrice){
            this.sellingPrice = sellingPrice;
        } else {
            throw new IllegalArgumentException("Selling price must be higher than Purchase price.");
        }
    }

    public double getProfit()
    {
        double profit = (sellingPrice - purchasePrice) * quantitySold;

        return profit;
    }
}
