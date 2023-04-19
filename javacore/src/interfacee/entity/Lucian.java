package interfacee.entity;

import interfacee.service.ICanShoot;
import interfacee.service.ICanSurf;

public class Lucian implements ICanSurf,ICanShoot {
    private String hair;
    private String weapon;

    public Lucian(String hair, String weapon) {
        this.hair = hair;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Lucian{" +
                "hair='" + hair + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void shoot() {
        System.out.println("bắn");
    }

    @Override
    public void surf() {
        System.out.println("lướt");
    }
}
