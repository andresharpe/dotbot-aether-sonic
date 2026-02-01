package com.google.android.material.datepicker;

import T0.a;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.F;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.C1784e;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.E;
import e.C2046a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: G1, reason: collision with root package name */
    private static final String f32110G1 = "OVERRIDE_THEME_RES_ID";

    /* renamed from: H1, reason: collision with root package name */
    private static final String f32111H1 = "DATE_SELECTOR_KEY";

    /* renamed from: I1, reason: collision with root package name */
    private static final String f32112I1 = "CALENDAR_CONSTRAINTS_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;

    /* renamed from: J1, reason: collision with root package name */
    private static final String f32113J1 = "TITLE_TEXT_RES_ID_KEY";

    /* renamed from: K1, reason: collision with root package name */
    private static final String f32114K1 = "TITLE_TEXT_KEY";

    /* renamed from: L1, reason: collision with root package name */
    private static final String f32115L1 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";

    /* renamed from: M1, reason: collision with root package name */
    private static final String f32116M1 = "POSITIVE_BUTTON_TEXT_KEY";

    /* renamed from: N1, reason: collision with root package name */
    private static final String f32117N1 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";

    /* renamed from: O1, reason: collision with root package name */
    private static final String f32118O1 = "NEGATIVE_BUTTON_TEXT_KEY";

    /* renamed from: P1, reason: collision with root package name */
    private static final String f32119P1 = "INPUT_MODE_KEY";

    /* renamed from: Q1, reason: collision with root package name */
    static final Object f32120Q1 = "CONFIRM_BUTTON_TAG";

    /* renamed from: R1, reason: collision with root package name */
    static final Object f32121R1 = "CANCEL_BUTTON_TAG";

    /* renamed from: S1, reason: collision with root package name */
    static final Object f32122S1 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A1, reason: collision with root package name */
    private CharSequence f32123A1;

    /* renamed from: B1, reason: collision with root package name */
    private TextView f32124B1;

    /* renamed from: C1, reason: collision with root package name */
    private CheckableImageButton f32125C1;

    /* renamed from: D1, reason: collision with root package name */
    @P
    private com.google.android.material.shape.j f32126D1;

    /* renamed from: E1, reason: collision with root package name */
    private Button f32127E1;

    /* renamed from: F1, reason: collision with root package name */
    private boolean f32128F1;

    /* renamed from: k1, reason: collision with root package name */
    private final LinkedHashSet<k<? super S>> f32129k1 = new LinkedHashSet<>();

    /* renamed from: l1, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f32130l1 = new LinkedHashSet<>();

    /* renamed from: m1, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f32131m1 = new LinkedHashSet<>();

    /* renamed from: n1, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f32132n1 = new LinkedHashSet<>();

    /* renamed from: o1, reason: collision with root package name */
    @d0
    private int f32133o1;

    /* renamed from: p1, reason: collision with root package name */
    @P
    private com.google.android.material.datepicker.f<S> f32134p1;

    /* renamed from: q1, reason: collision with root package name */
    private q<S> f32135q1;

    /* renamed from: r1, reason: collision with root package name */
    @P
    private com.google.android.material.datepicker.a f32136r1;

    /* renamed from: s1, reason: collision with root package name */
    private MaterialCalendar<S> f32137s1;

    /* renamed from: t1, reason: collision with root package name */
    @c0
    private int f32138t1;

    /* renamed from: u1, reason: collision with root package name */
    private CharSequence f32139u1;

    /* renamed from: v1, reason: collision with root package name */
    private boolean f32140v1;

    /* renamed from: w1, reason: collision with root package name */
    private int f32141w1;

    /* renamed from: x1, reason: collision with root package name */
    @c0
    private int f32142x1;

    /* renamed from: y1, reason: collision with root package name */
    private CharSequence f32143y1;

    /* renamed from: z1, reason: collision with root package name */
    @c0
    private int f32144z1;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f32129k1.iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(MaterialDatePicker.this.getSelection());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f32130l1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements InterfaceC0772a0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32147a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f32148b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32149c;

        c(int i4, View view, int i5) {
            this.f32147a = i4;
            this.f32148b = view;
            this.f32149c = i5;
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            int i4 = y02.f(Y0.m.i()).f12400b;
            if (this.f32147a >= 0) {
                this.f32148b.getLayoutParams().height = this.f32147a + i4;
                View view2 = this.f32148b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f32148b;
            view3.setPadding(view3.getPaddingLeft(), this.f32149c + i4, this.f32148b.getPaddingRight(), this.f32148b.getPaddingBottom());
            return y02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends p<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.p
        public void a() {
            MaterialDatePicker.this.f32127E1.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.p
        public void b(S s4) {
            MaterialDatePicker.this.J0();
            MaterialDatePicker.this.f32127E1.setEnabled(MaterialDatePicker.this.getDateSelector().F());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker.this.f32127E1.setEnabled(MaterialDatePicker.this.getDateSelector().F());
            MaterialDatePicker.this.f32125C1.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.K0(materialDatePicker.f32125C1);
            MaterialDatePicker.this.I0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<S> {

        /* renamed from: a, reason: collision with root package name */
        final com.google.android.material.datepicker.f<S> f32153a;

        /* renamed from: c, reason: collision with root package name */
        com.google.android.material.datepicker.a f32155c;

        /* renamed from: b, reason: collision with root package name */
        int f32154b = 0;

        /* renamed from: d, reason: collision with root package name */
        int f32156d = 0;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f32157e = null;

        /* renamed from: f, reason: collision with root package name */
        int f32158f = 0;

        /* renamed from: g, reason: collision with root package name */
        CharSequence f32159g = null;

        /* renamed from: h, reason: collision with root package name */
        int f32160h = 0;

        /* renamed from: i, reason: collision with root package name */
        CharSequence f32161i = null;

        /* renamed from: j, reason: collision with root package name */
        @P
        S f32162j = null;

        /* renamed from: k, reason: collision with root package name */
        int f32163k = 0;

        private f(com.google.android.material.datepicker.f<S> fVar) {
            this.f32153a = fVar;
        }

        private m b() {
            if (!this.f32153a.H().isEmpty()) {
                m g4 = m.g(this.f32153a.H().iterator().next().longValue());
                if (f(g4, this.f32155c)) {
                    return g4;
                }
            }
            m i4 = m.i();
            if (!f(i4, this.f32155c)) {
                return this.f32155c.m();
            }
            return i4;
        }

        @N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> f<S> c(@N com.google.android.material.datepicker.f<S> fVar) {
            return new f<>(fVar);
        }

        @N
        public static f<Long> d() {
            return new f<>(new s());
        }

        @N
        public static f<androidx.core.util.q<Long, Long>> e() {
            return new f<>(new r());
        }

        private static boolean f(m mVar, com.google.android.material.datepicker.a aVar) {
            if (mVar.compareTo(aVar.m()) >= 0 && mVar.compareTo(aVar.h()) <= 0) {
                return true;
            }
            return false;
        }

        @N
        public MaterialDatePicker<S> a() {
            if (this.f32155c == null) {
                this.f32155c = new a.b().a();
            }
            if (this.f32156d == 0) {
                this.f32156d = this.f32153a.t();
            }
            S s4 = this.f32162j;
            if (s4 != null) {
                this.f32153a.k(s4);
            }
            if (this.f32155c.l() == null) {
                this.f32155c.q(b());
            }
            return MaterialDatePicker.G0(this);
        }

        @N
        public f<S> g(com.google.android.material.datepicker.a aVar) {
            this.f32155c = aVar;
            return this;
        }

        @N
        public f<S> h(int i4) {
            this.f32163k = i4;
            return this;
        }

        @N
        public f<S> i(@c0 int i4) {
            this.f32160h = i4;
            this.f32161i = null;
            return this;
        }

        @N
        public f<S> j(@P CharSequence charSequence) {
            this.f32161i = charSequence;
            this.f32160h = 0;
            return this;
        }

        @N
        public f<S> k(@c0 int i4) {
            this.f32158f = i4;
            this.f32159g = null;
            return this;
        }

        @N
        public f<S> l(@P CharSequence charSequence) {
            this.f32159g = charSequence;
            this.f32158f = 0;
            return this;
        }

        @N
        public f<S> m(S s4) {
            this.f32162j = s4;
            return this;
        }

        @N
        public f<S> n(@d0 int i4) {
            this.f32154b = i4;
            return this;
        }

        @N
        public f<S> o(@c0 int i4) {
            this.f32156d = i4;
            this.f32157e = null;
            return this;
        }

        @N
        public f<S> p(@P CharSequence charSequence) {
            this.f32157e = charSequence;
            this.f32156d = 0;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface g {
    }

    private void A0(Window window) {
        if (this.f32128F1) {
            return;
        }
        View findViewById = requireView().findViewById(a.h.f2717W1);
        C1784e.b(window, true, E.f(findViewById), null);
        C0823k0.a2(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f32128F1 = true;
    }

    private static int B0(@N Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.M6);
        int i4 = m.i().f32229H;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(a.f.S6) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(a.f.g7));
    }

    private int C0(Context context) {
        int i4 = this.f32133o1;
        if (i4 != 0) {
            return i4;
        }
        return getDateSelector().A(context);
    }

    private void D0(Context context) {
        boolean z3;
        this.f32125C1.setTag(f32122S1);
        this.f32125C1.setImageDrawable(z0(context));
        CheckableImageButton checkableImageButton = this.f32125C1;
        if (this.f32141w1 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        checkableImageButton.setChecked(z3);
        C0823k0.B1(this.f32125C1, null);
        K0(this.f32125C1);
        this.f32125C1.setOnClickListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean E0(@N Context context) {
        return H0(context, R.attr.windowFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F0(@N Context context) {
        return H0(context, a.c.oc);
    }

    @N
    static <S> MaterialDatePicker<S> G0(@N f<S> fVar) {
        MaterialDatePicker<S> materialDatePicker = new MaterialDatePicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f32110G1, fVar.f32154b);
        bundle.putParcelable(f32111H1, fVar.f32153a);
        bundle.putParcelable(f32112I1, fVar.f32155c);
        bundle.putInt(f32113J1, fVar.f32156d);
        bundle.putCharSequence(f32114K1, fVar.f32157e);
        bundle.putInt(f32119P1, fVar.f32163k);
        bundle.putInt(f32115L1, fVar.f32158f);
        bundle.putCharSequence(f32116M1, fVar.f32159g);
        bundle.putInt(f32117N1, fVar.f32160h);
        bundle.putCharSequence(f32118O1, fVar.f32161i);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    static boolean H0(@N Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, a.c.Ya, MaterialCalendar.class.getCanonicalName()), new int[]{i4});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        q<S> qVar;
        int C02 = C0(requireContext());
        this.f32137s1 = MaterialCalendar.newInstance(getDateSelector(), C02, this.f32136r1);
        if (this.f32125C1.isChecked()) {
            qVar = MaterialTextInputPicker.m0(getDateSelector(), C02, this.f32136r1);
        } else {
            qVar = this.f32137s1;
        }
        this.f32135q1 = qVar;
        J0();
        F q4 = getChildFragmentManager().q();
        q4.C(a.h.f2775i3, this.f32135q1);
        q4.s();
        this.f32135q1.addOnSelectionChangedListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        String headerText = getHeaderText();
        this.f32124B1.setContentDescription(String.format(getString(a.m.f3050G0), headerText));
        this.f32124B1.setText(headerText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(@N CheckableImageButton checkableImageButton) {
        String string;
        if (this.f32125C1.isChecked()) {
            string = checkableImageButton.getContext().getString(a.m.f3106f1);
        } else {
            string = checkableImageButton.getContext().getString(a.m.f3112h1);
        }
        this.f32125C1.setContentDescription(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.f<S> getDateSelector() {
        if (this.f32134p1 == null) {
            this.f32134p1 = (com.google.android.material.datepicker.f) getArguments().getParcelable(f32111H1);
        }
        return this.f32134p1;
    }

    public static long thisMonthInUtcMilliseconds() {
        return m.i().f32231J;
    }

    public static long todayInUtcMilliseconds() {
        return v.t().getTimeInMillis();
    }

    @N
    private static Drawable z0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C2046a.b(context, a.g.f2560d1));
        stateListDrawable.addState(new int[0], C2046a.b(context, a.g.f2566f1));
        return stateListDrawable;
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f32131m1.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f32132n1.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f32130l1.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(k<? super S> kVar) {
        return this.f32129k1.add(kVar);
    }

    public void clearOnCancelListeners() {
        this.f32131m1.clear();
    }

    public void clearOnDismissListeners() {
        this.f32132n1.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f32130l1.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f32129k1.clear();
    }

    public String getHeaderText() {
        return getDateSelector().f(getContext());
    }

    @P
    public final S getSelection() {
        return getDateSelector().V();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f32131m1.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32133o1 = bundle.getInt(f32110G1);
        this.f32134p1 = (com.google.android.material.datepicker.f) bundle.getParcelable(f32111H1);
        this.f32136r1 = (com.google.android.material.datepicker.a) bundle.getParcelable(f32112I1);
        this.f32138t1 = bundle.getInt(f32113J1);
        this.f32139u1 = bundle.getCharSequence(f32114K1);
        this.f32141w1 = bundle.getInt(f32119P1);
        this.f32142x1 = bundle.getInt(f32115L1);
        this.f32143y1 = bundle.getCharSequence(f32116M1);
        this.f32144z1 = bundle.getInt(f32117N1);
        this.f32123A1 = bundle.getCharSequence(f32118O1);
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public final Dialog onCreateDialog(@P Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), C0(requireContext()));
        Context context = dialog.getContext();
        this.f32140v1 = E0(context);
        int g4 = com.google.android.material.resources.b.g(context, a.c.f1979o3, MaterialDatePicker.class.getCanonicalName());
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context, null, a.c.Ya, a.n.Th);
        this.f32126D1 = jVar;
        jVar.Z(context);
        this.f32126D1.o0(ColorStateList.valueOf(g4));
        this.f32126D1.n0(C0823k0.R(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        int i4;
        if (this.f32140v1) {
            i4 = a.k.f2931G0;
        } else {
            i4 = a.k.f2929F0;
        }
        View inflate = layoutInflater.inflate(i4, viewGroup);
        Context context = inflate.getContext();
        if (this.f32140v1) {
            inflate.findViewById(a.h.f2775i3).setLayoutParams(new LinearLayout.LayoutParams(B0(context), -2));
        } else {
            inflate.findViewById(a.h.f2780j3).setLayoutParams(new LinearLayout.LayoutParams(B0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(a.h.u3);
        this.f32124B1 = textView;
        C0823k0.D1(textView, 1);
        this.f32125C1 = (CheckableImageButton) inflate.findViewById(a.h.w3);
        TextView textView2 = (TextView) inflate.findViewById(a.h.A3);
        CharSequence charSequence = this.f32139u1;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f32138t1);
        }
        D0(context);
        this.f32127E1 = (Button) inflate.findViewById(a.h.f2700S0);
        if (getDateSelector().F()) {
            this.f32127E1.setEnabled(true);
        } else {
            this.f32127E1.setEnabled(false);
        }
        this.f32127E1.setTag(f32120Q1);
        CharSequence charSequence2 = this.f32143y1;
        if (charSequence2 != null) {
            this.f32127E1.setText(charSequence2);
        } else {
            int i5 = this.f32142x1;
            if (i5 != 0) {
                this.f32127E1.setText(i5);
            }
        }
        this.f32127E1.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(a.h.f2632B0);
        button.setTag(f32121R1);
        CharSequence charSequence3 = this.f32123A1;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i6 = this.f32144z1;
            if (i6 != 0) {
                button.setText(i6);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@N DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f32132n1.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f32110G1, this.f32133o1);
        bundle.putParcelable(f32111H1, this.f32134p1);
        a.b bVar = new a.b(this.f32136r1);
        if (this.f32137s1.x0() != null) {
            bVar.c(this.f32137s1.x0().f32231J);
        }
        bundle.putParcelable(f32112I1, bVar.a());
        bundle.putInt(f32113J1, this.f32138t1);
        bundle.putCharSequence(f32114K1, this.f32139u1);
        bundle.putInt(f32115L1, this.f32142x1);
        bundle.putCharSequence(f32116M1, this.f32143y1);
        bundle.putInt(f32117N1, this.f32144z1);
        bundle.putCharSequence(f32118O1, this.f32123A1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f32140v1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f32126D1);
            A0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(a.f.U6);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f32126D1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new X0.a(requireDialog(), rect));
        }
        I0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f32135q1.k0();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f32131m1.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f32132n1.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f32130l1.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(k<? super S> kVar) {
        return this.f32129k1.remove(kVar);
    }
}
