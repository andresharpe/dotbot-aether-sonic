package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@androidx.annotation.W(28)
/* loaded from: classes.dex */
public class X extends W {

    /* renamed from: B, reason: collision with root package name */
    private static final String f12453B = "createFromFamiliesWithDefault";

    /* renamed from: C, reason: collision with root package name */
    private static final int f12454C = -1;

    /* renamed from: D, reason: collision with root package name */
    private static final String f12455D = "sans-serif";

    @Override // androidx.core.graphics.W
    protected Method B(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f12453B, cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.graphics.W, androidx.core.graphics.U, androidx.core.graphics.Z
    @androidx.annotation.N
    public Typeface g(@androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        return Typeface.create(typeface, i4, z3);
    }

    @Override // androidx.core.graphics.W
    protected Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f12446m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f12452s.invoke(null, newInstance, f12455D, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
