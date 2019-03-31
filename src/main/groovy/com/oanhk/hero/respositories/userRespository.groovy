package com.oanhk.hero.respositories

import com.oanhk.hero.models.User
import org.springframework.data.repository.CrudRepository

interface userRespository extends CrudRepository<User, Long> {}
