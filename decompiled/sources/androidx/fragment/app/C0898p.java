package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0898p {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final CopyOnWriteArrayList<a> f15327a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    private final FragmentManager f15328b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        final FragmentManager.l f15329a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f15330b;

        a(@androidx.annotation.N FragmentManager.l lVar, boolean z3) {
            this.f15329a = lVar;
            this.f15330b = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0898p(@androidx.annotation.N FragmentManager fragmentManager) {
        this.f15328b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@androidx.annotation.N Fragment fragment, @androidx.annotation.P Bundle bundle, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.a(this.f15328b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@androidx.annotation.N Fragment fragment, boolean z3) {
        Context g4 = this.f15328b.F0().g();
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().b(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.b(this.f15328b, fragment, g4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(@androidx.annotation.N Fragment fragment, @androidx.annotation.P Bundle bundle, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.c(this.f15328b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().d(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.d(this.f15328b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().e(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.e(this.f15328b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().f(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.f(this.f15328b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@androidx.annotation.N Fragment fragment, boolean z3) {
        Context g4 = this.f15328b.F0().g();
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().g(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.g(this.f15328b, fragment, g4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@androidx.annotation.N Fragment fragment, @androidx.annotation.P Bundle bundle, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.h(this.f15328b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().i(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.i(this.f15328b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Bundle bundle, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.j(this.f15328b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().k(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.k(this.f15328b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().l(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.l(this.f15328b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@androidx.annotation.N Fragment fragment, @androidx.annotation.N View view, @androidx.annotation.P Bundle bundle, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.m(this.f15328b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment I02 = this.f15328b.I0();
        if (I02 != null) {
            I02.getParentFragmentManager().H0().n(fragment, true);
        }
        Iterator<a> it = this.f15327a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z3 || next.f15330b) {
                next.f15329a.n(this.f15328b, fragment);
            }
        }
    }

    public void o(@androidx.annotation.N FragmentManager.l lVar, boolean z3) {
        this.f15327a.add(new a(lVar, z3));
    }

    public void p(@androidx.annotation.N FragmentManager.l lVar) {
        synchronized (this.f15327a) {
            try {
                int size = this.f15327a.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    if (this.f15327a.get(i4).f15329a == lVar) {
                        this.f15327a.remove(i4);
                        break;
                    }
                    i4++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
