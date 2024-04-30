package VideoManagementSystem;
// import VideoManagementSystem.Video;
import java.util.ArrayList;
public class VideoStore {
    ArrayList<Video> videos = new ArrayList<Video>(); // Declare the videos variable at the class level

    // Move method declarations outside of the main method
    void addVideo(String name) {
        Video video = new Video();
        videos.add(video);
    }

    void doCheckout(String name) {
        for (Video video : videos) {
            if (video.getName().equals(name)) {
                video.doCheckout();
                return;
            }
        }
    }

    void doReturn(String name) {
        for (Video video : videos) {
            if (video.getName().equals(name)) {
                video.doReturn();
                return;
            }
        }
    }

    void receiveRating(String name, int rating) {
        for (Video video : videos) {
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
                return;
            }
        }
    }

    void listInventory() {
        System.out.printf("%s\t%s\t%s\t%s\n", "Video Name", "Checkout Status", "Rating", "Check Out Count");
        for (Video video : videos) {
            System.out.printf("%s\t%s\t%s\t%s\n", video.getName(), video.getCheckout(), video.getRating());
        }
    }

    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore(); // Create an instance of VideoStore
        videoStore.addVideo("The Matrix"); // Add videos using the addVideo method
        videoStore.addVideo("Godfather II");
        videoStore.addVideo("Star Wars Episode IV: A New Hope");
    }
    
}
