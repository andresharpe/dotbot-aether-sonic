package P2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
/* loaded from: classes2.dex */
public @interface a {
}
