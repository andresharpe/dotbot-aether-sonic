package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C2197u;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.navigation.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941s implements Parcelable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final String f16542E;

    /* renamed from: F, reason: collision with root package name */
    private final int f16543F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final Bundle f16544G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final Bundle f16545H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final b f16541I = new b(null);

    @W2.f
    @l3.d
    public static final Parcelable.Creator<C0941s> CREATOR = new a();

    /* renamed from: androidx.navigation.s$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C0941s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @l3.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0941s createFromParcel(@l3.d Parcel inParcel) {
            kotlin.jvm.internal.F.p(inParcel, "inParcel");
            return new C0941s(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0941s[] newArray(int i4) {
            return new C0941s[i4];
        }
    }

    /* renamed from: androidx.navigation.s$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    public C0941s(@l3.d r entry) {
        kotlin.jvm.internal.F.p(entry, "entry");
        this.f16542E = entry.h();
        this.f16543F = entry.g().t();
        this.f16544G = entry.e();
        Bundle bundle = new Bundle();
        this.f16545H = bundle;
        entry.m(bundle);
    }

    @l3.e
    public final Bundle a() {
        return this.f16544G;
    }

    public final int b() {
        return this.f16543F;
    }

    @l3.d
    public final String c() {
        return this.f16542E;
    }

    @l3.d
    public final Bundle d() {
        return this.f16545H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l3.d
    public final r e(@l3.d Context context, @l3.d F destination, @l3.d Lifecycle.State hostLifecycleState, @l3.e C0945w c0945w) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f16544G;
        if (bundle == null) {
            bundle = null;
        } else {
            bundle.setClassLoader(context.getClassLoader());
        }
        return r.f16524R.a(context, destination, bundle, hostLifecycleState, c0945w, this.f16542E, this.f16545H);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l3.d Parcel parcel, int i4) {
        kotlin.jvm.internal.F.p(parcel, "parcel");
        parcel.writeString(this.f16542E);
        parcel.writeInt(this.f16543F);
        parcel.writeBundle(this.f16544G);
        parcel.writeBundle(this.f16545H);
    }

    public C0941s(@l3.d Parcel inParcel) {
        kotlin.jvm.internal.F.p(inParcel, "inParcel");
        String readString = inParcel.readString();
        kotlin.jvm.internal.F.m(readString);
        kotlin.jvm.internal.F.o(readString, "inParcel.readString()!!");
        this.f16542E = readString;
        this.f16543F = inParcel.readInt();
        this.f16544G = inParcel.readBundle(C0941s.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(C0941s.class.getClassLoader());
        kotlin.jvm.internal.F.m(readBundle);
        kotlin.jvm.internal.F.o(readBundle, "inParcel.readBundle(javaClass.classLoader)!!");
        this.f16545H = readBundle;
    }
}
