package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f12510a = versionedParcel.M(iconCompat.f12510a, 1);
        iconCompat.f12512c = versionedParcel.t(iconCompat.f12512c, 2);
        iconCompat.f12513d = versionedParcel.W(iconCompat.f12513d, 3);
        iconCompat.f12514e = versionedParcel.M(iconCompat.f12514e, 4);
        iconCompat.f12515f = versionedParcel.M(iconCompat.f12515f, 5);
        iconCompat.f12516g = (ColorStateList) versionedParcel.W(iconCompat.f12516g, 6);
        iconCompat.f12518i = versionedParcel.d0(iconCompat.f12518i, 7);
        iconCompat.f12519j = versionedParcel.d0(iconCompat.f12519j, 8);
        iconCompat.h();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(true, true);
        iconCompat.i(versionedParcel.i());
        int i4 = iconCompat.f12510a;
        if (-1 != i4) {
            versionedParcel.M0(i4, 1);
        }
        byte[] bArr = iconCompat.f12512c;
        if (bArr != null) {
            versionedParcel.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f12513d;
        if (parcelable != null) {
            versionedParcel.X0(parcelable, 3);
        }
        int i5 = iconCompat.f12514e;
        if (i5 != 0) {
            versionedParcel.M0(i5, 4);
        }
        int i6 = iconCompat.f12515f;
        if (i6 != 0) {
            versionedParcel.M0(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f12516g;
        if (colorStateList != null) {
            versionedParcel.X0(colorStateList, 6);
        }
        String str = iconCompat.f12518i;
        if (str != null) {
            versionedParcel.f1(str, 7);
        }
        String str2 = iconCompat.f12519j;
        if (str2 != null) {
            versionedParcel.f1(str2, 8);
        }
    }
}
