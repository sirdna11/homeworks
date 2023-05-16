package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

class VideoStore {
    private ArrayList<Video> videos;

    public VideoStore() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(String title) {
        videos.add(new Video(title));
    }

    public Video getVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        return null;
    }

    public void checkOut(String title) {
        Video video = getVideo(title);
        if (video != null) {
            video.checkOut();
        }
    }

    public void returnVideo(String title) {
        Video video = getVideo(title);
        if (video != null) {
            video.returnVideo();
        }
    }

    public void rateVideo(String title, int rating) {
        Video video = getVideo(title);
        if (video != null) {
            video.rate(rating);
        }
    }

    public void listInventory() {
        for (Video video : videos) {
            System.out.println("Title: " + video.getTitle() + ", Average Rating: " + video.getAverageRating() + ", Checked Out: " + video.isCheckedOut());
        }
    }
}
