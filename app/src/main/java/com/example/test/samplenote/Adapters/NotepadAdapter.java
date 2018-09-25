package com.example.test.samplenote.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.test.samplenote.Model.Note;
import com.example.test.samplenote.R;

import java.util.ArrayList;

public class NotepadAdapter extends RecyclerView.Adapter<NotepadAdapter.NoteHolder>{

    private Context context;
    private ArrayList<Note> notes;

    public NotepadAdapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;
    }


    @Override
    public NoteHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v= LayoutInflater.from(context).inflate(R.layout.notepad_layout,viewGroup,false);
        return new NoteHolder(v);

    }

    @Override
    public void onBindViewHolder(NoteHolder noteHolder, int pos) {

        Note note=getNote(pos);
        if(note!=null){
            noteHolder.noteTitle.setText(note.getNoteTitle());
            noteHolder.noteText.setText(note.getNoteText());
            noteHolder.noteDate.setText(note.getNoteDate());
        }

    }

    @Override
    public int getItemCount() {

        return notes.size();

    }

    private Note getNote(int position){

        return notes.get(position);

    }

    class NoteHolder extends RecyclerView.ViewHolder{

        TextView noteTitle,noteText,noteDate;

        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            noteTitle=itemView.findViewById(R.id.noteTitle);
            noteText=itemView.findViewById(R.id.noteContent);
            noteDate=itemView.findViewById(R.id.noteDate);
        }
    }
}
