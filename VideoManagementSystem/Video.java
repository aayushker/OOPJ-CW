package VideoManagementSystem;
import VideoManagementSystem.Video;
// import VideoManagementSystem.VideoLauncher;

public class Video {
    String videoName;
    boolean checkout;
    int rating;

    public String getName(){
        return videoName;
    }

    public void doCheckout(){
        checkout = true;
    }

    public void doReturn(){
        checkout = false;
    }

    public void receiveRating(int rating){
        this.rating = rating;
    }

    public boolean getCheckout(){
        return checkout;
    }

    public int getRating(){
        return rating;
    }

    public static void main(String[] args) {
        VideoLauncher.main(args);
        // Video video = new Video("The Matrix");
        // video.doCheckout();
        // video.doReturn();
        // video.receiveRating(5);
        // System.out.println("Rating: " + video.getRating());
        // System.out.println("Checkout status: " + video.getCheckout());
    }
}
