package androidx.media;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.W;
import androidx.media.i;

@W(21)
/* loaded from: classes.dex */
class j extends r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context) {
        super(context);
        this.f16084a = context;
    }

    private boolean d(@N i.c cVar) {
        if (e().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.b(), cVar.a()) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.media.r, androidx.media.i.a
    public boolean a(@N i.c cVar) {
        if (!d(cVar) && !super.a(cVar)) {
            return false;
        }
        return true;
    }
}
