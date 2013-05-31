package com.dianping.gladio.domain.implementation;

import com.dianping.gladio.domain.ClientService;
import com.google.inject.Inject;

import com.dianping.gladio.domain.Service;

public class ClientServiceImpl implements ClientService {
    private final Service service;

    @Inject
    public ClientServiceImpl(Service service) {
        this.service = service;
    }

    public void go() {
        service.go();
    }
}
