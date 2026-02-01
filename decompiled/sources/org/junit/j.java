package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface j {

    /* renamed from: P0, reason: collision with root package name */
    public static final int f55660P0 = -1;

    int order() default -1;
}
