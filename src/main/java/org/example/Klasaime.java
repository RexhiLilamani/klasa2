package org.example;

public class Klasaime {
    public static void(String[] args) {
        String[] participantList = new String[15];
        participantList[0] = "Louis Kennedy";
        participantList[1] = "Blake Baker";
        participantList[2] = "Jacob Campbell";
        participantList[3] = "Arthur Green";
        participantList[4] = "Caleb Willis";
        participantList[5] = "Heath Rasmussen";
        participantList[6] = "Lara Malinowska";
        participantList[7] = "Kase Knapp";
        participantList[8] = "Avery Livingston";
        participantList[9] = "Armando Zamora";
        participantList[10] = "Skye Hunt";
        participantList[11] = "Gale Carr";
        participantList[12] = "Gabe Collins";
        participantList[13] = "Mel Pruitt";
        participantList[14] = "Jess Owen";

        for (int i = 0; participantList.length > i; i++ ) {
            System.out.println("Participant nr " + i + " is " + participantList[i]);
        }
    }
}