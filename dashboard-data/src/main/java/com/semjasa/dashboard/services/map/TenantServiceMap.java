package com.semjasa.dashboard.services.map;

import com.semjasa.dashboard.models.Tenant;
import com.semjasa.dashboard.services.CrudService;

import java.util.Set;

public class TenantServiceMap extends AbstractMapService<Tenant, Long> implements CrudService<Tenant, Long> {

    @Override
    public Set<Tenant> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Tenant object) {
        super.delete(object);
    }

    @Override
    public Tenant save(Tenant object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Tenant findById(Long id) {
        return super.findById(id);
    }
}
