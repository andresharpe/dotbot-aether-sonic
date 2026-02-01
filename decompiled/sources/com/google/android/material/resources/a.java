package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f33004a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0294a f33005b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33006c;

    /* renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0294a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0294a interfaceC0294a, Typeface typeface) {
        this.f33004a = typeface;
        this.f33005b = interfaceC0294a;
    }

    private void d(Typeface typeface) {
        if (!this.f33006c) {
            this.f33005b.a(typeface);
        }
    }

    @Override // com.google.android.material.resources.f
    public void a(int i4) {
        d(this.f33004a);
    }

    @Override // com.google.android.material.resources.f
    public void b(Typeface typeface, boolean z3) {
        d(typeface);
    }

    public void c() {
        this.f33006c = true;
    }
}
