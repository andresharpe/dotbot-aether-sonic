package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.W;
import androidx.media.i;

@W(28)
/* loaded from: classes.dex */
class q extends j {

    /* renamed from: h, reason: collision with root package name */
    MediaSessionManager f16077h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Context context) {
        super(context);
        this.f16077h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.j, androidx.media.r, androidx.media.i.a
    public boolean a(i.c cVar) {
        boolean isTrustedForMediaControl;
        if (cVar instanceof a) {
            isTrustedForMediaControl = this.f16077h.isTrustedForMediaControl(((a) cVar).f16078a);
            return isTrustedForMediaControl;
        }
        return false;
    }

    /* loaded from: classes.dex */
    static final class a implements i.c {

        /* renamed from: a, reason: collision with root package name */
        final MediaSessionManager.RemoteUserInfo f16078a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, int i4, int i5) {
            this.f16078a = p.a(str, i4, i5);
        }

        @Override // androidx.media.i.c
        public int a() {
            int uid;
            uid = this.f16078a.getUid();
            return uid;
        }

        @Override // androidx.media.i.c
        public int b() {
            int pid;
            pid = this.f16078a.getPid();
            return pid;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                equals = this.f16078a.equals(((a) obj).f16078a);
                return equals;
            }
            return false;
        }

        @Override // androidx.media.i.c
        public String g() {
            String packageName;
            packageName = this.f16078a.getPackageName();
            return packageName;
        }

        public int hashCode() {
            return androidx.core.util.p.b(this.f16078a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f16078a = remoteUserInfo;
        }
    }
}
