package com.example.week4daily2homework.model.local.office;

import android.os.Parcel;
import android.os.Parcelable;

public class Office implements Parcelable {
    private String owner;
    private String location;
    private String company;
    private String isWorkDone;

    public Office() {
    }

    public Office(String owner, String location, String company, String isWorkDone) {
        this.owner = owner;
        this.location = location;
        this.company = company;
        this.isWorkDone = isWorkDone;
    }

    protected Office(Parcel in) {
        owner = in.readString();
        location = in.readString();
        company = in.readString();
        isWorkDone = in.readString();
    }

    public static final Creator<Office> CREATOR = new Creator<Office>() {
        @Override
        public Office createFromParcel(Parcel in) {
            return new Office(in);
        }

        @Override
        public Office[] newArray(int size) {
            return new Office[size];
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String isWorkDone() {
        return isWorkDone;
    }

    public void setWorkDone(String workDone) {
        isWorkDone = workDone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(owner);
        dest.writeString(location);
        dest.writeString(company);
        dest.writeString(isWorkDone);
    }
}
