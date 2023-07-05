public class Radio {

    private int CurrentStation;
    private int CurrentVolume;


    public void nextStation() {
        if (CurrentStation != 9) {
            CurrentStation++;
        } else {
            CurrentStation = 0;
        }
    }

    public void previousStation() {
        if (CurrentStation != 0) {
            CurrentStation--;
        } else {
            CurrentStation = 9;
        }
    }

    public void nextVolume() {
        if (CurrentVolume != 10) {
            CurrentVolume++;
        } else {
            CurrentVolume = 0;
        }
    }

    public void previousVolume() {
        if (CurrentVolume != 0) {
            CurrentVolume--;
        } else {
            CurrentVolume = 10;
        }
    }

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
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
        if (CurrentVolume > 10) {
            return;
        }
        this.CurrentVolume = currentVolume;
    }
}


