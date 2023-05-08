package com.example.lab3copilot;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MascotaViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Mascota>> listaMascotas = new MutableLiveData<>();

    public MutableLiveData<ArrayList<Mascota>> getListaMascotas() {
        listaMascotas = new MutableLiveData<>();
        cargarMascotas();
        return listaMascotas;
    }

    private void cargarMascotas() {
        // Load the Mascotas list from a data source, for example a database or a web service.
        // Then set the value of the MutableLiveData object:
        ArrayList<Mascota> lista = new ArrayList<>();
        lista.add(new Mascota("Max", true, "Juan", "12345678", "Perro grande y juguetón", "Lince-Lince"));
        lista.add(new Mascota("Luna", false, "Ana", "87654321", "Gata tímida y cariñosa", "Lince-Lince"));
        lista.add( new Mascota("Rocky", true, "Pedro", "11111111", "Perro pequeño y enérgico", "Magdalena-Lince"));
        lista.add(new Mascota("Lola", false, "María", "99999999", "Perra mayor y tranquila", "Magdalena-Lince"));
        lista.add(new Mascota("Mimi", false, "María", "12345678", "Gato siamés muy juguetón", "Magdalena-Lince"));
        lista.add(new Mascota("Rocky", true, "Pedro", "64213579", "Perro bulldog muy sociable", "Jesús Maria-Lince"));
        lista.add(new Mascota("Max", true, "Juan", "12345678", "Perro grande y juguetón", "Lince-Lince"));
        lista.add(new Mascota("Luna", false, "Ana", "87654321", "Gata tímida y cariñosa", "Lince-Lince"));
        lista.add( new Mascota("Rocky", true, "Pedro", "11111111", "Perro pequeño y enérgico", "Magdalena-Lince"));
        lista.add(new Mascota("Lola", false, "María", "99999999", "Perra mayor y tranquila", "Magdalena-Lince"));
        lista.add(new Mascota("Mimi", false, "María", "12345678", "Gato siamés muy juguetón", "Magdalena-Lince"));
        lista.add(new Mascota("Rocky", true, "Pedro", "64213579", "Perro bulldog muy sociable", "Jesús Maria-Lince"));
        listaMascotas.setValue(lista);
    }
}
