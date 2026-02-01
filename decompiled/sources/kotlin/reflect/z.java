package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.r
@U({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
/* loaded from: classes2.dex */
public final class z implements WildcardType, v {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f52520G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final z f52521H = new z(null, null);

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final Type f52522E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final Type f52523F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final z a() {
            return z.f52521H;
        }

        private a() {
        }
    }

    public z(@l3.e Type type, @l3.e Type type2) {
        this.f52522E = type;
        this.f52523F = type2;
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @l3.d
    public Type[] getLowerBounds() {
        Type type = this.f52523F;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @l3.d
    public String getTypeName() {
        String j4;
        String j5;
        if (this.f52523F != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            j5 = y.j(this.f52523F);
            sb.append(j5);
            return sb.toString();
        }
        Type type = this.f52522E;
        if (type != null && !F.g(type, Object.class)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? extends ");
            j4 = y.j(this.f52522E);
            sb2.append(j4);
            return sb2.toString();
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    @l3.d
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f52522E;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @l3.d
    public String toString() {
        return getTypeName();
    }
}
