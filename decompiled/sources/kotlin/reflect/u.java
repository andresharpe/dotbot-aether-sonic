package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.r
@U({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
/* loaded from: classes2.dex */
public final class u implements ParameterizedType, v {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Class<?> f52513E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final Type f52514F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Type[] f52515G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements X2.l<Type, String> {

        /* renamed from: N, reason: collision with root package name */
        public static final a f52516N = new a();

        a() {
            super(1, y.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d Type p02) {
            String j4;
            F.p(p02, "p0");
            j4 = y.j(p02);
            return j4;
        }
    }

    public u(@l3.d Class<?> rawType, @l3.e Type type, @l3.d List<? extends Type> typeArguments) {
        F.p(rawType, "rawType");
        F.p(typeArguments, "typeArguments");
        this.f52513E = rawType;
        this.f52514F = type;
        this.f52515G = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (F.g(this.f52513E, parameterizedType.getRawType()) && F.g(this.f52514F, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @l3.d
    public Type[] getActualTypeArguments() {
        return this.f52515G;
    }

    @Override // java.lang.reflect.ParameterizedType
    @l3.e
    public Type getOwnerType() {
        return this.f52514F;
    }

    @Override // java.lang.reflect.ParameterizedType
    @l3.d
    public Type getRawType() {
        return this.f52513E;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @l3.d
    public String getTypeName() {
        String j4;
        boolean z3;
        String j5;
        StringBuilder sb = new StringBuilder();
        Type type = this.f52514F;
        if (type != null) {
            j5 = y.j(type);
            sb.append(j5);
            sb.append("$");
            sb.append(this.f52513E.getSimpleName());
        } else {
            j4 = y.j(this.f52513E);
            sb.append(j4);
        }
        Type[] typeArr = this.f52515G;
        if (typeArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            C2101p.Tg(typeArr, sb, null, "<", ">", 0, null, a.f52516N, 50, null);
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public int hashCode() {
        int i4;
        int hashCode = this.f52513E.hashCode();
        Type type = this.f52514F;
        if (type != null) {
            i4 = type.hashCode();
        } else {
            i4 = 0;
        }
        return (hashCode ^ i4) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @l3.d
    public String toString() {
        return getTypeName();
    }
}
