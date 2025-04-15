package com.example.calorytransformerjson.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Name {
    AREPAS, BARBECUE_RIBS, BRUSCHETTE_WITH_TOMATO, BUNNY_CHOW, CAESAR_SALAD, CALIFORNIA_MAKI, CAPRESE_SALAD, CAULIFLOWER_PENNE, CHEESEBURGER, CHICKEN_FAJITAS, CHICKEN_MILANESE, CHICKEN_PARM, CHICKEN_WINGS, CHILLI_CON_CARNE, EBITEN_MAKI, FETTUCCINE_ALFREDO, FISH_AND_CHIPS, FRENCH_FRIES_WITH_SAUSAGES, FRENCH_TOAST, HUMMUS, KATSU_CURRY, KEBAB, LASAGNE, LINGUINE_WITH_CLAMS, MASSAMAN_CURRY, MEATBALLS_WITH_SAUCE, MUSHROOM_RISOTTO, PAPPARDELLE_ALLA_BOLOGNESE, PASTA_AND_BEANS, PASTA_CARBONARA, PASTA_WITH_TOMATO_AND_BASIL, PEKING_DUCK, PHILADELPHIA_MAKI, PHO, PIEROGI, PIZZA, POKE, PORK_BELLY_BUNS, PORK_SAUSAGE_ROLL, POUTINE, RICOTTA_STUFFED_RAVIOLI, RISOTTO_WITH_SEAFOOD, SALMON_NIGIRI, SCOTCH_EGGS, SEAFOOD_PAELLA, SOM_TAM, SOUVLAKI, STINKY_TOFU, SUSHI, TACOS, TERIYAKI_CHICKEN_DONBURI, TIRAMIS, TUNA_SASHIMI, VEGETABLE_SOUP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AREPAS: return "Arepas";
            case BARBECUE_RIBS: return "Barbecue Ribs";
            case BRUSCHETTE_WITH_TOMATO: return "Bruschette with Tomato";
            case BUNNY_CHOW: return "Bunny Chow";
            case CAESAR_SALAD: return "Caesar Salad";
            case CALIFORNIA_MAKI: return "California Maki";
            case CAPRESE_SALAD: return "Caprese Salad";
            case CAULIFLOWER_PENNE: return "Cauliflower Penne";
            case CHEESEBURGER: return "Cheeseburger";
            case CHICKEN_FAJITAS: return "Chicken Fajitas";
            case CHICKEN_MILANESE: return "Chicken Milanese";
            case CHICKEN_PARM: return "Chicken Parm";
            case CHICKEN_WINGS: return "Chicken Wings";
            case CHILLI_CON_CARNE: return "Chilli con Carne";
            case EBITEN_MAKI: return "Ebiten maki";
            case FETTUCCINE_ALFREDO: return "Fettuccine Alfredo";
            case FISH_AND_CHIPS: return "Fish and Chips";
            case FRENCH_FRIES_WITH_SAUSAGES: return "French Fries with Sausages";
            case FRENCH_TOAST: return "French Toast";
            case HUMMUS: return "Hummus";
            case KATSU_CURRY: return "Katsu Curry";
            case KEBAB: return "Kebab";
            case LASAGNE: return "Lasagne";
            case LINGUINE_WITH_CLAMS: return "Linguine with Clams";
            case MASSAMAN_CURRY: return "Massaman Curry";
            case MEATBALLS_WITH_SAUCE: return "Meatballs with Sauce";
            case MUSHROOM_RISOTTO: return "Mushroom Risotto";
            case PAPPARDELLE_ALLA_BOLOGNESE: return "Pappardelle alla Bolognese";
            case PASTA_AND_BEANS: return "Pasta and Beans";
            case PASTA_CARBONARA: return "Pasta Carbonara";
            case PASTA_WITH_TOMATO_AND_BASIL: return "Pasta with Tomato and Basil";
            case PEKING_DUCK: return "Peking Duck";
            case PHILADELPHIA_MAKI: return "Philadelphia Maki";
            case PHO: return "Pho";
            case PIEROGI: return "Pierogi";
            case PIZZA: return "Pizza";
            case POKE: return "Poke";
            case PORK_BELLY_BUNS: return "Pork Belly Buns";
            case PORK_SAUSAGE_ROLL: return "Pork Sausage Roll";
            case POUTINE: return "Poutine";
            case RICOTTA_STUFFED_RAVIOLI: return "Ricotta Stuffed Ravioli";
            case RISOTTO_WITH_SEAFOOD: return "Risotto with Seafood";
            case SALMON_NIGIRI: return "Salmon Nigiri";
            case SCOTCH_EGGS: return "Scotch Eggs";
            case SEAFOOD_PAELLA: return "Seafood Paella";
            case SOM_TAM: return "Som Tam";
            case SOUVLAKI: return "Souvlaki";
            case STINKY_TOFU: return "Stinky Tofu";
            case SUSHI: return "Sushi";
            case TACOS: return "Tacos";
            case TERIYAKI_CHICKEN_DONBURI: return "Teriyaki Chicken Donburi";
            case TIRAMIS: return "Tiramis\u00f9";
            case TUNA_SASHIMI: return "Tuna Sashimi";
            case VEGETABLE_SOUP: return "Vegetable Soup";
        }
        return null;
    }

    @JsonCreator
    public static Name forValue(String value) throws IOException {
        if (value.equals("Arepas")) return AREPAS;
        if (value.equals("Barbecue Ribs")) return BARBECUE_RIBS;
        if (value.equals("Bruschette with Tomato")) return BRUSCHETTE_WITH_TOMATO;
        if (value.equals("Bunny Chow")) return BUNNY_CHOW;
        if (value.equals("Caesar Salad")) return CAESAR_SALAD;
        if (value.equals("California Maki")) return CALIFORNIA_MAKI;
        if (value.equals("Caprese Salad")) return CAPRESE_SALAD;
        if (value.equals("Cauliflower Penne")) return CAULIFLOWER_PENNE;
        if (value.equals("Cheeseburger")) return CHEESEBURGER;
        if (value.equals("Chicken Fajitas")) return CHICKEN_FAJITAS;
        if (value.equals("Chicken Milanese")) return CHICKEN_MILANESE;
        if (value.equals("Chicken Parm")) return CHICKEN_PARM;
        if (value.equals("Chicken Wings")) return CHICKEN_WINGS;
        if (value.equals("Chilli con Carne")) return CHILLI_CON_CARNE;
        if (value.equals("Ebiten maki")) return EBITEN_MAKI;
        if (value.equals("Fettuccine Alfredo")) return FETTUCCINE_ALFREDO;
        if (value.equals("Fish and Chips")) return FISH_AND_CHIPS;
        if (value.equals("French Fries with Sausages")) return FRENCH_FRIES_WITH_SAUSAGES;
        if (value.equals("French Toast")) return FRENCH_TOAST;
        if (value.equals("Hummus")) return HUMMUS;
        if (value.equals("Katsu Curry")) return KATSU_CURRY;
        if (value.equals("Kebab")) return KEBAB;
        if (value.equals("Lasagne")) return LASAGNE;
        if (value.equals("Linguine with Clams")) return LINGUINE_WITH_CLAMS;
        if (value.equals("Massaman Curry")) return MASSAMAN_CURRY;
        if (value.equals("Meatballs with Sauce")) return MEATBALLS_WITH_SAUCE;
        if (value.equals("Mushroom Risotto")) return MUSHROOM_RISOTTO;
        if (value.equals("Pappardelle alla Bolognese")) return PAPPARDELLE_ALLA_BOLOGNESE;
        if (value.equals("Pasta and Beans")) return PASTA_AND_BEANS;
        if (value.equals("Pasta Carbonara")) return PASTA_CARBONARA;
        if (value.equals("Pasta with Tomato and Basil")) return PASTA_WITH_TOMATO_AND_BASIL;
        if (value.equals("Peking Duck")) return PEKING_DUCK;
        if (value.equals("Philadelphia Maki")) return PHILADELPHIA_MAKI;
        if (value.equals("Pho")) return PHO;
        if (value.equals("Pierogi")) return PIEROGI;
        if (value.equals("Pizza")) return PIZZA;
        if (value.equals("Poke")) return POKE;
        if (value.equals("Pork Belly Buns")) return PORK_BELLY_BUNS;
        if (value.equals("Pork Sausage Roll")) return PORK_SAUSAGE_ROLL;
        if (value.equals("Poutine")) return POUTINE;
        if (value.equals("Ricotta Stuffed Ravioli")) return RICOTTA_STUFFED_RAVIOLI;
        if (value.equals("Risotto with Seafood")) return RISOTTO_WITH_SEAFOOD;
        if (value.equals("Salmon Nigiri")) return SALMON_NIGIRI;
        if (value.equals("Scotch Eggs")) return SCOTCH_EGGS;
        if (value.equals("Seafood Paella")) return SEAFOOD_PAELLA;
        if (value.equals("Som Tam")) return SOM_TAM;
        if (value.equals("Souvlaki")) return SOUVLAKI;
        if (value.equals("Stinky Tofu")) return STINKY_TOFU;
        if (value.equals("Sushi")) return SUSHI;
        if (value.equals("Tacos")) return TACOS;
        if (value.equals("Teriyaki Chicken Donburi")) return TERIYAKI_CHICKEN_DONBURI;
        if (value.equals("Tiramis\u00f9")) return TIRAMIS;
        if (value.equals("Tuna Sashimi")) return TUNA_SASHIMI;
        if (value.equals("Vegetable Soup")) return VEGETABLE_SOUP;
        throw new IOException("Cannot deserialize Name");
    }
}
