package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AdminHistory {
    private static int autoID;
    private int id;
    private Oder oder;
    private String confirmTime;

    public AdminHistory(Oder oder) {
        this.id = ++autoID;
        this.oder = oder;
        LocalDateTime currentTime  = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.confirmTime = currentTime .format(formatter);
    }
    @Override
    public String toString() {
        return "AdminHistory{" +
                "id=" + id +
                ", oder=" + oder +
                ", confirmTime=" + confirmTime +
                '}';
    }
}

