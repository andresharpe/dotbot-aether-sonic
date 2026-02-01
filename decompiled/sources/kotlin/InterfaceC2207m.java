package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@P2.a
@Documented
@Retention(RetentionPolicy.RUNTIME)
@P2.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.TYPEALIAS})
@Y(version = "1.4")
/* renamed from: kotlin.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC2207m {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
