package com.harman.jbl.partybox.generated.callback;

import android.view.View;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: E, reason: collision with root package name */
    final InterfaceC0358a f40554E;

    /* renamed from: F, reason: collision with root package name */
    final int f40555F;

    /* renamed from: com.harman.jbl.partybox.generated.callback.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0358a {
        void b(int i4, View view);
    }

    public a(InterfaceC0358a interfaceC0358a, int i4) {
        this.f40554E = interfaceC0358a;
        this.f40555F = i4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f40554E.b(this.f40555F, view);
    }
}
