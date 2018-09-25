package com.example.test.samplenote.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Note {
    private String noteTitle,noteText;
    private long noteDate;

    public Note(String noteTitle, String noteText, long noteDate){
        this.noteTitle=noteTitle;
        this.noteText=noteText;
        this.noteDate=noteDate;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getNoteDate() {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd", Locale.US);
        String date=dateFormat.format(noteDate);
        return date;
    }

    public void setNoteDate(long noteDate) {
        this.noteDate = noteDate;
    }
}
