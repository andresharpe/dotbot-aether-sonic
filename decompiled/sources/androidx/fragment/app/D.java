package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class D {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14883e = "FragmentManager";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f14884a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, B> f14885b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, A> f14886c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private v f14887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public ArrayList<String> A() {
        synchronized (this.f14884a) {
            try {
                if (this.f14884a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f14884a.size());
                Iterator<Fragment> it = this.f14884a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.f14997J);
                    if (FragmentManager.S0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f14997J + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(@androidx.annotation.N v vVar) {
        this.f14887d = vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public A C(@androidx.annotation.N String str, @androidx.annotation.P A a4) {
        if (a4 != null) {
            return this.f14886c.put(str, a4);
        }
        return this.f14886c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@androidx.annotation.N Fragment fragment) {
        if (!this.f14884a.contains(fragment)) {
            synchronized (this.f14884a) {
                this.f14884a.add(fragment);
            }
            fragment.f15003P = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f14885b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(@androidx.annotation.N String str) {
        if (this.f14885b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i4) {
        for (B b4 : this.f14885b.values()) {
            if (b4 != null) {
                b4.u(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        String str2 = str + "    ";
        if (!this.f14885b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (B b4 : this.f14885b.values()) {
                printWriter.print(str);
                if (b4 != null) {
                    Fragment k4 = b4.k();
                    printWriter.println(k4);
                    k4.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f14884a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = this.f14884a.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment f(@androidx.annotation.N String str) {
        B b4 = this.f14885b.get(str);
        if (b4 != null) {
            return b4.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment g(@androidx.annotation.D int i4) {
        for (int size = this.f14884a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f14884a.get(size);
            if (fragment != null && fragment.f15015b0 == i4) {
                return fragment;
            }
        }
        for (B b4 : this.f14885b.values()) {
            if (b4 != null) {
                Fragment k4 = b4.k();
                if (k4.f15015b0 == i4) {
                    return k4;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment h(@androidx.annotation.P String str) {
        if (str != null) {
            for (int size = this.f14884a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f14884a.get(size);
                if (fragment != null && str.equals(fragment.f15017d0)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (B b4 : this.f14885b.values()) {
                if (b4 != null) {
                    Fragment k4 = b4.k();
                    if (str.equals(k4.f15017d0)) {
                        return k4;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment i(@androidx.annotation.N String str) {
        Fragment e4;
        for (B b4 : this.f14885b.values()) {
            if (b4 != null && (e4 = b4.k().e(str)) != null) {
                return e4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(@androidx.annotation.N Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f15025l0;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f14884a.indexOf(fragment);
        for (int i4 = indexOf - 1; i4 >= 0; i4--) {
            Fragment fragment2 = this.f14884a.get(i4);
            if (fragment2.f15025l0 == viewGroup && (view2 = fragment2.f15026m0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f14884a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f14884a.get(indexOf);
            if (fragment3.f15025l0 == viewGroup && (view = fragment3.f15026m0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f14885b.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public List<B> l() {
        ArrayList arrayList = new ArrayList();
        for (B b4 : this.f14885b.values()) {
            if (b4 != null) {
                arrayList.add(b4);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (B b4 : this.f14885b.values()) {
            if (b4 != null) {
                arrayList.add(b4.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public ArrayList<A> n() {
        return new ArrayList<>(this.f14886c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public B o(@androidx.annotation.N String str) {
        return this.f14885b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public List<Fragment> p() {
        ArrayList arrayList;
        if (this.f14884a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f14884a) {
            arrayList = new ArrayList(this.f14884a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v q() {
        return this.f14887d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public A r(@androidx.annotation.N String str) {
        return this.f14886c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(@androidx.annotation.N B b4) {
        Fragment k4 = b4.k();
        if (c(k4.f14997J)) {
            return;
        }
        this.f14885b.put(k4.f14997J, b4);
        if (k4.f15021h0) {
            if (k4.f15020g0) {
                this.f14887d.u(k4);
            } else {
                this.f14887d.F(k4);
            }
            k4.f15021h0 = false;
        }
        if (FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(@androidx.annotation.N B b4) {
        Fragment k4 = b4.k();
        if (k4.f15020g0) {
            this.f14887d.F(k4);
        }
        if (this.f14885b.put(k4.f14997J, null) != null && FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        Iterator<Fragment> it = this.f14884a.iterator();
        while (it.hasNext()) {
            B b4 = this.f14885b.get(it.next().f14997J);
            if (b4 != null) {
                b4.m();
            }
        }
        for (B b5 : this.f14885b.values()) {
            if (b5 != null) {
                b5.m();
                Fragment k4 = b5.k();
                if (k4.f15004Q && !k4.y()) {
                    if (k4.f15005R && !this.f14886c.containsKey(k4.f14997J)) {
                        b5.s();
                    }
                    t(b5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(@androidx.annotation.N Fragment fragment) {
        synchronized (this.f14884a) {
            this.f14884a.remove(fragment);
        }
        fragment.f15003P = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f14885b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(@androidx.annotation.P List<String> list) {
        this.f14884a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f4 = f(str);
                if (f4 != null) {
                    if (FragmentManager.S0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f4);
                    }
                    a(f4);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(@androidx.annotation.N ArrayList<A> arrayList) {
        this.f14886c.clear();
        Iterator<A> it = arrayList.iterator();
        while (it.hasNext()) {
            A next = it.next();
            this.f14886c.put(next.f14846F, next);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f14885b.size());
        for (B b4 : this.f14885b.values()) {
            if (b4 != null) {
                Fragment k4 = b4.k();
                b4.s();
                arrayList.add(k4.f14997J);
                if (FragmentManager.S0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k4 + ": " + k4.f14993F);
                }
            }
        }
        return arrayList;
    }
}
