package com.google.android.material.timepicker;

import T0.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.core.view.C0823k0;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.e {

    /* renamed from: G1, reason: collision with root package name */
    static final String f33858G1 = "TIME_PICKER_TIME_MODEL";

    /* renamed from: H1, reason: collision with root package name */
    static final String f33859H1 = "TIME_PICKER_INPUT_MODE";

    /* renamed from: I1, reason: collision with root package name */
    static final String f33860I1 = "TIME_PICKER_TITLE_RES";
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;

    /* renamed from: J1, reason: collision with root package name */
    static final String f33861J1 = "TIME_PICKER_TITLE_TEXT";

    /* renamed from: K1, reason: collision with root package name */
    static final String f33862K1 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";

    /* renamed from: L1, reason: collision with root package name */
    static final String f33863L1 = "TIME_PICKER_POSITIVE_BUTTON_TEXT";

    /* renamed from: M1, reason: collision with root package name */
    static final String f33864M1 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";

    /* renamed from: N1, reason: collision with root package name */
    static final String f33865N1 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";

    /* renamed from: O1, reason: collision with root package name */
    static final String f33866O1 = "TIME_PICKER_OVERRIDE_THEME_RES_ID";

    /* renamed from: A1, reason: collision with root package name */
    private CharSequence f33867A1;

    /* renamed from: B1, reason: collision with root package name */
    private MaterialButton f33868B1;

    /* renamed from: C1, reason: collision with root package name */
    private Button f33869C1;

    /* renamed from: E1, reason: collision with root package name */
    private e f33871E1;

    /* renamed from: o1, reason: collision with root package name */
    private TimePickerView f33877o1;

    /* renamed from: p1, reason: collision with root package name */
    private ViewStub f33878p1;

    /* renamed from: q1, reason: collision with root package name */
    @P
    private f f33879q1;

    /* renamed from: r1, reason: collision with root package name */
    @P
    private j f33880r1;

    /* renamed from: s1, reason: collision with root package name */
    @P
    private h f33881s1;

    /* renamed from: t1, reason: collision with root package name */
    @InterfaceC0578v
    private int f33882t1;

    /* renamed from: u1, reason: collision with root package name */
    @InterfaceC0578v
    private int f33883u1;

    /* renamed from: w1, reason: collision with root package name */
    private CharSequence f33885w1;

    /* renamed from: y1, reason: collision with root package name */
    private CharSequence f33887y1;

    /* renamed from: k1, reason: collision with root package name */
    private final Set<View.OnClickListener> f33873k1 = new LinkedHashSet();

    /* renamed from: l1, reason: collision with root package name */
    private final Set<View.OnClickListener> f33874l1 = new LinkedHashSet();

    /* renamed from: m1, reason: collision with root package name */
    private final Set<DialogInterface.OnCancelListener> f33875m1 = new LinkedHashSet();

    /* renamed from: n1, reason: collision with root package name */
    private final Set<DialogInterface.OnDismissListener> f33876n1 = new LinkedHashSet();

    /* renamed from: v1, reason: collision with root package name */
    @c0
    private int f33884v1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    @c0
    private int f33886x1 = 0;

    /* renamed from: z1, reason: collision with root package name */
    @c0
    private int f33888z1 = 0;

    /* renamed from: D1, reason: collision with root package name */
    private int f33870D1 = 0;

    /* renamed from: F1, reason: collision with root package name */
    private int f33872F1 = 0;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f33873k1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f33874l1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4;
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            if (materialTimePicker.f33870D1 == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            materialTimePicker.f33870D1 = i4;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.G0(materialTimePicker2.f33868B1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        private int f33893b;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f33895d;

        /* renamed from: f, reason: collision with root package name */
        private CharSequence f33897f;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f33899h;

        /* renamed from: a, reason: collision with root package name */
        private e f33892a = new e();

        /* renamed from: c, reason: collision with root package name */
        @c0
        private int f33894c = 0;

        /* renamed from: e, reason: collision with root package name */
        @c0
        private int f33896e = 0;

        /* renamed from: g, reason: collision with root package name */
        @c0
        private int f33898g = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f33900i = 0;

        @N
        public MaterialTimePicker j() {
            return MaterialTimePicker.C0(this);
        }

        @N
        public d k(@F(from = 0, to = 23) int i4) {
            this.f33892a.i(i4);
            return this;
        }

        @N
        public d l(int i4) {
            this.f33893b = i4;
            return this;
        }

        @N
        public d m(@F(from = 0, to = 59) int i4) {
            this.f33892a.l(i4);
            return this;
        }

        @N
        public d n(@c0 int i4) {
            this.f33898g = i4;
            return this;
        }

        @N
        public d o(@P CharSequence charSequence) {
            this.f33899h = charSequence;
            return this;
        }

        @N
        public d p(@c0 int i4) {
            this.f33896e = i4;
            return this;
        }

        @N
        public d q(@P CharSequence charSequence) {
            this.f33897f = charSequence;
            return this;
        }

        @N
        public d r(@d0 int i4) {
            this.f33900i = i4;
            return this;
        }

        @N
        public d s(int i4) {
            e eVar = this.f33892a;
            int i5 = eVar.f33930H;
            int i6 = eVar.f33931I;
            e eVar2 = new e(i4);
            this.f33892a = eVar2;
            eVar2.l(i6);
            this.f33892a.i(i5);
            return this;
        }

        @N
        public d t(@c0 int i4) {
            this.f33894c = i4;
            return this;
        }

        @N
        public d u(@P CharSequence charSequence) {
            this.f33895d = charSequence;
            return this;
        }
    }

    private h B0(int i4, @N TimePickerView timePickerView, @N ViewStub viewStub) {
        if (i4 == 0) {
            f fVar = this.f33879q1;
            if (fVar == null) {
                fVar = new f(timePickerView, this.f33871E1);
            }
            this.f33879q1 = fVar;
            return fVar;
        }
        if (this.f33880r1 == null) {
            this.f33880r1 = new j((LinearLayout) viewStub.inflate(), this.f33871E1);
        }
        this.f33880r1.f();
        return this.f33880r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public static MaterialTimePicker C0(@N d dVar) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f33858G1, dVar.f33892a);
        bundle.putInt(f33859H1, dVar.f33893b);
        bundle.putInt(f33860I1, dVar.f33894c);
        if (dVar.f33895d != null) {
            bundle.putCharSequence(f33861J1, dVar.f33895d);
        }
        bundle.putInt(f33862K1, dVar.f33896e);
        if (dVar.f33897f != null) {
            bundle.putCharSequence(f33863L1, dVar.f33897f);
        }
        bundle.putInt(f33864M1, dVar.f33898g);
        if (dVar.f33899h != null) {
            bundle.putCharSequence(f33865N1, dVar.f33899h);
        }
        bundle.putInt(f33866O1, dVar.f33900i);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void D0(@P Bundle bundle) {
        if (bundle == null) {
            return;
        }
        e eVar = (e) bundle.getParcelable(f33858G1);
        this.f33871E1 = eVar;
        if (eVar == null) {
            this.f33871E1 = new e();
        }
        this.f33870D1 = bundle.getInt(f33859H1, 0);
        this.f33884v1 = bundle.getInt(f33860I1, 0);
        this.f33885w1 = bundle.getCharSequence(f33861J1);
        this.f33886x1 = bundle.getInt(f33862K1, 0);
        this.f33887y1 = bundle.getCharSequence(f33863L1);
        this.f33888z1 = bundle.getInt(f33864M1, 0);
        this.f33867A1 = bundle.getCharSequence(f33865N1);
        this.f33872F1 = bundle.getInt(f33866O1, 0);
    }

    private void F0() {
        int i4;
        Button button = this.f33869C1;
        if (button != null) {
            if (isCancelable()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            button.setVisibility(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(MaterialButton materialButton) {
        if (materialButton != null && this.f33877o1 != null && this.f33878p1 != null) {
            h hVar = this.f33881s1;
            if (hVar != null) {
                hVar.h();
            }
            h B02 = B0(this.f33870D1, this.f33877o1, this.f33878p1);
            this.f33881s1 = B02;
            B02.a();
            this.f33881s1.c();
            Pair<Integer, Integer> y02 = y0(this.f33870D1);
            materialButton.setIconResource(((Integer) y02.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) y02.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    private Pair<Integer, Integer> y0(int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                return new Pair<>(Integer.valueOf(this.f33883u1), Integer.valueOf(a.m.f3147u0));
            }
            throw new IllegalArgumentException("no icon for mode: " + i4);
        }
        return new Pair<>(Integer.valueOf(this.f33882t1), Integer.valueOf(a.m.f3157z0));
    }

    private int z0() {
        int i4 = this.f33872F1;
        if (i4 != 0) {
            return i4;
        }
        TypedValue a4 = com.google.android.material.resources.b.a(requireContext(), a.c.mb);
        if (a4 == null) {
            return 0;
        }
        return a4.data;
    }

    @P
    f A0() {
        return this.f33879q1;
    }

    @i0
    void E0(@P h hVar) {
        this.f33881s1 = hVar;
    }

    public boolean addOnCancelListener(@N DialogInterface.OnCancelListener onCancelListener) {
        return this.f33875m1.add(onCancelListener);
    }

    public boolean addOnDismissListener(@N DialogInterface.OnDismissListener onDismissListener) {
        return this.f33876n1.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@N View.OnClickListener onClickListener) {
        return this.f33874l1.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@N View.OnClickListener onClickListener) {
        return this.f33873k1.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.f33875m1.clear();
    }

    public void clearOnDismissListeners() {
        this.f33876n1.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f33874l1.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f33873k1.clear();
    }

    @F(from = 0, to = 23)
    public int getHour() {
        return this.f33871E1.f33930H % 24;
    }

    public int getInputMode() {
        return this.f33870D1;
    }

    @F(from = 0, to = 59)
    public int getMinute() {
        return this.f33871E1.f33931I;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f33875m1.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        D0(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public final Dialog onCreateDialog(@P Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), z0());
        Context context = dialog.getContext();
        int g4 = com.google.android.material.resources.b.g(context, a.c.f1979o3, MaterialTimePicker.class.getCanonicalName());
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context, null, a.c.lb, a.n.Xi);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.o.Hm, a.c.lb, a.n.Xi);
        this.f33883u1 = obtainStyledAttributes.getResourceId(a.o.Im, 0);
        this.f33882t1 = obtainStyledAttributes.getResourceId(a.o.Jm, 0);
        obtainStyledAttributes.recycle();
        jVar.Z(context);
        jVar.o0(ColorStateList.valueOf(g4));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        jVar.n0(C0823k0.R(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(a.k.f2995i0, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(a.h.f2702S2);
        this.f33877o1 = timePickerView;
        timePickerView.U(this);
        this.f33878p1 = (ViewStub) viewGroup2.findViewById(a.h.f2678M2);
        this.f33868B1 = (MaterialButton) viewGroup2.findViewById(a.h.f2694Q2);
        TextView textView = (TextView) viewGroup2.findViewById(a.h.f2744c2);
        int i4 = this.f33884v1;
        if (i4 != 0) {
            textView.setText(i4);
        } else if (!TextUtils.isEmpty(this.f33885w1)) {
            textView.setText(this.f33885w1);
        }
        G0(this.f33868B1);
        Button button = (Button) viewGroup2.findViewById(a.h.f2698R2);
        button.setOnClickListener(new a());
        int i5 = this.f33886x1;
        if (i5 != 0) {
            button.setText(i5);
        } else if (!TextUtils.isEmpty(this.f33887y1)) {
            button.setText(this.f33887y1);
        }
        Button button2 = (Button) viewGroup2.findViewById(a.h.f2682N2);
        this.f33869C1 = button2;
        button2.setOnClickListener(new b());
        int i6 = this.f33888z1;
        if (i6 != 0) {
            this.f33869C1.setText(i6);
        } else if (!TextUtils.isEmpty(this.f33867A1)) {
            this.f33869C1.setText(this.f33867A1);
        }
        F0();
        this.f33868B1.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f33881s1 = null;
        this.f33879q1 = null;
        this.f33880r1 = null;
        TimePickerView timePickerView = this.f33877o1;
        if (timePickerView != null) {
            timePickerView.U(null);
            this.f33877o1 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@N DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f33876n1.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.f33870D1 = 1;
        G0(this.f33868B1);
        this.f33880r1.j();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f33858G1, this.f33871E1);
        bundle.putInt(f33859H1, this.f33870D1);
        bundle.putInt(f33860I1, this.f33884v1);
        bundle.putCharSequence(f33861J1, this.f33885w1);
        bundle.putInt(f33862K1, this.f33886x1);
        bundle.putCharSequence(f33863L1, this.f33887y1);
        bundle.putInt(f33864M1, this.f33888z1);
        bundle.putCharSequence(f33865N1, this.f33867A1);
        bundle.putInt(f33866O1, this.f33872F1);
    }

    public boolean removeOnCancelListener(@N DialogInterface.OnCancelListener onCancelListener) {
        return this.f33875m1.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@N DialogInterface.OnDismissListener onDismissListener) {
        return this.f33876n1.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@N View.OnClickListener onClickListener) {
        return this.f33874l1.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@N View.OnClickListener onClickListener) {
        return this.f33873k1.remove(onClickListener);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        F0();
    }

    public void setHour(@F(from = 0, to = 23) int i4) {
        this.f33871E1.h(i4);
        h hVar = this.f33881s1;
        if (hVar != null) {
            hVar.c();
        }
    }

    public void setMinute(@F(from = 0, to = 59) int i4) {
        this.f33871E1.l(i4);
        h hVar = this.f33881s1;
        if (hVar != null) {
            hVar.c();
        }
    }
}
