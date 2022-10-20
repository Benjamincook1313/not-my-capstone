package com.smartList.proj.repository;

import com.smartList.proj.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataRepository
    extends JpaRepository<Item, Integer>{
}
