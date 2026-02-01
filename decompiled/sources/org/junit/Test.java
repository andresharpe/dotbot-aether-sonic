package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface Test {

    /* loaded from: classes2.dex */
    public static class None extends Throwable {

        /* renamed from: E, reason: collision with root package name */
        private static final long f55490E = 1;

        private None() {
        }
    }

    Class<? extends Throwable> expected() default None.class;

    long timeout() default 0;
}
