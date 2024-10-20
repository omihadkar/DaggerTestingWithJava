package org.example.config;

import dagger.Component;
import org.example.models.FooServiceModule;
import org.example.models.OAuthModule;
import org.example.services.WrapperService;

import javax.inject.Inject;
import javax.inject.Singleton;

//@Singleton
@Component(modules = {OAuthModule.class, FooServiceModule.class})
public interface AppComponent {

    WrapperService wrapperService();

}


