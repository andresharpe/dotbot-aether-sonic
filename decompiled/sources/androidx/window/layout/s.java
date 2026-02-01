package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.W;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final s f20880a = new s();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final kotlin.A f20881b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements X2.a<Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ClassLoader f20882F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f20882F = classLoader;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            s sVar = s.f20880a;
            Class l4 = sVar.l(this.f20882F);
            boolean z3 = false;
            Method getBoundsMethod = l4.getMethod("getBounds", new Class[0]);
            Method getTypeMethod = l4.getMethod("getType", new Class[0]);
            Method getStateMethod = l4.getMethod("getState", new Class[0]);
            kotlin.jvm.internal.F.o(getBoundsMethod, "getBoundsMethod");
            if (sVar.k(getBoundsMethod, N.d(Rect.class)) && sVar.o(getBoundsMethod)) {
                kotlin.jvm.internal.F.o(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (sVar.k(getTypeMethod, N.d(cls)) && sVar.o(getTypeMethod)) {
                    kotlin.jvm.internal.F.o(getStateMethod, "getStateMethod");
                    if (sVar.k(getStateMethod, N.d(cls)) && sVar.o(getStateMethod)) {
                        z3 = true;
                    }
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements X2.a<Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ClassLoader f20883F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f20883F = classLoader;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            s sVar = s.f20880a;
            boolean z3 = false;
            Method getWindowLayoutComponentMethod = sVar.t(this.f20883F).getMethod("getWindowLayoutComponent", new Class[0]);
            Class windowLayoutComponentClass = sVar.v(this.f20883F);
            kotlin.jvm.internal.F.o(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (sVar.o(getWindowLayoutComponentMethod)) {
                kotlin.jvm.internal.F.o(windowLayoutComponentClass, "windowLayoutComponentClass");
                if (sVar.j(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                    z3 = true;
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends Lambda implements X2.a<Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ClassLoader f20884F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f20884F = classLoader;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            boolean z3;
            s sVar = s.f20880a;
            Class v3 = sVar.v(this.f20884F);
            Method addListenerMethod = v3.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method removeListenerMethod = v3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            kotlin.jvm.internal.F.o(addListenerMethod, "addListenerMethod");
            if (sVar.o(addListenerMethod)) {
                kotlin.jvm.internal.F.o(removeListenerMethod, "removeListenerMethod");
                if (sVar.o(removeListenerMethod)) {
                    z3 = true;
                    return Boolean.valueOf(z3);
                }
            }
            z3 = false;
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements X2.a<Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ClassLoader f20885F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f20885F = classLoader;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            s sVar = s.f20880a;
            boolean z3 = false;
            Method getWindowExtensionsMethod = sVar.u(this.f20885F).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class windowExtensionsClass = sVar.t(this.f20885F);
            kotlin.jvm.internal.F.o(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            kotlin.jvm.internal.F.o(windowExtensionsClass, "windowExtensionsClass");
            if (sVar.j(getWindowExtensionsMethod, windowExtensionsClass) && sVar.o(getWindowExtensionsMethod)) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* loaded from: classes.dex */
    static final class e extends Lambda implements X2.a<WindowLayoutComponent> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f20886F = new e();

        e() {
            super(0);
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent n() {
            ClassLoader classLoader = s.class.getClassLoader();
            if (classLoader != null && s.f20880a.i(classLoader)) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
            return null;
        }
    }

    static {
        kotlin.A a4;
        a4 = kotlin.C.a(e.f20886F);
        f20881b = a4;
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        if (r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(Method method, kotlin.reflect.d<?> dVar) {
        return j(method, W2.b.e(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    @W(24)
    private final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    private final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    private final boolean s(X2.a<Boolean> aVar) {
        try {
            return aVar.n().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @l3.e
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f20881b.getValue();
    }
}
