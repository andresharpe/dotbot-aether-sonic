package com.google.android.play.core.review.internal;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class p extends j {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ IBinder f34435F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ s f34436G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(s sVar, IBinder iBinder) {
        this.f34436G = sVar;
        this.f34435F = iBinder;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        List list;
        List list2;
        this.f34436G.f34438c.f34452m = e.A(this.f34435F);
        t.n(this.f34436G.f34438c);
        this.f34436G.f34438c.f34446g = false;
        list = this.f34436G.f34438c.f34443d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f34436G.f34438c.f34443d;
        list2.clear();
    }
}
