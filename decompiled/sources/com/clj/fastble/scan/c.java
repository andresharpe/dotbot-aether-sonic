package com.clj.fastble.scan;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import com.clj.fastble.data.BleScanState;
import java.util.List;
import java.util.UUID;
import v0.h;
import v0.i;
import v0.j;

@TargetApi(18)
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private BleScanState f27128a = BleScanState.STATE_IDLE;

    /* renamed from: b, reason: collision with root package name */
    private final com.clj.fastble.scan.a f27129b = new a();

    /* loaded from: classes.dex */
    class a extends com.clj.fastble.scan.a {

        /* renamed from: com.clj.fastble.scan.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0248a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ List f27131E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ h f27132F;

            RunnableC0248a(List list, h hVar) {
                this.f27131E = list;
                this.f27132F = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.clj.fastble.a.w().c((com.clj.fastble.data.b) this.f27131E.get(0), this.f27132F);
            }
        }

        a() {
        }

        @Override // com.clj.fastble.scan.a
        public void j(com.clj.fastble.data.b bVar) {
            if (c.this.f27129b.g()) {
                h hVar = (h) c.this.f27129b.e();
                if (hVar != null) {
                    hVar.r(bVar);
                    return;
                }
                return;
            }
            i iVar = (i) c.this.f27129b.e();
            if (iVar != null) {
                iVar.a(bVar);
            }
        }

        @Override // com.clj.fastble.scan.a
        public void k(List<com.clj.fastble.data.b> list) {
            if (c.this.f27129b.g()) {
                h hVar = (h) c.this.f27129b.e();
                if (list != null && list.size() >= 1) {
                    if (hVar != null) {
                        hVar.s(list.get(0));
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0248a(list, hVar), 100L);
                    return;
                } else {
                    if (hVar != null) {
                        hVar.s(null);
                        return;
                    }
                    return;
                }
            }
            i iVar = (i) c.this.f27129b.e();
            if (iVar != null) {
                iVar.b(list);
            }
        }

        @Override // com.clj.fastble.scan.a
        public void l(boolean z3) {
            j e4 = c.this.f27129b.e();
            if (e4 != null) {
                e4.m(z3);
            }
        }

        @Override // com.clj.fastble.scan.a
        public void m(com.clj.fastble.data.b bVar) {
            j e4 = c.this.f27129b.e();
            if (e4 != null) {
                e4.i(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f27134a = new c();

        private b() {
        }
    }

    public static c b() {
        return b.f27134a;
    }

    private synchronized void f(UUID[] uuidArr, String[] strArr, String str, boolean z3, boolean z4, long j4, j jVar) {
        BleScanState bleScanState = this.f27128a;
        BleScanState bleScanState2 = BleScanState.STATE_IDLE;
        if (bleScanState != bleScanState2) {
            com.clj.fastble.utils.a.d("scan action already exists, complete the previous scan action first");
            if (jVar != null) {
                jVar.m(false);
            }
        } else {
            this.f27129b.n(strArr, str, z3, z4, j4, jVar);
            boolean startLeScan = com.clj.fastble.a.w().o().startLeScan(uuidArr, this.f27129b);
            if (startLeScan) {
                bleScanState2 = BleScanState.STATE_SCANNING;
            }
            this.f27128a = bleScanState2;
            this.f27129b.h(startLeScan);
        }
    }

    public BleScanState c() {
        return this.f27128a;
    }

    public void d(UUID[] uuidArr, String[] strArr, String str, boolean z3, long j4, i iVar) {
        f(uuidArr, strArr, str, z3, false, j4, iVar);
    }

    public void e(UUID[] uuidArr, String[] strArr, String str, boolean z3, long j4, h hVar) {
        f(uuidArr, strArr, str, z3, true, j4, hVar);
    }

    public synchronized void g() {
        com.clj.fastble.a.w().o().stopLeScan(this.f27129b);
        this.f27128a = BleScanState.STATE_IDLE;
        this.f27129b.i();
    }
}
