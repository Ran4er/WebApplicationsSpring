package ru.aston.dao.impl;

import ru.aston.dao.OrderDAO;
import ru.aston.entity.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Order> getAllOrders() {
        return entityManager.createQuery("SELECT o FROM Order o", Order.class).getResultList();
    }

    @Override
    public Order getOrderById(long id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    @Transactional
    public void addOrder(Order order) {
        entityManager.persist(order);
    }

    @Override
    @Transactional
    public void updateOrder(Order order) {
        entityManager.merge(order);
    }

    @Override
    @Transactional
    public void deleteOrder(long id) {
        Order order = entityManager.find(Order.class, id);
        if (order != null) {
            entityManager.remove(order);
        }
    }
}
