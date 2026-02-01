package androidx.media;

import android.os.Bundle;
import androidx.annotation.N;
import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f15891a;

    /* renamed from: b, reason: collision with root package name */
    int f15892b;

    /* renamed from: c, reason: collision with root package name */
    int f15893c;

    /* renamed from: d, reason: collision with root package name */
    int f15894d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplBase() {
        this.f15891a = 0;
        this.f15892b = 0;
        this.f15893c = 0;
        this.f15894d = -1;
    }

    public static AudioAttributesImpl h(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("androidx.media.audio_attrs.FLAGS", 0), bundle.getInt("androidx.media.audio_attrs.USAGE", 0), bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i4 = this.f15893c;
        int c4 = c();
        if (c4 == 6) {
            i4 |= 4;
        } else if (c4 == 7) {
            i4 |= 1;
        }
        return i4 & 273;
    }

    @Override // androidx.media.AudioAttributesImpl
    @N
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.f15891a);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.f15892b);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.f15893c);
        int i4 = this.f15894d;
        if (i4 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i4);
        }
        return bundle;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        int i4 = this.f15894d;
        if (i4 != -1) {
            return i4;
        }
        return AudioAttributesCompat.j(false, this.f15893c, this.f15891a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return this.f15894d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int e() {
        return this.f15891a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f15892b != audioAttributesImplBase.getContentType() || this.f15893c != audioAttributesImplBase.a() || this.f15891a != audioAttributesImplBase.e() || this.f15894d != audioAttributesImplBase.f15894d) {
            return false;
        }
        return true;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object f() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int g() {
        return AudioAttributesCompat.j(true, this.f15893c, this.f15891a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f15892b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15892b), Integer.valueOf(this.f15893c), Integer.valueOf(this.f15891a), Integer.valueOf(this.f15894d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f15894d != -1) {
            sb.append(" stream=");
            sb.append(this.f15894d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.n(this.f15891a));
        sb.append(" content=");
        sb.append(this.f15892b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f15893c).toUpperCase());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplBase(int i4, int i5, int i6, int i7) {
        this.f15892b = i4;
        this.f15893c = i5;
        this.f15891a = i6;
        this.f15894d = i7;
    }
}
