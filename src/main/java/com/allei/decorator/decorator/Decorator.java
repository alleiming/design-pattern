package com.allei.decorator.decorator;

import com.allei.decorator.Drink;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // TODO Auto-generated method stub
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + drink.getDescription();
    }

}
