package com.himura.Factory.IDCard;

import com.himura.Factory.framework.Product;


public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("制作了" + owner + "IDCard");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用了" + owner + "IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
