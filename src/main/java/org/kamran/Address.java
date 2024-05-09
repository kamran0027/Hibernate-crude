package org.kamran;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "student_addres")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Addres_Id")
    private int addressId;
    @Column(length = 50,name = "STREET")
    private String street;
    @Column(length = 100,name = "CITY")
    private String city;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    //for image
    private byte[] image;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Address() {
        super();
    }

    public Address(int addressId, String street, String city, Date addedDate, byte[] image) {
        super();
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.addedDate = addedDate;
        this.image = image;
    }
}
