package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C0823k0;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f31370a;

    /* renamed from: b, reason: collision with root package name */
    private int f31371b;

    /* renamed from: c, reason: collision with root package name */
    private int f31372c;

    /* renamed from: d, reason: collision with root package name */
    private int f31373d;

    /* renamed from: e, reason: collision with root package name */
    private int f31374e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31375f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31376g = true;

    public e(View view) {
        this.f31370a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f31370a;
        C0823k0.f1(view, this.f31373d - (view.getTop() - this.f31371b));
        View view2 = this.f31370a;
        C0823k0.e1(view2, this.f31374e - (view2.getLeft() - this.f31372c));
    }

    public int b() {
        return this.f31372c;
    }

    public int c() {
        return this.f31371b;
    }

    public int d() {
        return this.f31374e;
    }

    public int e() {
        return this.f31373d;
    }

    public boolean f() {
        return this.f31376g;
    }

    public boolean g() {
        return this.f31375f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f31371b = this.f31370a.getTop();
        this.f31372c = this.f31370a.getLeft();
    }

    public void i(boolean z3) {
        this.f31376g = z3;
    }

    public boolean j(int i4) {
        if (this.f31376g && this.f31374e != i4) {
            this.f31374e = i4;
            a();
            return true;
        }
        return false;
    }

    public boolean k(int i4) {
        if (this.f31375f && this.f31373d != i4) {
            this.f31373d = i4;
            a();
            return true;
        }
        return false;
    }

    public void l(boolean z3) {
        this.f31375f = z3;
    }
}
