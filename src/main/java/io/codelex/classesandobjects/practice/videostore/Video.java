package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

class Video {
    private String title;
    private boolean checkedOut;
    private ArrayList<Integer> ratings;

    public Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.ratings = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void returnVideo() {
        this.checkedOut = false;
    }

    public void rate(int rating) {
        this.ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        double sum = 0;
        for (Integer rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }
}
