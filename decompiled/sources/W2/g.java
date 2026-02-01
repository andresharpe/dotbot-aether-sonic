package W2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Y;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@P2.a
@P2.c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@P2.d(allowedTargets = {AnnotationTarget.CLASS})
@Y(version = "1.5")
@Documented
/* loaded from: classes2.dex */
public @interface g {
}
