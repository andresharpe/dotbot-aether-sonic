package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b {
    private b() {
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt(MediaBrowserCompat.f3848d, -1) == -1 && bundle2.getInt(MediaBrowserCompat.f3849e, -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle2 == null) {
            if (bundle.getInt(MediaBrowserCompat.f3848d, -1) == -1 && bundle.getInt(MediaBrowserCompat.f3849e, -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle.getInt(MediaBrowserCompat.f3848d, -1) == bundle2.getInt(MediaBrowserCompat.f3848d, -1) && bundle.getInt(MediaBrowserCompat.f3849e, -1) == bundle2.getInt(MediaBrowserCompat.f3849e, -1)) {
            return true;
        }
        return false;
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (bundle == null) {
            i4 = -1;
        } else {
            i4 = bundle.getInt(MediaBrowserCompat.f3848d, -1);
        }
        if (bundle2 == null) {
            i5 = -1;
        } else {
            i5 = bundle2.getInt(MediaBrowserCompat.f3848d, -1);
        }
        if (bundle == null) {
            i6 = -1;
        } else {
            i6 = bundle.getInt(MediaBrowserCompat.f3849e, -1);
        }
        if (bundle2 == null) {
            i7 = -1;
        } else {
            i7 = bundle2.getInt(MediaBrowserCompat.f3849e, -1);
        }
        int i11 = Integer.MAX_VALUE;
        if (i4 != -1 && i6 != -1) {
            i9 = i4 * i6;
            i8 = (i6 + i9) - 1;
        } else {
            i8 = Integer.MAX_VALUE;
            i9 = 0;
        }
        if (i5 != -1 && i7 != -1) {
            i10 = i5 * i7;
            i11 = (i7 + i10) - 1;
        } else {
            i10 = 0;
        }
        if (i8 < i10 || i11 < i9) {
            return false;
        }
        return true;
    }
}
