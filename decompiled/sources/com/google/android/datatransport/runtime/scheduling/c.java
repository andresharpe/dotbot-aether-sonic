package com.google.android.datatransport.runtime.scheduling;

import B0.a;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import com.google.android.datatransport.runtime.v;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f27495f = Logger.getLogger(v.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f27496a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f27497b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f27498c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1134d f27499d;

    /* renamed from: e, reason: collision with root package name */
    private final B0.a f27500e;

    @O2.a
    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, x xVar, InterfaceC1134d interfaceC1134d, B0.a aVar) {
        this.f27497b = executor;
        this.f27498c = eVar;
        this.f27496a = xVar;
        this.f27499d = interfaceC1134d;
        this.f27500e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(q qVar, j jVar) {
        this.f27499d.I0(qVar, jVar);
        this.f27496a.a(qVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final q qVar, com.google.android.datatransport.i iVar, j jVar) {
        try {
            m a4 = this.f27498c.a(qVar.b());
            if (a4 == null) {
                String format = String.format("Transport backend '%s' is not registered", qVar.b());
                f27495f.warning(format);
                iVar.a(new IllegalArgumentException(format));
            } else {
                final j b4 = a4.b(jVar);
                this.f27500e.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.b
                    @Override // B0.a.InterfaceC0001a
                    public final Object a() {
                        Object d4;
                        d4 = c.this.d(qVar, b4);
                        return d4;
                    }
                });
                iVar.a(null);
            }
        } catch (Exception e4) {
            f27495f.warning("Error scheduling event " + e4.getMessage());
            iVar.a(e4);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.e
    public void a(final q qVar, final j jVar, final com.google.android.datatransport.i iVar) {
        this.f27497b.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(qVar, iVar, jVar);
            }
        });
    }
}
