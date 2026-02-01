package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC2205l;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.METHOD})
@InterfaceC2205l(message = "Replaced by the {@code androidx.resourceinpsection} package.")
@P2.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
/* loaded from: classes.dex */
public @interface InspectableProperty {

    @kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public enum ValueType {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @P2.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @P2.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    /* loaded from: classes.dex */
    public @interface a {
        String name();

        int value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @P2.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @P2.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    /* loaded from: classes.dex */
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    ValueType valueType() default ValueType.INFERRED;
}
