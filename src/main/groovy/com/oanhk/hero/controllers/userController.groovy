package com.oanhk.hero.controllers

import com.oanhk.hero.service.userservice
import com.oanhk.hero.models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


import javax.transaction.Transactional


@RestController
@RequestMapping('user')
@Transactional

class userController {
@Autowired
userservice userservice
    @GetMapping('')
    List findAll(){
        userservice.findAll()
    }

    @GetMapping('{id}')
    User findOne(@PathVariable long id){
        userservice.findById(id)
    }
    @PostMapping('')
    User save(@RequestBody User user){
        userservice.save(user)
    }
    User update

}
