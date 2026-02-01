package k3;

import android.os.Parcelable;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

/* loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ <T extends Parcelable> Parcelable.Creator<T> a() {
        F.y(4, androidx.exifinterface.media.a.f5);
        Parcelable.Creator<T> creator = null;
        Object obj = Parcelable.class.getDeclaredField("CREATOR").get(null);
        if (obj instanceof Parcelable.Creator) {
            creator = (Parcelable.Creator) obj;
        }
        if (creator != null) {
            return creator;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not access CREATOR field in class ");
        F.y(4, androidx.exifinterface.media.a.f5);
        sb.append(N.d(Parcelable.class).J());
        throw new IllegalArgumentException(sb.toString());
    }
}
