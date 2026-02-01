package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.N;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.internal.C1285y;

@I0.a
/* loaded from: classes.dex */
public abstract class RemoteCreator<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f29039a;

    /* renamed from: b, reason: collision with root package name */
    private Object f29040b;

    @I0.a
    /* loaded from: classes.dex */
    public static class RemoteCreatorException extends Exception {
        @I0.a
        public RemoteCreatorException(@N String str) {
            super(str);
        }

        @I0.a
        public RemoteCreatorException(@N String str, @N Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public RemoteCreator(@N String str) {
        this.f29039a = str;
    }

    @I0.a
    @N
    protected abstract T a(@N IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @N
    public final T b(@N Context context) throws RemoteCreatorException {
        if (this.f29040b == null) {
            C1285y.l(context);
            Context i4 = C1290k.i(context);
            if (i4 != null) {
                try {
                    this.f29040b = a((IBinder) i4.getClassLoader().loadClass(this.f29039a).newInstance());
                } catch (ClassNotFoundException e4) {
                    throw new RemoteCreatorException("Could not load creator class.", e4);
                } catch (IllegalAccessException e5) {
                    throw new RemoteCreatorException("Could not access creator.", e5);
                } catch (InstantiationException e6) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e6);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return (T) this.f29040b;
    }
}
