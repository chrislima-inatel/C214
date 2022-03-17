package br.inatel.cdg;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {

    InimigoService inimigoService;

    public BuscaInimigo(InimigoService service){
        this.inimigoService = service;
    }

    public Inimigo buscaInimigo(int id){
        // id = 10 -> buscando um inimigo de ID 10
        //InimigoJson é uma string que retornou do serviço
        String inimigoJson = inimigoService.busca(id);

        //jsonObject é um objeto JSON feito a partir da string de retonro
        JsonObject jsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();

        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }

}
