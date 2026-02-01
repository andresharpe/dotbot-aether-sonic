package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f33750a;

    /* renamed from: b, reason: collision with root package name */
    Context f33751b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f33752c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC0578v
    final int f33753d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(@N TextInputLayout textInputLayout, @InterfaceC0578v int i4) {
        this.f33750a = textInputLayout;
        this.f33751b = textInputLayout.getContext();
        this.f33752c = textInputLayout.getEndIconView();
        this.f33753d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i4) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }
}
