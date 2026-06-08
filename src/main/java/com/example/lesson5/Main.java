package com.example.lesson5;

public class Main {

    public static void main(String[] args) {
        //MVP Model-View-Presenter
        //MVC Model-View-Controller

        // Приложение для управления покупателями и заказами
        // Customer Покупатель(идентификатор, имя)
        // Order Заказ(идентификатор, номер, дата создания, идентификатор покупателя)

        // Пользователь может:
        // 1. Создать нового покупателя
        // 2. Посмотреть список покупателя
        // 3. Создать заказ
        // 4. Посмотреть список заказов
        // 5. Посмотреть заказы покупателя

        CustomerModel customerModel = new CustomerModel();
        OrderModel orderModel = new OrderModel();

        CustomerPresenter customerPresenter = new CustomerPresenter(customerModel);
        OrderPresenter orderPresenter = new OrderPresenter(customerModel, orderModel);
        View view = new View(customerPresenter, orderPresenter);
        view.start();

    }

}
