package org.java.wishlist;

public class Gift {
    String description;
    String destinatary;

    public Gift(String description, String destinatary) {
        this.description = description;
        this.destinatary = destinatary;
    }

    public String getDescription() {
        return description;
    }

    public String getDestinatary() {
        return destinatary;
    }

    @Override
    public String toString() {
        return
                "description='" + description + '\'' +
                ", destinatary='" + destinatary + '\'' +
                '}';
    }
}

