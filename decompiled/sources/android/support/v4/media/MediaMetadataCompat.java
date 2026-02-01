package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: H, reason: collision with root package name */
    private static final String f3990H = "MediaMetadata";

    /* renamed from: I, reason: collision with root package name */
    public static final String f3991I = "android.media.metadata.TITLE";

    /* renamed from: J, reason: collision with root package name */
    public static final String f3992J = "android.media.metadata.ARTIST";

    /* renamed from: K, reason: collision with root package name */
    public static final String f3993K = "android.media.metadata.DURATION";

    /* renamed from: L, reason: collision with root package name */
    public static final String f3994L = "android.media.metadata.ALBUM";

    /* renamed from: M, reason: collision with root package name */
    public static final String f3995M = "android.media.metadata.AUTHOR";

    /* renamed from: N, reason: collision with root package name */
    public static final String f3996N = "android.media.metadata.WRITER";

    /* renamed from: O, reason: collision with root package name */
    public static final String f3997O = "android.media.metadata.COMPOSER";

    /* renamed from: P, reason: collision with root package name */
    public static final String f3998P = "android.media.metadata.COMPILATION";

    /* renamed from: Q, reason: collision with root package name */
    public static final String f3999Q = "android.media.metadata.DATE";

    /* renamed from: R, reason: collision with root package name */
    public static final String f4000R = "android.media.metadata.YEAR";

    /* renamed from: S, reason: collision with root package name */
    public static final String f4001S = "android.media.metadata.GENRE";

    /* renamed from: T, reason: collision with root package name */
    public static final String f4002T = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: U, reason: collision with root package name */
    public static final String f4003U = "android.media.metadata.NUM_TRACKS";

    /* renamed from: V, reason: collision with root package name */
    public static final String f4004V = "android.media.metadata.DISC_NUMBER";

    /* renamed from: W, reason: collision with root package name */
    public static final String f4005W = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: X, reason: collision with root package name */
    public static final String f4006X = "android.media.metadata.ART";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f4007Y = "android.media.metadata.ART_URI";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f4008Z = "android.media.metadata.ALBUM_ART";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f4009a0 = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f4010b0 = "android.media.metadata.USER_RATING";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f4011c0 = "android.media.metadata.RATING";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f4012d0 = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f4013e0 = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f4014f0 = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f4015g0 = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f4016h0 = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f4017i0 = "android.media.metadata.MEDIA_ID";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f4018j0 = "android.media.metadata.MEDIA_URI";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f4019k0 = "android.media.metadata.BT_FOLDER_TYPE";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f4020l0 = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f4021m0 = "android.media.metadata.DOWNLOAD_STATUS";

    /* renamed from: n0, reason: collision with root package name */
    static final int f4022n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    static final int f4023o0 = 1;

    /* renamed from: p0, reason: collision with root package name */
    static final int f4024p0 = 2;

    /* renamed from: q0, reason: collision with root package name */
    static final int f4025q0 = 3;

    /* renamed from: r0, reason: collision with root package name */
    static final androidx.collection.a<String, Integer> f4026r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final String[] f4027s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final String[] f4028t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final String[] f4029u0;

    /* renamed from: E, reason: collision with root package name */
    final Bundle f4030E;

    /* renamed from: F, reason: collision with root package name */
    private Object f4031F;

    /* renamed from: G, reason: collision with root package name */
    private MediaDescriptionCompat f4032G;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i4) {
            return new MediaMetadataCompat[i4];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface f {
    }

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        f4026r0 = aVar;
        aVar.put(f3991I, 1);
        aVar.put(f3992J, 1);
        aVar.put(f3993K, 0);
        aVar.put(f3994L, 1);
        aVar.put(f3995M, 1);
        aVar.put(f3996N, 1);
        aVar.put(f3997O, 1);
        aVar.put(f3998P, 1);
        aVar.put(f3999Q, 1);
        aVar.put(f4000R, 0);
        aVar.put(f4001S, 1);
        aVar.put(f4002T, 0);
        aVar.put(f4003U, 0);
        aVar.put(f4004V, 0);
        aVar.put(f4005W, 1);
        aVar.put(f4006X, 2);
        aVar.put(f4007Y, 1);
        aVar.put(f4008Z, 2);
        aVar.put(f4009a0, 1);
        aVar.put(f4010b0, 3);
        aVar.put(f4011c0, 3);
        aVar.put(f4012d0, 1);
        aVar.put(f4013e0, 1);
        aVar.put(f4014f0, 1);
        aVar.put(f4015g0, 2);
        aVar.put(f4016h0, 1);
        aVar.put(f4017i0, 1);
        aVar.put(f4019k0, 0);
        aVar.put(f4018j0, 1);
        aVar.put(f4020l0, 0);
        aVar.put(f4021m0, 0);
        f4027s0 = new String[]{f3991I, f3992J, f3994L, f4005W, f3996N, f3995M, f3997O};
        f4028t0 = new String[]{f4015g0, f4006X, f4008Z};
        f4029u0 = new String[]{f4016h0, f4007Y, f4009a0};
        CREATOR = new a();
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f4030E = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            android.support.v4.media.f.g(obj, obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f4031F = obj;
            return createFromParcel;
        }
        return null;
    }

    public boolean a(String str) {
        return this.f4030E.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.f4030E.getParcelable(str);
        } catch (Exception e4) {
            Log.w(f3990H, "Failed to retrieve a key as Bitmap.", e4);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.f4030E);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f4032G;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String l4 = l(f4017i0);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence m4 = m(f4012d0);
        if (!TextUtils.isEmpty(m4)) {
            charSequenceArr[0] = m4;
            charSequenceArr[1] = m(f4013e0);
            charSequenceArr[2] = m(f4014f0);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < 3) {
                String[] strArr = f4027s0;
                if (i5 >= strArr.length) {
                    break;
                }
                int i6 = i5 + 1;
                CharSequence m5 = m(strArr[i5]);
                if (!TextUtils.isEmpty(m5)) {
                    charSequenceArr[i4] = m5;
                    i4++;
                }
                i5 = i6;
            }
        }
        int i7 = 0;
        while (true) {
            String[] strArr2 = f4028t0;
            uri = null;
            if (i7 < strArr2.length) {
                bitmap = c(strArr2[i7]);
                if (bitmap != null) {
                    break;
                }
                i7++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i8 = 0;
        while (true) {
            String[] strArr3 = f4029u0;
            if (i8 < strArr3.length) {
                String l5 = l(strArr3[i8]);
                if (!TextUtils.isEmpty(l5)) {
                    uri2 = Uri.parse(l5);
                    break;
                }
                i8++;
            } else {
                uri2 = null;
                break;
            }
        }
        String l6 = l(f4018j0);
        if (!TextUtils.isEmpty(l6)) {
            uri = Uri.parse(l6);
        }
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.f(l4);
        bVar.i(charSequenceArr[0]);
        bVar.h(charSequenceArr[1]);
        bVar.b(charSequenceArr[2]);
        bVar.d(bitmap);
        bVar.e(uri2);
        bVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.f4030E.containsKey(f4019k0)) {
            bundle.putLong(MediaDescriptionCompat.f3959N, g(f4019k0));
        }
        if (this.f4030E.containsKey(f4021m0)) {
            bundle.putLong(MediaDescriptionCompat.f3967V, g(f4021m0));
        }
        if (!bundle.isEmpty()) {
            bVar.c(bundle);
        }
        MediaDescriptionCompat a4 = bVar.a();
        this.f4032G = a4;
        return a4;
    }

    public long g(String str) {
        return this.f4030E.getLong(str, 0L);
    }

    public Object h() {
        if (this.f4031F == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f4031F = android.support.v4.media.f.a(obtain);
            obtain.recycle();
        }
        return this.f4031F;
    }

    public RatingCompat i(String str) {
        try {
            return RatingCompat.a(this.f4030E.getParcelable(str));
        } catch (Exception e4) {
            Log.w(f3990H, "Failed to retrieve a key as Rating.", e4);
            return null;
        }
    }

    public String l(String str) {
        CharSequence charSequence = this.f4030E.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence m(String str) {
        return this.f4030E.getCharSequence(str);
    }

    public Set<String> n() {
        return this.f4030E.keySet();
    }

    public int o() {
        return this.f4030E.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeBundle(this.f4030E);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f4033a;

        public c() {
            this.f4033a = new Bundle();
        }

        private Bitmap g(Bitmap bitmap, int i4) {
            float f4 = i4;
            float min = Math.min(f4 / bitmap.getWidth(), f4 / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f4033a);
        }

        public c b(String str, Bitmap bitmap) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f4026r0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 2) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
            }
            this.f4033a.putParcelable(str, bitmap);
            return this;
        }

        public c c(String str, long j4) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f4026r0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 0) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
            }
            this.f4033a.putLong(str, j4);
            return this;
        }

        public c d(String str, RatingCompat ratingCompat) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f4026r0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 3) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            this.f4033a.putParcelable(str, (Parcelable) ratingCompat.c());
            return this;
        }

        public c e(String str, String str2) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f4026r0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
            }
            this.f4033a.putCharSequence(str, str2);
            return this;
        }

        public c f(String str, CharSequence charSequence) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f4026r0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
            }
            this.f4033a.putCharSequence(str, charSequence);
            return this;
        }

        public c(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f4030E);
            this.f4033a = bundle;
            MediaSessionCompat.b(bundle);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c(MediaMetadataCompat mediaMetadataCompat, int i4) {
            this(mediaMetadataCompat);
            for (String str : this.f4033a.keySet()) {
                Object obj = this.f4033a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i4 || bitmap.getWidth() > i4) {
                        b(str, g(bitmap, i4));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f4030E = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
