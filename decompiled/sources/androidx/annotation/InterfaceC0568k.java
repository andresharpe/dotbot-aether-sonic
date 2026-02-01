package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.FIELD, ElementType.METHOD})
@P2.a
@P2.c(AnnotationRetention.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD})
/* renamed from: androidx.annotation.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0568k {
    int api() default -1;

    String codename() default "";

    int lambda() default -1;

    int parameter() default -1;
}
