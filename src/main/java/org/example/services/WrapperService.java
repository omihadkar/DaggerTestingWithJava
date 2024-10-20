package org.example.services;


import javax.inject.Inject;
import java.util.Optional;

public class WrapperService {

    AuthenticationServiceImpl authenticationService;

    @Inject
    public WrapperService(AuthenticationServiceImpl authenticationService) {

        this.authenticationService = authenticationService;
    }

    public void startProcess() {
        var output = authenticationService.validate();
        System.out.println(Optional.ofNullable(output));
    }

}
