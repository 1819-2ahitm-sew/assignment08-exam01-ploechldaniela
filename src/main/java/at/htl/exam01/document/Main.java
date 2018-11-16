
package at.htl.exam01.document;

import at.htl.exam01.compress.StringCompress;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {
        Document[] document = new Document[10];



    }

    public abstract class Document{
        private String autor;

        public Document(String autor){
            this.autor = autor;
        }

        public String getAuthor(){
            return this.autor;
        }
    }

    public class Book extends Document {

        private String title;

        public Book(String autor, String title) {
            super(autor);

            this.title = title;
        }

        public String getTitle(){
            return this.title;
        }

        public String toString(){
            return title +" von "+ getAuthor();
        }
    }

    public class Email extends Document {

        private String subject;
        private String to;

        public Email(String autor, String subject, String to) {
            super(autor);

            this.subject = subject;
            this.to = to;
        }

        public String getSubject(){
            return this.subject;
        }

        public String getTo(){
            return this.to;
        }

        public String toString(){
            return subject +" von "+ getAuthor() +" an "+ to;
        }
    }


    public class Book1 extends Book{



        public Book1(String autor, String title) {
            super(autor, title);

            autor = "Rowlings";
            title = "Harry Potter und der Stein der Weisen";
        }
    }

}
