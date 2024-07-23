package org.aadi.bookstore.services

import org.aadi.bookstore.domain.BookSummary
import org.aadi.bookstore.domain.BookUpdateRequest
import org.aadi.bookstore.domain.entities.BookEntity

interface BookService {

    fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean>

    fun list(authorId: Long?=null): List<BookEntity>

    fun get(isbn: String): BookEntity?

    fun partialUpdate(isbn: String, bookUpdateRequest: BookUpdateRequest): BookEntity

    fun delete(isbn: String)

}