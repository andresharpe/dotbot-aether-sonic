package androidx.lifecycle;

import R.a;
import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.C2197u;

@kotlin.jvm.internal.U({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final p0 f15673a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final b f15674b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final R.a f15675c;

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f15682a = a.f15683a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f15683a = new a();

            private a() {
            }

            @W2.n
            @l3.d
            public final b a(@l3.d R.h<?>... initializers) {
                kotlin.jvm.internal.F.p(initializers, "initializers");
                return new R.b((R.h[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @W2.n
        @l3.d
        static b b(@l3.d R.h<?>... hVarArr) {
            return f15682a.a(hVarArr);
        }

        @l3.d
        default <T extends j0> T a(@l3.d Class<T> modelClass) {
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @l3.d
        default <T extends j0> T c(@l3.d Class<T> modelClass, @l3.d R.a extras) {
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            kotlin.jvm.internal.F.p(extras, "extras");
            return (T) a(modelClass);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        @l3.e
        private static c f15685c;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final a f15684b = new a(null);

        /* renamed from: d, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final a.b<String> f15686d = a.C0140a.f15687a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.m0$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0140a implements a.b<String> {

                /* renamed from: a, reason: collision with root package name */
                @l3.d
                public static final C0140a f15687a = new C0140a();

                private C0140a() {
                }
            }

            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            @W2.n
            public static /* synthetic */ void b() {
            }

            @l3.d
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final c a() {
                if (c.f15685c == null) {
                    c.f15685c = new c();
                }
                c cVar = c.f15685c;
                kotlin.jvm.internal.F.m(cVar);
                return cVar;
            }

            private a() {
            }
        }

        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final c f() {
            return f15684b.a();
        }

        @Override // androidx.lifecycle.m0.b
        @l3.d
        public <T extends j0> T a(@l3.d Class<T> modelClass) {
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.F.o(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class d {
        public void d(@l3.d j0 viewModel) {
            kotlin.jvm.internal.F.p(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @W2.j
    public m0(@l3.d p0 store, @l3.d b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.F.p(store, "store");
        kotlin.jvm.internal.F.p(factory, "factory");
    }

    @l3.d
    @androidx.annotation.K
    public <T extends j0> T a(@l3.d Class<T> modelClass) {
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @l3.d
    @androidx.annotation.K
    public <T extends j0> T b(@l3.d String key, @l3.d Class<T> modelClass) {
        T t3;
        d dVar;
        kotlin.jvm.internal.F.p(key, "key");
        kotlin.jvm.internal.F.p(modelClass, "modelClass");
        T t4 = (T) this.f15673a.b(key);
        if (modelClass.isInstance(t4)) {
            Object obj = this.f15674b;
            if (obj instanceof d) {
                dVar = (d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                kotlin.jvm.internal.F.m(t4);
                dVar.d(t4);
            }
            kotlin.jvm.internal.F.n(t4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t4;
        }
        R.e eVar = new R.e(this.f15675c);
        eVar.c(c.f15686d, key);
        try {
            t3 = (T) this.f15674b.c(modelClass, eVar);
        } catch (AbstractMethodError unused) {
            t3 = (T) this.f15674b.a(modelClass);
        }
        this.f15673a.d(key, t3);
        return t3;
    }

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: g, reason: collision with root package name */
        @l3.d
        public static final String f15677g = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        /* renamed from: h, reason: collision with root package name */
        @l3.e
        private static a f15678h;

        /* renamed from: e, reason: collision with root package name */
        @l3.e
        private final Application f15680e;

        /* renamed from: f, reason: collision with root package name */
        @l3.d
        public static final C0138a f15676f = new C0138a(null);

        /* renamed from: i, reason: collision with root package name */
        @W2.f
        @l3.d
        public static final a.b<Application> f15679i = C0138a.C0139a.f15681a;

        /* renamed from: androidx.lifecycle.m0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0138a {

            /* renamed from: androidx.lifecycle.m0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0139a implements a.b<Application> {

                /* renamed from: a, reason: collision with root package name */
                @l3.d
                public static final C0139a f15681a = new C0139a();

                private C0139a() {
                }
            }

            public /* synthetic */ C0138a(C2197u c2197u) {
                this();
            }

            @l3.d
            public final b a(@l3.d q0 owner) {
                kotlin.jvm.internal.F.p(owner, "owner");
                if (owner instanceof InterfaceC0919v) {
                    return ((InterfaceC0919v) owner).getDefaultViewModelProviderFactory();
                }
                return c.f15684b.a();
            }

            @W2.n
            @l3.d
            public final a b(@l3.d Application application) {
                kotlin.jvm.internal.F.p(application, "application");
                if (a.f15678h == null) {
                    a.f15678h = new a(application);
                }
                a aVar = a.f15678h;
                kotlin.jvm.internal.F.m(aVar);
                return aVar;
            }

            private C0138a() {
            }
        }

        private a(Application application, int i4) {
            this.f15680e = application;
        }

        private final <T extends j0> T i(Class<T> cls, Application application) {
            if (C0900b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    kotlin.jvm.internal.F.o(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                } catch (InstantiationException e5) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e5);
                } catch (NoSuchMethodException e6) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e7);
                }
            }
            return (T) super.a(cls);
        }

        @W2.n
        @l3.d
        public static final a j(@l3.d Application application) {
            return f15676f.b(application);
        }

        @Override // androidx.lifecycle.m0.c, androidx.lifecycle.m0.b
        @l3.d
        public <T extends j0> T a(@l3.d Class<T> modelClass) {
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            Application application = this.f15680e;
            if (application != null) {
                return (T) i(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.m0.b
        @l3.d
        public <T extends j0> T c(@l3.d Class<T> modelClass, @l3.d R.a extras) {
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            kotlin.jvm.internal.F.p(extras, "extras");
            if (this.f15680e != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f15679i);
            if (application != null) {
                return (T) i(modelClass, application);
            }
            if (!C0900b.class.isAssignableFrom(modelClass)) {
                return (T) super.a(modelClass);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@l3.d Application application) {
            this(application, 0);
            kotlin.jvm.internal.F.p(application, "application");
        }
    }

    @W2.j
    public m0(@l3.d p0 store, @l3.d b factory, @l3.d R.a defaultCreationExtras) {
        kotlin.jvm.internal.F.p(store, "store");
        kotlin.jvm.internal.F.p(factory, "factory");
        kotlin.jvm.internal.F.p(defaultCreationExtras, "defaultCreationExtras");
        this.f15673a = store;
        this.f15674b = factory;
        this.f15675c = defaultCreationExtras;
    }

    public /* synthetic */ m0(p0 p0Var, b bVar, R.a aVar, int i4, C2197u c2197u) {
        this(p0Var, bVar, (i4 & 4) != 0 ? a.C0017a.f1726b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(@l3.d q0 owner) {
        this(owner.getViewModelStore(), a.f15676f.a(owner), n0.a(owner));
        kotlin.jvm.internal.F.p(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(@l3.d q0 owner, @l3.d b factory) {
        this(owner.getViewModelStore(), factory, n0.a(owner));
        kotlin.jvm.internal.F.p(owner, "owner");
        kotlin.jvm.internal.F.p(factory, "factory");
    }
}
