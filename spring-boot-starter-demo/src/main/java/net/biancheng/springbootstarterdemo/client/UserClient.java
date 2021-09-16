package net.biancheng.springbootstarterdemo.client;

import net.biancheng.springbootstarterdemo.config.UserProperties;

public class UserClient {

    private UserProperties userProperties;

    public UserClient(){

    }

    public UserClient(UserProperties p){
        this.userProperties = p;
    }

    public String getName(){
        return this.userProperties.getName();
    }
}
