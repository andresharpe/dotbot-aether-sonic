package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.InterfaceC0566i;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w;
import androidx.lifecycle.A;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.F;
import androidx.navigation.InterfaceC0931h;
import androidx.navigation.T;
import androidx.navigation.c0;
import androidx.navigation.d0;
import androidx.navigation.f0;
import androidx.navigation.fragment.k;
import androidx.navigation.r;
import com.google.firebase.remoteconfig.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.E;
import kotlin.H0;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;

@c0.b("dialog")
@E(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0015\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006/"}, d2 = {"Landroidx/navigation/fragment/c;", "Landroidx/navigation/c0;", "Landroidx/navigation/fragment/c$b;", "Landroidx/navigation/r;", "entry", "Lkotlin/H0;", "o", "(Landroidx/navigation/r;)V", "popUpTo", "", "savedState", "j", "(Landroidx/navigation/r;Z)V", "n", "()Landroidx/navigation/fragment/c$b;", "", u.c.f37791i0, "Landroidx/navigation/T;", "navOptions", "Landroidx/navigation/c0$a;", "navigatorExtras", "e", "(Ljava/util/List;Landroidx/navigation/T;Landroidx/navigation/c0$a;)V", "Landroidx/navigation/f0;", "state", "f", "(Landroidx/navigation/f0;)V", "Landroid/content/Context;", "c", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "d", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "Landroidx/lifecycle/A;", "Landroidx/lifecycle/A;", "observer", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "g", "a", com.harman.log.b.f47574c, "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c extends c0<b> {

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final a f16446g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final String f16447h = "DialogFragmentNavigator";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Context f16448c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final FragmentManager f16449d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final Set<String> f16450e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final A f16451f;

    /* loaded from: classes.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @F.a(DialogFragment.class)
    /* loaded from: classes.dex */
    public static class b extends F implements InterfaceC0931h {

        /* renamed from: P, reason: collision with root package name */
        @l3.e
        private String f16452P;

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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, k.d.f16470a);
            kotlin.jvm.internal.F.o(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(k.d.f16471b);
            if (string != null) {
                Q(string);
            }
            obtainAttributes.recycle();
        }

        @l3.d
        public final String O() {
            String str = this.f16452P;
            if (str != null) {
                if (str != null) {
                    return str;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }

        @l3.d
        public final b Q(@l3.d String className) {
            kotlin.jvm.internal.F.p(className, "className");
            this.f16452P = className;
            return this;
        }

        @Override // androidx.navigation.F
        public boolean equals(@l3.e Object obj) {
            if (obj == null || !(obj instanceof b) || !super.equals(obj) || !kotlin.jvm.internal.F.g(this.f16452P, ((b) obj).f16452P)) {
                return false;
            }
            return true;
        }

        @Override // androidx.navigation.F
        public int hashCode() {
            int hashCode;
            int hashCode2 = super.hashCode() * 31;
            String str = this.f16452P;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@l3.d d0 navigatorProvider) {
            this((c0<? extends b>) navigatorProvider.e(c.class));
            kotlin.jvm.internal.F.p(navigatorProvider, "navigatorProvider");
        }
    }

    public c(@l3.d Context context, @l3.d FragmentManager fragmentManager) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(fragmentManager, "fragmentManager");
        this.f16448c = context;
        this.f16449d = fragmentManager;
        this.f16450e = new LinkedHashSet();
        this.f16451f = new A() { // from class: androidx.navigation.fragment.a
            @Override // androidx.lifecycle.A
            public final void f(androidx.lifecycle.E e4, Lifecycle.Event event) {
                c.p(c.this, e4, event);
            }
        };
    }

    private final void o(r rVar) {
        b bVar = (b) rVar.g();
        String O3 = bVar.O();
        if (O3.charAt(0) == '.') {
            O3 = kotlin.jvm.internal.F.C(this.f16448c.getPackageName(), O3);
        }
        Fragment a4 = this.f16449d.C0().a(this.f16448c.getClassLoader(), O3);
        kotlin.jvm.internal.F.o(a4, "fragmentManager.fragment…ader, className\n        )");
        if (DialogFragment.class.isAssignableFrom(a4.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) a4;
            dialogFragment.setArguments(rVar.e());
            dialogFragment.getLifecycle().a(this.f16451f);
            dialogFragment.show(this.f16449d, rVar.h());
            b().i(rVar);
            return;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.O() + " is not an instance of DialogFragment").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(c this$0, androidx.lifecycle.E source, Lifecycle.Event event) {
        r rVar;
        Object v3;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            DialogFragment dialogFragment = (DialogFragment) source;
            List<r> value = this$0.b().b().getValue();
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(((r) it.next()).h(), dialogFragment.getTag())) {
                        return;
                    }
                }
            }
            dialogFragment.dismiss();
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            DialogFragment dialogFragment2 = (DialogFragment) source;
            if (!dialogFragment2.requireDialog().isShowing()) {
                List<r> value2 = this$0.b().b().getValue();
                ListIterator<r> listIterator = value2.listIterator(value2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        rVar = listIterator.previous();
                        if (kotlin.jvm.internal.F.g(rVar.h(), dialogFragment2.getTag())) {
                            break;
                        }
                    } else {
                        rVar = null;
                        break;
                    }
                }
                if (rVar != null) {
                    r rVar2 = rVar;
                    v3 = D.v3(value2);
                    if (!kotlin.jvm.internal.F.g(v3, rVar2)) {
                        Log.i(f16447h, "Dialog " + dialogFragment2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    this$0.j(rVar2, false);
                    return;
                }
                throw new IllegalStateException(("Dialog " + dialogFragment2 + " has already been popped off of the Navigation back stack").toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(c this$0, FragmentManager noName_0, Fragment childFragment) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(noName_0, "$noName_0");
        kotlin.jvm.internal.F.p(childFragment, "childFragment");
        if (this$0.f16450e.remove(childFragment.getTag())) {
            childFragment.getLifecycle().a(this$0.f16451f);
        }
    }

    @Override // androidx.navigation.c0
    public void e(@l3.d List<r> entries, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(entries, "entries");
        if (this.f16449d.Y0()) {
            Log.i(f16447h, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<r> it = entries.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
    }

    @Override // androidx.navigation.c0
    public void f(@l3.d f0 state) {
        Lifecycle lifecycle;
        kotlin.jvm.internal.F.p(state, "state");
        super.f(state);
        for (r rVar : state.b().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.f16449d.o0(rVar.h());
            H0 h02 = null;
            if (dialogFragment != null && (lifecycle = dialogFragment.getLifecycle()) != null) {
                lifecycle.a(this.f16451f);
                h02 = H0.f51801a;
            }
            if (h02 == null) {
                this.f16450e.add(rVar.h());
            }
        }
        this.f16449d.k(new w() { // from class: androidx.navigation.fragment.b
            @Override // androidx.fragment.app.w
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                c.q(c.this, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.c0
    public void j(@l3.d r popUpTo, boolean z3) {
        List X4;
        kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
        if (this.f16449d.Y0()) {
            Log.i(f16447h, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<r> value = b().b().getValue();
        X4 = D.X4(value.subList(value.indexOf(popUpTo), value.size()));
        Iterator it = X4.iterator();
        while (it.hasNext()) {
            Fragment o02 = this.f16449d.o0(((r) it.next()).h());
            if (o02 != null) {
                o02.getLifecycle().d(this.f16451f);
                ((DialogFragment) o02).dismiss();
            }
        }
        b().g(popUpTo, z3);
    }

    @Override // androidx.navigation.c0
    @l3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }
}
