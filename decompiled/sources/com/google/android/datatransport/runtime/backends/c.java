package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: b, reason: collision with root package name */
    private final Context f27365b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27366c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27367d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27368e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context != null) {
            this.f27365b = context;
            if (aVar != null) {
                this.f27366c = aVar;
                if (aVar2 != null) {
                    this.f27367d = aVar2;
                    if (str != null) {
                        this.f27368e = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public Context c() {
        return this.f27365b;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    @N
    public String d() {
        return this.f27368e;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public com.google.android.datatransport.runtime.time.a e() {
        return this.f27367d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f27365b.equals(hVar.c()) && this.f27366c.equals(hVar.f()) && this.f27367d.equals(hVar.e()) && this.f27368e.equals(hVar.d())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public com.google.android.datatransport.runtime.time.a f() {
        return this.f27366c;
    }

    public int hashCode() {
        return ((((((this.f27365b.hashCode() ^ 1000003) * 1000003) ^ this.f27366c.hashCode()) * 1000003) ^ this.f27367d.hashCode()) * 1000003) ^ this.f27368e.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f27365b + ", wallClock=" + this.f27366c + ", monotonicClock=" + this.f27367d + ", backendName=" + this.f27368e + "}";
    }
}
