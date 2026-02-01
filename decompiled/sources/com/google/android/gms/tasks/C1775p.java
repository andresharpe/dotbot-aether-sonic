package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.tasks.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1775p implements InterfaceC1762c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f31185a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1775p(Collection collection) {
        this.f31185a = collection;
    }

    @Override // com.google.android.gms.tasks.InterfaceC1762c
    public final /* bridge */ /* synthetic */ Object a(@androidx.annotation.N AbstractC1770k abstractC1770k) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f31185a.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1770k) it.next()).r());
        }
        return arrayList;
    }
}
