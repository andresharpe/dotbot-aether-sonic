package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class MaterialCalendar<S> extends q<S> {

    /* renamed from: Y0, reason: collision with root package name */
    private static final String f32070Y0 = "THEME_RES_ID_KEY";

    /* renamed from: Z0, reason: collision with root package name */
    private static final String f32071Z0 = "GRID_SELECTOR_KEY";

    /* renamed from: a1, reason: collision with root package name */
    private static final String f32072a1 = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: b1, reason: collision with root package name */
    private static final String f32073b1 = "CURRENT_MONTH_KEY";

    /* renamed from: c1, reason: collision with root package name */
    private static final int f32074c1 = 3;

    /* renamed from: d1, reason: collision with root package name */
    @i0
    static final Object f32075d1 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: e1, reason: collision with root package name */
    @i0
    static final Object f32076e1 = "NAVIGATION_PREV_TAG";

    /* renamed from: f1, reason: collision with root package name */
    @i0
    static final Object f32077f1 = "NAVIGATION_NEXT_TAG";

    /* renamed from: g1, reason: collision with root package name */
    @i0
    static final Object f32078g1 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: O0, reason: collision with root package name */
    @d0
    private int f32079O0;

    /* renamed from: P0, reason: collision with root package name */
    @P
    private com.google.android.material.datepicker.f<S> f32080P0;

    /* renamed from: Q0, reason: collision with root package name */
    @P
    private com.google.android.material.datepicker.a f32081Q0;

    /* renamed from: R0, reason: collision with root package name */
    @P
    private m f32082R0;

    /* renamed from: S0, reason: collision with root package name */
    private k f32083S0;

    /* renamed from: T0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f32084T0;

    /* renamed from: U0, reason: collision with root package name */
    private RecyclerView f32085U0;

    /* renamed from: V0, reason: collision with root package name */
    private RecyclerView f32086V0;

    /* renamed from: W0, reason: collision with root package name */
    private View f32087W0;

    /* renamed from: X0, reason: collision with root package name */
    private View f32088X0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f32089E;

        a(int i4) {
            this.f32089E = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f32086V0.O1(this.f32089E);
        }
    }

    /* loaded from: classes2.dex */
    class b extends C0771a {
        b() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.b1(null);
        }
    }

    /* loaded from: classes2.dex */
    class c extends t {

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f32092P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i4, boolean z3, int i5) {
            super(context, i4, z3);
            this.f32092P = i5;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void k2(@N RecyclerView.C c4, @N int[] iArr) {
            if (this.f32092P == 0) {
                iArr[0] = MaterialCalendar.this.f32086V0.getWidth();
                iArr[1] = MaterialCalendar.this.f32086V0.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f32086V0.getHeight();
                iArr[1] = MaterialCalendar.this.f32086V0.getHeight();
            }
        }
    }

    /* loaded from: classes2.dex */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.MaterialCalendar.l
        public void a(long j4) {
            if (MaterialCalendar.this.f32081Q0.g().D(j4)) {
                MaterialCalendar.this.f32080P0.a0(j4);
                Iterator<p<S>> it = MaterialCalendar.this.f32247N0.iterator();
                while (it.hasNext()) {
                    it.next().b(MaterialCalendar.this.f32080P0.V());
                }
                MaterialCalendar.this.f32086V0.getAdapter().r();
                if (MaterialCalendar.this.f32085U0 != null) {
                    MaterialCalendar.this.f32085U0.getAdapter().r();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f32095a = v.v();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f32096b = v.v();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.C c4) {
            int i4;
            int width;
            if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                w wVar = (w) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.q<Long, Long> qVar : MaterialCalendar.this.f32080P0.j()) {
                    Long l4 = qVar.f13025a;
                    if (l4 != null && qVar.f13026b != null) {
                        this.f32095a.setTimeInMillis(l4.longValue());
                        this.f32096b.setTimeInMillis(qVar.f13026b.longValue());
                        int Q3 = wVar.Q(this.f32095a.get(1));
                        int Q4 = wVar.Q(this.f32096b.get(1));
                        View J3 = gridLayoutManager.J(Q3);
                        View J4 = gridLayoutManager.J(Q4);
                        int D3 = Q3 / gridLayoutManager.D3();
                        int D32 = Q4 / gridLayoutManager.D3();
                        for (int i5 = D3; i5 <= D32; i5++) {
                            View J5 = gridLayoutManager.J(gridLayoutManager.D3() * i5);
                            if (J5 != null) {
                                int top = J5.getTop() + MaterialCalendar.this.f32084T0.f32193d.e();
                                int bottom = J5.getBottom() - MaterialCalendar.this.f32084T0.f32193d.b();
                                if (i5 == D3) {
                                    i4 = J3.getLeft() + (J3.getWidth() / 2);
                                } else {
                                    i4 = 0;
                                }
                                if (i5 == D32) {
                                    width = J4.getLeft() + (J4.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i4, top, width, bottom, MaterialCalendar.this.f32084T0.f32197h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends C0771a {
        f() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            String string;
            super.g(view, m4);
            if (MaterialCalendar.this.f32088X0.getVisibility() == 0) {
                string = MaterialCalendar.this.getString(a.m.f3115i1);
            } else {
                string = MaterialCalendar.this.getString(a.m.f3109g1);
            }
            m4.o1(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f32099a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f32100b;

        g(o oVar, MaterialButton materialButton) {
            this.f32099a = oVar;
            this.f32100b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(@N RecyclerView recyclerView, int i4) {
            if (i4 == 0) {
                recyclerView.announceForAccessibility(this.f32100b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(@N RecyclerView recyclerView, int i4, int i5) {
            int A22;
            if (i4 < 0) {
                A22 = MaterialCalendar.this.A0().x2();
            } else {
                A22 = MaterialCalendar.this.A0().A2();
            }
            MaterialCalendar.this.f32082R0 = this.f32099a.P(A22);
            this.f32100b.setText(this.f32099a.Q(A22));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ o f32103E;

        i(o oVar) {
            this.f32103E = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int x22 = MaterialCalendar.this.A0().x2() + 1;
            if (x22 < MaterialCalendar.this.f32086V0.getAdapter().l()) {
                MaterialCalendar.this.C0(this.f32103E.P(x22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ o f32105E;

        j(o oVar) {
            this.f32105E = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int A22 = MaterialCalendar.this.A0().A2() - 1;
            if (A22 >= 0) {
                MaterialCalendar.this.C0(this.f32105E.P(A22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface l {
        void a(long j4);
    }

    private void B0(int i4) {
        this.f32086V0.post(new a(i4));
    }

    @N
    public static <T> MaterialCalendar<T> newInstance(@N com.google.android.material.datepicker.f<T> fVar, @d0 int i4, @N com.google.android.material.datepicker.a aVar) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f32070Y0, i4);
        bundle.putParcelable(f32071Z0, fVar);
        bundle.putParcelable(f32072a1, aVar);
        bundle.putParcelable(f32073b1, aVar.l());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void t0(@N View view, @N o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(a.h.f2735a3);
        materialButton.setTag(f32078g1);
        C0823k0.B1(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(a.h.f2745c3);
        materialButton2.setTag(f32076e1);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(a.h.f2740b3);
        materialButton3.setTag(f32077f1);
        this.f32087W0 = view.findViewById(a.h.f2800n3);
        this.f32088X0 = view.findViewById(a.h.f2765g3);
        D0(k.DAY);
        materialButton.setText(this.f32082R0.o());
        this.f32086V0.r(new g(oVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(oVar));
        materialButton2.setOnClickListener(new j(oVar));
    }

    @N
    private RecyclerView.n u0() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @U
    public static int y0(@N Context context) {
        return context.getResources().getDimensionPixelSize(a.f.O6);
    }

    private static int z0(@N Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(a.f.j7) + resources.getDimensionPixelOffset(a.f.k7) + resources.getDimensionPixelOffset(a.f.i7);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(a.f.T6);
        int i4 = n.f32233J;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(a.f.O6) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(a.f.h7)) + resources.getDimensionPixelOffset(a.f.L6);
    }

    @N
    LinearLayoutManager A0() {
        return (LinearLayoutManager) this.f32086V0.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0(m mVar) {
        boolean z3;
        o oVar = (o) this.f32086V0.getAdapter();
        int R3 = oVar.R(mVar);
        int R4 = R3 - oVar.R(this.f32082R0);
        boolean z4 = false;
        if (Math.abs(R4) > 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (R4 > 0) {
            z4 = true;
        }
        this.f32082R0 = mVar;
        if (z3 && z4) {
            this.f32086V0.G1(R3 - 3);
            B0(R3);
        } else if (z3) {
            this.f32086V0.G1(R3 + 3);
            B0(R3);
        } else {
            B0(R3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(k kVar) {
        this.f32083S0 = kVar;
        if (kVar == k.YEAR) {
            this.f32085U0.getLayoutManager().R1(((w) this.f32085U0.getAdapter()).Q(this.f32082R0.f32228G));
            this.f32087W0.setVisibility(0);
            this.f32088X0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f32087W0.setVisibility(8);
            this.f32088X0.setVisibility(0);
            C0(this.f32082R0);
        }
    }

    void E0() {
        k kVar = this.f32083S0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            D0(k.DAY);
        } else if (kVar == k.DAY) {
            D0(kVar2);
        }
    }

    @Override // com.google.android.material.datepicker.q
    public boolean addOnSelectionChangedListener(@N p<S> pVar) {
        return super.addOnSelectionChangedListener(pVar);
    }

    @Override // com.google.android.material.datepicker.q
    @P
    public com.google.android.material.datepicker.f<S> getDateSelector() {
        return this.f32080P0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32079O0 = bundle.getInt(f32070Y0);
        this.f32080P0 = (com.google.android.material.datepicker.f) bundle.getParcelable(f32071Z0);
        this.f32081Q0 = (com.google.android.material.datepicker.a) bundle.getParcelable(f32072a1);
        this.f32082R0 = (m) bundle.getParcelable(f32073b1);
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        int i4;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f32079O0);
        this.f32084T0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m m4 = this.f32081Q0.m();
        if (MaterialDatePicker.E0(contextThemeWrapper)) {
            i4 = a.k.f3035z0;
            i5 = 1;
        } else {
            i4 = a.k.f3025u0;
            i5 = 0;
        }
        View inflate = cloneInContext.inflate(i4, viewGroup, false);
        inflate.setMinimumHeight(z0(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(a.h.f2770h3);
        C0823k0.B1(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.j());
        gridView.setNumColumns(m4.f32229H);
        gridView.setEnabled(false);
        this.f32086V0 = (RecyclerView) inflate.findViewById(a.h.f2785k3);
        this.f32086V0.setLayoutManager(new c(getContext(), i5, false, i5));
        this.f32086V0.setTag(f32075d1);
        o oVar = new o(contextThemeWrapper, this.f32080P0, this.f32081Q0, new d());
        this.f32086V0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(a.i.f2871R);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(a.h.f2800n3);
        this.f32085U0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f32085U0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f32085U0.setAdapter(new w(this));
            this.f32085U0.n(u0());
        }
        if (inflate.findViewById(a.h.f2735a3) != null) {
            t0(inflate, oVar);
        }
        if (!MaterialDatePicker.E0(contextThemeWrapper)) {
            new z().b(this.f32086V0);
        }
        this.f32086V0.G1(oVar.R(this.f32082R0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f32070Y0, this.f32079O0);
        bundle.putParcelable(f32071Z0, this.f32080P0);
        bundle.putParcelable(f32072a1, this.f32081Q0);
        bundle.putParcelable(f32073b1, this.f32082R0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public com.google.android.material.datepicker.a v0() {
        return this.f32081Q0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.c w0() {
        return this.f32084T0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public m x0() {
        return this.f32082R0;
    }
}
