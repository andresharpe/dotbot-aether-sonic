package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.F;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883a extends F implements FragmentManager.i, FragmentManager.p {

    /* renamed from: R, reason: collision with root package name */
    private static final String f15231R = "FragmentManager";

    /* renamed from: N, reason: collision with root package name */
    final FragmentManager f15232N;

    /* renamed from: O, reason: collision with root package name */
    boolean f15233O;

    /* renamed from: P, reason: collision with root package name */
    int f15234P;

    /* renamed from: Q, reason: collision with root package name */
    boolean f15235Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0883a(@androidx.annotation.N FragmentManager fragmentManager) {
        super(fragmentManager.C0(), fragmentManager.F0() != null ? fragmentManager.F0().g().getClassLoader() : null);
        this.f15234P = -1;
        this.f15235Q = false;
        this.f15232N = fragmentManager;
    }

    @Override // androidx.fragment.app.F
    public boolean A() {
        return this.f14953c.isEmpty();
    }

    @Override // androidx.fragment.app.F
    @androidx.annotation.N
    public F B(@androidx.annotation.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.f15011X;
        if (fragmentManager != null && fragmentManager != this.f15232N) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.B(fragment);
    }

    @Override // androidx.fragment.app.F
    @androidx.annotation.N
    public F O(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Lifecycle.State state) {
        if (fragment.f15011X == this.f15232N) {
            if (state == Lifecycle.State.INITIALIZED && fragment.f14992E > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
            }
            if (state != Lifecycle.State.DESTROYED) {
                return super.O(fragment, state);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f15232N);
    }

    @Override // androidx.fragment.app.F
    @androidx.annotation.N
    public F P(@androidx.annotation.P Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.f15011X) != null && fragmentManager != this.f15232N) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.P(fragment);
    }

    @Override // androidx.fragment.app.F
    @androidx.annotation.N
    public F T(@androidx.annotation.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.f15011X;
        if (fragmentManager != null && fragmentManager != this.f15232N) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.T(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(int i4) {
        if (!this.f14959i) {
            return;
        }
        if (FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
        }
        int size = this.f14953c.size();
        for (int i5 = 0; i5 < size; i5++) {
            F.a aVar = this.f14953c.get(i5);
            Fragment fragment = aVar.f14971b;
            if (fragment != null) {
                fragment.f15010W += i4;
                if (FragmentManager.S0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f14971b + " to " + aVar.f14971b.f15010W);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        int size = this.f14953c.size() - 1;
        while (size >= 0) {
            F.a aVar = this.f14953c.get(size);
            if (aVar.f14972c) {
                if (aVar.f14970a == 8) {
                    aVar.f14972c = false;
                    this.f14953c.remove(size - 1);
                    size--;
                } else {
                    int i4 = aVar.f14971b.f15016c0;
                    aVar.f14970a = 2;
                    aVar.f14972c = false;
                    for (int i5 = size - 1; i5 >= 0; i5--) {
                        F.a aVar2 = this.f14953c.get(i5);
                        if (aVar2.f14972c && aVar2.f14971b.f15016c0 == i4) {
                            this.f14953c.remove(i5);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int W(boolean z3) {
        if (!this.f15233O) {
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new L("FragmentManager"));
                X("  ", printWriter);
                printWriter.close();
            }
            this.f15233O = true;
            if (this.f14959i) {
                this.f15234P = this.f15232N.n();
            } else {
                this.f15234P = -1;
            }
            this.f15232N.d0(this, z3);
            return this.f15234P;
        }
        throw new IllegalStateException("commit already called");
    }

    public void X(String str, PrintWriter printWriter) {
        Y(str, printWriter, true);
    }

    public void Y(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f14961k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f15234P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f15233O);
            if (this.f14958h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f14958h));
            }
            if (this.f14954d != 0 || this.f14955e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f14954d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f14955e));
            }
            if (this.f14956f != 0 || this.f14957g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f14956f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f14957g));
            }
            if (this.f14962l != 0 || this.f14963m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f14962l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f14963m);
            }
            if (this.f14964n != 0 || this.f14965o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f14964n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f14965o);
            }
        }
        if (!this.f14953c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f14953c.size();
            for (int i4 = 0; i4 < size; i4++) {
                F.a aVar = this.f14953c.get(i4);
                switch (aVar.f14970a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f14970a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f14971b);
                if (z3) {
                    if (aVar.f14973d != 0 || aVar.f14974e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f14973d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f14974e));
                    }
                    if (aVar.f14975f != 0 || aVar.f14976g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f14975f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f14976g));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z() {
        int size = this.f14953c.size();
        for (int i4 = 0; i4 < size; i4++) {
            F.a aVar = this.f14953c.get(i4);
            Fragment fragment = aVar.f14971b;
            if (fragment != null) {
                fragment.f15005R = this.f15235Q;
                fragment.h0(false);
                fragment.g0(this.f14958h);
                fragment.j0(this.f14966p, this.f14967q);
            }
            switch (aVar.f14970a) {
                case 1:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.M1(fragment, false);
                    this.f15232N.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f14970a);
                case 3:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.t1(fragment);
                    break;
                case 4:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.P0(fragment);
                    break;
                case 5:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.M1(fragment, false);
                    this.f15232N.T1(fragment);
                    break;
                case 6:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.A(fragment);
                    break;
                case 7:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.M1(fragment, false);
                    this.f15232N.p(fragment);
                    break;
                case 8:
                    this.f15232N.P1(fragment);
                    break;
                case 9:
                    this.f15232N.P1(null);
                    break;
                case 10:
                    this.f15232N.O1(fragment, aVar.f14978i);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.i
    @androidx.annotation.P
    public CharSequence a() {
        if (this.f14962l != 0) {
            return this.f15232N.F0().g().getText(this.f14962l);
        }
        return this.f14963m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0() {
        for (int size = this.f14953c.size() - 1; size >= 0; size--) {
            F.a aVar = this.f14953c.get(size);
            Fragment fragment = aVar.f14971b;
            if (fragment != null) {
                fragment.f15005R = this.f15235Q;
                fragment.h0(true);
                fragment.g0(FragmentManager.F1(this.f14958h));
                fragment.j0(this.f14967q, this.f14966p);
            }
            switch (aVar.f14970a) {
                case 1:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.M1(fragment, true);
                    this.f15232N.t1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f14970a);
                case 3:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.j(fragment);
                    break;
                case 4:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.T1(fragment);
                    break;
                case 5:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.M1(fragment, true);
                    this.f15232N.P0(fragment);
                    break;
                case 6:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.p(fragment);
                    break;
                case 7:
                    fragment.e0(aVar.f14973d, aVar.f14974e, aVar.f14975f, aVar.f14976g);
                    this.f15232N.M1(fragment, true);
                    this.f15232N.A(fragment);
                    break;
                case 8:
                    this.f15232N.P1(null);
                    break;
                case 9:
                    this.f15232N.P1(fragment);
                    break;
                case 10:
                    this.f15232N.O1(fragment, aVar.f14977h);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.p
    public boolean b(@androidx.annotation.N ArrayList<C0883a> arrayList, @androidx.annotation.N ArrayList<Boolean> arrayList2) {
        if (FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f14959i) {
            this.f15232N.i(this);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b0(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i4 = 0;
        while (i4 < this.f14953c.size()) {
            F.a aVar = this.f14953c.get(i4);
            int i5 = aVar.f14970a;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3 && i5 != 6) {
                        if (i5 != 7) {
                            if (i5 == 8) {
                                this.f14953c.add(i4, new F.a(9, fragment2, true));
                                aVar.f14972c = true;
                                i4++;
                                fragment2 = aVar.f14971b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.f14971b);
                        Fragment fragment3 = aVar.f14971b;
                        if (fragment3 == fragment2) {
                            this.f14953c.add(i4, new F.a(9, fragment3));
                            i4++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.f14971b;
                    int i6 = fragment4.f15016c0;
                    boolean z3 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.f15016c0 == i6) {
                            if (fragment5 == fragment4) {
                                z3 = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f14953c.add(i4, new F.a(9, fragment5, true));
                                    i4++;
                                    fragment2 = null;
                                }
                                F.a aVar2 = new F.a(3, fragment5, true);
                                aVar2.f14973d = aVar.f14973d;
                                aVar2.f14975f = aVar.f14975f;
                                aVar2.f14974e = aVar.f14974e;
                                aVar2.f14976g = aVar.f14976g;
                                this.f14953c.add(i4, aVar2);
                                arrayList.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z3) {
                        this.f14953c.remove(i4);
                        i4--;
                    } else {
                        aVar.f14970a = 1;
                        aVar.f14972c = true;
                        arrayList.add(fragment4);
                    }
                }
                i4++;
            }
            arrayList.add(aVar.f14971b);
            i4++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.FragmentManager.i
    public int c() {
        return this.f14964n;
    }

    public void c0() {
        if (this.f14969s != null) {
            for (int i4 = 0; i4 < this.f14969s.size(); i4++) {
                this.f14969s.get(i4).run();
            }
            this.f14969s = null;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.i
    public int d() {
        return this.f14962l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment d0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f14953c.size() - 1; size >= 0; size--) {
            F.a aVar = this.f14953c.get(size);
            int i4 = aVar.f14970a;
            if (i4 != 1) {
                if (i4 != 3) {
                    switch (i4) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f14971b;
                            break;
                        case 10:
                            aVar.f14978i = aVar.f14977h;
                            break;
                    }
                }
                arrayList.add(aVar.f14971b);
            }
            arrayList.remove(aVar.f14971b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.i
    @androidx.annotation.P
    public CharSequence e() {
        if (this.f14964n != 0) {
            return this.f15232N.F0().g().getText(this.f14964n);
        }
        return this.f14965o;
    }

    @Override // androidx.fragment.app.FragmentManager.i
    public int getId() {
        return this.f15234P;
    }

    @Override // androidx.fragment.app.FragmentManager.i
    @androidx.annotation.P
    public String getName() {
        return this.f14961k;
    }

    @Override // androidx.fragment.app.F
    public int q() {
        return W(false);
    }

    @Override // androidx.fragment.app.F
    public int r() {
        return W(true);
    }

    @Override // androidx.fragment.app.F
    public void s() {
        w();
        this.f15232N.g0(this, false);
    }

    @Override // androidx.fragment.app.F
    public void t() {
        w();
        this.f15232N.g0(this, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f15234P >= 0) {
            sb.append(" #");
            sb.append(this.f15234P);
        }
        if (this.f14961k != null) {
            sb.append(" ");
            sb.append(this.f14961k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.F
    @androidx.annotation.N
    public F v(@androidx.annotation.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.f15011X;
        if (fragmentManager != null && fragmentManager != this.f15232N) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.v(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.F
    public void x(int i4, Fragment fragment, @androidx.annotation.P String str, int i5) {
        super.x(i4, fragment, str, i5);
        fragment.f15011X = this.f15232N;
    }

    @Override // androidx.fragment.app.F
    @androidx.annotation.N
    public F y(@androidx.annotation.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.f15011X;
        if (fragmentManager != null && fragmentManager != this.f15232N) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.y(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0883a(@androidx.annotation.N C0883a c0883a) {
        super(c0883a.f15232N.C0(), c0883a.f15232N.F0() != null ? c0883a.f15232N.F0().g().getClassLoader() : null, c0883a);
        this.f15234P = -1;
        this.f15235Q = false;
        this.f15232N = c0883a.f15232N;
        this.f15233O = c0883a.f15233O;
        this.f15234P = c0883a.f15234P;
        this.f15235Q = c0883a.f15235Q;
    }
}
