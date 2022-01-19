package com.example.myfavoritebooksiguess

import androidx.recyclerview.widget.RecyclerView
import com.example.myfavoritebooksiguess.databinding.BookCardCellBinding

class CardViewHolder(
    private val cardCellBinding: BookCardCellBinding
) : RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindBook(book: Books) {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author
    }
}