package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;

@O2.f
/* loaded from: classes.dex */
public class v implements u {

    /* renamed from: e, reason: collision with root package name */
    private static volatile w f27710e;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27711a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27712b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.e f27713c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.r f27714d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.a
    public v(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.r rVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.v vVar) {
        this.f27711a = aVar;
        this.f27712b = aVar2;
        this.f27713c = eVar;
        this.f27714d = rVar;
        vVar.c();
    }

    private j b(p pVar) {
        return j.a().i(this.f27711a.a()).k(this.f27712b.a()).j(pVar.g()).h(new i(pVar.b(), pVar.d())).g(pVar.c().a()).d();
    }

    public static v c() {
        w wVar = f27710e;
        if (wVar != null) {
            return wVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<com.google.android.datatransport.c> d(g gVar) {
        if (gVar instanceof h) {
            return Collections.unmodifiableSet(((h) gVar).a());
        }
        return Collections.singleton(com.google.android.datatransport.c.b("proto"));
    }

    public static void f(Context context) {
        if (f27710e == null) {
            synchronized (v.class) {
                try {
                    if (f27710e == null) {
                        f27710e = f.c().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @i0
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void i(w wVar, Callable<Void> callable) throws Throwable {
        w wVar2;
        synchronized (v.class) {
            wVar2 = f27710e;
            f27710e = wVar;
        }
        try {
            callable.call();
            synchronized (v.class) {
                f27710e = wVar2;
            }
        } catch (Throwable th) {
            synchronized (v.class) {
                f27710e = wVar2;
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.u
    public void a(p pVar, com.google.android.datatransport.i iVar) {
        this.f27713c.a(pVar.f().f(pVar.c().c()), b(pVar), iVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.r e() {
        return this.f27714d;
    }

    public com.google.android.datatransport.h g(g gVar) {
        return new r(d(gVar), q.a().b(gVar.getName()).c(gVar.getExtras()).a(), this);
    }

    @Deprecated
    public com.google.android.datatransport.h h(String str) {
        return new r(d(null), q.a().b(str).a(), this);
    }
}
