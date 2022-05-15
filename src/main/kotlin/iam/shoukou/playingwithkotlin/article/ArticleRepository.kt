package iam.shoukou.playingwithkotlin.article

import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
}