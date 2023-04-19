package interfacee.entity;

import interfacee.service.ICanSurf;

public class Yasuo implements ICanSurf {
    private String hair;
    private String weapon;

    public Yasuo(String hair, String weapon) {
        this.hair = hair;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Yasuo{" +
                "hair='" + hair + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void surf() {
        System.out.println(toString());
    }
}
