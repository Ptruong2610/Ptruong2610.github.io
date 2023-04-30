package entity;

public class Oder{
    private static int autoID;
    private int id;
    private Product product;
    private int amount;
    private String customerName;
    private String address;
    private String phone;

    public Oder(Product product, String customerName, String address, String phone) {
        this.id = ++autoID;
        this.product = product;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return (product.getNumber()* product.getPrice());
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


    @Override
    public String toString() {
        return "Oder{" +
                "id=" + id +
                "," + product +
                ", amount=" + getAmount() +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
