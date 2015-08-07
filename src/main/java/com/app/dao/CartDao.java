package com.app.dao;

import com.app.domain.Cart;

import java.util.List;
import java.util.Set;

/**
 * Created by user on 8/7/2015.
 */
public interface CartDao
{
    public Set<Cart> findAll();
    public Cart findById(Long cartId);
    public void addCart(Cart cart);
    public void editCart(Cart cart, Long cartId);
    public void removeCart(Long cartId);
}
