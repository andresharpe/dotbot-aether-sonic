package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.v;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.InterfaceC2229v;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

@U({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* renamed from: kotlin.jvm.internal.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2195s implements kotlin.reflect.d<Object>, r {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f52366F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final Map<Class<? extends InterfaceC2229v<?>>, Integer> f52367G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final HashMap<String, String> f52368H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final HashMap<String, String> f52369I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final HashMap<String, String> f52370J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final Map<String, String> f52371K;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Class<?> f52372E;

    @U({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* renamed from: kotlin.jvm.internal.s$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.e
        public final String a(@l3.d Class<?> jClass) {
            String str;
            F.p(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C2195s.f52370J.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) C2195s.f52370J.get(jClass.getName());
            if (str3 == null) {
                return jClass.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(@l3.d java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.F.p(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.F.m(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = kotlin.text.q.n5(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.F.m(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = kotlin.text.q.n5(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.F.m(r0)
                java.lang.String r1 = kotlin.text.q.m5(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.C2195s.B()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.C2195s.B()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C2195s.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(@l3.e Object obj, @l3.d Class<?> jClass) {
            F.p(jClass, "jClass");
            Map map = C2195s.f52367G;
            F.n(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return X.B(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = W2.b.g(W2.b.i(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List O3;
        int b02;
        Map<Class<? extends InterfaceC2229v<?>>, Integer> B02;
        int j4;
        String q5;
        String q52;
        O3 = CollectionsKt__CollectionsKt.O(X2.a.class, X2.l.class, X2.p.class, X2.q.class, X2.r.class, X2.s.class, X2.t.class, X2.u.class, X2.v.class, X2.w.class, X2.b.class, X2.c.class, X2.d.class, X2.e.class, X2.f.class, X2.g.class, X2.h.class, X2.i.class, X2.j.class, X2.k.class, X2.m.class, X2.n.class, X2.o.class);
        b02 = C2109w.b0(O3, 10);
        ArrayList arrayList = new ArrayList(b02);
        int i4 = 0;
        for (Object obj : O3) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            arrayList.add(C2122h0.a((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        B02 = kotlin.collections.Y.B0(arrayList);
        f52367G = B02;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(v.b.f7404f, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(v.b.f7401c, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f52368H = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f52369I = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        F.o(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            F.m(str);
            q52 = kotlin.text.A.q5(str, '.', null, 2, null);
            sb.append(q52);
            sb.append("CompanionObject");
            Pair a4 = C2122h0.a(sb.toString(), str + ".Companion");
            hashMap3.put(a4.e(), a4.f());
        }
        for (Map.Entry<Class<? extends InterfaceC2229v<?>>, Integer> entry : f52367G.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f52370J = hashMap3;
        j4 = kotlin.collections.X.j(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            q5 = kotlin.text.A.q5((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, q5);
        }
        f52371K = linkedHashMap;
    }

    public C2195s(@l3.d Class<?> jClass) {
        F.p(jClass, "jClass");
        this.f52372E = jClass;
    }

    private final Void C() {
        throw new KotlinReflectionNotSupportedError();
    }

    @kotlin.Y(version = "1.3")
    public static /* synthetic */ void E() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void F() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void G() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void N() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void P() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void S() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void U() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void V() {
    }

    @kotlin.Y(version = "1.4")
    public static /* synthetic */ void Y() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void Z() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void a0() {
    }

    @kotlin.Y(version = "1.1")
    public static /* synthetic */ void c0() {
    }

    @kotlin.Y(version = "1.5")
    public static /* synthetic */ void d0() {
    }

    @Override // kotlin.reflect.d
    @l3.d
    public List<kotlin.reflect.d<? extends Object>> D() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean H() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean I() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @l3.e
    public String J() {
        return f52366F.b(p());
    }

    @Override // kotlin.reflect.d
    @l3.d
    public List<kotlin.reflect.r> L() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @l3.e
    public Object O() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean T() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean X() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @l3.e
    public KVisibility c() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean d() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof C2195s) && F.g(W2.b.g(this), W2.b.g((kotlin.reflect.d) obj))) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.d
    @l3.d
    public List<kotlin.reflect.s> f() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @kotlin.Y(version = "1.1")
    public boolean g0(@l3.e Object obj) {
        return f52366F.c(obj, p());
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return W2.b.g(this).hashCode();
    }

    @Override // kotlin.reflect.b
    @l3.d
    public List<Annotation> i() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean j() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d, kotlin.reflect.h
    @l3.d
    public Collection<kotlin.reflect.c<?>> m() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @l3.e
    public String o() {
        return f52366F.a(p());
    }

    @Override // kotlin.jvm.internal.r
    @l3.d
    public Class<?> p() {
        return this.f52372E;
    }

    @Override // kotlin.reflect.d
    @l3.d
    public Collection<kotlin.reflect.d<?>> q() {
        C();
        throw new KotlinNothingValueException();
    }

    @l3.d
    public String toString() {
        return p().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.d
    public boolean u0() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @l3.d
    public Collection<kotlin.reflect.i<Object>> v() {
        C();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean y() {
        C();
        throw new KotlinNothingValueException();
    }
}
