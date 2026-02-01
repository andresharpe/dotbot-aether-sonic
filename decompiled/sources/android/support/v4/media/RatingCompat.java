package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: H, reason: collision with root package name */
    private static final String f4034H = "Rating";

    /* renamed from: I, reason: collision with root package name */
    public static final int f4035I = 0;

    /* renamed from: J, reason: collision with root package name */
    public static final int f4036J = 1;

    /* renamed from: K, reason: collision with root package name */
    public static final int f4037K = 2;

    /* renamed from: L, reason: collision with root package name */
    public static final int f4038L = 3;

    /* renamed from: M, reason: collision with root package name */
    public static final int f4039M = 4;

    /* renamed from: N, reason: collision with root package name */
    public static final int f4040N = 5;

    /* renamed from: O, reason: collision with root package name */
    public static final int f4041O = 6;

    /* renamed from: P, reason: collision with root package name */
    private static final float f4042P = -1.0f;

    /* renamed from: E, reason: collision with root package name */
    private final int f4043E;

    /* renamed from: F, reason: collision with root package name */
    private final float f4044F;

    /* renamed from: G, reason: collision with root package name */
    private Object f4045G;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i4) {
            return new RatingCompat[i4];
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
    public @interface c {
    }

    RatingCompat(int i4, float f4) {
        this.f4043E = i4;
        this.f4044F = f4;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = l(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = o(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = n(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = q(ratingStyle);
            }
            ratingCompat.f4045G = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat l(boolean z3) {
        float f4;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        return new RatingCompat(1, f4);
    }

    public static RatingCompat m(float f4) {
        if (f4 >= 0.0f && f4 <= 100.0f) {
            return new RatingCompat(6, f4);
        }
        Log.e(f4034H, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat n(int i4, float f4) {
        float f5;
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    Log.e(f4034H, "Invalid rating style (" + i4 + ") for a star rating");
                    return null;
                }
                f5 = 5.0f;
            } else {
                f5 = 4.0f;
            }
        } else {
            f5 = 3.0f;
        }
        if (f4 >= 0.0f && f4 <= f5) {
            return new RatingCompat(i4, f4);
        }
        Log.e(f4034H, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat o(boolean z3) {
        float f4;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        return new RatingCompat(2, f4);
    }

    public static RatingCompat q(int i4) {
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i4, f4042P);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f4043E == 6 && h()) {
            return this.f4044F;
        }
        return f4042P;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000c. Please report as an issue. */
    public Object c() {
        if (this.f4045G == null) {
            if (h()) {
                int i4 = this.f4043E;
                switch (i4) {
                    case 1:
                        this.f4045G = Rating.newHeartRating(g());
                        break;
                    case 2:
                        this.f4045G = Rating.newThumbRating(i());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f4045G = Rating.newStarRating(i4, e());
                        break;
                    case 6:
                        this.f4045G = Rating.newPercentageRating(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f4045G = Rating.newUnratedRating(this.f4043E);
            }
        }
        return this.f4045G;
    }

    public int d() {
        return this.f4043E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f4043E;
    }

    public float e() {
        int i4 = this.f4043E;
        if ((i4 == 3 || i4 == 4 || i4 == 5) && h()) {
            return this.f4044F;
        }
        return f4042P;
    }

    public boolean g() {
        if (this.f4043E != 1 || this.f4044F != 1.0f) {
            return false;
        }
        return true;
    }

    public boolean h() {
        if (this.f4044F >= 0.0f) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (this.f4043E != 2 || this.f4044F != 1.0f) {
            return false;
        }
        return true;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f4043E);
        sb.append(" rating=");
        float f4 = this.f4044F;
        if (f4 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f4);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4043E);
        parcel.writeFloat(this.f4044F);
    }
}
