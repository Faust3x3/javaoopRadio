package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int numOfStations) {
        this.maxStation = numOfStations - 1;
    }

    public Radio() {
        this.maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation | newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}