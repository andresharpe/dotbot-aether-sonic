package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.N;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15887c = "AudioAttributesCompat21";

    /* renamed from: d, reason: collision with root package name */
    static Method f15888d;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f15889a;

    /* renamed from: b, reason: collision with root package name */
    int f15890b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21() {
        this.f15890b = -1;
    }

    public static AudioAttributesImpl h(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable("androidx.media.audio_attrs.FRAMEWORKS")) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    static Method i() {
        try {
            if (f15888d == null) {
                f15888d = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return f15888d;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        return this.f15889a.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    @N
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.f15889a);
        int i4 = this.f15890b;
        if (i4 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i4);
        }
        return bundle;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        int i4 = this.f15890b;
        if (i4 != -1) {
            return i4;
        }
        Method i5 = i();
        if (i5 == null) {
            Log.w(f15887c, "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) i5.invoke(null, this.f15889a)).intValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            Log.w(f15887c, "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT, e4);
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return this.f15890b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int e() {
        return this.f15889a.getUsage();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f15889a.equals(((AudioAttributesImplApi21) obj).f15889a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object f() {
        return this.f15889a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int g() {
        int volumeControlStream;
        if (Build.VERSION.SDK_INT >= 26) {
            volumeControlStream = this.f15889a.getVolumeControlStream();
            return volumeControlStream;
        }
        return AudioAttributesCompat.j(true, a(), e());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f15889a.getContentType();
    }

    public int hashCode() {
        return this.f15889a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15889a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i4) {
        this.f15889a = audioAttributes;
        this.f15890b = i4;
    }
}
