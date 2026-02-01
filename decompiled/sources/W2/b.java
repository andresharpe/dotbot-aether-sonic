package W2;

import androidx.constraintlayout.core.motion.utils.v;
import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

@i(name = "JvmClassMappingKt")
/* loaded from: classes2.dex */
public final class b {
    @l3.d
    public static final <T extends Annotation> kotlin.reflect.d<? extends T> a(@l3.d T t3) {
        F.p(t3, "<this>");
        Class<? extends Annotation> annotationType = t3.annotationType();
        F.o(annotationType, "annotationType(...)");
        kotlin.reflect.d<? extends T> i4 = i(annotationType);
        F.n(i4, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i4;
    }

    private static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        F.p(r12, "<this>");
        Class<E> declaringClass = r12.getDeclaringClass();
        F.o(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    @l3.d
    public static final <T> Class<T> d(@l3.d T t3) {
        F.p(t3, "<this>");
        Class<T> cls = (Class<T>) t3.getClass();
        F.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @l3.d
    @i(name = "getJavaClass")
    public static final <T> Class<T> e(@l3.d kotlin.reflect.d<T> dVar) {
        F.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.r) dVar).p();
        F.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    @l3.d
    public static final <T> Class<T> g(@l3.d kotlin.reflect.d<T> dVar) {
        F.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.r) dVar).p();
        if (!cls.isPrimitive()) {
            F.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(v.b.f7404f)) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(v.b.f7401c)) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        F.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @l3.e
    public static final <T> Class<T> h(@l3.d kotlin.reflect.d<T> dVar) {
        F.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.r) dVar).p();
        if (cls.isPrimitive()) {
            F.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @l3.d
    @i(name = "getKotlinClass")
    public static final <T> kotlin.reflect.d<T> i(@l3.d Class<T> cls) {
        F.p(cls, "<this>");
        return N.d(cls);
    }

    @l3.d
    @i(name = "getRuntimeClassOfKClassInstance")
    public static final <T> Class<kotlin.reflect.d<T>> j(@l3.d kotlin.reflect.d<T> dVar) {
        F.p(dVar, "<this>");
        Class<kotlin.reflect.d<T>> cls = (Class<kotlin.reflect.d<T>>) dVar.getClass();
        F.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        F.p(objArr, "<this>");
        F.y(4, androidx.exifinterface.media.a.f5);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    @Y(version = "1.7")
    @kotlin.internal.f
    public static /* synthetic */ void c(Enum r02) {
    }

    public static /* synthetic */ void f(kotlin.reflect.d dVar) {
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @V(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }
}
