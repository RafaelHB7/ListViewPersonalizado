package com.example.listviewpersonalizado;

import java.util.HashMap;

public class ContatoController {
    public Contato[] contato = {ADS5, DANIEL, ADSDDM, RICARDO, ALISSON, ROMULO};

    public HashMap<String, Contato> contato_map = new HashMap<>();

    public ContatoController(){
        for (Contato CONTATO: contato){
            contato_map.put(String.valueOf(CONTATO.getNome()),CONTATO);
        }
    }

    public static final Contato ADS5 = new Contato("ADS 5", "Você: A aula de hoje já começou", "13/04/2020", R.drawable.ads5);
    public static final Contato ADSDDM = new Contato("ADS-DDM-2020-1", "Rômulo: Olá pessoal Segue o link para...", "07/04/2020", R.drawable.adsddm);
    public static final Contato DANIEL = new Contato("Daniel", "Bora", "09/04/2020", R.drawable.daniel);
    public static final Contato RICARDO = new Contato("Ricardo", "Boa ideia", "06/04/2020", R.drawable.ricardo);
    public static final Contato ALISSON = new Contato("Alisson", "kk", "05/04/2020", R.drawable.alisson);
    public static final Contato ROMULO = new Contato("Rômulo", "Ok", "29/03/2020", R.drawable.romulo);
}
