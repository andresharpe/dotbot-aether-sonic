package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.n;
import androidx.preference.q;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import e.C2046a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class j extends RecyclerView.Adapter<p> implements Preference.c, PreferenceGroup.c {

    /* renamed from: d, reason: collision with root package name */
    private final PreferenceGroup f16917d;

    /* renamed from: e, reason: collision with root package name */
    private List<Preference> f16918e;

    /* renamed from: f, reason: collision with root package name */
    private List<Preference> f16919f;

    /* renamed from: g, reason: collision with root package name */
    private final List<d> f16920g;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f16922i = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f16921h = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends C0964j.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f16924a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f16925b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.d f16926c;

        b(List list, List list2, n.d dVar) {
            this.f16924a = list;
            this.f16925b = list2;
            this.f16926c = dVar;
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public boolean a(int i4, int i5) {
            return this.f16926c.a((Preference) this.f16924a.get(i4), (Preference) this.f16925b.get(i5));
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public boolean b(int i4, int i5) {
            return this.f16926c.b((Preference) this.f16924a.get(i4), (Preference) this.f16925b.get(i5));
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public int d() {
            return this.f16925b.size();
        }

        @Override // androidx.recyclerview.widget.C0964j.b
        public int e() {
            return this.f16924a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Preference.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f16928a;

        c(PreferenceGroup preferenceGroup) {
            this.f16928a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(@N Preference preference) {
            this.f16928a.B1(Integer.MAX_VALUE);
            j.this.b(preference);
            PreferenceGroup.b q12 = this.f16928a.q1();
            if (q12 != null) {
                q12.a();
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        int f16930a;

        /* renamed from: b, reason: collision with root package name */
        int f16931b;

        /* renamed from: c, reason: collision with root package name */
        String f16932c;

        d(@N Preference preference) {
            this.f16932c = preference.getClass().getName();
            this.f16930a = preference.v();
            this.f16931b = preference.N();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f16930a != dVar.f16930a || this.f16931b != dVar.f16931b || !TextUtils.equals(this.f16932c, dVar.f16932c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((((527 + this.f16930a) * 31) + this.f16931b) * 31) + this.f16932c.hashCode();
        }
    }

    public j(@N PreferenceGroup preferenceGroup) {
        this.f16917d = preferenceGroup;
        preferenceGroup.P0(this);
        this.f16918e = new ArrayList();
        this.f16919f = new ArrayList();
        this.f16920g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            L(((PreferenceScreen) preferenceGroup).G1());
        } else {
            L(true);
        }
        V();
    }

    private androidx.preference.c O(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.c cVar = new androidx.preference.c(preferenceGroup.m(), list, preferenceGroup.s());
        cVar.R0(new c(preferenceGroup));
        return cVar;
    }

    private List<Preference> P(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int s12 = preferenceGroup.s1();
        int i4 = 0;
        for (int i5 = 0; i5 < s12; i5++) {
            Preference r12 = preferenceGroup.r1(i5);
            if (r12.W()) {
                if (S(preferenceGroup) && i4 >= preferenceGroup.p1()) {
                    arrayList2.add(r12);
                } else {
                    arrayList.add(r12);
                }
                if (!(r12 instanceof PreferenceGroup)) {
                    i4++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) r12;
                    if (!preferenceGroup2.u1()) {
                        continue;
                    } else {
                        if (S(preferenceGroup) && S(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : P(preferenceGroup2)) {
                            if (S(preferenceGroup) && i4 >= preferenceGroup.p1()) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        if (S(preferenceGroup) && i4 > preferenceGroup.p1()) {
            arrayList.add(O(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void Q(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.E1();
        int s12 = preferenceGroup.s1();
        for (int i4 = 0; i4 < s12; i4++) {
            Preference r12 = preferenceGroup.r1(i4);
            list.add(r12);
            d dVar = new d(r12);
            if (!this.f16920g.contains(dVar)) {
                this.f16920g.add(dVar);
            }
            if (r12 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) r12;
                if (preferenceGroup2.u1()) {
                    Q(list, preferenceGroup2);
                }
            }
            r12.P0(this);
        }
    }

    private boolean S(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.p1() != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @P
    public Preference R(int i4) {
        if (i4 >= 0 && i4 < l()) {
            return this.f16919f.get(i4);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void C(@N p pVar, int i4) {
        Preference R3 = R(i4);
        pVar.V();
        R3.d0(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public p E(@N ViewGroup viewGroup, int i4) {
        d dVar = this.f16920g.get(i4);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, q.k.f17174a);
        Drawable drawable = obtainStyledAttributes.getDrawable(q.k.f17177b);
        if (drawable == null) {
            drawable = C2046a.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.f16930a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C0823k0.I1(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i5 = dVar.f16931b;
            if (i5 != 0) {
                from.inflate(i5, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new p(inflate);
    }

    void V() {
        Iterator<Preference> it = this.f16918e.iterator();
        while (it.hasNext()) {
            it.next().P0(null);
        }
        ArrayList arrayList = new ArrayList(this.f16918e.size());
        this.f16918e = arrayList;
        Q(arrayList, this.f16917d);
        List<Preference> list = this.f16919f;
        List<Preference> P3 = P(this.f16917d);
        this.f16919f = P3;
        n H3 = this.f16917d.H();
        if (H3 != null && H3.l() != null) {
            C0964j.b(new b(list, P3, H3.l())).e(this);
        } else {
            r();
        }
        Iterator<Preference> it2 = this.f16918e.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    @Override // androidx.preference.Preference.c
    public void b(@N Preference preference) {
        this.f16921h.removeCallbacks(this.f16922i);
        this.f16921h.post(this.f16922i);
    }

    @Override // androidx.preference.Preference.c
    public void d(@N Preference preference) {
        b(preference);
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int e(@N Preference preference) {
        int size = this.f16919f.size();
        for (int i4 = 0; i4 < size; i4++) {
            Preference preference2 = this.f16919f.get(i4);
            if (preference2 != null && preference2.equals(preference)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.c
    public void f(@N Preference preference) {
        int indexOf = this.f16919f.indexOf(preference);
        if (indexOf != -1) {
            t(indexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int g(@N String str) {
        int size = this.f16919f.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (TextUtils.equals(str, this.f16919f.get(i4).u())) {
                return i4;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f16919f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long m(int i4) {
        if (!q()) {
            return -1L;
        }
        return R(i4).s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int n(int i4) {
        d dVar = new d(R(i4));
        int indexOf = this.f16920g.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f16920g.size();
        this.f16920g.add(dVar);
        return size;
    }
}
