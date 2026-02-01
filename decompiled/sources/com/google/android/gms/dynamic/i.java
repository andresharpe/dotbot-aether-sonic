package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f29048a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a aVar) {
        this.f29048a = aVar;
    }

    @Override // com.google.android.gms.dynamic.g
    public final void a(e eVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        e eVar2;
        this.f29048a.f29041a = eVar;
        linkedList = this.f29048a.f29043c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            eVar2 = this.f29048a.f29041a;
            pVar.a(eVar2);
        }
        linkedList2 = this.f29048a.f29043c;
        linkedList2.clear();
        this.f29048a.f29042b = null;
    }
}
