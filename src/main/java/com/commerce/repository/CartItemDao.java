package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.models.entities.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
