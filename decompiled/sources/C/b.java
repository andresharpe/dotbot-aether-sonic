package c;

import P2.c;
import P2.d;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@InterfaceC2205l(message = "This annotation has been replaced by `@OptIn`", replaceWith = @V(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FILE, AnnotationTarget.TYPEALIAS})
/* loaded from: classes.dex */
public @interface b {
    Class<? extends Annotation>[] markerClass();
}
