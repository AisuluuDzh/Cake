package com.company;

import java.util.concurrent.Callable;

public class KassirClient
{

    public static void main(String[] args) {
        KassirMediator mediator = new KassirMediatorImpl();
        Client user1 = new ClientImpl(mediator, "Backerei");
        Client user2 = new ClientImpl(mediator, "Aisuluu");
        Client user3 = new ClientImpl(mediator, "Jama");
        Client user4 = new ClientImpl(mediator, "Nurs");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Bestellung von Client");

    }

}