package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.Entity.ViewModule;

public interface IViewModuleRepository extends JpaRepository<ViewModule, Long> {

}
