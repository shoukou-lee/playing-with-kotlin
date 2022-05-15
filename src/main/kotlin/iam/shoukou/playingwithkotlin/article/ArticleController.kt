package iam.shoukou.playingwithkotlin.article

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/apis/v1/articles")
class ArticleController {

    @GetMapping("/{id}")
    fun getArticle(@PathVariable id: Long): String {
        return "article" + id
    }

}