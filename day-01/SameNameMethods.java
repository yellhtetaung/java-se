public class SameNameMethods {
    public static void main(String[] args) {
        Paper paper = new Paper();
        NoteBook noteBook = new NoteBook();

        takeNote("Hello Java", paper);

        System.out.println(paper.message);
    }

    static void takeNote(String message, Paper paper) {
        paper.message = message;
    }


    static void takeNote(String message, NoteBook noteBook) {
        noteBook.message = message;
    }
}

class Paper {
    String message;
}

class NoteBook {
    String message;
}