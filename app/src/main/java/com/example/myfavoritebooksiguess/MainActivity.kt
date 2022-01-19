package com.example.myfavoritebooksiguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myfavoritebooksiguess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
        }
    }

    private fun populateBooks() {
        val book1 = Books(
            R.drawable.beforeyouleap,
            "Kermit The Frog",
            "Before You Leap",
            "An autoBiography about kermit himself."
        )
        bookList.add(book1)

        val book2 = Books(
            R.drawable.eleanor,
            "Gare Thompson",
            "Who Was Eleanor Roosevelt?",
            "A biography detailing the life of who Eleanor was."
        )
        bookList.add(book2)

        val book3 = Books(
            R.drawable.blink,
            "Malcolm Gladwell",
            "Blink",
            "The power of thinking without thinking"
        )
        bookList.add(book3)

        val book4 = Books(
            R.drawable.daughteroftheking,
            "Carlene Havel and Sharon Faucheux",
            "Daughter of The King",
            "A Biblical/Romance novel."
        )
        bookList.add(book4)

        val book5 = Books(
            R.drawable.factfulness,
            "Anna Rosling, Hans Rosling, and Ola Rosling",
            "Factfulness",
            "Ten reasons we are wrong about the world."
        )
        bookList.add(book5)


        val book6 = Books(
            R.drawable.thegoldenhour,
            "Beatriz Williams",
            "The Golden Hour",
            "a historical fiction novel about alternate time lines."
        )
        bookList.add(book6)

        val book7 = Books(
            R.drawable.unguardedscottiepippen,
            "Scottie Pippen",
            "Unguarded",
            "A memoir about a six time NBA champion."
        )
        bookList.add(book7)

        val book8 = Books(
            R.drawable.thereplacementwife,
            "Darby Kane",
            "The Replacement Wife",
            "a suspense novel that asks how many wives and girlfriends should dissappear before anyone notices."
        )
        bookList.add(book8)

        val book9= Books(
            R.drawable.thesleepfix,
            "Diane Macedo",
            "The Sleep Fix",
            "a novel that offers reasearch and advice."
        )
        bookList.add(book9)

        val book10= Books(
            R.drawable.ocean,
            "Chris Dixon and Jeremy K. Spencer",
            "The Ocean",
            "a handbook of treasure trove information."
        )
        bookList.add(book10)

    }
}