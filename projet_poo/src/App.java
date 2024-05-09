// import java.util.Date;
import java.util.Scanner;
import java.sql.Date;
import java.time.LocalDate;

import Adherents.Adherents;
import Adherents.Emprunt;
import documents.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Article article = new Article("Bell amie", "1/1", 0, 5, "GUY DE MAUPASSANT", new Date());
        // // article.Afficher();
        // Magazines magazines = new Magazines("Elle", "logpom", 0, 6, 1);
        // // magazines.Afficher();
        // Memoire memoire = new Memoire("site de e-commerce", "2/4", 0, 98, "Stefy Godlove", new Date());
        // // memoire.Afficher();
        // Livres livres = new Livres("les tribus de Capitollines", "3/6", 8, 20, "mbezele", "capitole",new Date());
        // // livres.Afficher();

        // Document[] document = new Document[5];
        // document[0] = article;
        // document[1] = magazines;
        // document[2] = memoire;
        // document[3] = livres;
        // for(int i = 0; i < 4; i++){
        //     document[i].Afficher();
        //     // System.out.println(document.getClass());
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("veillez entrer les infos relatifs a votre memoire");
        // System.out.print("Entrer le titre: ");
        // String motEntrer = scanner.nextLine();
        // // System.out.println(motEntrer);
        // System.out.println("enter sa localisation dans la bibliotheque");
        // String localisation = scanner.nextLine();
        // System.out.println("entrer son code");
        // int code = scanner.nextInt();
        // System.out.println("entrer le nombre d'exemplaire");
        // int Nbre_exemplaire = scanner.nextInt();
        // System.out.println("entre le nom du candidat");
        // String candidat = scanner.nextLine();
        // Date date = new Date();
        // document[4] = new Memoire(motEntrer, localisation, code, Nbre_exemplaire, candidat, date);

        // for(int i = 0; i <= 4; i++){
        //     document[i].Afficher();
        // }
        Date date = new Date(0);

        Adherents adherents = new Adherents("stefy", "Guidjou", "21g00313","logpom", "etudiant");
        adherents.Afficher();

        // Emprunt emprunt = new Emprunt("ide111", date.valueOf(""+LocalDate.now()), date.valueOf(""+LocalDate.now()), "ddd");
        // adherents.Emprunter(emprunt);
        // emprunt = new Emprunt("ide22", date.valueOf(""+LocalDate.now()), date.valueOf(""+LocalDate.now()), "ddd2");
        // adherents.Emprunter(emprunt);
        adherents.afficheEmprunt();
        adherents.Remettre("ddd2", "ide22",  date.valueOf(""+LocalDate.now()));
        System.out.println("-------------------------------------------------------");
        adherents.afficheEmprunt();
        adherents.EmpruntDepasse("ddd", "ide111", date);
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("entrer le codd du livre que vous souhaite rendre");
        // String codeD = scanner.nextLine();
        // System.out.println("entrer votre code "); 
        // String IdEm = scanner.nextLine();
        // System.out.println("entrer la date d'emprunt");




    }
}
