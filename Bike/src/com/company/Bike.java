package com.company;

public class Bike {
    private static int id;
    private String manufacturer;
    private String modelName;

    public Bike(String manufacturer, String modelName)
    {
        this.id += ++this.id;
        setManufacturer(manufacturer);
        setModelName(modelName);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void showInfo()
    {
        System.out.println("_______Bike Information___________");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Bike Model: " + getManufacturer() + "\n\n");
    }
}
