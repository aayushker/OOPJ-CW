package VideoManagementSystem;

import java.util.Scanner;
import VideoManagementSystem.VideoStore;
import VideoManagementSystem.Video;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1. Add Videos:");
        System.out.println("2. Check Out Video:");
        System.out.println("3. Return Video:");
        System.out.println("4. Receive Rating:");
        System.out.println("5. List Inventory:");
        System.out.println("6. Exit:");
        System.out.println("Enter your choice (1..6):");

        VideoStore videoStore = new VideoStore();
        while (true) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the video you want to add:");
                    sc.nextLine();
                    String videoName = sc.nextLine();
                    videoStore.addVideo(videoName);
                    break;
                case 2:
                    System.out.println("Enter the name of the video you want to check out:");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    videoStore.doCheckout(videoName);
                    break;
                case 3:
                    System.out.println("Enter the name of the video you want to return:");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    videoStore.doReturn(videoName);
                    break;
                case 4:
                    System.out.println("Enter the name of the video you want to rate:");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    System.out.println("Enter the rating for this video:");
                    int rating = sc.nextInt();
                    videoStore.receiveRating(videoName, rating);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
