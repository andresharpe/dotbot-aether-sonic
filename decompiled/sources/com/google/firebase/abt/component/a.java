package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.B;
import androidx.annotation.i0;
import com.google.firebase.abt.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @B("this")
    private final Map<String, c> f34508a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f34509b;

    /* renamed from: c, reason: collision with root package name */
    private final C1.b<com.google.firebase.analytics.connector.a> f34510c;

    /* JADX INFO: Access modifiers changed from: protected */
    @i0(otherwise = 3)
    public a(Context context, C1.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f34509b = context;
        this.f34510c = bVar;
    }

    @i0
    protected c a(String str) {
        return new c(this.f34509b, this.f34510c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.f34508a.containsKey(str)) {
                this.f34508a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f34508a.get(str);
    }
}
