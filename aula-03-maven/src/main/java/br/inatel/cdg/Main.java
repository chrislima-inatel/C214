package br.inatel.cdg;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.musicas.Musicas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		List<Musicas> musicas = new ArrayList<Musicas>();
		System.out.println("Mudança...");
		
		musicas.add(new Musicas("Musica1", 3));
		musicas.add(new Musicas("Musica2", 5));

		//gson instanciado com PrettyPrinting()
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		//Criando o JSON a partir da lista de musicas com a dependencia gson
		String json = gson.toJson(musicas);

		//Escrevendo o json criado no arquivo musicas.json
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
