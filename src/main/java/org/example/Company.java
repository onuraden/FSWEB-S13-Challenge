package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String [] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if(giro<0){
            System.out.println("Giro never below 0. Please check!");
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index " + index + " is out of bounds for developerNames.");
        } else if (developerNames[index] != null) {
            System.out.println("Index " + index + " is already occupied by: " + developerNames[index]);
        } else {
            developerNames[index] = name;
            System.out.println("Employee added at index " + index + ": " + name);
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
