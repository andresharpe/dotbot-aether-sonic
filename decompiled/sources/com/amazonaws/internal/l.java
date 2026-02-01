package com.amazonaws.internal;

import com.amazonaws.auth.InterfaceC1029g;
import com.amazonaws.auth.InterfaceC1030h;

/* loaded from: classes.dex */
public class l implements InterfaceC1030h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1029g f23804a;

    public l(InterfaceC1029g interfaceC1029g) {
        this.f23804a = interfaceC1029g;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        return this.f23804a;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
    }
}
