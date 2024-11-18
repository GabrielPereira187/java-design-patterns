package br.com.prototype.entities;

import br.com.prototype.interfaces.Prototype;

import java.util.Arrays;
import java.util.List;

public class FreeVersion extends SoftwareVersion implements Prototype {

    private static final String DEFAULT_NAME = "Free Version";
    private static final List<String> DEFAULT_FUNCTIONALITIES = Arrays.asList("Picture editing", "Simple Designing");

    public FreeVersion() {
        this(DEFAULT_NAME, DEFAULT_FUNCTIONALITIES);
    }

    public FreeVersion(String name, List<String> availableFunctionalities) {
        super(name, availableFunctionalities);
    }

    @Override
    public SoftwareVersion cloneSoftwareVersion() {
        return new FreeVersion(this.getName(),
                List.copyOf(this.getAvailableFunctionalities()));
    }

    @Override
    public String toString() {
        return "FreeVersion{" +
                "name='" + getName() + '\'' +
                ", functionalities=" + getAvailableFunctionalities() +
                '}';
    }
}
