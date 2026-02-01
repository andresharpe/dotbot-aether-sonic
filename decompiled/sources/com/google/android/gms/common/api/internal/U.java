package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.internal.InterfaceC1268p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class U extends AbstractRunnableC1170a0 {

    /* renamed from: F, reason: collision with root package name */
    private final ArrayList<C1164a.f> f28212F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1173b0 f28213G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1173b0 c1173b0, ArrayList<C1164a.f> arrayList) {
        super(c1173b0, null);
        this.f28213G = c1173b0;
        this.f28212F = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC1170a0
    @androidx.annotation.j0
    public final void a() {
        C1208o0 c1208o0;
        InterfaceC1268p interfaceC1268p;
        C1208o0 c1208o02;
        C1173b0 c1173b0 = this.f28213G;
        c1208o0 = c1173b0.f28232a;
        c1208o0.f28377v.f28339s = C1173b0.y(c1173b0);
        ArrayList<C1164a.f> arrayList = this.f28212F;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1164a.f fVar = arrayList.get(i4);
            C1173b0 c1173b02 = this.f28213G;
            interfaceC1268p = c1173b02.f28246o;
            c1208o02 = c1173b02.f28232a;
            fVar.i(interfaceC1268p, c1208o02.f28377v.f28339s);
        }
    }
}
