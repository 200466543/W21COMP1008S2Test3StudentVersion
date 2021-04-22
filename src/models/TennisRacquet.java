/*Nathan Goddard 200466543
 */
package models;

import Utilities.DBUtility;

public class TennisRacquet extends InventoryItem {
    private double weight;  //240-310
    private String headSize; //midsize, midplus, oversize, super oversize
    private String brand; //Head, Babolat, Dunlop, Yonex
    private String model;


    //Your original constructor did not include the quantitySold value inherited from the inventory item class, so I had to add it
    public TennisRacquet(String brand, String model, double weight, String headSize, double purchasePrice, double sellingPrice, int quantityInStock, int quantitySold) {
        super(purchasePrice, sellingPrice, quantityInStock, quantitySold);
        setWeight(weight);
        setHeadSize(headSize);
        setBrand(brand);
        setModel(model);
    }

    /*public TennisRacquet(String brand, String model, double weight, String headSize, double purchasePrice, double sellingPrice, int quantityInStock) {
    }*/

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 240 && weight <= 310){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be between 240 and 310.");
        }
    }

    public String getHeadSize() {
        return headSize;
    }

    public void setHeadSize(String headSize) {
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
}
