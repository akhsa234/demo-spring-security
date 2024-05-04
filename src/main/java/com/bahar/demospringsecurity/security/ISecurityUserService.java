package com.bahar.demospringsecurity.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);
}
