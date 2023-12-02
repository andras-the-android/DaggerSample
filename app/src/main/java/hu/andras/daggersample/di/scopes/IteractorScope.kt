package hu.andras.daggersample.di.scopes;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Andras_Nemeth on 2017. 10. 04..
 */

@Scope
@Documented
@Retention(value= RetentionPolicy.RUNTIME)
public @interface IteractorScope {
}
