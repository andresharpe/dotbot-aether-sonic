package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.N;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27369a = "cct";

    public static h a(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new c(context, aVar, aVar2, f27369a);
    }

    public static h b(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context c();

    @N
    public abstract String d();

    public abstract com.google.android.datatransport.runtime.time.a e();

    public abstract com.google.android.datatransport.runtime.time.a f();
}
