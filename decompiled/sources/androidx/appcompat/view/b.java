package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: E, reason: collision with root package name */
    private Object f5111E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f5112F;

    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f5111E;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f5112F;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i4);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.f5111E = obj;
    }

    public abstract void r(int i4);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z3) {
        this.f5112F = z3;
    }
}
