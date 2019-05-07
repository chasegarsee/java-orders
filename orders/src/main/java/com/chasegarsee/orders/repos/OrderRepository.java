package com.chasegarsee.orders.repos;

import com.chasegarsee.orders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long>
{
}
