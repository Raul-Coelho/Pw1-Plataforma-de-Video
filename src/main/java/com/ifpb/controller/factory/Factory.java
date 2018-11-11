package com.ifpb.controller.factory;

import com.ifpb.model.interfaces.FactoryDAO;

public class Factory {

    public static FactoryDAO createFactory(){
        return new FactoryDB();
    }
}
