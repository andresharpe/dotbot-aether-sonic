package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Y;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.U;
import kotlin.sequences.SequencesKt___SequencesKt;

@U({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes2.dex */
public final class y {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52518a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52518a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<Class<?>, Class<?>> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f52519N = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // X2.l
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Class<?> C(@l3.d Class<?> p02) {
            F.p(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.r
    public static final Type c(r rVar, boolean z3) {
        Class e4;
        Object k5;
        int i4;
        g e02 = rVar.e0();
        if (e02 instanceof s) {
            return new x((s) e02);
        }
        if (e02 instanceof d) {
            d dVar = (d) e02;
            if (z3) {
                e4 = W2.b.g(dVar);
            } else {
                e4 = W2.b.e(dVar);
            }
            List<t> h4 = rVar.h();
            if (h4.isEmpty()) {
                return e4;
            }
            if (e4.isArray()) {
                if (!e4.getComponentType().isPrimitive()) {
                    k5 = D.k5(h4);
                    t tVar = (t) k5;
                    if (tVar != null) {
                        KVariance a4 = tVar.a();
                        r b4 = tVar.b();
                        if (a4 == null) {
                            i4 = -1;
                        } else {
                            i4 = a.f52518a[a4.ordinal()];
                        }
                        if (i4 != -1 && i4 != 1) {
                            if (i4 != 2 && i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            F.m(b4);
                            Type d4 = d(b4, false, 1, null);
                            if (!(d4 instanceof Class)) {
                                return new kotlin.reflect.a(d4);
                            }
                            return e4;
                        }
                        return e4;
                    }
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + rVar);
                }
                return e4;
            }
            return e(e4, h4);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + rVar);
    }

    static /* synthetic */ Type d(r rVar, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return c(rVar, z3);
    }

    @kotlin.r
    private static final Type e(Class<?> cls, List<t> list) {
        int b02;
        int b03;
        int b04;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            b04 = C2109w.b0(list, 10);
            ArrayList arrayList = new ArrayList(b04);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((t) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            b03 = C2109w.b0(list, 10);
            ArrayList arrayList2 = new ArrayList(b03);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((t) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e4 = e(declaringClass, list.subList(length, list.size()));
        List<t> subList = list.subList(0, length);
        b02 = C2109w.b0(subList, 10);
        ArrayList arrayList3 = new ArrayList(b02);
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((t) it3.next()));
        }
        return new u(cls, e4, arrayList3);
    }

    @l3.d
    public static final Type f(@l3.d r rVar) {
        Type Q3;
        F.p(rVar, "<this>");
        if ((rVar instanceof G) && (Q3 = ((G) rVar).Q()) != null) {
            return Q3;
        }
        return d(rVar, false, 1, null);
    }

    private static final Type g(t tVar) {
        KVariance h4 = tVar.h();
        if (h4 == null) {
            return z.f52520G.a();
        }
        r g4 = tVar.g();
        F.m(g4);
        int i4 = a.f52518a[h4.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return new z(c(g4, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return c(g4, true);
        }
        return new z(null, c(g4, true));
    }

    @kotlin.r
    @kotlin.internal.h
    @Y(version = "1.4")
    public static /* synthetic */ void h(r rVar) {
    }

    @kotlin.r
    private static /* synthetic */ void i(t tVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        kotlin.sequences.m n4;
        Object f12;
        int g02;
        String e22;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                n4 = kotlin.sequences.s.n(type, b.f52519N);
                StringBuilder sb = new StringBuilder();
                f12 = SequencesKt___SequencesKt.f1(n4);
                sb.append(((Class) f12).getName());
                g02 = SequencesKt___SequencesKt.g0(n4);
                e22 = kotlin.text.z.e2("[]", g02);
                sb.append(e22);
                name = sb.toString();
            } else {
                name = cls.getName();
            }
            F.m(name);
            return name;
        }
        return type.toString();
    }
}
