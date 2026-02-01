package com.google.android.datatransport;

import androidx.annotation.P;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class d<T> {
    public static <T> d<T> d(int i4, T t3) {
        return new a(Integer.valueOf(i4), t3, Priority.DEFAULT);
    }

    public static <T> d<T> e(T t3) {
        return new a(null, t3, Priority.DEFAULT);
    }

    public static <T> d<T> f(int i4, T t3) {
        return new a(Integer.valueOf(i4), t3, Priority.VERY_LOW);
    }

    public static <T> d<T> g(T t3) {
        return new a(null, t3, Priority.VERY_LOW);
    }

    public static <T> d<T> h(int i4, T t3) {
        return new a(Integer.valueOf(i4), t3, Priority.HIGHEST);
    }

    public static <T> d<T> i(T t3) {
        return new a(null, t3, Priority.HIGHEST);
    }

    @P
    public abstract Integer a();

    public abstract T b();

    public abstract Priority c();
}
