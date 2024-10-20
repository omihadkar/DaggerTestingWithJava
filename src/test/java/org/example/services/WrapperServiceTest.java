package org.example.services;

import junit.framework.TestCase;
/*import org.example.config.DaggerTestComponent;
import org.example.config.TestComponent;*/
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


public class WrapperServiceTest  {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    AuthenticationServiceImpl authenticationService;

    @InjectMocks
    WrapperService wrapperService;

    @Test
    public void testStartProcess() {
        when(authenticationService.validate()).thenReturn("Hello ji");
        wrapperService.startProcess();

    }
}