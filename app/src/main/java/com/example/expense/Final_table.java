package com.example.expense;

public class Final_table {
    private String ID = "fid";
    private String FOOD_NAME = "Food_Item";
    private String PER_PLATE = "Per_cost";

    private String DAILY_DATE = "daily_date";
    private String PLATE_COUNT = "Count";
    private String TOTAL_COST = "total";

    public Final_table() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFOOD_NAME() {
        return FOOD_NAME;
    }

    public void setFOOD_NAME(String FOOD_NAME) {
        this.FOOD_NAME = FOOD_NAME;
    }

    public String getPER_PLATE() {
        return PER_PLATE;
    }

    public void setPER_PLATE(String PER_PLATE) {
        this.PER_PLATE = PER_PLATE;
    }

    public String getDAILY_DATE() {
        return DAILY_DATE;
    }

    public void setDAILY_DATE(String DAILY_DATE) {
        this.DAILY_DATE = DAILY_DATE;
    }

    public String getPLATE_COUNT() {
        return PLATE_COUNT;
    }

    public void setPLATE_COUNT(String PLATE_COUNT) {
        this.PLATE_COUNT = PLATE_COUNT;
    }

    public String getTOTAL_COST() {
        return TOTAL_COST;
    }

    public void setTOTAL_COST(String TOTAL_COST) {
        this.TOTAL_COST = TOTAL_COST;
    }

    @Override
    public String toString() {
        return "Final_table{" +
                "ID='" + ID + '\'' +
                ", FOOD_NAME='" + FOOD_NAME + '\'' +
                ", PER_PLATE='" + PER_PLATE + '\'' +
                ", DAILY_DATE='" + DAILY_DATE + '\'' +
                ", PLATE_COUNT='" + PLATE_COUNT + '\'' +
                ", TOTAL_COST='" + TOTAL_COST + '\'' +
                '}';
    }
}