package br.inatel.cdg;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.musicas.Playlists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		List<Playlists> musicas = new ArrayList<Playlists>();
		
		musicas.add(new Playlists("https://open.spotify.com/playlist/1Zuf4z9u26AxGB5xi0qtjt?si=54310c9ee1764e96", 272));
		musicas.add(new Playlists("https://open.spotify.com/playlist/5Pc7evOjtB1CaRddwLh6i4?si=a1bfd50bf81b46f1", 307));
		
		Gson gson = new GsonBuilder().
					setPrettyPrinting().create();
		
		String json = gson.toJson(musicas);
		
		FileWriter writer;
		try {
			writer = new FileWriter("musicas.json");
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
