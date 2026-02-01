package com.google.android.material.timepicker;

import T0.a;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.C0669d;
import androidx.core.view.accessibility.M;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.harman.sdk.utils.k;

/* loaded from: classes2.dex */
class f implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, h {

    /* renamed from: J, reason: collision with root package name */
    private static final String[] f33934J = {"12", "1", "2", "3", com.harman.jbl.partybox.ui.effectlab.a.f43467l, "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: K, reason: collision with root package name */
    private static final String[] f33935K = {"00", "2", com.harman.jbl.partybox.ui.effectlab.a.f43467l, "6", "8", "10", "12", "14", "16", "18", "20", "22"};

    /* renamed from: L, reason: collision with root package name */
    private static final String[] f33936L = {"00", "5", "10", "15", "20", "25", "30", k.f48565B, k.f48592K, k.f48698o1, "50", k.f48613R};

    /* renamed from: M, reason: collision with root package name */
    private static final int f33937M = 30;

    /* renamed from: N, reason: collision with root package name */
    private static final int f33938N = 6;

    /* renamed from: E, reason: collision with root package name */
    private final TimePickerView f33939E;

    /* renamed from: F, reason: collision with root package name */
    private final e f33940F;

    /* renamed from: G, reason: collision with root package name */
    private float f33941G;

    /* renamed from: H, reason: collision with root package name */
    private float f33942H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f33943I = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.android.material.timepicker.a {
        a(Context context, int i4) {
            super(context, i4);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(view.getResources().getString(a.m.f3117j0, String.valueOf(f.this.f33940F.c())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends com.google.android.material.timepicker.a {
        b(Context context, int i4) {
            super(context, i4);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(view.getResources().getString(a.m.f3123l0, String.valueOf(f.this.f33940F.f33931I)));
        }
    }

    public f(TimePickerView timePickerView, e eVar) {
        this.f33939E = timePickerView;
        this.f33940F = eVar;
        b();
    }

    private int j() {
        if (this.f33940F.f33929G == 1) {
            return 15;
        }
        return 30;
    }

    private String[] k() {
        if (this.f33940F.f33929G == 1) {
            return f33935K;
        }
        return f33934J;
    }

    private void l(int i4, int i5) {
        e eVar = this.f33940F;
        if (eVar.f33931I != i5 || eVar.f33930H != i4) {
            this.f33939E.performHapticFeedback(4);
        }
    }

    private void n() {
        TimePickerView timePickerView = this.f33939E;
        e eVar = this.f33940F;
        timePickerView.b(eVar.f33933K, eVar.c(), this.f33940F.f33931I);
    }

    private void o() {
        p(f33934J, e.f33926M);
        p(f33935K, e.f33926M);
        p(f33936L, e.f33925L);
    }

    private void p(String[] strArr, String str) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            strArr[i4] = e.b(this.f33939E.getResources(), strArr[i4], str);
        }
    }

    @Override // com.google.android.material.timepicker.h
    public void a() {
        this.f33939E.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.h
    public void b() {
        if (this.f33940F.f33929G == 0) {
            this.f33939E.Z();
        }
        this.f33939E.O(this);
        this.f33939E.W(this);
        this.f33939E.V(this);
        this.f33939E.T(this);
        o();
        c();
    }

    @Override // com.google.android.material.timepicker.h
    public void c() {
        this.f33942H = this.f33940F.c() * j();
        e eVar = this.f33940F;
        this.f33941G = eVar.f33931I * 6;
        m(eVar.f33932J, false);
        n();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void d(float f4, boolean z3) {
        if (this.f33943I) {
            return;
        }
        e eVar = this.f33940F;
        int i4 = eVar.f33930H;
        int i5 = eVar.f33931I;
        int round = Math.round(f4);
        e eVar2 = this.f33940F;
        if (eVar2.f33932J == 12) {
            eVar2.l((round + 3) / 6);
            this.f33941G = (float) Math.floor(this.f33940F.f33931I * 6);
        } else {
            this.f33940F.h((round + (j() / 2)) / j());
            this.f33942H = this.f33940F.c() * j();
        }
        if (!z3) {
            n();
            l(i4, i5);
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void e(float f4, boolean z3) {
        this.f33943I = true;
        e eVar = this.f33940F;
        int i4 = eVar.f33931I;
        int i5 = eVar.f33930H;
        if (eVar.f33932J == 10) {
            this.f33939E.Q(this.f33942H, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) C0669d.o(this.f33939E.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                m(12, true);
            }
        } else {
            int round = Math.round(f4);
            if (!z3) {
                this.f33940F.l(((round + 15) / 30) * 5);
                this.f33941G = this.f33940F.f33931I * 6;
            }
            this.f33939E.Q(this.f33941G, z3);
        }
        this.f33943I = false;
        n();
        l(i5, i4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void f(int i4) {
        this.f33940F.m(i4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void g(int i4) {
        m(i4, true);
    }

    @Override // com.google.android.material.timepicker.h
    public void h() {
        this.f33939E.setVisibility(8);
    }

    void m(int i4, boolean z3) {
        boolean z4;
        String[] k4;
        int i5;
        float f4;
        if (i4 == 12) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f33939E.P(z4);
        this.f33940F.f33932J = i4;
        TimePickerView timePickerView = this.f33939E;
        if (z4) {
            k4 = f33936L;
        } else {
            k4 = k();
        }
        if (z4) {
            i5 = a.m.f3123l0;
        } else {
            i5 = a.m.f3117j0;
        }
        timePickerView.c(k4, i5);
        TimePickerView timePickerView2 = this.f33939E;
        if (z4) {
            f4 = this.f33941G;
        } else {
            f4 = this.f33942H;
        }
        timePickerView2.Q(f4, z3);
        this.f33939E.a(i4);
        this.f33939E.S(new a(this.f33939E.getContext(), a.m.f3114i0));
        this.f33939E.R(new b(this.f33939E.getContext(), a.m.f3120k0));
    }
}
