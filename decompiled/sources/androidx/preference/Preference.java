package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.M;
import androidx.preference.n;
import androidx.preference.q;
import e.C2046a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: v0, reason: collision with root package name */
    public static final int f16713v0 = Integer.MAX_VALUE;

    /* renamed from: w0, reason: collision with root package name */
    private static final String f16714w0 = "Preference";

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Context f16715E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private n f16716F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private androidx.preference.g f16717G;

    /* renamed from: H, reason: collision with root package name */
    private long f16718H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f16719I;

    /* renamed from: J, reason: collision with root package name */
    private d f16720J;

    /* renamed from: K, reason: collision with root package name */
    private e f16721K;

    /* renamed from: L, reason: collision with root package name */
    private int f16722L;

    /* renamed from: M, reason: collision with root package name */
    private int f16723M;

    /* renamed from: N, reason: collision with root package name */
    private CharSequence f16724N;

    /* renamed from: O, reason: collision with root package name */
    private CharSequence f16725O;

    /* renamed from: P, reason: collision with root package name */
    private int f16726P;

    /* renamed from: Q, reason: collision with root package name */
    private Drawable f16727Q;

    /* renamed from: R, reason: collision with root package name */
    private String f16728R;

    /* renamed from: S, reason: collision with root package name */
    private Intent f16729S;

    /* renamed from: T, reason: collision with root package name */
    private String f16730T;

    /* renamed from: U, reason: collision with root package name */
    private Bundle f16731U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f16732V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f16733W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f16734X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f16735Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f16736Z;

    /* renamed from: a0, reason: collision with root package name */
    private Object f16737a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f16738b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f16739c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f16740d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f16741e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f16742f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f16743g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f16744h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f16745i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f16746j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f16747k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f16748l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f16749m0;

    /* renamed from: n0, reason: collision with root package name */
    private c f16750n0;

    /* renamed from: o0, reason: collision with root package name */
    private List<Preference> f16751o0;

    /* renamed from: p0, reason: collision with root package name */
    private PreferenceGroup f16752p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f16753q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f16754r0;

    /* renamed from: s0, reason: collision with root package name */
    private f f16755s0;

    /* renamed from: t0, reason: collision with root package name */
    private g f16756t0;

    /* renamed from: u0, reason: collision with root package name */
    private final View.OnClickListener f16757u0;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.r0(view);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbsSavedState {

        @N
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void b(@N Preference preference);

        void d(@N Preference preference);

        void f(@N Preference preference);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(@N Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(@N Preference preference);
    }

    /* loaded from: classes.dex */
    private static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: E, reason: collision with root package name */
        private final Preference f16759E;

        f(@N Preference preference) {
            this.f16759E = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence K3 = this.f16759E.K();
            if (this.f16759E.P() && !TextUtils.isEmpty(K3)) {
                contextMenu.setHeaderTitle(K3);
                contextMenu.add(0, 0, 0, q.i.f17073a).setOnMenuItemClickListener(this);
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f16759E.m().getSystemService("clipboard");
            CharSequence K3 = this.f16759E.K();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.f16714w0, K3));
            Toast.makeText(this.f16759E.m(), this.f16759E.m().getString(q.i.f17076d, K3), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface g<T extends Preference> {
        @P
        CharSequence a(@N T t3);
    }

    public Preference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        this.f16722L = Integer.MAX_VALUE;
        this.f16723M = 0;
        this.f16732V = true;
        this.f16733W = true;
        this.f16735Y = true;
        this.f16738b0 = true;
        this.f16739c0 = true;
        this.f16740d0 = true;
        this.f16741e0 = true;
        this.f16742f0 = true;
        this.f16744h0 = true;
        this.f16747k0 = true;
        this.f16748l0 = q.h.f17057c;
        this.f16757u0 = new a();
        this.f16715E = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17142K, i4, i5);
        this.f16726P = androidx.core.content.res.n.n(obtainStyledAttributes, q.k.f17199i0, q.k.f17144L, 0);
        this.f16728R = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17208l0, q.k.f17156R);
        this.f16724N = androidx.core.content.res.n.p(obtainStyledAttributes, q.k.f17232t0, q.k.f17152P);
        this.f16725O = androidx.core.content.res.n.p(obtainStyledAttributes, q.k.f17229s0, q.k.f17158S);
        this.f16722L = androidx.core.content.res.n.d(obtainStyledAttributes, q.k.f17214n0, q.k.f17160T, Integer.MAX_VALUE);
        this.f16730T = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17196h0, q.k.f17170Y);
        this.f16748l0 = androidx.core.content.res.n.n(obtainStyledAttributes, q.k.f17211m0, q.k.f17150O, q.h.f17057c);
        this.f16749m0 = androidx.core.content.res.n.n(obtainStyledAttributes, q.k.f17235u0, q.k.f17162U, 0);
        this.f16732V = androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17193g0, q.k.f17148N, true);
        this.f16733W = androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17220p0, q.k.f17154Q, true);
        this.f16735Y = androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17217o0, q.k.f17146M, true);
        this.f16736Z = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17187e0, q.k.f17164V);
        int i6 = q.k.f17178b0;
        this.f16741e0 = androidx.core.content.res.n.b(obtainStyledAttributes, i6, i6, this.f16733W);
        int i7 = q.k.f17181c0;
        this.f16742f0 = androidx.core.content.res.n.b(obtainStyledAttributes, i7, i7, this.f16733W);
        if (obtainStyledAttributes.hasValue(q.k.f17184d0)) {
            this.f16737a0 = h0(obtainStyledAttributes, q.k.f17184d0);
        } else if (obtainStyledAttributes.hasValue(q.k.f17166W)) {
            this.f16737a0 = h0(obtainStyledAttributes, q.k.f17166W);
        }
        this.f16747k0 = androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17223q0, q.k.f17168X, true);
        boolean hasValue = obtainStyledAttributes.hasValue(q.k.f17226r0);
        this.f16743g0 = hasValue;
        if (hasValue) {
            this.f16744h0 = androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17226r0, q.k.f17172Z, true);
        }
        this.f16745i0 = androidx.core.content.res.n.b(obtainStyledAttributes, q.k.f17202j0, q.k.f17175a0, false);
        int i8 = q.k.f17205k0;
        this.f16740d0 = androidx.core.content.res.n.b(obtainStyledAttributes, i8, i8, true);
        int i9 = q.k.f17190f0;
        this.f16746j0 = androidx.core.content.res.n.b(obtainStyledAttributes, i9, i9, false);
        obtainStyledAttributes.recycle();
    }

    private void H0(@N View view, boolean z3) {
        view.setEnabled(z3);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                H0(viewGroup.getChildAt(childCount), z3);
            }
        }
    }

    private void i1(@N SharedPreferences.Editor editor) {
        if (this.f16716F.H()) {
            editor.apply();
        }
    }

    private void j1() {
        Preference l4;
        String str = this.f16736Z;
        if (str != null && (l4 = l(str)) != null) {
            l4.k1(this);
        }
    }

    private void k() {
        if (G() != null) {
            o0(true, this.f16737a0);
            return;
        }
        if (h1() && I().contains(this.f16728R)) {
            o0(true, null);
            return;
        }
        Object obj = this.f16737a0;
        if (obj != null) {
            o0(false, obj);
        }
    }

    private void k1(Preference preference) {
        List<Preference> list = this.f16751o0;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void y0() {
        if (TextUtils.isEmpty(this.f16736Z)) {
            return;
        }
        Preference l4 = l(this.f16736Z);
        if (l4 != null) {
            l4.z0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f16736Z + "\" not found for preference \"" + this.f16728R + "\" (title: \"" + ((Object) this.f16724N) + "\"");
    }

    private void z0(Preference preference) {
        if (this.f16751o0 == null) {
            this.f16751o0 = new ArrayList();
        }
        this.f16751o0.add(preference);
        preference.f0(this, g1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean A(boolean z3) {
        if (!h1()) {
            return z3;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            return G3.a(this.f16728R, z3);
        }
        return this.f16716F.o().getBoolean(this.f16728R, z3);
    }

    void A0() {
        if (!TextUtils.isEmpty(this.f16728R)) {
            this.f16734X = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    protected float B(float f4) {
        if (!h1()) {
            return f4;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            return G3.b(this.f16728R, f4);
        }
        return this.f16716F.o().getFloat(this.f16728R, f4);
    }

    public void B0(@N Bundle bundle) {
        i(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int C(int i4) {
        if (!h1()) {
            return i4;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            return G3.c(this.f16728R, i4);
        }
        return this.f16716F.o().getInt(this.f16728R, i4);
    }

    public void C0(@N Bundle bundle) {
        j(bundle);
    }

    protected long D(long j4) {
        if (!h1()) {
            return j4;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            return G3.d(this.f16728R, j4);
        }
        return this.f16716F.o().getLong(this.f16728R, j4);
    }

    public void D0(boolean z3) {
        if (this.f16746j0 != z3) {
            this.f16746j0 = z3;
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String E(String str) {
        if (!h1()) {
            return str;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            return G3.e(this.f16728R, str);
        }
        return this.f16716F.o().getString(this.f16728R, str);
    }

    public void E0(Object obj) {
        this.f16737a0 = obj;
    }

    public Set<String> F(Set<String> set) {
        if (!h1()) {
            return set;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            return G3.f(this.f16728R, set);
        }
        return this.f16716F.o().getStringSet(this.f16728R, set);
    }

    public void F0(@P String str) {
        j1();
        this.f16736Z = str;
        y0();
    }

    @P
    public androidx.preference.g G() {
        androidx.preference.g gVar = this.f16717G;
        if (gVar != null) {
            return gVar;
        }
        n nVar = this.f16716F;
        if (nVar != null) {
            return nVar.m();
        }
        return null;
    }

    public void G0(boolean z3) {
        if (this.f16732V != z3) {
            this.f16732V = z3;
            Y(g1());
            X();
        }
    }

    public n H() {
        return this.f16716F;
    }

    @P
    public SharedPreferences I() {
        if (this.f16716F != null && G() == null) {
            return this.f16716F.o();
        }
        return null;
    }

    public void I0(@P String str) {
        this.f16730T = str;
    }

    public boolean J() {
        return this.f16747k0;
    }

    public void J0(int i4) {
        K0(C2046a.b(this.f16715E, i4));
        this.f16726P = i4;
    }

    @P
    public CharSequence K() {
        if (L() != null) {
            return L().a(this);
        }
        return this.f16725O;
    }

    public void K0(@P Drawable drawable) {
        if (this.f16727Q != drawable) {
            this.f16727Q = drawable;
            this.f16726P = 0;
            X();
        }
    }

    @P
    public final g L() {
        return this.f16756t0;
    }

    public void L0(boolean z3) {
        if (this.f16745i0 != z3) {
            this.f16745i0 = z3;
            X();
        }
    }

    @P
    public CharSequence M() {
        return this.f16724N;
    }

    public void M0(@P Intent intent) {
        this.f16729S = intent;
    }

    public final int N() {
        return this.f16749m0;
    }

    public void N0(String str) {
        this.f16728R = str;
        if (this.f16734X && !O()) {
            A0();
        }
    }

    public boolean O() {
        return !TextUtils.isEmpty(this.f16728R);
    }

    public void O0(int i4) {
        this.f16748l0 = i4;
    }

    public boolean P() {
        return this.f16746j0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P0(@P c cVar) {
        this.f16750n0 = cVar;
    }

    public boolean Q() {
        if (this.f16732V && this.f16738b0 && this.f16739c0) {
            return true;
        }
        return false;
    }

    public void Q0(@P d dVar) {
        this.f16720J = dVar;
    }

    public boolean R() {
        return this.f16745i0;
    }

    public void R0(@P e eVar) {
        this.f16721K = eVar;
    }

    public boolean S() {
        return this.f16735Y;
    }

    public void S0(int i4) {
        if (i4 != this.f16722L) {
            this.f16722L = i4;
            Z();
        }
    }

    public boolean T() {
        return this.f16733W;
    }

    public void T0(boolean z3) {
        this.f16735Y = z3;
    }

    public final boolean U() {
        if (!W() || H() == null) {
            return false;
        }
        if (this == H().n()) {
            return true;
        }
        PreferenceGroup z3 = z();
        if (z3 == null) {
            return false;
        }
        return z3.U();
    }

    public void U0(@P androidx.preference.g gVar) {
        this.f16717G = gVar;
    }

    public boolean V() {
        return this.f16744h0;
    }

    public void V0(boolean z3) {
        if (this.f16733W != z3) {
            this.f16733W = z3;
            X();
        }
    }

    public final boolean W() {
        return this.f16740d0;
    }

    public void W0(boolean z3) {
        if (this.f16747k0 != z3) {
            this.f16747k0 = z3;
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X() {
        c cVar = this.f16750n0;
        if (cVar != null) {
            cVar.f(this);
        }
    }

    public void X0(boolean z3) {
        this.f16743g0 = true;
        this.f16744h0 = z3;
    }

    public void Y(boolean z3) {
        List<Preference> list = this.f16751o0;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).f0(this, z3);
        }
    }

    public void Y0(int i4) {
        Z0(this.f16715E.getString(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Z() {
        c cVar = this.f16750n0;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public void Z0(@P CharSequence charSequence) {
        if (L() == null) {
            if (!TextUtils.equals(this.f16725O, charSequence)) {
                this.f16725O = charSequence;
                X();
                return;
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public void a0() {
        y0();
    }

    public final void a1(@P g gVar) {
        this.f16756t0 = gVar;
        X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@P PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f16752p0 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f16752p0 = preferenceGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0(@N n nVar) {
        this.f16716F = nVar;
        if (!this.f16719I) {
            this.f16718H = nVar.h();
        }
        k();
    }

    public void b1(int i4) {
        c1(this.f16715E.getString(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c0(@N n nVar, long j4) {
        this.f16718H = j4;
        this.f16719I = true;
        try {
            b0(nVar);
        } finally {
            this.f16719I = false;
        }
    }

    public void c1(@P CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f16724N)) {
            this.f16724N = charSequence;
            X();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(@androidx.annotation.N androidx.preference.p r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.d0(androidx.preference.p):void");
    }

    public void d1(int i4) {
        this.f16723M = i4;
    }

    public boolean e(Object obj) {
        d dVar = this.f16720J;
        if (dVar != null && !dVar.a(this, obj)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e0() {
    }

    public final void e1(boolean z3) {
        if (this.f16740d0 != z3) {
            this.f16740d0 = z3;
            c cVar = this.f16750n0;
            if (cVar != null) {
                cVar.d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.f16753q0 = false;
    }

    public void f0(@N Preference preference, boolean z3) {
        if (this.f16738b0 == z3) {
            this.f16738b0 = !z3;
            Y(g1());
            X();
        }
    }

    public void f1(int i4) {
        this.f16749m0 = i4;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(@N Preference preference) {
        int i4 = this.f16722L;
        int i5 = preference.f16722L;
        if (i4 != i5) {
            return i4 - i5;
        }
        CharSequence charSequence = this.f16724N;
        CharSequence charSequence2 = preference.f16724N;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f16724N.toString());
    }

    public void g0() {
        j1();
        this.f16753q0 = true;
    }

    public boolean g1() {
        return !Q();
    }

    @P
    protected Object h0(@N TypedArray typedArray, int i4) {
        return null;
    }

    protected boolean h1() {
        if (this.f16716F != null && S() && O()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(@N Bundle bundle) {
        Parcelable parcelable;
        if (O() && (parcelable = bundle.getParcelable(this.f16728R)) != null) {
            this.f16754r0 = false;
            l0(parcelable);
            if (!this.f16754r0) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    @InterfaceC0566i
    @Deprecated
    public void i0(M m4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(@N Bundle bundle) {
        if (O()) {
            this.f16754r0 = false;
            Parcelable m02 = m0();
            if (this.f16754r0) {
                if (m02 != null) {
                    bundle.putParcelable(this.f16728R, m02);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public void j0(@N Preference preference, boolean z3) {
        if (this.f16739c0 == z3) {
            this.f16739c0 = !z3;
            Y(g1());
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k0() {
        j1();
    }

    @P
    protected <T extends Preference> T l(@N String str) {
        n nVar = this.f16716F;
        if (nVar == null) {
            return null;
        }
        return (T) nVar.b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l0(@P Parcelable parcelable) {
        this.f16754r0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l1() {
        return this.f16753q0;
    }

    @N
    public Context m() {
        return this.f16715E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @P
    public Parcelable m0() {
        this.f16754r0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    @P
    public String n() {
        return this.f16736Z;
    }

    protected void n0(@P Object obj) {
    }

    @N
    public Bundle o() {
        if (this.f16731U == null) {
            this.f16731U = new Bundle();
        }
        return this.f16731U;
    }

    @Deprecated
    protected void o0(boolean z3, Object obj) {
        n0(obj);
    }

    @N
    StringBuilder p() {
        StringBuilder sb = new StringBuilder();
        CharSequence M3 = M();
        if (!TextUtils.isEmpty(M3)) {
            sb.append(M3);
            sb.append(' ');
        }
        CharSequence K3 = K();
        if (!TextUtils.isEmpty(K3)) {
            sb.append(K3);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    @P
    public Bundle p0() {
        return this.f16731U;
    }

    @P
    public String q() {
        return this.f16730T;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void q0() {
        n.c k4;
        if (Q() && T()) {
            e0();
            e eVar = this.f16721K;
            if (eVar != null && eVar.a(this)) {
                return;
            }
            n H3 = H();
            if ((H3 == null || (k4 = H3.k()) == null || !k4.onPreferenceTreeClick(this)) && this.f16729S != null) {
                m().startActivity(this.f16729S);
            }
        }
    }

    @P
    public Drawable r() {
        int i4;
        if (this.f16727Q == null && (i4 = this.f16726P) != 0) {
            this.f16727Q = C2046a.b(this.f16715E, i4);
        }
        return this.f16727Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r0(@N View view) {
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long s() {
        return this.f16718H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s0(boolean z3) {
        if (!h1()) {
            return false;
        }
        if (z3 == A(!z3)) {
            return true;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            G3.g(this.f16728R, z3);
        } else {
            SharedPreferences.Editor g4 = this.f16716F.g();
            g4.putBoolean(this.f16728R, z3);
            i1(g4);
        }
        return true;
    }

    @P
    public Intent t() {
        return this.f16729S;
    }

    protected boolean t0(float f4) {
        if (!h1()) {
            return false;
        }
        if (f4 == B(Float.NaN)) {
            return true;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            G3.h(this.f16728R, f4);
        } else {
            SharedPreferences.Editor g4 = this.f16716F.g();
            g4.putFloat(this.f16728R, f4);
            i1(g4);
        }
        return true;
    }

    @N
    public String toString() {
        return p().toString();
    }

    public String u() {
        return this.f16728R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u0(int i4) {
        if (!h1()) {
            return false;
        }
        if (i4 == C(~i4)) {
            return true;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            G3.i(this.f16728R, i4);
        } else {
            SharedPreferences.Editor g4 = this.f16716F.g();
            g4.putInt(this.f16728R, i4);
            i1(g4);
        }
        return true;
    }

    public final int v() {
        return this.f16748l0;
    }

    protected boolean v0(long j4) {
        if (!h1()) {
            return false;
        }
        if (j4 == D(~j4)) {
            return true;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            G3.j(this.f16728R, j4);
        } else {
            SharedPreferences.Editor g4 = this.f16716F.g();
            g4.putLong(this.f16728R, j4);
            i1(g4);
        }
        return true;
    }

    @P
    public d w() {
        return this.f16720J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w0(String str) {
        if (!h1()) {
            return false;
        }
        if (TextUtils.equals(str, E(null))) {
            return true;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            G3.k(this.f16728R, str);
        } else {
            SharedPreferences.Editor g4 = this.f16716F.g();
            g4.putString(this.f16728R, str);
            i1(g4);
        }
        return true;
    }

    @P
    public e x() {
        return this.f16721K;
    }

    public boolean x0(Set<String> set) {
        if (!h1()) {
            return false;
        }
        if (set.equals(F(null))) {
            return true;
        }
        androidx.preference.g G3 = G();
        if (G3 != null) {
            G3.l(this.f16728R, set);
        } else {
            SharedPreferences.Editor g4 = this.f16716F.g();
            g4.putStringSet(this.f16728R, set);
            i1(g4);
        }
        return true;
    }

    public int y() {
        return this.f16722L;
    }

    @P
    public PreferenceGroup z() {
        return this.f16752p0;
    }

    public Preference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public Preference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f16987Q, R.attr.preferenceStyle));
    }

    public Preference(@N Context context) {
        this(context, null);
    }
}
