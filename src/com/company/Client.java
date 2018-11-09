package com.company;

public abstract class Client {
    protected KassirMediator mediator;
    protected String name;

    public Client(KassirMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
