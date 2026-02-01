package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0283a();

    /* renamed from: E, reason: collision with root package name */
    @N
    private final m f32171E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final m f32172F;

    /* renamed from: G, reason: collision with root package name */
    @N
    private final c f32173G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private m f32174H;

    /* renamed from: I, reason: collision with root package name */
    private final int f32175I;

    /* renamed from: J, reason: collision with root package name */
    private final int f32176J;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0283a implements Parcelable.Creator<a> {
        C0283a() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@N Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    /* loaded from: classes2.dex */
    public interface c extends Parcelable {
        boolean D(long j4);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, C0283a c0283a) {
        this(mVar, mVar2, cVar, mVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m e(m mVar) {
        if (mVar.compareTo(this.f32171E) < 0) {
            return this.f32171E;
        }
        if (mVar.compareTo(this.f32172F) > 0) {
            return this.f32172F;
        }
        return mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f32171E.equals(aVar.f32171E) && this.f32172F.equals(aVar.f32172F) && androidx.core.util.p.a(this.f32174H, aVar.f32174H) && this.f32173G.equals(aVar.f32173G)) {
            return true;
        }
        return false;
    }

    public c g() {
        return this.f32173G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public m h() {
        return this.f32172F;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32171E, this.f32172F, this.f32174H, this.f32173G});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f32176J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public m l() {
        return this.f32174H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public m m() {
        return this.f32171E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f32175I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(long j4) {
        if (this.f32171E.m(1) <= j4) {
            m mVar = this.f32172F;
            if (j4 <= mVar.m(mVar.f32230I)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(@P m mVar) {
        this.f32174H = mVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f32171E, 0);
        parcel.writeParcelable(this.f32172F, 0);
        parcel.writeParcelable(this.f32174H, 0);
        parcel.writeParcelable(this.f32173G, 0);
    }

    private a(@N m mVar, @N m mVar2, @N c cVar, @P m mVar3) {
        this.f32171E = mVar;
        this.f32172F = mVar2;
        this.f32174H = mVar3;
        this.f32173G = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f32176J = mVar.s(mVar2) + 1;
        this.f32175I = (mVar2.f32228G - mVar.f32228G) + 1;
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final long f32177e = v.a(m.e(1900, 0).f32231J);

        /* renamed from: f, reason: collision with root package name */
        static final long f32178f = v.a(m.e(2100, 11).f32231J);

        /* renamed from: g, reason: collision with root package name */
        private static final String f32179g = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: a, reason: collision with root package name */
        private long f32180a;

        /* renamed from: b, reason: collision with root package name */
        private long f32181b;

        /* renamed from: c, reason: collision with root package name */
        private Long f32182c;

        /* renamed from: d, reason: collision with root package name */
        private c f32183d;

        public b() {
            this.f32180a = f32177e;
            this.f32181b = f32178f;
            this.f32183d = i.a(Long.MIN_VALUE);
        }

        @N
        public a a() {
            m g4;
            Bundle bundle = new Bundle();
            bundle.putParcelable(f32179g, this.f32183d);
            m g5 = m.g(this.f32180a);
            m g6 = m.g(this.f32181b);
            c cVar = (c) bundle.getParcelable(f32179g);
            Long l4 = this.f32182c;
            if (l4 == null) {
                g4 = null;
            } else {
                g4 = m.g(l4.longValue());
            }
            return new a(g5, g6, cVar, g4, null);
        }

        @N
        public b b(long j4) {
            this.f32181b = j4;
            return this;
        }

        @N
        public b c(long j4) {
            this.f32182c = Long.valueOf(j4);
            return this;
        }

        @N
        public b d(long j4) {
            this.f32180a = j4;
            return this;
        }

        @N
        public b e(@N c cVar) {
            this.f32183d = cVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(@N a aVar) {
            this.f32180a = f32177e;
            this.f32181b = f32178f;
            this.f32183d = i.a(Long.MIN_VALUE);
            this.f32180a = aVar.f32171E.f32231J;
            this.f32181b = aVar.f32172F.f32231J;
            this.f32182c = Long.valueOf(aVar.f32174H.f32231J);
            this.f32183d = aVar.f32173G;
        }
    }
}
