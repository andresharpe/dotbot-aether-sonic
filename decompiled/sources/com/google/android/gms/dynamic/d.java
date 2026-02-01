package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.N;

/* loaded from: classes.dex */
public interface d extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends com.google.android.gms.internal.common.k implements d {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @N
        public static d A(@N IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof d) {
                return (d) queryLocalInterface;
            }
            return new r(iBinder);
        }
    }
}
