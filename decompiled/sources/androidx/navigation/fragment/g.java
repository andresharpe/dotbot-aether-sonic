package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0566i;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.F;
import androidx.navigation.T;
import androidx.navigation.c0;
import androidx.navigation.d0;
import androidx.navigation.fragment.k;
import androidx.navigation.r;
import com.google.firebase.remoteconfig.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.collections.A;
import kotlin.collections.D;
import kotlin.collections.Y;
import kotlin.jvm.internal.C2197u;

@c0.b("fragment")
@E(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\b\u0017\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000345&B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b1\u00102J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00066"}, d2 = {"Landroidx/navigation/fragment/g;", "Landroidx/navigation/c0;", "Landroidx/navigation/fragment/g$b;", "Landroidx/navigation/r;", "entry", "Landroidx/navigation/T;", "navOptions", "Landroidx/navigation/c0$a;", "navigatorExtras", "Lkotlin/H0;", "n", "(Landroidx/navigation/r;Landroidx/navigation/T;Landroidx/navigation/c0$a;)V", "popUpTo", "", "savedState", "j", "(Landroidx/navigation/r;Z)V", "l", "()Landroidx/navigation/fragment/g$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "className", "Landroid/os/Bundle;", "args", "Landroidx/fragment/app/Fragment;", "m", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", "", u.c.f37791i0, "e", "(Ljava/util/List;Landroidx/navigation/T;Landroidx/navigation/c0$a;)V", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/FragmentManager;", "", "I", "containerId", "", "f", "Ljava/util/Set;", "savedIds", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "g", "a", com.harman.log.b.f47574c, "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class g extends c0<b> {

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final a f16454g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final String f16455h = "FragmentNavigator";

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final String f16456i = "androidx-nav-fragment:navigator:savedIds";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Context f16457c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final FragmentManager f16458d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16459e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final Set<String> f16460f;

    /* loaded from: classes.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @F.a(Fragment.class)
    /* loaded from: classes.dex */
    public static class b extends F {

        /* renamed from: P, reason: collision with root package name */
        @l3.e
        private String f16461P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d c0<? extends b> fragmentNavigator) {
            super(fragmentNavigator);
            kotlin.jvm.internal.F.p(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.F
        @InterfaceC0566i
        public void B(@l3.d Context context, @l3.d AttributeSet attrs) {
            kotlin.jvm.internal.F.p(context, "context");
            kotlin.jvm.internal.F.p(attrs, "attrs");
            super.B(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, k.d.f16472c);
            kotlin.jvm.internal.F.o(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(k.d.f16473d);
            if (string != null) {
                Q(string);
            }
            H0 h02 = H0.f51801a;
            obtainAttributes.recycle();
        }

        @l3.d
        public final String O() {
            String str = this.f16461P;
            if (str != null) {
                if (str != null) {
                    return str;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new IllegalStateException("Fragment class was not set".toString());
        }

        @l3.d
        public final b Q(@l3.d String className) {
            kotlin.jvm.internal.F.p(className, "className");
            this.f16461P = className;
            return this;
        }

        @Override // androidx.navigation.F
        public boolean equals(@l3.e Object obj) {
            if (obj == null || !(obj instanceof b) || !super.equals(obj) || !kotlin.jvm.internal.F.g(this.f16461P, ((b) obj).f16461P)) {
                return false;
            }
            return true;
        }

        @Override // androidx.navigation.F
        public int hashCode() {
            int hashCode;
            int hashCode2 = super.hashCode() * 31;
            String str = this.f16461P;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @Override // androidx.navigation.F
        @l3.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f16461P;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@l3.d d0 navigatorProvider) {
            this((c0<? extends b>) navigatorProvider.e(g.class));
            kotlin.jvm.internal.F.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements c0.a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final LinkedHashMap<View, String> f16462a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            private final LinkedHashMap<View, String> f16463a = new LinkedHashMap<>();

            @l3.d
            public final a a(@l3.d View sharedElement, @l3.d String name) {
                kotlin.jvm.internal.F.p(sharedElement, "sharedElement");
                kotlin.jvm.internal.F.p(name, "name");
                this.f16463a.put(sharedElement, name);
                return this;
            }

            @l3.d
            public final a b(@l3.d Map<View, String> sharedElements) {
                kotlin.jvm.internal.F.p(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @l3.d
            public final c c() {
                return new c(this.f16463a);
            }
        }

        public c(@l3.d Map<View, String> sharedElements) {
            kotlin.jvm.internal.F.p(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f16462a = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        @l3.d
        public final Map<View, String> a() {
            Map<View, String> D02;
            D02 = Y.D0(this.f16462a);
            return D02;
        }
    }

    public g(@l3.d Context context, @l3.d FragmentManager fragmentManager, int i4) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(fragmentManager, "fragmentManager");
        this.f16457c = context;
        this.f16458d = fragmentManager;
        this.f16459e = i4;
        this.f16460f = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(androidx.navigation.r r12, androidx.navigation.T r13, androidx.navigation.c0.a r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.g.n(androidx.navigation.r, androidx.navigation.T, androidx.navigation.c0$a):void");
    }

    @Override // androidx.navigation.c0
    public void e(@l3.d List<r> entries, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(entries, "entries");
        if (this.f16458d.Y0()) {
            Log.i(f16455h, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<r> it = entries.iterator();
        while (it.hasNext()) {
            n(it.next(), t3, aVar);
        }
    }

    @Override // androidx.navigation.c0
    public void h(@l3.d Bundle savedState) {
        kotlin.jvm.internal.F.p(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList(f16456i);
        if (stringArrayList != null) {
            this.f16460f.clear();
            A.q0(this.f16460f, stringArrayList);
        }
    }

    @Override // androidx.navigation.c0
    @l3.e
    public Bundle i() {
        if (this.f16460f.isEmpty()) {
            return null;
        }
        return C0741d.b(C2122h0.a(f16456i, new ArrayList(this.f16460f)));
    }

    @Override // androidx.navigation.c0
    public void j(@l3.d r popUpTo, boolean z3) {
        Object B22;
        List<r> X4;
        kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
        if (this.f16458d.Y0()) {
            Log.i(f16455h, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z3) {
            List<r> value = b().b().getValue();
            B22 = D.B2(value);
            r rVar = (r) B22;
            X4 = D.X4(value.subList(value.indexOf(popUpTo), value.size()));
            for (r rVar2 : X4) {
                if (kotlin.jvm.internal.F.g(rVar2, rVar)) {
                    Log.i(f16455h, kotlin.jvm.internal.F.C("FragmentManager cannot save the state of the initial destination ", rVar2));
                } else {
                    this.f16458d.I1(rVar2.h());
                    this.f16460f.add(rVar2.h());
                }
            }
        } else {
            this.f16458d.l1(popUpTo.h(), 1);
        }
        b().g(popUpTo, z3);
    }

    @Override // androidx.navigation.c0
    @l3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @l3.d
    @InterfaceC2205l(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment m(@l3.d Context context, @l3.d FragmentManager fragmentManager, @l3.d String className, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.F.p(className, "className");
        Fragment a4 = fragmentManager.C0().a(context.getClassLoader(), className);
        kotlin.jvm.internal.F.o(a4, "fragmentManager.fragment…t.classLoader, className)");
        return a4;
    }
}
