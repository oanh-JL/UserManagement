package com.oanhk.hero.service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import com.oanhk.hero.respositories.userRespository
import com.oanhk.hero.models.User

import javax.persistence.EntityNotFoundException
import java.awt.List

@Service
class userservice {
    @Autowired
    userRespository userRespository
    List findAll(){
        userRespository.findAll(Sort.by('name')).asList()
    }
    User findById(long id) {
        userRespository.findById(id).orElseThrow({
            new EntityNotFoundException()
        })

    }
    User save(User user){
        userRespository.save(user)
    }


    User deleteById(long id) {
        def user = findByIdOrError(id)
        userRespository.delete(user)
        user
    }

}
