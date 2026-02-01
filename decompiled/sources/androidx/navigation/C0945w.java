package androidx.navigation;

import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C2197u;

/* renamed from: androidx.navigation.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945w extends androidx.lifecycle.j0 implements Y {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final b f16627I = new b(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final m0.b f16628J = new a();

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final Map<String, p0> f16629H = new LinkedHashMap();

    /* renamed from: androidx.navigation.w$a */
    /* loaded from: classes.dex */
    public static final class a implements m0.b {
        a() {
        }

        @Override // androidx.lifecycle.m0.b
        @l3.d
        public <T extends androidx.lifecycle.j0> T a(@l3.d Class<T> modelClass) {
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            return new C0945w();
        }
    }

    /* renamed from: androidx.navigation.w$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final C0945w a(@l3.d p0 viewModelStore) {
            kotlin.jvm.internal.F.p(viewModelStore, "viewModelStore");
            androidx.lifecycle.j0 a4 = new m0(viewModelStore, C0945w.f16628J).a(C0945w.class);
            kotlin.jvm.internal.F.o(a4, "get(VM::class.java)");
            return (C0945w) a4;
        }

        private b() {
        }
    }

    @W2.n
    @l3.d
    public static final C0945w w(@l3.d p0 p0Var) {
        return f16627I.a(p0Var);
    }

    @Override // androidx.navigation.Y
    @l3.d
    public p0 g(@l3.d String backStackEntryId) {
        kotlin.jvm.internal.F.p(backStackEntryId, "backStackEntryId");
        p0 p0Var = this.f16629H.get(backStackEntryId);
        if (p0Var == null) {
            p0 p0Var2 = new p0();
            this.f16629H.put(backStackEntryId, p0Var2);
            return p0Var2;
        }
        return p0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        Iterator<p0> it = this.f16629H.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f16629H.clear();
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.f16629H.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "sb.toString()");
        return sb2;
    }

    public final void v(@l3.d String backStackEntryId) {
        kotlin.jvm.internal.F.p(backStackEntryId, "backStackEntryId");
        p0 remove = this.f16629H.remove(backStackEntryId);
        if (remove != null) {
            remove.a();
        }
    }
}
