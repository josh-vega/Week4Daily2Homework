package com.example.week4daily2homework.model.local.home;

import android.os.Parcel;
import android.os.Parcelable;

public class Home implements Parcelable {
    private String owner;
    private String location;
    private String residents;
    private String forRent;

    public Home() {
    }

    public Home(String owner, String location, String residents, String forRent) {
        this.owner = owner;
        this.location = location;
        this.residents = residents;
        this.forRent = forRent;
    }

    protected Home(Parcel in) {
        owner = in.readString();
        location = in.readString();
        residents = in.readString();
        forRent = in.readString();
    }

    public static final Creator<Home> CREATOR = new Creator<Home>() {
        @Override
        public Home createFromParcel(Parcel in) {
            return new Home(in);
        }

        @Override
        public Home[] newArray(int size) {
            return new Home[size];
        }
    };

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResidents() {
        return residents;
    }

    public void setResidents(String residents) {
        this.residents = residents;
    }

    public String isForRent() {
        return forRent;
    }

    public void setForRent(String forRent) {
        this.forRent = forRent;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(owner);
        dest.writeString(location);
        dest.writeString(residents);
        dest.writeString (forRent);
    }
}
