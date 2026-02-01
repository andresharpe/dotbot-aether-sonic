package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B0.a;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f27592a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1134d f27593b;

    /* renamed from: c, reason: collision with root package name */
    private final x f27594c;

    /* renamed from: d, reason: collision with root package name */
    private final B0.a f27595d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.a
    public v(Executor executor, InterfaceC1134d interfaceC1134d, x xVar, B0.a aVar) {
        this.f27592a = executor;
        this.f27593b = interfaceC1134d;
        this.f27594c = xVar;
        this.f27595d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<com.google.android.datatransport.runtime.q> it = this.f27593b.Q().iterator();
        while (it.hasNext()) {
            this.f27594c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f27595d.a(new a.InterfaceC0001a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.u
            @Override // B0.a.InterfaceC0001a
            public final Object a() {
                Object d4;
                d4 = v.this.d();
                return d4;
            }
        });
    }

    public void c() {
        this.f27592a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
