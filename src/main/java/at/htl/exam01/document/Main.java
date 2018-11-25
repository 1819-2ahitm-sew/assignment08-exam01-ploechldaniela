
package at.htl.exam01.document;

import at.htl.exam01.compress.StringCompress;

public class Main {

    /**
     * Führen Sie hier folgendes durch:
     * <p>
     * 1. Erstellen Sie 2 Bücher und ein email
     * Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     * Email: "Susi", "Bewerbung", "CoolCompany"
     * Buch: "Tolkien", "lordOfTheRings"
     * <p>
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     * <p>
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     * Nutzen Sie dabei die Mechanismen der Vererbung.
     * Erstellen Sie außerdem geeignete toString-Methoden
     * <p>
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */

    public static void main(String[] args) {
        Book book = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
        Email email = new Email("Susi", "Bewerbung", "CoolCompany");
        Book book1 = new Book("Tolkien", "lordOfTheRings");

        Document[] document = new Document[3];

        document[0] = book;
        document[1] = email;
        document[2] = book1;

        int bücher = 0;
        int emails = 0;

        for (int i = 0; i < document.length; i++) {



            if (document[i] instanceof Book){
                System.out.println("Book: "+ document[i].toString());
                bücher++;
            }else if (document[i] instanceof Email){
                System.out.println("Email: "+ document[i].toString());
                emails++;
            }
        }
        System.out.println("Anzahl Books: "+bücher);
        System.out.println("Anzahl Emails: "+emails);
    }
}