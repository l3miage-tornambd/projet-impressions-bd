package fr.uga.l3miage.photonum;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Image;


public class CreateBasingObjectForTest {

    public static Client newClient1() {
        Client client = new Client();
        client.setNom("Riado");
        client.setPrenom("Bastien");
        client.setAdresseMail("bastien.riado@etu.univ-grenoble-ales.fr");
        client.setAdressePostale("36 rue du tacos");
        client.setMotDePasse("abricot");
        return client;
    }

    public static Client newClient2() {
        Client client = new Client();
        client.setNom("Patrac");
        client.setPrenom("Théo");
        client.setAdresseMail("theo.patrac@etu.univ-grenoble-ales.fr");
        client.setAdressePostale("69 avenue tendu");
        client.setMotDePasse("soral");
        return client;
    }

    public static Client newClient3() {
        Client client = new Client();
        client.setNom("Cormier");
        client.setPrenom("Levi");
        client.setAdresseMail("levi.cormier@etu.univ-grenoble-ales.fr");
        client.setAdressePostale("shibuya avenue");
        client.setMotDePasse("japon");
        return client;
    }

    public static Client newClient4() {
        Client client = new Client();
        client.setNom("Tornambé");
        client.setPrenom("damien");
        client.setAdresseMail("damien.tornambe@etu.univ-grenoble-ales.fr");
        client.setAdressePostale("66 à droite");
        client.setMotDePasse("jeanneausecours");
        return client;
    }


    public static Image newImage1() {
        Image image = new Image();
        image.setChemin("https://zemmour2027.fr/barricades");
        image.setResolution(666);
        image.setInfo("Protegez les frontières contre les hordes barbares");
        return image;
    }

    public static Image newImage2() {
        Image image = new Image();
        image.setChemin("https://soral.fr/fautlesavoir");
        image.setResolution(666);
        image.setInfo("Tout ce qui faut savoir");
        return image;
    }

    public static Image newImage3() {
        Image image = new Image();
        image.setChemin("https://cuisine2000.fr/fourchettes");
        image.setResolution(666);
        return image;
    }

    public static Image newImage4() {
        Image image = new Image();
        image.setChemin("https://jacquieetmichel.fr/fontaine");
        image.setResolution(666);
        image.setInfo("Attention ça éclabousse!");
        return image;
    }

    public static Image newImage5() {
        Image image = new Image();
        image.setChemin("https://bigard.fr/pognons");
        image.setResolution(666);
        return image;
    }

    public static Image newImage6() {
        Image image = new Image();
        image.setChemin("https://akihabara.fr/culottes");
        image.setResolution(666);
        image.setInfo("Le meilleur site de culottes sales d'écolières japonaises");
        return image;
    }

    public static Image newImage7() {
        Image image = new Image();
        image.setChemin("https://rouletterusse.fr/arcenciel");
        image.setResolution(666);
        image.setInfo("Un jeu mortelle!");
        return image;
    }

}
