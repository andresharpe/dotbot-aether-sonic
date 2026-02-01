package p0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC2388a {
    String method() default "GET";

    String path() default "/";
}
