package iam.shoukou.playingwithkotlin.user

import iam.shoukou.playingwithkotlin.article.Article
import javax.persistence.*

@Entity
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var name: String

    var password: String

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    var articles: List<Article>? = arrayListOf()

    constructor(name: String, password: String, articles: List<Article>?) {
        this.name = name
        this.password = password
        this.articles = articles
    }

}