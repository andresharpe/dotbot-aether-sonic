package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.util.D;

@I0.a
/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static e f29034b = new e();

    /* renamed from: a, reason: collision with root package name */
    @P
    private d f29035a = null;

    @I0.a
    @N
    public static d a(@N Context context) {
        return f29034b.b(context);
    }

    @N
    @D
    public final synchronized d b(@N Context context) {
        try {
            if (this.f29035a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f29035a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f29035a;
    }
}
