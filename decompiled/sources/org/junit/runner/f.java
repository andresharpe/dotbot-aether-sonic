package org.junit.runner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.runner.manipulation.f;

@Target({ElementType.TYPE})
@Inherited
@org.junit.validator.f(g.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface f {
    Class<? extends f.c> value();
}
