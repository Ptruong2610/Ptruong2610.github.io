package entity;

public class Oder {
    private static int autoID;
    private int id;
    private int userID;
    private String nameProduct;
    private int numberBuy;
    private int priceProduct;
    private int amount;
    private String customerName;
    private String address;
    private String phone;
    private String status;

    public Oder(int userID, String nameProduct, int numberBuy, int priceProduct, String customerName, String address, String phone, String status) {
        this.id = ++autoID;
        this.userID = userID;
        this.nameProduct = nameProduct;
        this.numberBuy = numberBuy;
        this.priceProduct = priceProduct;
        this.customerName = customerName;
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

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getNumberBuy() {
        return numberBuy;
    }

    public void setNumberBuy(int numberBuy) {
        this.numberBuy = numberBuy;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getAmount() {
        return (getNumberBuy()*getPriceProduct());
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Oder{" +
                "id=" + id +
                ", userID=" + userID +
                ", nameProduct='" + nameProduct + '\'' +
                ", numberBuy=" + numberBuy +
                ", priceProduct=" + priceProduct +
                ", amount=" + getAmount() +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
