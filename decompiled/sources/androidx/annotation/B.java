package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.FIELD, ElementType.METHOD})
@P2.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
/* loaded from: classes.dex */
public @interface B {
    String value();
}
