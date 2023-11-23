package poo.Classes;

import poo.Interfaces.PodeVoar;

public class Aguia extends Ave implements PodeVoar {
    public float tamanho;
    private String cor;

    @Override
    public void voa() {
        System.out.println("\nA águia avuô");
    }
}
