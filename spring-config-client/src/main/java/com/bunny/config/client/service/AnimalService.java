package com.bunny.config.client.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class AnimalService {
    @Value("${server.port}")
    private String port;
    @Value("${server.id}")
    private String id;
}
