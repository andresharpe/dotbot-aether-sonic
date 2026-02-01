package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v extends j0 {

    /* renamed from: O, reason: collision with root package name */
    private static final String f15364O = "FragmentManager";

    /* renamed from: P, reason: collision with root package name */
    private static final m0.b f15365P = new a();

    /* renamed from: K, reason: collision with root package name */
    private final boolean f15369K;

    /* renamed from: H, reason: collision with root package name */
    private final HashMap<String, Fragment> f15366H = new HashMap<>();

    /* renamed from: I, reason: collision with root package name */
    private final HashMap<String, v> f15367I = new HashMap<>();

    /* renamed from: J, reason: collision with root package name */
    private final HashMap<String, p0> f15368J = new HashMap<>();

    /* renamed from: L, reason: collision with root package name */
    private boolean f15370L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f15371M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f15372N = false;

    /* loaded from: classes.dex */
    class a implements m0.b {
        a() {
        }

        @Override // androidx.lifecycle.m0.b
        @androidx.annotation.N
        public <T extends j0> T a(@androidx.annotation.N Class<T> cls) {
            return new v(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(boolean z3) {
        this.f15369K = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public static v A(p0 p0Var) {
        return (v) new m0(p0Var, f15365P).a(v.class);
    }

    private void x(@androidx.annotation.N String str) {
        v vVar = this.f15367I.get(str);
        if (vVar != null) {
            vVar.s();
            this.f15367I.remove(str);
        }
        p0 p0Var = this.f15368J.get(str);
        if (p0Var != null) {
            p0Var.a();
            this.f15368J.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public Collection<Fragment> B() {
        return new ArrayList(this.f15366H.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    @Deprecated
    public t C() {
        if (this.f15366H.isEmpty() && this.f15367I.isEmpty() && this.f15368J.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, v> entry : this.f15367I.entrySet()) {
            t C3 = entry.getValue().C();
            if (C3 != null) {
                hashMap.put(entry.getKey(), C3);
            }
        }
        this.f15371M = true;
        if (this.f15366H.isEmpty() && hashMap.isEmpty() && this.f15368J.isEmpty()) {
            return null;
        }
        return new t(new ArrayList(this.f15366H.values()), hashMap, new HashMap(this.f15368J));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public p0 D(@androidx.annotation.N Fragment fragment) {
        p0 p0Var = this.f15368J.get(fragment.f14997J);
        if (p0Var == null) {
            p0 p0Var2 = new p0();
            this.f15368J.put(fragment.f14997J, p0Var2);
            return p0Var2;
        }
        return p0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        return this.f15370L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(@androidx.annotation.N Fragment fragment) {
        if (this.f15372N) {
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f15366H.remove(fragment.f14997J) != null && FragmentManager.S0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public void G(@androidx.annotation.P t tVar) {
        this.f15366H.clear();
        this.f15367I.clear();
        this.f15368J.clear();
        if (tVar != null) {
            Collection<Fragment> b4 = tVar.b();
            if (b4 != null) {
                for (Fragment fragment : b4) {
                    if (fragment != null) {
                        this.f15366H.put(fragment.f14997J, fragment);
                    }
                }
            }
            Map<String, t> a4 = tVar.a();
            if (a4 != null) {
                for (Map.Entry<String, t> entry : a4.entrySet()) {
                    v vVar = new v(this.f15369K);
                    vVar.G(entry.getValue());
                    this.f15367I.put(entry.getKey(), vVar);
                }
            }
            Map<String, p0> c4 = tVar.c();
            if (c4 != null) {
                this.f15368J.putAll(c4);
            }
        }
        this.f15371M = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(boolean z3) {
        this.f15372N = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I(@androidx.annotation.N Fragment fragment) {
        if (!this.f15366H.containsKey(fragment.f14997J)) {
            return true;
        }
        if (this.f15369K) {
            return this.f15370L;
        }
        return !this.f15371M;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f15366H.equals(vVar.f15366H) && this.f15367I.equals(vVar.f15367I) && this.f15368J.equals(vVar.f15368J)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15366H.hashCode() * 31) + this.f15367I.hashCode()) * 31) + this.f15368J.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15370L = true;
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f15366H.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f15367I.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f15368J.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(@androidx.annotation.N Fragment fragment) {
        if (this.f15372N) {
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f15366H.containsKey(fragment.f14997J)) {
                return;
            }
            this.f15366H.put(fragment.f14997J, fragment);
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(@androidx.annotation.N Fragment fragment) {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        x(fragment.f14997J);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(@androidx.annotation.N String str) {
        if (FragmentManager.S0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        x(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment y(String str) {
        return this.f15366H.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public v z(@androidx.annotation.N Fragment fragment) {
        v vVar = this.f15367I.get(fragment.f14997J);
        if (vVar == null) {
            v vVar2 = new v(this.f15369K);
            this.f15367I.put(fragment.f14997J, vVar2);
            return vVar2;
        }
        return vVar;
    }
}
