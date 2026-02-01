package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@InterfaceC2215s
@P2.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.CLASS})
@Y(version = "1.8")
/* renamed from: kotlin.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC2085c0 {
    Class<? extends Annotation> markerClass();
}
