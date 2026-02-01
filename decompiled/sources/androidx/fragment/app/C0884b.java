package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.F;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884b implements Parcelable {
    public static final Parcelable.Creator<C0884b> CREATOR = new a();

    /* renamed from: S, reason: collision with root package name */
    private static final String f15236S = "FragmentManager";

    /* renamed from: E, reason: collision with root package name */
    final int[] f15237E;

    /* renamed from: F, reason: collision with root package name */
    final ArrayList<String> f15238F;

    /* renamed from: G, reason: collision with root package name */
    final int[] f15239G;

    /* renamed from: H, reason: collision with root package name */
    final int[] f15240H;

    /* renamed from: I, reason: collision with root package name */
    final int f15241I;

    /* renamed from: J, reason: collision with root package name */
    final String f15242J;

    /* renamed from: K, reason: collision with root package name */
    final int f15243K;

    /* renamed from: L, reason: collision with root package name */
    final int f15244L;

    /* renamed from: M, reason: collision with root package name */
    final CharSequence f15245M;

    /* renamed from: N, reason: collision with root package name */
    final int f15246N;

    /* renamed from: O, reason: collision with root package name */
    final CharSequence f15247O;

    /* renamed from: P, reason: collision with root package name */
    final ArrayList<String> f15248P;

    /* renamed from: Q, reason: collision with root package name */
    final ArrayList<String> f15249Q;

    /* renamed from: R, reason: collision with root package name */
    final boolean f15250R;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C0884b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0884b createFromParcel(Parcel parcel) {
            return new C0884b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0884b[] newArray(int i4) {
            return new C0884b[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0884b(C0883a c0883a) {
        int size = c0883a.f14953c.size();
        this.f15237E = new int[size * 6];
        if (c0883a.f14959i) {
            this.f15238F = new ArrayList<>(size);
            this.f15239G = new int[size];
            this.f15240H = new int[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                F.a aVar = c0883a.f14953c.get(i5);
                int i6 = i4 + 1;
                this.f15237E[i4] = aVar.f14970a;
                ArrayList<String> arrayList = this.f15238F;
                Fragment fragment = aVar.f14971b;
                arrayList.add(fragment != null ? fragment.f14997J : null);
                int[] iArr = this.f15237E;
                iArr[i6] = aVar.f14972c ? 1 : 0;
                iArr[i4 + 2] = aVar.f14973d;
                iArr[i4 + 3] = aVar.f14974e;
                int i7 = i4 + 5;
                iArr[i4 + 4] = aVar.f14975f;
                i4 += 6;
                iArr[i7] = aVar.f14976g;
                this.f15239G[i5] = aVar.f14977h.ordinal();
                this.f15240H[i5] = aVar.f14978i.ordinal();
            }
            this.f15241I = c0883a.f14958h;
            this.f15242J = c0883a.f14961k;
            this.f15243K = c0883a.f15234P;
            this.f15244L = c0883a.f14962l;
            this.f15245M = c0883a.f14963m;
            this.f15246N = c0883a.f14964n;
            this.f15247O = c0883a.f14965o;
            this.f15248P = c0883a.f14966p;
            this.f15249Q = c0883a.f14967q;
            this.f15250R = c0883a.f14968r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(@androidx.annotation.N C0883a c0883a) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 < this.f15237E.length) {
                F.a aVar = new F.a();
                int i6 = i4 + 1;
                aVar.f14970a = this.f15237E[i4];
                if (FragmentManager.S0(2)) {
                    Log.v("FragmentManager", "Instantiate " + c0883a + " op #" + i5 + " base fragment #" + this.f15237E[i6]);
                }
                aVar.f14977h = Lifecycle.State.values()[this.f15239G[i5]];
                aVar.f14978i = Lifecycle.State.values()[this.f15240H[i5]];
                int[] iArr = this.f15237E;
                int i7 = i4 + 2;
                if (iArr[i6] == 0) {
                    z3 = false;
                }
                aVar.f14972c = z3;
                int i8 = iArr[i7];
                aVar.f14973d = i8;
                int i9 = iArr[i4 + 3];
                aVar.f14974e = i9;
                int i10 = i4 + 5;
                int i11 = iArr[i4 + 4];
                aVar.f14975f = i11;
                i4 += 6;
                int i12 = iArr[i10];
                aVar.f14976g = i12;
                c0883a.f14954d = i8;
                c0883a.f14955e = i9;
                c0883a.f14956f = i11;
                c0883a.f14957g = i12;
                c0883a.m(aVar);
                i5++;
            } else {
                c0883a.f14958h = this.f15241I;
                c0883a.f14961k = this.f15242J;
                c0883a.f14959i = true;
                c0883a.f14962l = this.f15244L;
                c0883a.f14963m = this.f15245M;
                c0883a.f14964n = this.f15246N;
                c0883a.f14965o = this.f15247O;
                c0883a.f14966p = this.f15248P;
                c0883a.f14967q = this.f15249Q;
                c0883a.f14968r = this.f15250R;
                return;
            }
        }
    }

    @androidx.annotation.N
    public C0883a b(@androidx.annotation.N FragmentManager fragmentManager) {
        C0883a c0883a = new C0883a(fragmentManager);
        a(c0883a);
        c0883a.f15234P = this.f15243K;
        for (int i4 = 0; i4 < this.f15238F.size(); i4++) {
            String str = this.f15238F.get(i4);
            if (str != null) {
                c0883a.f14953c.get(i4).f14971b = fragmentManager.k0(str);
            }
        }
        c0883a.U(1);
        return c0883a;
    }

    @androidx.annotation.N
    public C0883a c(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Map<String, Fragment> map) {
        C0883a c0883a = new C0883a(fragmentManager);
        a(c0883a);
        for (int i4 = 0; i4 < this.f15238F.size(); i4++) {
            String str = this.f15238F.get(i4);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    c0883a.f14953c.get(i4).f14971b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f15242J + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return c0883a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f15237E);
        parcel.writeStringList(this.f15238F);
        parcel.writeIntArray(this.f15239G);
        parcel.writeIntArray(this.f15240H);
        parcel.writeInt(this.f15241I);
        parcel.writeString(this.f15242J);
        parcel.writeInt(this.f15243K);
        parcel.writeInt(this.f15244L);
        TextUtils.writeToParcel(this.f15245M, parcel, 0);
        parcel.writeInt(this.f15246N);
        TextUtils.writeToParcel(this.f15247O, parcel, 0);
        parcel.writeStringList(this.f15248P);
        parcel.writeStringList(this.f15249Q);
        parcel.writeInt(this.f15250R ? 1 : 0);
    }

    C0884b(Parcel parcel) {
        this.f15237E = parcel.createIntArray();
        this.f15238F = parcel.createStringArrayList();
        this.f15239G = parcel.createIntArray();
        this.f15240H = parcel.createIntArray();
        this.f15241I = parcel.readInt();
        this.f15242J = parcel.readString();
        this.f15243K = parcel.readInt();
        this.f15244L = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f15245M = (CharSequence) creator.createFromParcel(parcel);
        this.f15246N = parcel.readInt();
        this.f15247O = (CharSequence) creator.createFromParcel(parcel);
        this.f15248P = parcel.createStringArrayList();
        this.f15249Q = parcel.createStringArrayList();
        this.f15250R = parcel.readInt() != 0;
    }
}
