package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1776q implements InterfaceC1762c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f31186a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1776q(Collection collection) {
        this.f31186a = collection;
    }

    @Override // com.google.android.gms.tasks.InterfaceC1762c
    public final /* bridge */ /* synthetic */ Object a(@androidx.annotation.N AbstractC1770k abstractC1770k) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f31186a);
        return C1773n.g(arrayList);
    }
}
