/*
Write a Java program to simulate a Music Playlist using LinkedList<String>. Perform the
following operations:
1. Add songs to the playlist.
2. Display the full playlist.
3. Play the first song (remove from front).
4. Skip the last song (remove from end).
5. Display the updated playlist after each operation.
 */
import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many songs do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        System.out.println("\nFull Playlist:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            String played = playlist.removeFirst();
            System.out.println("\nNow Playing: " + played);
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            String skipped = playlist.removeLast();
            System.out.println("\nSkipped Song: " + skipped);
        }

        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);

    }
}
/*
How many songs do you want to add? 5
Enter song 1: abc
Enter song 2: def
Enter song 3: ghi
Enter song 4: jkl
Enter song 5: mno

Full Playlist:
[abc, def, ghi, jkl, mno]

Now Playing: abc
Playlist after playing first song:
[def, ghi, jkl, mno]

Skipped Song: mno
Playlist after skipping last song:
[def, ghi, jkl]
 */