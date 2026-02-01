package com.harman.jbl.partybox.ui.core.base;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class b implements m0.b {

    /* renamed from: b, reason: collision with root package name */
    @d
    private final PartyBoxDevice f42426b;

    public b(@d PartyBoxDevice device) {
        F.p(device, "device");
        this.f42426b = device;
    }

    @Override // androidx.lifecycle.m0.b
    @d
    public <T extends j0> T a(@d Class<T> modelClass) {
        F.p(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(a.class)) {
            return new a(this.f42426b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
