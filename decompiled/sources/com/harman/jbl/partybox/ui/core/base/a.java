package com.harman.jbl.partybox.ui.core.base;

import androidx.lifecycle.j0;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public class a extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @d
    private final PartyBoxDevice f42425H;

    public a(@d PartyBoxDevice device) {
        F.p(device, "device");
        this.f42425H = device;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        super.s();
    }

    @d
    public final PartyBoxDevice u() {
        return this.f42425H;
    }
}
