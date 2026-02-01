package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.core.view.C0850t0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface G {
    Menu A();

    boolean B();

    int C();

    void D(int i4);

    C0850t0 E(int i4, long j4);

    void F(int i4);

    void G(int i4);

    void H(n.a aVar, g.a aVar2);

    ViewGroup I();

    void J(boolean z3);

    void K(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void L(SparseArray<Parcelable> sparseArray);

    CharSequence M();

    int N();

    int O();

    void P(int i4);

    void Q(View view);

    void R();

    int S();

    void T();

    void U(Drawable drawable);

    void V(boolean z3);

    int a();

    void b(Drawable drawable);

    int c();

    void collapseActionView();

    void d(Menu menu, n.a aVar);

    Context e();

    boolean f();

    void g();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    boolean m();

    void n(int i4);

    void o();

    View p();

    void q(Y y3);

    void r(Drawable drawable);

    boolean s();

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setLogo(int i4);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i4);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean t();

    void u(int i4);

    void v(CharSequence charSequence);

    void w(CharSequence charSequence);

    void x(Drawable drawable);

    void y(SparseArray<Parcelable> sparseArray);

    void z(int i4);
}
