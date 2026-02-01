package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
/* renamed from: androidx.databinding.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0879d {
    boolean requireAll() default true;

    String[] value();
}
