package com.company;

public class ClientImpl extends Client{
    public ClientImpl(KassirMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        System.out.println(this.name +  " : "+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+" получил сообщение : "+msg);
    }

}

