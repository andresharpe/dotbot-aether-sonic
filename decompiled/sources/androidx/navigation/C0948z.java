package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.z1;
import androidx.navigation.c0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2096k;

/* renamed from: androidx.navigation.z */
/* loaded from: classes.dex */
public final class C0948z {

    /* renamed from: a */
    @l3.d
    private final Context f16653a;

    /* renamed from: b */
    @l3.d
    private final Intent f16654b;

    /* renamed from: c */
    @l3.e
    private J f16655c;

    /* renamed from: d */
    @l3.d
    private final List<a> f16656d;

    /* renamed from: e */
    @l3.e
    private Bundle f16657e;

    /* renamed from: androidx.navigation.z$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f16658a;

        /* renamed from: b */
        @l3.e
        private final Bundle f16659b;

        public a(int i4, @l3.e Bundle bundle) {
            this.f16658a = i4;
            this.f16659b = bundle;
        }

        @l3.e
        public final Bundle a() {
            return this.f16659b;
        }

        public final int b() {
            return this.f16658a;
        }
    }

    /* renamed from: androidx.navigation.z$b */
    /* loaded from: classes.dex */
    private static final class b extends d0 {

        /* renamed from: d */
        @l3.d
        private final c0<F> f16660d = new a();

        @kotlin.E(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/navigation/z$b$a", "Landroidx/navigation/c0;", "Landroidx/navigation/F;", "a", "()Landroidx/navigation/F;", FirebaseAnalytics.b.f34818z, "Landroid/os/Bundle;", "args", "Landroidx/navigation/T;", "navOptions", "Landroidx/navigation/c0$a;", "navigatorExtras", "d", "(Landroidx/navigation/F;Landroid/os/Bundle;Landroidx/navigation/T;Landroidx/navigation/c0$a;)Landroidx/navigation/F;", "", "k", "()Z", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.navigation.z$b$a */
        /* loaded from: classes.dex */
        public static final class a extends c0<F> {
            a() {
            }

            @Override // androidx.navigation.c0
            @l3.d
            public F a() {
                return new F("permissive");
            }

            @Override // androidx.navigation.c0
            @l3.e
            public F d(@l3.d F destination, @l3.e Bundle bundle, @l3.e T t3, @l3.e c0.a aVar) {
                kotlin.jvm.internal.F.p(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.c0
            public boolean k() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            b(new N(this));
        }

        @Override // androidx.navigation.d0
        @l3.d
        public <T extends c0<? extends F>> T f(@l3.d String name) {
            kotlin.jvm.internal.F.p(name, "name");
            try {
                return (T) super.f(name);
            } catch (IllegalStateException unused) {
                return this.f16660d;
            }
        }
    }

    public C0948z(@l3.d Context context) {
        Intent launchIntentForPackage;
        kotlin.jvm.internal.F.p(context, "context");
        this.f16653a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f16654b = launchIntentForPackage;
        this.f16656d = new ArrayList();
    }

    public static /* synthetic */ C0948z e(C0948z c0948z, int i4, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return c0948z.b(i4, bundle);
    }

    public static /* synthetic */ C0948z f(C0948z c0948z, String str, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        return c0948z.d(str, bundle);
    }

    private final void i() {
        int[] U5;
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        F f4 = null;
        for (a aVar : this.f16656d) {
            int b4 = aVar.b();
            Bundle a4 = aVar.a();
            F j4 = j(b4);
            if (j4 != null) {
                int[] m4 = j4.m(f4);
                int length = m4.length;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = m4[i4];
                    i4++;
                    arrayList.add(Integer.valueOf(i5));
                    arrayList2.add(a4);
                }
                f4 = j4;
            } else {
                throw new IllegalArgumentException("Navigation destination " + F.f16277N.b(this.f16653a, b4) + " cannot be found in the navigation graph " + this.f16655c);
            }
        }
        U5 = kotlin.collections.D.U5(arrayList);
        this.f16654b.putExtra(C0943u.f16556P, U5);
        this.f16654b.putParcelableArrayListExtra(C0943u.f16557Q, arrayList2);
    }

    private final F j(@androidx.annotation.D int i4) {
        C2096k c2096k = new C2096k();
        J j4 = this.f16655c;
        kotlin.jvm.internal.F.m(j4);
        c2096k.add(j4);
        while (!c2096k.isEmpty()) {
            F f4 = (F) c2096k.removeFirst();
            if (f4.t() == i4) {
                return f4;
            }
            if (f4 instanceof J) {
                Iterator<F> it = ((J) f4).iterator();
                while (it.hasNext()) {
                    c2096k.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ C0948z r(C0948z c0948z, int i4, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return c0948z.o(i4, bundle);
    }

    public static /* synthetic */ C0948z s(C0948z c0948z, String str, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        return c0948z.q(str, bundle);
    }

    private final void v() {
        Iterator<a> it = this.f16656d.iterator();
        while (it.hasNext()) {
            int b4 = it.next().b();
            if (j(b4) == null) {
                throw new IllegalArgumentException("Navigation destination " + F.f16277N.b(this.f16653a, b4) + " cannot be found in the navigation graph " + this.f16655c);
            }
        }
    }

    @W2.j
    @l3.d
    public final C0948z a(@androidx.annotation.D int i4) {
        return e(this, i4, null, 2, null);
    }

    @W2.j
    @l3.d
    public final C0948z b(@androidx.annotation.D int i4, @l3.e Bundle bundle) {
        this.f16656d.add(new a(i4, bundle));
        if (this.f16655c != null) {
            v();
        }
        return this;
    }

    @W2.j
    @l3.d
    public final C0948z c(@l3.d String route) {
        kotlin.jvm.internal.F.p(route, "route");
        return f(this, route, null, 2, null);
    }

    @W2.j
    @l3.d
    public final C0948z d(@l3.d String route, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(route, "route");
        this.f16656d.add(new a(F.f16277N.a(route).hashCode(), bundle));
        if (this.f16655c != null) {
            v();
        }
        return this;
    }

    @l3.d
    public final PendingIntent g() {
        int i4;
        int hashCode;
        int hashCode2;
        Bundle bundle = this.f16657e;
        if (bundle == null) {
            i4 = 0;
        } else {
            Iterator<String> it = bundle.keySet().iterator();
            i4 = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                int i5 = i4 * 31;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                i4 = i5 + hashCode;
            }
        }
        for (a aVar : this.f16656d) {
            i4 = (i4 * 31) + aVar.b();
            Bundle a4 = aVar.a();
            if (a4 != null) {
                Iterator<String> it2 = a4.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = a4.get(it2.next());
                    int i6 = i4 * 31;
                    if (obj2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = obj2.hashCode();
                    }
                    i4 = i6 + hashCode2;
                }
            }
        }
        PendingIntent p4 = h().p(i4, 201326592);
        kotlin.jvm.internal.F.m(p4);
        kotlin.jvm.internal.F.o(p4, "createTaskStackBuilder()…LAG_IMMUTABLE\n        )!!");
        return p4;
    }

    @l3.d
    public final z1 h() {
        if (this.f16655c != null) {
            if (!this.f16656d.isEmpty()) {
                i();
                z1 c4 = z1.j(this.f16653a).c(new Intent(this.f16654b));
                kotlin.jvm.internal.F.o(c4, "create(context)\n        …rentStack(Intent(intent))");
                int n4 = c4.n();
                int i4 = 0;
                while (i4 < n4) {
                    int i5 = i4 + 1;
                    Intent k4 = c4.k(i4);
                    if (k4 != null) {
                        k4.putExtra(C0943u.f16560T, this.f16654b);
                    }
                    i4 = i5;
                }
                return c4;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
    }

    @l3.d
    public final C0948z k(@l3.e Bundle bundle) {
        this.f16657e = bundle;
        this.f16654b.putExtra(C0943u.f16558R, bundle);
        return this;
    }

    @l3.d
    public final C0948z l(@l3.d ComponentName componentName) {
        kotlin.jvm.internal.F.p(componentName, "componentName");
        this.f16654b.setComponent(componentName);
        return this;
    }

    @l3.d
    public final C0948z m(@l3.d Class<? extends Activity> activityClass) {
        kotlin.jvm.internal.F.p(activityClass, "activityClass");
        return l(new ComponentName(this.f16653a, activityClass));
    }

    @W2.j
    @l3.d
    public final C0948z n(@androidx.annotation.D int i4) {
        return r(this, i4, null, 2, null);
    }

    @W2.j
    @l3.d
    public final C0948z o(@androidx.annotation.D int i4, @l3.e Bundle bundle) {
        this.f16656d.clear();
        this.f16656d.add(new a(i4, bundle));
        if (this.f16655c != null) {
            v();
        }
        return this;
    }

    @W2.j
    @l3.d
    public final C0948z p(@l3.d String destRoute) {
        kotlin.jvm.internal.F.p(destRoute, "destRoute");
        return s(this, destRoute, null, 2, null);
    }

    @W2.j
    @l3.d
    public final C0948z q(@l3.d String destRoute, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(destRoute, "destRoute");
        this.f16656d.clear();
        this.f16656d.add(new a(F.f16277N.a(destRoute).hashCode(), bundle));
        if (this.f16655c != null) {
            v();
        }
        return this;
    }

    @l3.d
    public final C0948z t(@androidx.annotation.M int i4) {
        return u(new S(this.f16653a, new b()).b(i4));
    }

    @l3.d
    public final C0948z u(@l3.d J navGraph) {
        kotlin.jvm.internal.F.p(navGraph, "navGraph");
        this.f16655c = navGraph;
        v();
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0948z(@l3.d C0943u navController) {
        this(navController.F());
        kotlin.jvm.internal.F.p(navController, "navController");
        this.f16655c = navController.K();
    }
}
