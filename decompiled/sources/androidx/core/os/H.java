package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

@W(21)
/* loaded from: classes.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final H f12714a = new H();

    private H() {
    }

    @W2.n
    @InterfaceC0577u
    @l3.d
    public static final PersistableBundle a(int i4) {
        return new PersistableBundle(i4);
    }

    @W2.n
    @InterfaceC0577u
    public static final void b(@l3.d PersistableBundle persistableBundle, @l3.e String str, @l3.e Object obj) {
        kotlin.jvm.internal.F.p(persistableBundle, "persistableBundle");
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            I.a(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            I.b(persistableBundle, str, (boolean[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (obj instanceof Object[]) {
            Class<?> componentType = obj.getClass().getComponentType();
            kotlin.jvm.internal.F.m(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                kotlin.jvm.internal.F.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                persistableBundle.putStringArray(str, (String[]) obj);
                return;
            }
            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + kotlin.text.F.f52746b);
        }
        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + kotlin.text.F.f52746b);
    }
}
