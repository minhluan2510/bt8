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
public class Customer extends Person {

    private String country;

    public Customer(String country, String name, String age, String sex) {
        super(name, age, sex);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String language() {
        switch (getCountry()) {
            case "USA":
                return "English";
            case "VN":
                return "VietNamese";
            case "JP":
                return "Japanese";
            default:
                return "0";
        }
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + "- Sex: " + sex + "- Language: " + language();
    }

}

