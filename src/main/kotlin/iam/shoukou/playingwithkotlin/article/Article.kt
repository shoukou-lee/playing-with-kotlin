package iam.shoukou.playingwithkotlin.article

import iam.shoukou.playingwithkotlin.user.User
import javax.persistence.*

@Entity
class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var subject: String

    var content: String

    @ManyToOne
    var user: User

    constructor(subject: String, content: String, user: User) {
        this.subject = subject
        this.content = content
        this.user = user
    }

}