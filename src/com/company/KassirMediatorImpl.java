package com.company;
import java.util.ArrayList;
import java.util.List;

public class KassirMediatorImpl implements KassirMediator {
    private List<Client> users;

    public KassirMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(Client user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, Client user) {
        for(Client u : this.users){
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
