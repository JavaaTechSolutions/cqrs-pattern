package com.jtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtc.entity.OrderDetails;

@Repository
public interface OrderQueryDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
