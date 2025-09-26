package com.commerce.service;

import com.commerce.models.dto.CartDTO;
import com.commerce.models.entities.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);

}
