package com.util;

import lombok.Data;

/**
 * @ClassName Pizza
 * @Description
 * @Author xiangshuailong
 * @Date 2021/1/29 14:26
 * @Version 1.0
 **/
@Data
public class Pizza {

    private PizzaStatus status;
    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public boolean isDeliverable() {
        return getStatus() == PizzaStatus.READY;
    }

    public static void main(String[] args) {
        System.out.println(new Pizza().isDeliverable());
        Pizza.PizzaStatus pizza = null;
//        System.out.println(pizza.equals(Pizza.PizzaStatus.DELIVERED));//空指针异常
        System.out.println(pizza == Pizza.PizzaStatus.DELIVERED);//正常运行
    }

}
