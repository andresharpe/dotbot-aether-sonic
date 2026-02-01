package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.y;
import com.google.android.gms.dynamic.d;
import java.lang.reflect.Field;

@I0.a
@y
/* loaded from: classes.dex */
public final class f<T> extends d.a {

    /* renamed from: i, reason: collision with root package name */
    private final Object f29046i;

    private f(Object obj) {
        this.f29046i = obj;
    }

    @I0.a
    @N
    public static <T> T G(@N d dVar) {
        if (dVar instanceof f) {
            return (T) ((f) dVar).f29046i;
        }
        IBinder asBinder = dVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i4++;
                field = field2;
            }
        }
        if (i4 == 1) {
            C1285y.l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e4) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
                } catch (NullPointerException e5) {
                    throw new IllegalArgumentException("Binder object is null.", e5);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }

    @I0.a
    @N
    public static <T> d O0(@N T t3) {
        return new f(t3);
    }
}
