package org.example.jpa.entities;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        try(var emf = Persistence.createEntityManagerFactory("persistence-unit");
        var em = emf.createEntityManager()){

            em.getTransaction().begin();
            Product p1 = new Product();
            Product p2 = new Product();
            Category c1 = new Category();
            c1.setName("building materials");

            p1.setProductName("bricks");
            p1.setCategory(c1);
            p1.setPrice(7.0);
            p2.setProductName("cement");
            p2.setCategory(c1);
            p2.setPrice(320.0);



            c1.setProducts(Arrays.asList(p1,p2));

            em.persist(c1);
            em.getTransaction().commit();


        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }



    }
}
