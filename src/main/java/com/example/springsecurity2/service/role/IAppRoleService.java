package com.example.springsecurity2.service.role;

import com.example.springsecurity2.model.AppRole;
import com.example.springsecurity2.service.IGeneralService;


public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}