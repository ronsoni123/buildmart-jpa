package org.example.jpa.entities;


import jakarta.persistence.Persistence;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        try(var emf = Persistence.createEntityManagerFactory("persistence-unit");
        var em = emf.createEntityManager()){

            em.getTransaction().begin();
            Customer customer = new Customer();
            customer.setName("Rounak Soni");
            customer.setMobile_no("123456789");
            Address a1 = new Address();
            a1.setAddressLine1("A1");
            a1.setAddressLine2("saket nagar 1");
            a1.setCity("Patna");
            a1.setPincode("456789");
            a1.setCustomer(customer);
            Address a2 = new Address();
            a2.setAddressLine1("A2");
            a2.setAddressLine2("saket nagar 2");
            a2.setCity("Patna");
            a2.setPincode("456789");
            a2.setCustomer(customer);
            customer.setAddresses(Arrays.asList(a1,a2));

            em.persist(customer);

            em.getTransaction().commit();

        }
    }
}
