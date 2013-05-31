package com.dianping.gladio.domain;

import com.dianping.gladio.domain.implementation.ClientServiceImpl;
import com.dianping.gladio.domain.implementation.ServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class DomainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Service.class).to(ServiceImpl.class).in(Scopes.NO_SCOPE);
        bind(ClientService.class).to(ClientServiceImpl.class).in(Scopes.NO_SCOPE);
    }
}
