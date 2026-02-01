package l1;

import com.google.errorprone.annotations.Modifier;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface k {
    Modifier[] modifier() default {};

    @Deprecated
    javax.lang.model.element.Modifier[] value() default {};
}
