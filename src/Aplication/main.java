package Aplication;

import java.util.ArrayList;

public class main {
	
	private static ArrayList<album>albums = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		album album = new album( name: "Album1", artist:"AC/DC");
		
		album.addSong(title:"TNT", duration: 4.5);
		album.addSong(title:"Highway to hell", duration: 3.5);
		album.addSong(title:"ThunderStruck", duration: 5.0);
		albums.add(album);
		
		album = new album(name: "album2", artist: "Eminem");
		
		album.addSong(title:"Rap god", duration: 4.5);
		album.addSong(title:"Not Afraid", duration: 3.5);
		album.addSong(title:"Lose yourself", duration: 4.5);
		
		albums.add(album);
		
		
	}
}
