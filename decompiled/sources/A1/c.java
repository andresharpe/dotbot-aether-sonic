package a1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.D;
import androidx.annotation.N;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final View f3834a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3835b = false;

    /* renamed from: c, reason: collision with root package name */
    @D
    private int f3836c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f3834a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f3834a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).l(this.f3834a);
        }
    }

    @D
    public int b() {
        return this.f3836c;
    }

    public boolean c() {
        return this.f3835b;
    }

    public void d(@N Bundle bundle) {
        this.f3835b = bundle.getBoolean("expanded", false);
        this.f3836c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f3835b) {
            a();
        }
    }

    @N
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f3835b);
        bundle.putInt("expandedComponentIdHint", this.f3836c);
        return bundle;
    }

    public boolean f(boolean z3) {
        if (this.f3835b != z3) {
            this.f3835b = z3;
            a();
            return true;
        }
        return false;
    }

    public void g(@D int i4) {
        this.f3836c = i4;
    }
}
