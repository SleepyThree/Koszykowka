package com.example.lebronjames;

import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    private int punkty;
    public void addPunkty(int p){
        punkty+=p;
    }
}
