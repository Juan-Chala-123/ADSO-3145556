package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.Entity.ViewAction;

public interface IViewActionRepository extends JpaRepository<ViewAction, Long> {

}
