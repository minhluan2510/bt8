/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

/**
 *
 * @author luanq
 */
import java.util.List;
import java.util.Objects;

public class Order {

    private String orderId;
    private String dateCreated;
    private Customer customer;
    private List<Product> listProduct;

    public Order(String orderId, String dateCreated, Customer customer, List<Product> listProduct) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.customer = customer;
        this.listProduct = listProduct;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void addProduct(Product product) {
        this.listProduct.add(product);
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Date Created: " + dateCreated + ", Customer: " + customer.toString() + ", Products: " + listProduct.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.orderId, other.orderId)) {
            return false;
        }
        return true;
    }
    
}