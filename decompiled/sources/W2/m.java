package W2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Y;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({})
@P2.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.EXPRESSION})
@Y(version = "1.8")
/* loaded from: classes2.dex */
public @interface m {
}
