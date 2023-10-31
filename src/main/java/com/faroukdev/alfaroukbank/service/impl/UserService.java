package com.faroukdev.alfaroukbank.service.impl;

import com.faroukdev.alfaroukbank.dto.BankResponse;
import com.faroukdev.alfaroukbank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
