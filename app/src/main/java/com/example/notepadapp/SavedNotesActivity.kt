package com.example.notepadapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class SavedNotesActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnCreateNewNote: ImageButton
    private lateinit var btnDeleteSelectedNote: ImageButton
    private lateinit var btnRenameSelectedNote: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_notes)

        setUIComponents()
    }

    private fun setUIComponents() {

        btnCreateNewNote = findViewById(R.id.btn_create_new_note)
        btnDeleteSelectedNote = findViewById(R.id.btn_delete_selected_note)
        btnRenameSelectedNote = findViewById(R.id.btn_rename_selected_note)

        btnCreateNewNote.setOnClickListener(this)
        btnDeleteSelectedNote.setOnClickListener(this)
        btnRenameSelectedNote.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        if(view == null) {
            Toast.makeText(this, "View is coming null", Toast.LENGTH_SHORT).show()
            return
        }
        when (view.id) {
            R.id.btn_create_new_note -> {
                newNoteAction()
            }

            R.id.btn_rename_selected_note -> {
                renameNoteAction()
            }

            R.id.btn_delete_selected_note -> {
                deleteNoteAction()
            }
        }
    }

    private fun newNoteAction() {
        // Take database actions...
        val intent = Intent(this, WriteNoteActivity::class.java)
        startActivity(intent)
    }

    private fun renameNoteAction() {

    }

    private fun deleteNoteAction() {

    }
}
