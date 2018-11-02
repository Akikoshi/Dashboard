package com.semjasa.dashboard.services;

import com.semjasa.dashboard.models.Tenant;

import java.util.Set;

public interface TenantService {

    Tenant findById(Long id);

    Tenant save(Tenant tenant);

    Set<Tenant> findAll();
}
