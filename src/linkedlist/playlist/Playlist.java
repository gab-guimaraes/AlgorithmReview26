package linkedlist.playlist;

public class Playlist {
    private Song head;

    public Playlist(Song head) {
        this.head = head;
    }

    public void printAllPlaylist() {
        Song current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public void addMusic(Song song) {
        Song current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(song);
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist(new Song("Here without you", "3 Doors Down"));
        playlist.addMusic(new Song("I Miss You", "Blink182"));
        playlist.printAllPlaylist();
    }
}
