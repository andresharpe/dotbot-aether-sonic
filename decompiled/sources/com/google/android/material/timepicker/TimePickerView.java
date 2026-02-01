package com.google.android.material.timepicker;

import T0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.c0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout implements com.google.android.material.timepicker.g {

    /* renamed from: y0, reason: collision with root package name */
    static final String f33901y0 = "android.view.View";

    /* renamed from: p0, reason: collision with root package name */
    private final Chip f33902p0;

    /* renamed from: q0, reason: collision with root package name */
    private final Chip f33903q0;

    /* renamed from: r0, reason: collision with root package name */
    private final ClockHandView f33904r0;

    /* renamed from: s0, reason: collision with root package name */
    private final ClockFaceView f33905s0;

    /* renamed from: t0, reason: collision with root package name */
    private final MaterialButtonToggleGroup f33906t0;

    /* renamed from: u0, reason: collision with root package name */
    private final View.OnClickListener f33907u0;

    /* renamed from: v0, reason: collision with root package name */
    private f f33908v0;

    /* renamed from: w0, reason: collision with root package name */
    private g f33909w0;

    /* renamed from: x0, reason: collision with root package name */
    private e f33910x0;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f33909w0 != null) {
                TimePickerView.this.f33909w0.g(((Integer) view.getTag(a.h.M4)).intValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z3) {
            int i5;
            if (i4 == a.h.f2650F2) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (TimePickerView.this.f33908v0 != null && z3) {
                TimePickerView.this.f33908v0.f(i5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.f33910x0;
            if (eVar != null) {
                eVar.onDoubleTap();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ GestureDetector f33914E;

        d(GestureDetector gestureDetector) {
            this.f33914E = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f33914E.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    interface e {
        void onDoubleTap();
    }

    /* loaded from: classes2.dex */
    interface f {
        void f(int i4);
    }

    /* loaded from: classes2.dex */
    interface g {
        void g(int i4);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void X() {
        this.f33902p0.setTag(a.h.M4, 12);
        this.f33903q0.setTag(a.h.M4, 10);
        this.f33902p0.setOnClickListener(this.f33907u0);
        this.f33903q0.setOnClickListener(this.f33907u0);
        this.f33902p0.setAccessibilityClassName(f33901y0);
        this.f33903q0.setAccessibilityClassName(f33901y0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Y() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f33902p0.setOnTouchListener(dVar);
        this.f33903q0.setOnTouchListener(dVar);
    }

    private void a0(Chip chip, boolean z3) {
        int i4;
        chip.setChecked(z3);
        if (z3) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        C0823k0.D1(chip, i4);
    }

    private void b0() {
        int i4;
        if (this.f33906t0.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.H(this);
            if (C0823k0.Z(this) == 0) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            dVar.F(a.h.f2634B2, i4);
            dVar.r(this);
        }
    }

    public void O(ClockHandView.d dVar) {
        this.f33904r0.b(dVar);
    }

    public void P(boolean z3) {
        this.f33904r0.j(z3);
    }

    public void Q(float f4, boolean z3) {
        this.f33904r0.m(f4, z3);
    }

    public void R(C0771a c0771a) {
        C0823k0.B1(this.f33902p0, c0771a);
    }

    public void S(C0771a c0771a) {
        C0823k0.B1(this.f33903q0, c0771a);
    }

    public void T(ClockHandView.c cVar) {
        this.f33904r0.o(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(@P e eVar) {
        this.f33910x0 = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(f fVar) {
        this.f33908v0 = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(g gVar) {
        this.f33909w0 = gVar;
    }

    public void Z() {
        this.f33906t0.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.g
    public void a(int i4) {
        boolean z3;
        Chip chip = this.f33902p0;
        boolean z4 = false;
        if (i4 == 12) {
            z3 = true;
        } else {
            z3 = false;
        }
        a0(chip, z3);
        Chip chip2 = this.f33903q0;
        if (i4 == 10) {
            z4 = true;
        }
        a0(chip2, z4);
    }

    @Override // com.google.android.material.timepicker.g
    @SuppressLint({"DefaultLocale"})
    public void b(int i4, int i5, int i6) {
        int i7;
        if (i4 == 1) {
            i7 = a.h.f2650F2;
        } else {
            i7 = a.h.f2646E2;
        }
        this.f33906t0.e(i7);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, com.google.android.material.timepicker.e.f33925L, Integer.valueOf(i6));
        String format2 = String.format(locale, com.google.android.material.timepicker.e.f33925L, Integer.valueOf(i5));
        if (!TextUtils.equals(this.f33902p0.getText(), format)) {
            this.f33902p0.setText(format);
        }
        if (!TextUtils.equals(this.f33903q0.getText(), format2)) {
            this.f33903q0.setText(format2);
        }
    }

    @Override // com.google.android.material.timepicker.g
    public void c(String[] strArr, @c0 int i4) {
        this.f33905s0.c(strArr, i4);
    }

    @Override // com.google.android.material.timepicker.g
    public void f(float f4) {
        this.f33904r0.l(f4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b0();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@N View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (view == this && i4 == 0) {
            b0();
        }
    }

    public TimePickerView(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f33907u0 = new a();
        LayoutInflater.from(context).inflate(a.k.f2992h0, this);
        this.f33905s0 = (ClockFaceView) findViewById(a.h.f2638C2);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(a.h.f2654G2);
        this.f33906t0 = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f33902p0 = (Chip) findViewById(a.h.f2674L2);
        this.f33903q0 = (Chip) findViewById(a.h.f2662I2);
        this.f33904r0 = (ClockHandView) findViewById(a.h.f2642D2);
        Y();
        X();
    }
}
