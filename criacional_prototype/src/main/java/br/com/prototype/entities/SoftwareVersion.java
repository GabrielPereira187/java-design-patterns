package br.com.prototype.entities;

import java.util.List;

public class SoftwareVersion {
    private String name;
    private List<String> availableFunctionalities;


    public SoftwareVersion(String name, List<String> availableFunctionalities) {
        this.name = name;
        this.availableFunctionalities = availableFunctionalities;
    }

    public String getName() {
        return name;
    }

    public List<String> getAvailableFunctionalities() {
        return availableFunctionalities;
    }

    public void addFunctionality(String functionality) {
        this.availableFunctionalities.add(functionality);
    }

}
