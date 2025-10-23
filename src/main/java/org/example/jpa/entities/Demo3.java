package org.example.jpa.entities;

import jakarta.persistence.Persistence;

public class Demo3 {

    public static void main(String[] args) {
        try(var emf = Persistence.createEntityManagerFactory("persistence-unit");
        var em = emf.createEntityManager()){
            em.getTransaction().begin();



        }
    }
}
