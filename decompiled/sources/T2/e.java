package T2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.Y;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.ANNOTATION_TYPE})
@P2.a
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@P2.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Y(version = "1.3")
@Documented
/* loaded from: classes2.dex */
public @interface e {
}
