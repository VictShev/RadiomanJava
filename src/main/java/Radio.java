public class Radio {

    private int currentStation;
    private int currentVolume;


    public void nextStation() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void nextVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void previousVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 10;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}


