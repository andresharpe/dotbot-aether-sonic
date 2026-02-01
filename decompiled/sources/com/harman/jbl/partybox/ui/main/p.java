package com.harman.jbl.partybox.ui.main;

import androidx.lifecycle.j0;
import com.harman.jbl.partybox.j;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class p extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private ArrayList<com.harman.jbl.partybox.model.g> f44225H;

    public p() {
        ArrayList<com.harman.jbl.partybox.model.g> s4;
        s4 = CollectionsKt__CollectionsKt.s(new com.harman.jbl.partybox.model.g(j.m.f41647G1, j.f.Ha), new com.harman.jbl.partybox.model.g(j.m.f41839x2, j.f.Ia), new com.harman.jbl.partybox.model.g(j.m.f41725a, j.f.Ga));
        this.f44225H = s4;
    }

    @l3.d
    public final ArrayList<com.harman.jbl.partybox.model.g> u() {
        return this.f44225H;
    }

    public final void v(@l3.d ArrayList<com.harman.jbl.partybox.model.g> arrayList) {
        F.p(arrayList, "<set-?>");
        this.f44225H = arrayList;
    }
}
