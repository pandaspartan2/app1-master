package com.example.myfavoritebooksiguess

var bookList = mutableListOf<Books>()

class Books (
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    var id: Int? = bookList.size
)