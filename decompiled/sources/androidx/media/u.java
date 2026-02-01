package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.W;

@W(21)
/* loaded from: classes.dex */
class u {

    /* loaded from: classes.dex */
    static class a extends VolumeProvider {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f16264a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, int i5, int i6, b bVar) {
            super(i4, i5, i6);
            this.f16264a = bVar;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i4) {
            this.f16264a.b(i4);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i4) {
            this.f16264a.a(i4);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i4);

        void b(int i4);
    }

    private u() {
    }

    public static Object a(int i4, int i5, int i6, b bVar) {
        return new a(i4, i5, i6, bVar);
    }

    public static void b(Object obj, int i4) {
        ((VolumeProvider) obj).setCurrentVolume(i4);
    }
}
