package ru.cherkasov.SecondLab.model;

public enum Systems {
    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System");

    private String description;

    Systems(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

