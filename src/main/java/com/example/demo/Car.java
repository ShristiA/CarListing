package com.example.demo;

import com.example.demo.Brand;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Car {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String manufacture;
        private String model;
        private int year;
        private  double msrp;
        @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        public Set<Brand> brands;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public Set<Brand> getBrands() {
        return brands;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }
}

