package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.RestrictTo;
import androidx.navigation.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C2197u;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final a f16421b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final Map<Class<?>, String> f16422c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Map<String, c0<? extends F>> f16423a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final String a(@l3.d Class<? extends c0<?>> navigatorClass) {
            kotlin.jvm.internal.F.p(navigatorClass, "navigatorClass");
            String str = (String) d0.f16422c.get(navigatorClass);
            if (str == null) {
                c0.b bVar = (c0.b) navigatorClass.getAnnotation(c0.b.class);
                if (bVar == null) {
                    str = null;
                } else {
                    str = bVar.value();
                }
                if (b(str)) {
                    d0.f16422c.put(navigatorClass, str);
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.F.C("No @Navigator.Name annotation found for ", navigatorClass.getSimpleName()).toString());
                }
            }
            kotlin.jvm.internal.F.m(str);
            return str;
        }

        public final boolean b(@l3.e String str) {
            if (str != null && str.length() > 0) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }

    @W2.n
    @l3.d
    public static final String d(@l3.d Class<? extends c0<?>> cls) {
        return f16421b.a(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    public final c0<? extends F> b(@l3.d c0<? extends F> navigator) {
        kotlin.jvm.internal.F.p(navigator, "navigator");
        return c(f16421b.a(navigator.getClass()), navigator);
    }

    @l3.e
    @InterfaceC0566i
    public c0<? extends F> c(@l3.d String name, @l3.d c0<? extends F> navigator) {
        kotlin.jvm.internal.F.p(name, "name");
        kotlin.jvm.internal.F.p(navigator, "navigator");
        if (f16421b.b(name)) {
            c0<? extends F> c0Var = this.f16423a.get(name);
            if (kotlin.jvm.internal.F.g(c0Var, navigator)) {
                return navigator;
            }
            boolean z3 = false;
            if (c0Var != null && c0Var.c()) {
                z3 = true;
            }
            if (!z3) {
                if (!navigator.c()) {
                    return this.f16423a.put(name, navigator);
                }
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + c0Var).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @l3.d
    public final <T extends c0<?>> T e(@l3.d Class<T> navigatorClass) {
        kotlin.jvm.internal.F.p(navigatorClass, "navigatorClass");
        return (T) f(f16421b.a(navigatorClass));
    }

    @InterfaceC0566i
    @l3.d
    public <T extends c0<?>> T f(@l3.d String name) {
        kotlin.jvm.internal.F.p(name, "name");
        if (f16421b.b(name)) {
            c0<? extends F> c0Var = this.f16423a.get(name);
            if (c0Var != null) {
                return c0Var;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, c0<? extends F>> g() {
        Map<String, c0<? extends F>> D02;
        D02 = kotlin.collections.Y.D0(this.f16423a);
        return D02;
    }
}
