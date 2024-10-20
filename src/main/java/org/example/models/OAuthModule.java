package org.example.models;

import dagger.Module;
import dagger.Provides;
//import org.example.services.AuthenticationService;
import org.example.services.AuthenticationServiceImpl;

import javax.inject.Inject;

@Module
public class OAuthModule {

    @Provides
    public AuthenticationServiceImpl getAuthService() {
        return new AuthenticationServiceImpl();
    }
}
