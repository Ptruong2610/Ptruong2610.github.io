package entity;

import handle.ProductHandle;

import java.util.ArrayList;

public class Oder {
    private static int autoID;
    private int id;
    private int userID;
    ArrayList<OderDetail> oderDetails;
    private String nameCustomer;
    private String address;
    private String phone;
    private String status;

    public ArrayList<OderDetail> getOderDetails() {
        return oderDetails;
    }

    public Oder(int userID, ArrayList<OderDetail> oderDetails, String nameCustomer, String address, String phone, String status) {
        this.id = ++autoID;
        this.userID = userID;
        this.oderDetails = oderDetails;
        this.nameCustomer = nameCustomer;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userID=" + userID +
                ", orderDetails=" + oderDetails +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", status='" + status + '\'' +
                '}';
    }
    public String printOder(ArrayList<Product> products){
//        ProductHandle handle = new ProductHandle();
//
//        for (OderDetail oderdetail:oderDetails
//             ) {
//            Product product = handle.checkByProductID(products, oderdetail.getProductID());
            return "Order{" +
                    "id=" + id +
                    ", userID=" + userID +
                    ", nameCustomer='" + nameCustomer + '\'' +
                    ", address='" + address + '\'' +
                    ", phone=" + phone +
                    ", status='" + status + '\''+
                    " - ";
//        }
    }
}
