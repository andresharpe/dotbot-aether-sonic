package l1;

import com.google.errorprone.annotations.Modifier;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
@k(modifier = {Modifier.PUBLIC, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL})
/* loaded from: classes2.dex */
public @interface g {
}
