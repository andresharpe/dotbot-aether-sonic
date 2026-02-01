package com.google.android.material.internal;

import androidx.annotation.N;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Deprecated
/* renamed from: com.google.android.material.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC1785f {
    @N
    String value() default "";
}
