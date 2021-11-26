import java.util.Hashtable;

public class SheetMusic {

    private static Hashtable<String, MusicalNote> notesMap = new Hashtable<String, MusicalNote>();

    public static void loadNotes() {
        Do doNote = new Do();
        notesMap.put("Do", doNote);

        Re reNode = new Re();
        notesMap.put("Re", reNode);

        Mi miNote = new Mi();
        notesMap.put("Mi", miNote);

        Fa faNote = new Fa();
        notesMap.put("Fa", faNote);

        Sol solNote = new Sol();
        notesMap.put("Sol", solNote);

        La laNote = new La();
        notesMap.put("La", laNote);

        Si siNote = new Si();
        notesMap.put("Si", siNote);
    }

    public static MusicalNote getMusicalNote(String note) {
        MusicalNote musicalNote = notesMap.get(note);
        return musicalNote.clone();
    }
}
