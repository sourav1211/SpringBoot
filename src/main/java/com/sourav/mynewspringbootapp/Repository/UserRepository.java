package com.sourav.mynewspringbootapp.Repository;

import com.sourav.mynewspringbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {

}
