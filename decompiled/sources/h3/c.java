package h3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@P2.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.CLASS})
/* loaded from: classes2.dex */
public @interface c {
}
