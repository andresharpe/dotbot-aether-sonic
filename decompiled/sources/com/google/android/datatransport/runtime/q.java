package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.d;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class q {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract q a();

        public abstract a b(String str);

        public abstract a c(@P byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract a d(Priority priority);
    }

    public static a a() {
        return new d.b().d(Priority.DEFAULT);
    }

    public abstract String b();

    @P
    public abstract byte[] c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Priority d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public q f(Priority priority) {
        return a().b(b()).d(priority).c(c()).a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
