package br.com.prototype;

import br.com.prototype.entities.FreeVersion;
import br.com.prototype.entities.PaidVersion;
import br.com.prototype.entities.SoftwareVersion;

public class Main {
    public static void main(String[] args) {
        FreeVersion freeVersionOriginal = new FreeVersion();

        System.out.println(freeVersionOriginal);

        SoftwareVersion cloned = freeVersionOriginal.cloneSoftwareVersion();

        System.out.println(cloned);

        PaidVersion paidVersion = new PaidVersion(cloned);

        System.out.println(paidVersion);

    }
}