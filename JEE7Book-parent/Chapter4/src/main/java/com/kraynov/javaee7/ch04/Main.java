package com.kraynov.javaee7.ch04;

import com.kraynov.javaee7.ch04.entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        // Создает экземпляр Book
        Book book = new Book("H2G2", "Автостопом по Галактике", 12.5F, "1-84023-742-2", 354, false);
        // Получает EntityManager и транзакцию
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager em = emf.createEntityManager();
        // Обеспечивает постоянство Book в базе данных
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();
        // Закрывает EntityManager и EntityManagerFactory
        em.close();
        emf.close();
    }
}
