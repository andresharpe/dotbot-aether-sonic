package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

@c.a(creator = "ActivityRecognitionResultCreator")
@c.g({1000})
/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends K0.a implements ReflectedParcelable {

    @androidx.annotation.N
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new P0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 1)
    List<C1568h> f29859E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    long f29860F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    long f29861G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(id = 4)
    int f29862H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 5)
    Bundle f29863I;

    @com.google.android.gms.common.util.D
    public ActivityRecognitionResult(@androidx.annotation.N C1568h c1568h, long j4, long j5) {
        this(Collections.singletonList(c1568h), j4, j5, 0, null);
    }

    @androidx.annotation.P
    public static List<ActivityRecognitionResult> B0(@androidx.annotation.N Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return K0.d.g(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean E0(@androidx.annotation.P Bundle bundle, @androidx.annotation.P Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!E0(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i4 = 0; i4 < length; i4++) {
                            if (C1281w.b(Array.get(obj, i4), Array.get(obj2, i4))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.location.ActivityRecognitionResult c0(@androidx.annotation.N android.content.Intent r3) {
        /*
            boolean r0 = z0(r3)
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L2b
        L9:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L10
            goto L7
        L10:
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L25
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = com.google.android.gms.location.ActivityRecognitionResult.CREATOR
            K0.c r0 = K0.d.a(r0, r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L2b
        L25:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L7
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
        L2b:
            if (r0 == 0) goto L2e
            return r0
        L2e:
            java.util.List r3 = B0(r3)
            if (r3 == 0) goto L48
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3b
            goto L48
        L3b:
            int r0 = r3.size()
            int r0 = r0 + (-1)
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.c0(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public static boolean z0(@androidx.annotation.P Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> B02 = B0(intent);
        if (B02 == null || B02.isEmpty()) {
            return false;
        }
        return true;
    }

    public int e0(int i4) {
        for (C1568h c1568h : this.f29859E) {
            if (c1568h.e0() == i4) {
                return c1568h.c0();
            }
        }
        return 0;
    }

    @com.google.android.gms.common.internal.D
    public final boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f29860F == activityRecognitionResult.f29860F && this.f29861G == activityRecognitionResult.f29861G && this.f29862H == activityRecognitionResult.f29862H && C1281w.b(this.f29859E, activityRecognitionResult.f29859E) && E0(this.f29863I, activityRecognitionResult.f29863I)) {
                return true;
            }
        }
        return false;
    }

    @com.google.android.gms.common.internal.D
    public final int hashCode() {
        return C1281w.c(Long.valueOf(this.f29860F), Long.valueOf(this.f29861G), Integer.valueOf(this.f29862H), this.f29859E, this.f29863I);
    }

    public long i0() {
        return this.f29861G;
    }

    @androidx.annotation.N
    public String toString() {
        String valueOf = String.valueOf(this.f29859E);
        long j4 = this.f29860F;
        long j5 = this.f29861G;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j4);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j5);
        sb.append("]");
        return sb.toString();
    }

    @androidx.annotation.N
    public C1568h u0() {
        return this.f29859E.get(0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.d0(parcel, 1, this.f29859E, false);
        K0.b.K(parcel, 2, this.f29860F);
        K0.b.K(parcel, 3, this.f29861G);
        K0.b.F(parcel, 4, this.f29862H);
        K0.b.k(parcel, 5, this.f29863I, false);
        K0.b.b(parcel, a4);
    }

    @androidx.annotation.N
    public List<C1568h> x0() {
        return this.f29859E;
    }

    public long y0() {
        return this.f29860F;
    }

    public ActivityRecognitionResult(@androidx.annotation.N List<C1568h> list, long j4, long j5) {
        this(list, j4, j5, 0, null);
    }

    @com.google.android.gms.common.internal.D
    @c.b
    public ActivityRecognitionResult(@c.e(id = 1) @androidx.annotation.N List<C1568h> list, @c.e(id = 2) long j4, @c.e(id = 3) long j5, @c.e(id = 4) int i4, @c.e(id = 5) @androidx.annotation.P Bundle bundle) {
        C1285y.b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C1285y.b(j4 > 0 && j5 > 0, "Must set times");
        this.f29859E = list;
        this.f29860F = j4;
        this.f29861G = j5;
        this.f29862H = i4;
        this.f29863I = bundle;
    }
}
