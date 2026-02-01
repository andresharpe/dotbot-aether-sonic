package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.DeprecationLevel;
import kotlin.Y;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.P;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@P2.b
@P2.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
@Y(version = "1.2")
@Repeatable(a.class)
/* loaded from: classes2.dex */
public @interface p {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @P
    @P2.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @P2.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
    /* loaded from: classes2.dex */
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    DeprecationLevel level() default DeprecationLevel.ERROR;

    String message() default "";

    String version();

    RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;
}
