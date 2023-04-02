package org.example.productkatalog;

import java.util.UUID;

public class Product {
    private final String uuid;
    private final String name;
    private final String desc;

    public Product(UUID uuid,String name, String desc){
        this.uuid = uuid.toString();
        this.name = name;
        this.desc = desc;
    }

    public String getID(){return uuid;}
    public UUID getUUID(){return UUID.fromString(uuid);}
}