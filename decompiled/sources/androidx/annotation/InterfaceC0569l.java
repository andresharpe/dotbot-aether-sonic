package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@P2.a
@P2.c(AnnotationRetention.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.FIELD})
/* renamed from: androidx.annotation.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0569l {
}
