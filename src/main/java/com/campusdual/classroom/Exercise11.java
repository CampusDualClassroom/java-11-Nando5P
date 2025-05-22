package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Encender la TV
        redRemote.turnOn();
        blackRemote.turnOn();

        // Subir un canal
        redRemote.channelUp();
        blackRemote.channelUp();

        // Bajar un canal
        redRemote.channelDown();
        blackRemote.channelDown();

        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        System.out.println("TvRemote Rojo: ");
        System.out.println("Canal antes de bajar: " + redRemote.channel);
        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("Canal después de bajar: " + redRemote.channel);

        System.out.println("TvRemote Negro: ");
        System.out.println("Canal antes de bajar: " + blackRemote.channel);
        blackRemote.channel = 0;
        blackRemote.channelDown();
        System.out.println("Canal después de bajar: " + blackRemote.channel);

        // Subir el volumen
        redRemote.volumeUp();
        blackRemote.volumeUp();

        // Bajar el volumen
        redRemote.volumeDown();
        blackRemote.volumeDown();

        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        System.out.println("TvRemote Rojo: ");
        System.out.println("Volumen antes de bajar: " + redRemote.volume);
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("Volumen después de bajar: " + redRemote.volume);
        System.out.println("TvRemote Negro: ");
        System.out.println("Volumen antes de bajar: " + blackRemote.volume);
        blackRemote.volume = 0;
        blackRemote.volumeDown();
        System.out.println("Volumen después de bajar: " + blackRemote.volume);

        // Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Apagar la TV
        redRemote.turnOff();
        blackRemote.turnOff();

    }

}