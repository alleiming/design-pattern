package com.allei.decorator;


import com.allei.decorator.coffee.Decaf;
import com.allei.decorator.coffee.LongBlack;
import com.allei.decorator.decorator.Chocolate;
import com.allei.decorator.decorator.Milk;

public class CoffeeMain {

    public static void main(String[] args) {

        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());

        System.out.println("****************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());

    }

}
