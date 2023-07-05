public class Radio {

    private int CurrentStation;
    private int CurrentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;


    public Radio() {
        maxStation = 9;
        minStation = 0;
        maxVolume = 100;
        minVolume = 0;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public void nextStation() {
        if (CurrentStation != maxStation) {
            CurrentStation++;
        } else {
            CurrentStation = 0;
        }
    }

    public void previousStation() {
        if (CurrentStation != 0) {
            CurrentStation--;
        } else {
            CurrentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (CurrentVolume != 100) {
            CurrentVolume++;
        } else {
            CurrentVolume = 0;
        }
    }
    public void previousVolume() {
        if (CurrentVolume != 0) {
            CurrentVolume--;
        } else {
            CurrentVolume = 100;
        }
    }

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > maxStation) {
            return;
        }
        this.CurrentStation = currentStation;
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.CurrentVolume = currentVolume;
    }
}


