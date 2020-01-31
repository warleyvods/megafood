package com.delivery.megafood.domain.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Away {

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {
        try {
            Calendar dtEntrada = Calendar.getInstance();
            Calendar dtSaidaAlmoco = Calendar.getInstance();
            Calendar dtEntradaPosAlmoco = Calendar.getInstance();
            Calendar dtSaida = Calendar.getInstance();
            Scanner scanner = new Scanner(System.in);

            System.out.print("As horas devem ser informadas no formato HH:mm");

            System.out.print("Hora de chegada: ");
            dtEntrada.setTime(FORMAT.parse(scanner.next()));

            System.out.print("Hora de saída para o almoço: ");
            dtSaidaAlmoco.setTime(FORMAT.parse(scanner.next()));

            System.out.print("Hora volta do almoço: ");
            dtEntradaPosAlmoco.setTime(FORMAT.parse(scanner.next()));

            System.out.print("Data saída: ");
            dtSaida.setTime(FORMAT.parse(scanner.next()));

            Long difMilli = dtSaidaAlmoco.getTimeInMillis() - dtEntrada.getTimeInMillis();

            Hora hr = getDif(difMilli);

            difMilli = dtSaida.getTimeInMillis() - dtEntradaPosAlmoco.getTimeInMillis();
            Hora hr1 = getDif(difMilli);

            Calendar calendar = hr.t(hr1);

            System.out.println(FORMAT.format(calendar.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static Hora getDif(long difMilli) {
        int timeInSeconds = (int) difMilli / 1000;
        int hours, minutes, seconds;
        hours = timeInSeconds / 3600;
        timeInSeconds = timeInSeconds - (hours * 3600);
        minutes = timeInSeconds / 60;
        timeInSeconds = timeInSeconds - (minutes * 60);
        seconds = timeInSeconds;

        Hora hora = new Hora(hours, minutes, seconds);
        return hora;
    }

}

