package com.oanhk.hero.models

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.Entity

@Entity
class User {
    String userName
    Date birthday
    String phoneNumber
    @JsonIgnore
}
