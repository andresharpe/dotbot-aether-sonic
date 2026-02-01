package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.response.a;

@D
@I0.a
/* loaded from: classes.dex */
public abstract class b extends a implements K0.c {
    @I0.a
    public b() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.a
    @P
    @com.google.android.gms.common.util.D
    public Object e(@N String str) {
        return null;
    }

    @I0.a
    public boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0271a<?, ?> c0271a : c().values()) {
            if (g(c0271a)) {
                if (!aVar.g(c0271a) || !C1281w.b(d(c0271a), aVar.d(c0271a))) {
                    return false;
                }
            } else if (aVar.g(c0271a)) {
                return false;
            }
        }
        return true;
    }

    @I0.a
    @N
    public byte[] g0() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // com.google.android.gms.common.server.response.a
    @com.google.android.gms.common.util.D
    public boolean h(@N String str) {
        return false;
    }

    @I0.a
    public int hashCode() {
        int i4 = 0;
        for (a.C0271a<?, ?> c0271a : c().values()) {
            if (g(c0271a)) {
                i4 = (i4 * 31) + C1285y.l(d(c0271a)).hashCode();
            }
        }
        return i4;
    }
}
