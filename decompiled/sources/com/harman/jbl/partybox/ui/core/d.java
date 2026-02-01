package com.harman.jbl.partybox.ui.core;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d implements m0.b {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final PartyBoxDevice f42432b;

    public d(@l3.d PartyBoxDevice device) {
        F.p(device, "device");
        this.f42432b = device;
    }

    @Override // androidx.lifecycle.m0.b
    @l3.d
    public <T extends j0> T a(@l3.d Class<T> modelClass) {
        F.p(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(c.class)) {
            return new c(this.f42432b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
