package com.webApp.demo.repository;

import com.webApp.demo.Entity.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataRepository
    extends JpaRepository<Item, Integer>{
}
