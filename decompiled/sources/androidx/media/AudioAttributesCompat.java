package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.g {

    /* renamed from: A, reason: collision with root package name */
    private static final SparseIntArray f15832A;

    /* renamed from: B, reason: collision with root package name */
    static boolean f15833B = false;

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f15834C;

    /* renamed from: D, reason: collision with root package name */
    public static final int f15835D = 1;

    /* renamed from: E, reason: collision with root package name */
    static final int f15836E = 2;

    /* renamed from: F, reason: collision with root package name */
    static final int f15837F = 4;

    /* renamed from: G, reason: collision with root package name */
    static final int f15838G = 8;

    /* renamed from: H, reason: collision with root package name */
    public static final int f15839H = 16;

    /* renamed from: I, reason: collision with root package name */
    static final int f15840I = 32;

    /* renamed from: J, reason: collision with root package name */
    static final int f15841J = 64;

    /* renamed from: K, reason: collision with root package name */
    static final int f15842K = 128;

    /* renamed from: L, reason: collision with root package name */
    static final int f15843L = 256;

    /* renamed from: M, reason: collision with root package name */
    static final int f15844M = 512;

    /* renamed from: N, reason: collision with root package name */
    static final int f15845N = 1023;

    /* renamed from: O, reason: collision with root package name */
    static final int f15846O = 273;

    /* renamed from: P, reason: collision with root package name */
    static final int f15847P = -1;

    /* renamed from: Q, reason: collision with root package name */
    static final String f15848Q = "androidx.media.audio_attrs.FRAMEWORKS";

    /* renamed from: R, reason: collision with root package name */
    static final String f15849R = "androidx.media.audio_attrs.USAGE";

    /* renamed from: S, reason: collision with root package name */
    static final String f15850S = "androidx.media.audio_attrs.CONTENT_TYPE";

    /* renamed from: T, reason: collision with root package name */
    static final String f15851T = "androidx.media.audio_attrs.FLAGS";

    /* renamed from: U, reason: collision with root package name */
    static final String f15852U = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    /* renamed from: b, reason: collision with root package name */
    private static final String f15853b = "AudioAttributesCompat";

    /* renamed from: c, reason: collision with root package name */
    public static final int f15854c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15855d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15856e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15857f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f15858g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f15859h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f15860i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f15861j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f15862k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f15863l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f15864m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f15865n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f15866o = 7;

    /* renamed from: p, reason: collision with root package name */
    public static final int f15867p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final int f15868q = 9;

    /* renamed from: r, reason: collision with root package name */
    public static final int f15869r = 10;

    /* renamed from: s, reason: collision with root package name */
    public static final int f15870s = 11;

    /* renamed from: t, reason: collision with root package name */
    public static final int f15871t = 12;

    /* renamed from: u, reason: collision with root package name */
    public static final int f15872u = 13;

    /* renamed from: v, reason: collision with root package name */
    public static final int f15873v = 14;

    /* renamed from: w, reason: collision with root package name */
    private static final int f15874w = 15;

    /* renamed from: x, reason: collision with root package name */
    public static final int f15875x = 16;

    /* renamed from: y, reason: collision with root package name */
    private static final int f15876y = 1;

    /* renamed from: z, reason: collision with root package name */
    private static final int f15877z = 2;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributesImpl f15878a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f15879a = 6;

        /* renamed from: b, reason: collision with root package name */
        public static final int f15880b = 7;

        /* renamed from: c, reason: collision with root package name */
        public static final int f15881c = 9;

        /* renamed from: d, reason: collision with root package name */
        public static final int f15882d = 10;

        private c() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15832A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f15834C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static AudioAttributesCompat h(Bundle bundle) {
        AudioAttributesImpl h4 = AudioAttributesImplApi21.h(bundle);
        if (h4 == null) {
            return null;
        }
        return new AudioAttributesCompat(h4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void i(boolean z3) {
        f15833B = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(boolean z3, int i4, int i5) {
        if ((i4 & 1) == 1) {
            if (z3) {
                return 1;
            }
            return 7;
        }
        if ((i4 & 4) == 4) {
            if (z3) {
                return 0;
            }
            return 6;
        }
        switch (i5) {
            case 0:
                if (!z3) {
                    return 3;
                }
                return Integer.MIN_VALUE;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                if (z3) {
                    return 0;
                }
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z3) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i5 + " in audio attributes");
        }
    }

    static int k(boolean z3, AudioAttributesCompat audioAttributesCompat) {
        return j(z3, audioAttributesCompat.a(), audioAttributesCompat.e());
    }

    static int m(int i4) {
        switch (i4) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n(int i4) {
        switch (i4) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i4;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @P
    public static AudioAttributesCompat o(@N Object obj) {
        if (!f15833B) {
            AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
            AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
            audioAttributesCompat.f15878a = audioAttributesImplApi21;
            return audioAttributesCompat;
        }
        return null;
    }

    public int a() {
        return this.f15878a.a();
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle b() {
        return this.f15878a.b();
    }

    public int c() {
        return this.f15878a.c();
    }

    int d() {
        return this.f15878a.d();
    }

    public int e() {
        return this.f15878a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f15878a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f15878a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f15878a);
    }

    public int g() {
        return this.f15878a.g();
    }

    public int getContentType() {
        return this.f15878a.getContentType();
    }

    public int hashCode() {
        return this.f15878a.hashCode();
    }

    @P
    public Object l() {
        return this.f15878a.f();
    }

    public String toString() {
        return this.f15878a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f15878a = audioAttributesImpl;
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f15883a;

        /* renamed from: b, reason: collision with root package name */
        private int f15884b;

        /* renamed from: c, reason: collision with root package name */
        private int f15885c;

        /* renamed from: d, reason: collision with root package name */
        private int f15886d;

        public d() {
            this.f15883a = 0;
            this.f15884b = 0;
            this.f15885c = 0;
            this.f15886d = -1;
        }

        public AudioAttributesCompat a() {
            AudioAttributesImpl audioAttributesImplBase;
            if (!AudioAttributesCompat.f15833B) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f15884b).setFlags(this.f15885c).setUsage(this.f15883a);
                int i4 = this.f15886d;
                if (i4 != -1) {
                    usage.setLegacyStreamType(i4);
                }
                audioAttributesImplBase = new AudioAttributesImplApi21(usage.build(), this.f15886d);
            } else {
                audioAttributesImplBase = new AudioAttributesImplBase(this.f15884b, this.f15885c, this.f15883a, this.f15886d);
            }
            return new AudioAttributesCompat(audioAttributesImplBase);
        }

        public d b(int i4) {
            if (i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                this.f15883a = 0;
            } else {
                this.f15884b = i4;
            }
            return this;
        }

        public d c(int i4) {
            this.f15885c = (i4 & AudioAttributesCompat.f15845N) | this.f15885c;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        d d(int i4) {
            switch (i4) {
                case 0:
                    this.f15884b = 1;
                    break;
                case 1:
                    this.f15884b = 4;
                    break;
                case 2:
                    this.f15884b = 4;
                    break;
                case 3:
                    this.f15884b = 2;
                    break;
                case 4:
                    this.f15884b = 4;
                    break;
                case 5:
                    this.f15884b = 4;
                    break;
                case 6:
                    this.f15884b = 1;
                    this.f15885c |= 4;
                    break;
                case 7:
                    this.f15885c = 1 | this.f15885c;
                    this.f15884b = 4;
                    break;
                case 8:
                    this.f15884b = 4;
                    break;
                case 9:
                    this.f15884b = 4;
                    break;
                case 10:
                    this.f15884b = 1;
                    break;
                default:
                    Log.e(AudioAttributesCompat.f15853b, "Invalid stream type " + i4 + " for AudioAttributesCompat");
                    break;
            }
            this.f15883a = AudioAttributesCompat.m(i4);
            return this;
        }

        public d e(int i4) {
            if (i4 != 10) {
                this.f15886d = i4;
                return d(i4);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public d f(int i4) {
            switch (i4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f15883a = i4;
                    return this;
                case 16:
                    if (!AudioAttributesCompat.f15833B && Build.VERSION.SDK_INT > 25) {
                        this.f15883a = i4;
                    } else {
                        this.f15883a = 12;
                    }
                    return this;
                default:
                    this.f15883a = 0;
                    return this;
            }
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            this.f15883a = 0;
            this.f15884b = 0;
            this.f15885c = 0;
            this.f15886d = -1;
            this.f15883a = audioAttributesCompat.e();
            this.f15884b = audioAttributesCompat.getContentType();
            this.f15885c = audioAttributesCompat.a();
            this.f15886d = audioAttributesCompat.d();
        }
    }
}
