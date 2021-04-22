/*Nathan Goddard 200466543
 */
package models;

import Utilities.DBUtility;

public class Skis extends InventoryItem{
    private String brand, model;
    private int length;

    //Again the constructor needed quantitySold to be added as inheriting from the super requires 4 arguments
    public Skis(String brand, String model, int length, double purchasePrice, double sellingPrice, int quantityInStock, int quantitySold) {
        super(purchasePrice, sellingPrice, quantityInStock, quantitySold);
        setBrand(brand);
        setModel(model);
        setLength(length);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 60 && length <= 220){
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 60 and 220.");
        }
    }
}
