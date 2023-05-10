package entity;

import handle.ProductHandle;

import java.util.ArrayList;

public class OderDetail {
    private static int autoID;
    private int id;
    private int productID;
    private int quantity;

    public OderDetail() {
    }

    public OderDetail(int productID, int quantity) {
        this.id = ++autoID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {

        return "OderDetail{" +
                "id=" + id +
                ", productID=" + productID +
                ", quantity=" + quantity +
                '}';
    }

    public String printDetailProduct(ArrayList<Product> products){
        ProductHandle handle = new ProductHandle();
        Product product = handle.checkByProductID(products, getProductID());
        return "OderDetail{" +
                "id=" + id +
                ", Product{" + product.getName() +","+ product.getNameBrand()+","+product.getPrice()+'$'+
                "}, quantity=" + quantity +
                '}';
    }
}
