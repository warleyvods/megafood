package com.delivery.megafood.domain.util;

import java.util.Calendar;

class Hora {

    int hour;
    int minute;
    int second;

    public Hora(int hours, int minutes, int seconds) {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }

    public Calendar t(Hora hora) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, second);

        c.add(Calendar.HOUR_OF_DAY, hora.hour);
        c.add(Calendar.MINUTE, hora.minute);
        c.add(Calendar.SECOND, hora.second);
        return c;
    }

}
