package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f11852a = (IconCompat) versionedParcel.h0(remoteActionCompat.f11852a, 1);
        remoteActionCompat.f11853b = versionedParcel.w(remoteActionCompat.f11853b, 2);
        remoteActionCompat.f11854c = versionedParcel.w(remoteActionCompat.f11854c, 3);
        remoteActionCompat.f11855d = (PendingIntent) versionedParcel.W(remoteActionCompat.f11855d, 4);
        remoteActionCompat.f11856e = versionedParcel.m(remoteActionCompat.f11856e, 5);
        remoteActionCompat.f11857f = versionedParcel.m(remoteActionCompat.f11857f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.m1(remoteActionCompat.f11852a, 1);
        versionedParcel.z0(remoteActionCompat.f11853b, 2);
        versionedParcel.z0(remoteActionCompat.f11854c, 3);
        versionedParcel.X0(remoteActionCompat.f11855d, 4);
        versionedParcel.n0(remoteActionCompat.f11856e, 5);
        versionedParcel.n0(remoteActionCompat.f11857f, 6);
    }
}
