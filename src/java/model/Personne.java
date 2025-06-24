/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author toshiba
 */
public class Personne {
    String nom;
    int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Personne() {
           }
    
    public String calculerRest(int age) {
        int retraite = 65;
        if (age >= retraite) {
            return "Vous êtes déjà à la retraite.";
        } else {
            return "Il vous reste " + (retraite - age) + " ans avant la retraite.";
        }
    }
}

