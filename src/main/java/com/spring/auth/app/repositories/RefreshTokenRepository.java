package com.spring.auth.app.repositories;

import com.spring.auth.app.helpers.RefreshableCRUDRepository;
import com.spring.auth.app.models.RefreshToken;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RefreshTokenRepository extends RefreshableCRUDRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByToken(String token);
}
