package com.davidmerchan.dailypulse.articles

import com.davidmerchan.dailypulse.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel : BaseViewModel() {

    private var _articleState = MutableStateFlow(ArticleState(loading = true))
    val articleState: StateFlow<ArticleState>
        get() = _articleState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            val articlesFetched = fetchArticles()
            delay(500)
            _articleState.emit(ArticleState(articles = articlesFetched, loading = false))
        }
    }

    private fun fetchArticles(): List<Article> {
        return listOf(
            Article(
                title = "Title 1",
                imageUrl = "",
                description = "Description 1",
                date = "Date 1"
            ),
            Article(
                title = "Title 2",
                imageUrl = "",
                description = "Description 2",
                date = "Date 2"
            ),
            Article(
                title = "Title 3",
                imageUrl = "",
                description = "Description 3",
                date = "Date 3"
            ),
            Article(
                title = "Title 4",
                imageUrl = "",
                description = "Description 4",
                date = "Date 4"
            ),
            Article(
                title = "Title 5",
                imageUrl = "",
                description = "Description 5",
                date = "Date 5"
            )
        )

    }
}