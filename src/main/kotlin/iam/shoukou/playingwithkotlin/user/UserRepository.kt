package iam.shoukou.playingwithkotlin.user

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>{
}