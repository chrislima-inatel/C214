package br.inatel.cdg.test;

import br.inatel.cdg.InimigoService;

import java.util.ArrayList;

public class MockInimigoService implements InimigoService {


    @Override
    public String busca(int id) {

        if (id == 10){
            return InimigoConst.SKELETON;
        }else if (id == 20){
            return InimigoConst.DRAGAO;
        }else if(id < 0){
            return InimigoConst.INEXISTENTE;
        }else{
            return InimigoConst.PADRAO;
        }
    }

    @Override
    public boolean inimigoExistente(int id) {
        //Aceitando somente IDs 10 e 20. Pode-se melhorar a logica para aceitar também IDs positivos
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}
