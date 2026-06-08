package com.example.lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

    private final CustomerPresenter customerPresenter;
    private final OrderPresenter orderPresenter;

    private final Scanner scanner;

    public View(CustomerPresenter customerPresenter, OrderPresenter orderPresenter) {
        this.customerPresenter = customerPresenter;
        this.orderPresenter = orderPresenter;
        this.scanner = new Scanner(System.in);
    }


    public void start(){
        while(true){
            System.out.println("""
                Список доступных команд:
                1. customer create {name}
                2. customer list
                3. order create {customerId}
                4. order list
                5. order {customerId} order
                6. exit
                """);
            String command = scanner.nextLine();

            if ("exit".equals(command)){
                System.exit(0);
            }

            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];
            String[] args = Arrays.copyOfRange(commandArray, 1, commandArray.length);

            if("customer".equals(commandName)){
                handlerCustomerCommand(args);
            }else if("order".equals(commandName)){
                handlerOrderCommand(args);
            }else {
                // ошибка
            }

        }
    }

    private void handlerCustomerCommand(String[] args){
        if(args.length == 2){
            //создаем кастомера
            String customerName = args[1];
            customerPresenter.create(customerName);

        }else if(args.length == 1 && "list".equals(args[0])){
            //печатаем кастомера
            List<Customer> customers = customerPresenter.getAll();
            System.out.println(customers);
        }else {
            // ошибка
            System.err.println("Wrong number of arguments");
        }
    }

    private void handlerOrderCommand(String[] args){
        if(args.length == 1){
            if("list".equals(args[0])){
                // печатаем список всех заказов
                System.out.println(orderPresenter.getAll());
            } else{
                String customerId = args[0];
                //печатаем все заказы кастомера
                System.out.println(orderPresenter.getByCustomer(customerId));
            }
        }else if(args.length == 2 && "create".equals(args[0])){
            //создаем заказ
            String customerId = args[0];
            orderPresenter.create(customerId);
        }
        else {
            System.err.println("Wrong number of arguments");
        }
    }


}
