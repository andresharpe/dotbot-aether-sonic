package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0892j {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0894l<?> f15315a;

    private C0892j(AbstractC0894l<?> abstractC0894l) {
        this.f15315a = abstractC0894l;
    }

    @androidx.annotation.N
    public static C0892j b(@androidx.annotation.N AbstractC0894l<?> abstractC0894l) {
        return new C0892j((AbstractC0894l) androidx.core.util.u.m(abstractC0894l, "callbacks == null"));
    }

    @androidx.annotation.P
    public Fragment A(@androidx.annotation.N String str) {
        return this.f15315a.f15321I.p0(str);
    }

    @androidx.annotation.N
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f15315a.f15321I.v0();
    }

    public int C() {
        return this.f15315a.f15321I.u0();
    }

    @androidx.annotation.N
    public FragmentManager D() {
        return this.f15315a.f15321I;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public androidx.loader.app.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f15315a.f15321I.e1();
    }

    @androidx.annotation.P
    public View G(@androidx.annotation.P View view, @androidx.annotation.N String str, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        return this.f15315a.f15321I.G0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@androidx.annotation.P Parcelable parcelable, @androidx.annotation.P t tVar) {
        this.f15315a.f15321I.z1(parcelable, tVar);
    }

    @Deprecated
    public void J(@androidx.annotation.P Parcelable parcelable, @androidx.annotation.P List<Fragment> list) {
        this.f15315a.f15321I.z1(parcelable, new t(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) androidx.collection.l<String, androidx.loader.app.a> lVar) {
    }

    @Deprecated
    public void L(@androidx.annotation.P Parcelable parcelable) {
        AbstractC0894l<?> abstractC0894l = this.f15315a;
        if (abstractC0894l instanceof q0) {
            abstractC0894l.f15321I.C1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @androidx.annotation.P
    @Deprecated
    public androidx.collection.l<String, androidx.loader.app.a> M() {
        return null;
    }

    @androidx.annotation.P
    @Deprecated
    public t N() {
        return this.f15315a.f15321I.E1();
    }

    @androidx.annotation.P
    @Deprecated
    public List<Fragment> O() {
        t E12 = this.f15315a.f15321I.E1();
        if (E12 != null && E12.b() != null) {
            return new ArrayList(E12.b());
        }
        return null;
    }

    @androidx.annotation.P
    @Deprecated
    public Parcelable P() {
        return this.f15315a.f15321I.G1();
    }

    public void a(@androidx.annotation.P Fragment fragment) {
        AbstractC0894l<?> abstractC0894l = this.f15315a;
        abstractC0894l.f15321I.o(abstractC0894l, abstractC0894l, fragment);
    }

    public void c() {
        this.f15315a.f15321I.B();
    }

    public void d(@androidx.annotation.N Configuration configuration) {
        this.f15315a.f15321I.D(configuration);
    }

    public boolean e(@androidx.annotation.N MenuItem menuItem) {
        return this.f15315a.f15321I.E(menuItem);
    }

    public void f() {
        this.f15315a.f15321I.F();
    }

    public boolean g(@androidx.annotation.N Menu menu, @androidx.annotation.N MenuInflater menuInflater) {
        return this.f15315a.f15321I.G(menu, menuInflater);
    }

    public void h() {
        this.f15315a.f15321I.H();
    }

    public void i() {
        this.f15315a.f15321I.I();
    }

    public void j() {
        this.f15315a.f15321I.J();
    }

    public void k(boolean z3) {
        this.f15315a.f15321I.K(z3);
    }

    public boolean l(@androidx.annotation.N MenuItem menuItem) {
        return this.f15315a.f15321I.N(menuItem);
    }

    public void m(@androidx.annotation.N Menu menu) {
        this.f15315a.f15321I.O(menu);
    }

    public void n() {
        this.f15315a.f15321I.Q();
    }

    public void o(boolean z3) {
        this.f15315a.f15321I.R(z3);
    }

    public boolean p(@androidx.annotation.N Menu menu) {
        return this.f15315a.f15321I.S(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f15315a.f15321I.U();
    }

    public void s() {
        this.f15315a.f15321I.V();
    }

    public void t() {
        this.f15315a.f15321I.X();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z3) {
    }

    @Deprecated
    public void y(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
    }

    public boolean z() {
        return this.f15315a.f15321I.f0(true);
    }
}
