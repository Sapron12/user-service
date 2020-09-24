package com.example.userservice

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(@Id  @GeneratedValue(strategy= GenerationType.AUTO) var id: Long, var username: String, var password: String, var role: String) {

}
